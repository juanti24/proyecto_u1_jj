package com.uce.edu.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.service.IEstudianteService;



@SpringBootApplication
public class ProyectoU1JjApplication implements CommandLineRunner {

	@Autowired
	private IEstudianteService estudianteService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1JjApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Estudiante e = new Estudiante();
		e.setNombre("Juan");
		e.setApellido("Jumbo");
		e.setCedula("1723920979");
		this.estudianteService.ingresarEstudiante(e);
		
		Estudiante e1 = new Estudiante();
		e1.setNombre("Carlos");
		e1.setApellido("Suarez");
		e1.setCedula("0923920979");
		this.estudianteService.ingresarEstudiante(e1);
		
		//Usar los 3 metodo restantes
		e.setCedula("1723520977");
		this.estudianteService.actualizarEstudiante(e);
		
		this.estudianteService.buscarPorApellido("Jumbo");
		this.estudianteService.borrarEstudiante("0923920979");
		
	}

}
