package com.uce.edu.demo.cine.service;

import com.uce.edu.demo.cine.modelo.Pelicula;

public interface IPeliculaService {
	
	public void ingresarPelicula(Pelicula p);
	
	
	public Pelicula buscarPorNombre(String nombre);
	
	
	public void actualizarPelicula(Pelicula p);
		
		
	public void borrarPelicula(String nombre);	

}
