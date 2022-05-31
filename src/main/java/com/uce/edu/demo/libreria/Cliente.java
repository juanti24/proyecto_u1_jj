package com.uce.edu.demo.libreria;

import org.springframework.stereotype.Component;

@Component
public class Cliente {

	private String nombre;
	private String apellido;
	private int carnetLibreria;

	// SET Y GET
	public String getNombre() {

		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getCarnetLibreria() {
		return carnetLibreria;
	}

	public void setCarnetLibreria(int carnetLibreria) {
		this.carnetLibreria = carnetLibreria;
	}

}
