package com.uce.edu.demo.banco.repository;

import java.time.LocalDateTime;
import java.util.List;
import com.uce.edu.demo.banco.modelo.Retiro;

public interface IRetiroRepository {

	public void insertar(Retiro r);

	public Retiro buscar(String ctaOrigen);

	public void actualizar(Retiro r);

	public void borrar(String ctaOrigen);

	public List<Retiro> consultar(String cuenta, LocalDateTime fehaInicio, LocalDateTime fehaFin);

}
