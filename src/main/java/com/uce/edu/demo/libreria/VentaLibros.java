package com.uce.edu.demo.libreria;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VentaLibros {

	private LocalDateTime fechaVenta;
	private Cliente cliente;
	private Libro libro;

	// 2)DI por contructor
	public VentaLibros(Libro libro) {

		this.libro = libro;
	}

	public String vender(LocalDateTime fechaVenta, String nombreLibro, String genero, String autor,
			String nombreCliente, String apellidoCliente, int carnetLibreria) {

		this.libro.setNombre(nombreLibro);
		this.libro.setGenero(genero);
		this.libro.setAutor(autor);

		this.cliente.setNombre(nombreCliente);
		this.cliente.setApellido(apellidoCliente);
		this.cliente.setCarnetLibreria(carnetLibreria);
		this.fechaVenta = fechaVenta;

		// Se inserta la cita en la base de datos

		System.out.println("Datos del libro -> Nombre: " + nombreLibro + ", Autor: " + autor + ", Genero: " + genero);
		System.out.println("Datos del cliente -> Nombre: " + nombreCliente + " " + apellidoCliente + ", N° Carnet: "
				+ carnetLibreria);
		return "Se realizo una venta con exito";

	}

	//SET Y GET
	public LocalDateTime getFechaVenta() {
		return fechaVenta;
	}

	public void setFechaVenta(LocalDateTime fechaVenta) {
		this.fechaVenta = fechaVenta;
	}

	public Cliente getCliente() {
		return cliente;
	}

	// 3)Por metodo set
	@Autowired
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

}
