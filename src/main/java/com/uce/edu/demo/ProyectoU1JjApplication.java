package com.uce.edu.demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.consultorio.CitaMedica;
import com.uce.edu.demo.consultorio.CitaMedica2;
import com.uce.edu.demo.libreria.VentaLibros;

@SpringBootApplication
public class ProyectoU1JjApplication implements CommandLineRunner {

//  1)DI por atributo 
//	@Autowired
//	private CitaMedica cita;
//	

//	@Autowired
//	private CitaMedica2 cita2;

	// 1)DI por atributo
	@Autowired
	private VentaLibros libro;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1JjApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

//		System.out.println("Mi primer proyecto en Spring");
//		String respuesta = this.cita1.agendar(LocalDateTime.now(), "Xavier", "Teran", 32, "Quito", "Juan", 19);
//		System.out.println(respuesta);
//		String respuesta = this.cita2.agendar(LocalDateTime.now(), "Xavier", "Teran", 32, "Quito", "Juan", 19);
//		System.out.println(respuesta);

		String respuesta = libro.vender(LocalDateTime.now(), "Las Mil Horas", "Fantasia", "Gabriel Garcia Marquez",
				"Juan", "Jumbo", 1723920979);
		System.out.println(respuesta);

	}

}
