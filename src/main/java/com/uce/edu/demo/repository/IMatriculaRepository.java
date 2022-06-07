package com.uce.edu.demo.repository;

import com.uce.edu.demo.modelo.Matricula;

public interface IMatriculaRepository {

	public void insertar(Matricula m);

	public Matricula buscar(String numero);

	public void actualizar(Matricula e);

	public void eliminar(String numero);

}
