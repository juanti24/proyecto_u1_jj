package com.uce.edu.demo.cine.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.uce.edu.demo.cine.modelo.Pelicula;
import com.uce.edu.demo.cine.repository.IPeliculaRepository;

@Service
public class PeliculaServiceImpl implements IPeliculaService {

	@Autowired
	private IPeliculaRepository peliculaRepository;

	@Override
	public void ingresarPelicula(Pelicula p) {
		// TODO Auto-generated method stub
		this.peliculaRepository.insertar(p);

	}

	@Override
	public Pelicula buscarPorNombre(String nombre) {
		this.peliculaRepository.buscar(nombre);
		return null;
	}

	@Override
	public void actualizarPelicula(Pelicula p) {
		// TODO Auto-generated method stub
		this.peliculaRepository.actualizar(p);

	}

	@Override
	public void borrarPelicula(String nombre) {
		// TODO Auto-generated method stub
		this.peliculaRepository.eliminar(nombre);

	}

}
