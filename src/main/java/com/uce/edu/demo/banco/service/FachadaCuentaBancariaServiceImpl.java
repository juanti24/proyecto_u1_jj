package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.repository.ICuentaBancariaRepository;

@Service
public class FachadaCuentaBancariaServiceImpl implements IFachadaCuentaBancaria{

	@Autowired
	private ICuentaBancariaRepository iCuentaBancariaRepository;
	
	@Autowired
	@Qualifier("corriente")
	private ICuentaBancariaService iCuentaBancariaService; 
	
	@Autowired
	@Qualifier("ahorros")
	private ICuentaBancariaService iCuentaBancariaServiceA; 
	
	@Autowired
	@Qualifier("ahorros futuro")
	private ICuentaBancariaService iCuentaBancariaServiceAF; 
	
	
	@Override
	public BigDecimal calcularInteres(String numeroCta) {
		// TODO Auto-generated method stub
		
		CuentaBancaria cta = this.iCuentaBancariaRepository.buscar(numeroCta);
		BigDecimal interes=null;
		if(cta.getTipo().equals("A")) {
			//Ahorros
			interes=this.iCuentaBancariaServiceA.calcularInteres(numeroCta, cta.getSaldo());
		}else if (cta.getTipo().equals("F")){
			//Ahorros Futuro
			interes=this.iCuentaBancariaServiceAF.calcularInteres(numeroCta, cta.getSaldo());
			System.out.println("Cuenta de Ahorro Futuro");
		}else {
			//Corriente
			interes=this.iCuentaBancariaService.calcularInteres(numeroCta, cta.getSaldo());
		}
		
		return interes;
	}

}
