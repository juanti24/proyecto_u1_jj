package com.uce.edu.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.modelo.Transferencia;
import com.uce.edu.demo.banco.service.ICuentaBancariaService;
import com.uce.edu.demo.banco.service.IDepositoService;
import com.uce.edu.demo.banco.service.IFachadaCuentaBancaria;
import com.uce.edu.demo.banco.service.IRetiroService;
import com.uce.edu.demo.banco.service.ITransferenciaService;
import com.uce.edu.demo.supermercado.service.IGestorInventarioService;

@SpringBootApplication
public class ProyectoU1JjApplication implements CommandLineRunner {

	@Autowired
	private IFachadaCuentaBancaria bancaria;
	
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1JjApplication.class, args);
	}

	public void run(String... args) throws Exception {

		BigDecimal interes = this.bancaria.calcularInteres("1213");
		System.out.println(interes);
	}

}
