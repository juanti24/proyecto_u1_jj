package com.uce.edu.demo.cine.modelo;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value=ConfigurableBeanFactory.SCOPE_SINGLETON)
public class Pelicula {

	private String nombre;
	private String genero;
	private String duraciónPelicula;

	// SET Y GET
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getDuraciónPelicula() {
		return duraciónPelicula;
	}

	public void setDuraciónPelicula(String duraciónPelicula) {
		this.duraciónPelicula = duraciónPelicula;
	}

	@Override
	public String toString() {
		return "Pelicula [nombre=" + nombre + ", genero=" + genero + ", duraciónPelicula=" + duraciónPelicula + "]";
	}

}
