package com.uce.edu.demo.banco.service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;

public interface ICuentaBancariaService {

	public void actualizarCuenta(CuentaBancaria c);

	public CuentaBancaria buscar(String numero);
	
	public void isertarCuenta(CuentaBancaria c);

	public void borrar(String numero);
	
}
