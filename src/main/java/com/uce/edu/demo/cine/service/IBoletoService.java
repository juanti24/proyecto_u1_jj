package com.uce.edu.demo.cine.service;

import com.uce.edu.demo.cine.modelo.Boleto;

public interface IBoletoService {

	public void ingresarBoleto(Boleto b);

	public Boleto buscarPorNumero(String numero);

	public void actualizarBoleto(Boleto b);

	public void borrarBoleto(String numero);
}
