package com.uce.edu.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.modelo.Materia;
import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.service.IEstudianteService;
import com.uce.edu.demo.service.IMateriaService;
import com.uce.edu.demo.service.IMatriculaService;

@SpringBootApplication
public class ProyectoU1JjApplication implements CommandLineRunner {

	@Autowired
	private IEstudianteService estudianteService;
	@Autowired
	private IMateriaService materiaService;
	@Autowired
	private IMatriculaService matriculaService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1JjApplication.class, args);
	}

	public void run(String... args) throws Exception {

		System.out.println("Estudiante");
		
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
		System.out.println( );
		
		//////////////////////////////////////////////////////
		///////////////// TAREA N°6 //////////////////////////
		
		
		///////////////// Materia //////////////////////////
		
		System.out.println("Materia");
		
		Materia materia1 = new Materia();
		materia1.setNombre("Programacion 1");
		materia1.setSemestre("Primero");
		
		Materia materia2 = new Materia();
		materia2.setNombre("Analisis 1");
		materia2.setSemestre("Primero");
		
		this.materiaService.ingresarMateria(materia1);
		materia1.setNombre("Programacion");
		this.materiaService.actualizarMateria(materia1);
		this.materiaService.borrarMateria("Programación 1");
		this.materiaService.buscarPorNombre("Analisis 1");
		System.out.println( );

	
		///////////////// Matricula //////////////////////////
		
		List<Materia> materiasPrimero = new ArrayList<Materia>();
		materiasPrimero.add(materia1);
		materiasPrimero.add(materia2);
		
		System.out.println("Matricula");
		
		Matricula matricula1 = new Matricula();
		matricula1.setNumero("10101");
		matricula1.setEstudiante(e);
		matricula1.setMateria(materiasPrimero);
		
		Matricula matricula2 = new Matricula();
		matricula2.setNumero("10102");
		matricula2.setEstudiante(e1);
		matricula2.setMateria(materiasPrimero);
		
		this.matriculaService.ingresarMatricula(matricula1);
		matricula2.setNumero("10100");
		this.matriculaService.actualizarMatricula(matricula1);
		this.matriculaService.buscarPorNumero("10102");
		this.matriculaService.borrarMatricula("10101");
		
	}

}
