package com.uce.edu.demo.repository;


import com.uce.edu.demo.modelo.Materia;

public class MateriaRepository implements IMateriaRepository {

	@Override
	public void insertar(Materia e) {
		// Aqui se realiza la insercción a la base de datos
		System.out.println("Se ha insertado en la materia: " + e);
	}

	@Override
	public Materia buscar(String nombre) {
		// TODO Auto-generated method stub
		
		System.out.println("Se ha buscado en la base una materia: " + nombre);
		Materia n = new Materia();
		n.setNombre(nombre);
		return n;
		
	}

	@Override
	public void actualizar(Materia e) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado en la base la materia: " + e);
	}

	@Override
	public void eliminar(String materia) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado en la base el nombre del estudiante: " + materia);
	}

}
