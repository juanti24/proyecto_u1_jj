package com.uce.edu.demo.repository;

import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.modelo.Matricula;

public interface IMatriculaRepository {
	
	//C: crear/insertar
		public void insertar(Matricula m);
		
		//R: leer/buscar
		public Matricula buscar(String numero);
		
		//U: actualizar
		public void actualizar(Matricula e);
			
		//D: eliminar	
		public void eliminar(String matricula);	

}
