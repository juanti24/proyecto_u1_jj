package com.uce.edu.demo.banco.repository;

import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.banco.modelo.Transferencia;

public interface ITransferenciaRepository {

	public void insertar(Transferencia t);
	
	public List<Transferencia> consultar(String cuenta, LocalDateTime fehaInicio, LocalDateTime fehaFinal );
	
	public void actualizar(Transferencia t);
			
	public void eliminar(String numeroCtaDestino);	
	
	

	
}
