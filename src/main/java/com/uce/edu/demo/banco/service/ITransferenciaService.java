package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import com.uce.edu.demo.banco.modelo.Deposito;
import com.uce.edu.demo.banco.modelo.Transferencia;

public interface ITransferenciaService {

	public void realizarTransferencia(String ctaOrigen, String ctaDestino, BigDecimal monto);

	public Transferencia buscarTransferencia(String numeroCtaDestino);

	public void actualizarTransferencia(String ctaOrigen, String ctaDestino, BigDecimal monto);

	public void borrarTransferencia(String numeroCtaDestino);

}
