package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.modelo.Retiro;
import com.uce.edu.demo.banco.repository.IRetiroRepository;

@Service
public class RetiroServiceImpl implements IRetiroService {

	@Autowired
	private ICuentaBancariaService bancariaService;
	@Autowired
	private IRetiroRepository retiroRepository;
	
	@Override
	public void realizarRetiro(String numeroCtaOrigen, BigDecimal monto) {
		CuentaBancaria ctaOrigen = this.bancariaService.buscar(numeroCtaOrigen);
		BigDecimal saldoCtaOrigen = ctaOrigen.getSaldo();
		BigDecimal saldoFinal =  saldoCtaOrigen.subtract(monto);
		ctaOrigen.setSaldo(saldoFinal);
		this.bancariaService.actualizarCuenta(ctaOrigen);
		
		Retiro retiro = new Retiro();
		retiro.setFecha(LocalDateTime.now());
		retiro.setNumeroCuentaOrigen(numeroCtaOrigen);
		retiro.setMonto(monto);
		this.retiroRepository.retirar(retiro);
		
	}

}
