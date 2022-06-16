package com.uce.edu.demo.cine.repository;

import org.springframework.stereotype.Repository;
import com.uce.edu.demo.cine.modelo.Pelicula;

@Repository
public class PeliculaRepositoryImpl implements IPeliculaRepository {

	@Override
	public void insertar(Pelicula p) {
		// TODO Auto-generated method stub
		System.out.println("Se ha insertado en la base la pelicula: " + p);
		
	}

	@Override
	public Pelicula buscar(String nombre) {
		// TODO Auto-generated method stub
		System.out.println("Se ha buscado en la base la peliucla: " + nombre);
		Pelicula p  = new Pelicula();
		p.setNombre(nombre);
		return p;
	}

	@Override
	public void actualizar(Pelicula p) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado en la base la pelicula: " + p);
	}

	@Override
	public void eliminar(String nombre) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado en la base la pelicula: " + nombre);
	}

}
