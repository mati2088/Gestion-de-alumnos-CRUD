package com.gestion.productos.gestionproductos.service;

import com.gestion.productos.gestionproductos.entity.Estudiante;

import java.util.List;

public interface EstudianteServicio {
    public List<Estudiante> listarEstudiantes();
    public Estudiante guardarEstudiante(Estudiante estudiante);
    public Estudiante obtenerEstudiantePorId(Long id);
    public Estudiante actualizarEstudiante(Estudiante estudiante);
    public void eliminarEstudiante(Long id);
}
