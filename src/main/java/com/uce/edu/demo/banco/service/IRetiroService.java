package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import com.uce.edu.demo.banco.modelo.Retiro;

public interface IRetiroService {

	public void realizarRetiro(String numeroCtaOrigen, BigDecimal monto);

	public void actualizarrRetiro(Retiro r);

	public Retiro buscarRetiro(String c);

	public void eliminarRetiro(String c);

}
