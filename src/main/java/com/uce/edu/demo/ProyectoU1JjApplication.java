package com.uce.edu.demo;

import java.math.BigDecimal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.modelo.Transferencia;
import com.uce.edu.demo.banco.service.ICuentaBancariaService;
import com.uce.edu.demo.banco.service.IDepositoService;
import com.uce.edu.demo.banco.service.IRetiroService;
import com.uce.edu.demo.banco.service.ITransferenciaService;

@SpringBootApplication
public class ProyectoU1JjApplication implements CommandLineRunner {

	@Autowired
	private ITransferenciaService itransferenciaService ;
	@Autowired
	private IDepositoService idepositoService;
	@Autowired
	private IRetiroService iretiroService;
	@Autowired
	private ICuentaBancariaService icuentabancariaService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1JjApplication.class, args);
	}

	public void run(String... args) throws Exception {
		
		
		
		CuentaBancaria cuenta = new CuentaBancaria();
		cuenta.setNumero("100131");
		cuenta.setSaldo(new BigDecimal(200));
		
		System.out.println(" ");
		System.out.println("Cuenta Bancaria");
		this.icuentabancariaService.isertarCuenta(cuenta);
		cuenta.setNumero("100101");
		this.icuentabancariaService.actualizarCuenta(cuenta);
		this.icuentabancariaService.buscar("100101");
		this.icuentabancariaService.borrar("100131");
		
		System.out.println("Se realiza la Transferencia");
		this.itransferenciaService.realizarTransferencia("100111", "100112", new BigDecimal(20));
		this.itransferenciaService.buscarTransferencia("100111");
		this.itransferenciaService.actualizarTransferencia("100111", "100112", new BigDecimal(100));
		this.itransferenciaService.borrarTransferencia("100111");
		System.out.println(" ");
		
		System.out.println("Se realiza el Deposito");
		this.idepositoService.realizarDeposito("10009", new BigDecimal(20));
		this.idepositoService.buscarDeposito("10009");
		this.idepositoService.actualizarDeposito("10009",  new BigDecimal(100));
		this.idepositoService.borrarDeposito("10009");
		
		System.out.println(" ");
		System.out.println("Se realiza el Retiro");
		this.iretiroService.realizarRetiro("10012", new BigDecimal(40) );
	}

}
