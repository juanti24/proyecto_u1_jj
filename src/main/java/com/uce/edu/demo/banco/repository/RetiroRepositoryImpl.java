package com.uce.edu.demo.banco.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Retiro;

@Repository
public class RetiroRepositoryImpl implements IRetiroRepository {

	@Override
	public void retirar(Retiro r) {
		System.out.println("Aqui se realiza el retiro: " + r);
		
	}

}
