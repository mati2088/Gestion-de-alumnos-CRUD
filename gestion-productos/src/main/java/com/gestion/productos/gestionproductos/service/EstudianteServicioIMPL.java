package com.gestion.productos.gestionproductos.service;

import com.gestion.productos.gestionproductos.entity.Estudiante;
import com.gestion.productos.gestionproductos.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteServicioIMPL implements EstudianteServicio{
    @Autowired
    EstudianteRepository estudianteRepository;
    @Override
    public List<Estudiante> listarEstudiantes() {

        return estudianteRepository.findAll() ;
    }

    @Override
    public Estudiante guardarEstudiante(Estudiante estudiante) {
        return estudianteRepository.save(estudiante);
    }

    @Override
    public Estudiante obtenerEstudiantePorId(Long id) {
        return estudianteRepository.findById(id).get();
    }

    @Override
    public Estudiante actualizarEstudiante(Estudiante estudiante) {
        return estudianteRepository.save(estudiante);
    }

    @Override
    public void eliminarEstudiante(Long id) {
        estudianteRepository.deleteById(id);
    }
}
