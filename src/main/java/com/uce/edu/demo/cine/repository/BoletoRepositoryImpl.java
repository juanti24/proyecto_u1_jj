package com.uce.edu.demo.cine.repository;

import org.springframework.stereotype.Repository;
import com.uce.edu.demo.cine.modelo.Boleto;

@Repository
public class BoletoRepositoryImpl implements IBoletoRepository {

	@Override
	public void insertar(Boleto b) {
		// TODO Auto-generated method stub
		System.out.println("Se ha insertado en la base un boleto: " + b);
	}

	@Override
	public Boleto buscar(String numero) {
		// TODO Auto-generated method stub
		System.out.println("Se ha buscado en la base un boleto : " + numero);
		Boleto b = new Boleto();
		b.setNumero(numero);
		return b;
	}

	@Override
	public void actualizar(Boleto b) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado en la base un boleto: " + b);
		
	}

	@Override
	public void eliminar(String numero) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eleminado en la base un boleto " + numero);
		
	}

}
