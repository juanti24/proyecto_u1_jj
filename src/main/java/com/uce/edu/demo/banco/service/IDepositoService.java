package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import com.uce.edu.demo.banco.modelo.Deposito;

public interface IDepositoService {
	
	public void realizarDeposito(String numeroCtaDestino, BigDecimal monto);
	
	public Deposito buscarDeposito(String numeroCtaDestino);

	public void actualizarDeposito(String numeroCtaDestino, BigDecimal monto);

	public void borrarDeposito(String numeroCtaDestino);
}
