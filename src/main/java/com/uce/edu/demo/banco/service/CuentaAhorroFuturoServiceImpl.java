package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.uce.edu.demo.banco.modelo.CuentaBancaria;

@Service
@Qualifier("ahorros futuro")
public class CuentaAhorroFuturoServiceImpl implements ICuentaBancariaService {

	@Override
	public void isertarCuenta(CuentaBancaria c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CuentaBancaria buscar(String numero) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizarCuenta(CuentaBancaria c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borrar(String numero) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public BigDecimal calcularInteres(String numeroCta, BigDecimal saldo) {
		BigDecimal interes = new BigDecimal(230).multiply(new BigDecimal(10).divide(new BigDecimal(20)));
		interes = interes.add((saldo.divide(new BigDecimal(100))));

		return interes;
	}

}
