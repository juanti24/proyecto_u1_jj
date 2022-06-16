package com.uce.edu.demo.cine.repository;

import com.uce.edu.demo.cine.modelo.Boleto;

public interface IBoletoRepository {

	public void insertar(Boleto b);

	public Boleto buscar(String numero);

	public void actualizar(Boleto b);

	public void eliminar(String numero);

}
