package com.uce.edu.demo.repository;


import com.uce.edu.demo.modelo.Matricula;

public class MatriculaResository implements IMatriculaRepository {

	@Override
	public void insertar(Matricula m) {
		// TODO Auto-generated method stub
		// Aqui se realiza la insercción a la base de datos
		System.out.println("Se ha insertado en la base la matricula: " + m);
	}

	@Override
	public Matricula buscar(String numero) {
		// TODO Auto-generated method stub
		
		System.out.println("Se ha buscado en la base la matricula: " + numero);
		Matricula m = new Matricula();
		m.setNumero(numero);
		return m;
	}

	@Override
	public void actualizar(Matricula e) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado en la base la matricula: " + e);
	}

	@Override
	public void eliminar(String matricula) {
		System.out.println("Se ha eleminado en la base la matricula: " + matricula);
		
	}

}
