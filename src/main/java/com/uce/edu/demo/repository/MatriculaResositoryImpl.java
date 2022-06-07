package com.uce.edu.demo.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.modelo.Matricula;

@Repository
public class MatriculaResositoryImpl implements IMatriculaRepository {

	@Override
	public void insertar(Matricula m) {
		System.out.println("Se ha insertado en la base la matricula: " + m);
	}

	@Override
	public Matricula buscar(String numero) {
		// TODO Auto-generated method stub
		System.out.println("Se ha buscado en la base la matricula: " + numero);
		return null;
	}

	@Override
	public void actualizar(Matricula m) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado en la base la matricula: " + m);
	}

	@Override
	public void eliminar(String numero) {
		System.out.println("Se ha eleminado en la base la matricula: " + numero);
		
	}

}
