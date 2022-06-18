package com.uce.edu.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.cine.modelo.Boleto;
import com.uce.edu.demo.cine.modelo.Cliente;
import com.uce.edu.demo.cine.modelo.Pelicula;
import com.uce.edu.demo.cine.service.IBoletoService;
import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.modelo.Materia;
import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.modelo.ProfesorGeneral;
import com.uce.edu.demo.modelo.ProfesorMateria;
import com.uce.edu.demo.service.IMatriculaService;

@SpringBootApplication
public class ProyectoU1JjApplication implements CommandLineRunner {

	@Autowired
	private ProfesorGeneral profesorGeneral;
	
	@Autowired
	private ProfesorGeneral profesorGeneral1;
	
	@Autowired
	private ProfesorMateria profesorMateria;
	
	
	@Autowired
	private ProfesorMateria profesorMateria1;
	
	@Autowired
	private IMatriculaService iMatriculaService; 
	

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1JjApplication.class, args);
	}

	public void run(String... args) throws Exception {
		
		System.out.println("Ejemplo Singleton");
		this.profesorGeneral.setNombre("Juan");
		this.profesorGeneral.setApellido("Jumbo");
		
		System.out.println(this.profesorGeneral);
		System.out.println("--------------------");
		System.out.println(this.profesorGeneral1);
		this.profesorGeneral1.setNombre("Pepito");
		System.out.println("--------------------");
		System.out.println(this.profesorGeneral);
	
		System.out.println("Ejemplo Prototype");
		this.profesorMateria.setNombre("Daniel");
		this.profesorMateria.setApellido("Teran");
		System.out.println(this.profesorMateria);
		System.out.println("--------------------");
		System.out.println(this.profesorMateria);
		
		Matricula matricula1 = new Matricula();
		matricula1.setEstudiante(new Estudiante());
		List<Materia> materia = new ArrayList<>();
		matricula1.setMateria(materia);
		matricula1.setNumero("14");
		
		this.iMatriculaService.ingresarMatricula(matricula1);
		
		

	}

}
