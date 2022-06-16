package com.uce.edu.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.cine.modelo.Boleto;
import com.uce.edu.demo.cine.modelo.Cliente;
import com.uce.edu.demo.cine.modelo.Pelicula;
import com.uce.edu.demo.cine.service.IBoletoService;

@SpringBootApplication
public class ProyectoU1JjApplication implements CommandLineRunner {

	@Autowired
	private IBoletoService boletoService;

	@Autowired
	private Pelicula pelicula;

	@Autowired
	private Cliente cliente;
	
	@Autowired
	private Pelicula pelicula1;

	@Autowired
	private Cliente cliente1;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1JjApplication.class, args);
	}

	public void run(String... args) throws Exception {
		
		System.out.println(" ");	
		System.out.println("**********************");
		System.out.println("Ejemplos ingresados desde Main");
		System.out.println("**********************");
		System.out.println(" ");	
		
		System.out.println("Ejemplo Prototype");
		this.cliente.setNombre("Juan");
		this.cliente.setApellido("Jumbo");
		this.cliente.setCedula("1723920979");
		System.out.println(this.cliente);
		this.cliente1.setNombre("Xavier");
		this.cliente1.setApellido("Jumbo");
		this.cliente1.setCedula("1723920777");
		System.out.println(this.cliente1);
		System.out.println(this.cliente);
		System.out.println(" ");	
		
		System.out.println("Ejemplo Singleton");
		this.pelicula.setNombre("El Hombre Araña");
		this.pelicula.setGenero("Accion");
		this.pelicula.setDuraciónPelicula("2 horas");
		System.out.println(this.pelicula);
		this.pelicula1.setNombre("Superman");
		this.pelicula1.setGenero("Accion");
		this.pelicula1.setDuraciónPelicula("1 hora y 45 min");
		System.out.println(this.pelicula1);
		System.out.println(this.pelicula);
		
		System.out.println(" ");
		System.out.println("**********************");
		System.out.println("Ejemplos utilizando metodos");
		System.out.println("**********************");
		
		Cliente cliente = new Cliente();
		cliente.setNombre("Luis");
		cliente.setApellido("Jumbo");
		cliente.setCedula("1724500979");
		
		Pelicula pelicula = new Pelicula();
		pelicula.setNombre("Mision Imposible");
		pelicula.setGenero("Accion");
		pelicula.setDuraciónPelicula("2 horas y 30 min");
		
		Boleto boleto = new Boleto();
		boleto.setCliente(cliente);
		boleto.setPelicula(pelicula);
		boleto.setNumero("00012");
		
		Cliente cliente1 = new Cliente();
		cliente1.setNombre("Xavier");
		cliente1.setApellido("Jumbo");
		cliente1.setCedula("1724500777");
		
		Pelicula pelicula1 = new Pelicula();
		pelicula1.setNombre("Que Paso Ayer");
		pelicula1.setGenero("Comedia");
		pelicula1.setDuraciónPelicula("3 horas ");
		
		Boleto boleto1 = new Boleto();
		boleto1.setCliente(cliente1);
		boleto1.setPelicula(pelicula1);
		boleto1.setNumero("00013");
		
		System.out.println(" ");
		System.out.println("Ejemplo Prototype");
		this.boletoService.ingresarBoleto(boleto);
		this.boletoService.ingresarBoleto(boleto1);
		System.out.println(" ");
		System.out.println("Ejemplo Singleton");
		System.out.println("**********************");
		this.boletoService.actualizarBoleto(boleto);
		this.boletoService.actualizarBoleto(boleto1);
		

	}

}
