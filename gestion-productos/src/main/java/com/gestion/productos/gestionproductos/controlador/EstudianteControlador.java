package com.gestion.productos.gestionproductos.controlador;


import com.gestion.productos.gestionproductos.entity.Estudiante;
import com.gestion.productos.gestionproductos.service.EstudianteServicio;
import com.gestion.productos.gestionproductos.service.EstudianteServicioIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller

public class EstudianteControlador {
    @Autowired
    EstudianteServicio estudianteServicio;

    @GetMapping({"/estudiantes","/"})
    public String listarEstudiantes(Model modelo){
        modelo.addAttribute("estudiantes",estudianteServicio.listarEstudiantes());
        return "estudiantes";//retorna al html estudiantes
    }
    @GetMapping("/estudiantes/nuevo")
    public String crearEstudianteFormulario(Model modelo){
        Estudiante estudiante = new Estudiante();
        modelo.addAttribute("estudiante",estudiante);
        return "crearEstudiante";


    }
    @PostMapping("/estudiantes")
    public String guardarEstudiantes(@ModelAttribute("estudiante") Estudiante estudiante){
        estudianteServicio.guardarEstudiante(estudiante);
        return "redirect:/estudiantes";
    }
    @GetMapping("/estudiantes/editar/{id}")
    public String mostrarFormularioEditar(@PathVariable Long id,Model modelo){
        modelo.addAttribute("estudiante",estudianteServicio.obtenerEstudiantePorId(id));
        return "editarEstudiante";
    }
    @PostMapping("/estudiantes/{id}")
    public String actualizarEstudiante(@PathVariable Long id, @ModelAttribute("estudiante")Estudiante estudiante,Model modelo){
        Estudiante estudianteExistente= estudianteServicio.obtenerEstudiantePorId(id);
        estudianteExistente.setId(id);
        estudianteExistente.setNombre(estudiante.getNombre());
        estudianteExistente.setApellido(estudiante.getApellido());
        estudianteExistente.setEmail(estudiante.getEmail());

        estudianteServicio.actualizarEstudiante(estudianteExistente);
        return "redirect:/estudiantes";
    }

    @GetMapping("/estudiantes/{id}")
    public String eliminarEstudiante(@PathVariable Long id){
        estudianteServicio.eliminarEstudiante(id);
        return "redirect:/estudiantes";
    }



}
