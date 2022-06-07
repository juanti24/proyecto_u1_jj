package com.uce.edu.demo.service;

import com.uce.edu.demo.modelo.Materia;

public interface IMateriaService {
	

		public void ingresarMateria(Materia m);
		
		
		public Materia buscarPorNombre(String nombre);
		
		
		public void actualizarMateria(Materia m);
			
			
		public void borrarMateria(String nombre);	

	}

