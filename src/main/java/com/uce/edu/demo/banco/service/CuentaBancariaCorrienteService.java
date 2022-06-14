package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.uce.edu.demo.banco.modelo.CuentaBancaria;

@Service
@Qualifier("corriente")
public class CuentaBancariaCorrienteService implements ICuentaBancariaService {

	
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
		// TODO Auto-generated method stub
		// Codigo duplicado lo solucionamos con una fachada
		// CuentaBancaria cta = this.iCuentaBancariaRepository.buscar(numeroCta);

		BigDecimal interes = saldo.multiply(new BigDecimal(0.15));

		return interes;
	}

}
