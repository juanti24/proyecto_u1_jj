package com.uce.edu.demo.banco.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Deposito;

@Repository
public class DepositoRepositoryImpl implements IDepositoRepository {
	

	@Override
	public void insertarDeposito(Deposito d) {
		System.out.println("Aqui se creo el deposido: " + d);
		
	}
	
	

}
