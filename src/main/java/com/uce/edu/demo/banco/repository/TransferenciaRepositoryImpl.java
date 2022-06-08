package com.uce.edu.demo.banco.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Transferencia;

@Repository
public class TransferenciaRepositoryImpl implements ITransferenciaRepository {

	@Override
	public void insertar(Transferencia t) {
		System.out.println("Aqui se va a insertar en la base de datos a: " + t);
		
	}

	@Override
	public String toString() {
		return "TransferenciaRepositoryImpl [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	

}
