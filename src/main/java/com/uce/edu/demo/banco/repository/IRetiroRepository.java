package com.uce.edu.demo.banco.repository;

import java.time.LocalDateTime;
import java.util.List;
import com.uce.edu.demo.banco.modelo.Retiro;

public interface IRetiroRepository {

	public void retirar(Retiro r);
	
	public List<Retiro> consultar(String cuenta, LocalDateTime fehaInicio, LocalDateTime fehaFin);

}
