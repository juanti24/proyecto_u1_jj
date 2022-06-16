package com.uce.edu.demo.cine.repository;

import com.uce.edu.demo.cine.modelo.Pelicula;

public interface IPeliculaRepository {

	public void insertar(Pelicula p);

	public Pelicula buscar(String nombre);

	public void actualizar(Pelicula p);

	public void eliminar(String nombre);

}
