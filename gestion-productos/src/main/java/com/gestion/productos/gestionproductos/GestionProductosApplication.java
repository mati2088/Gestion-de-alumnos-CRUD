package com.gestion.productos.gestionproductos;

import com.gestion.productos.gestionproductos.entity.Estudiante;
import com.gestion.productos.gestionproductos.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GestionProductosApplication implements CommandLineRunner {
	@Autowired
	private EstudianteRepository estudianteRepository;
	public static void main(String[] args) {
		SpringApplication.run(GestionProductosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*Estudiante estudiante1=new Estudiante("matias","arana","matiasarana@gmail.com");
		estudianteRepository.save(estudiante1);

		Estudiante estudiante2=new Estudiante("mateo","acosta","mateoacosta@gmail.com");
		estudianteRepository.save(estudiante2);*/

	}
}
