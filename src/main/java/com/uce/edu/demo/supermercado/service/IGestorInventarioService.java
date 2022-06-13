package com.uce.edu.demo.supermercado.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public interface IGestorInventarioService {
	
	public void agregarProducto(String nombre, Integer cantidad,BigDecimal precioDist, LocalDateTime fechaIngreso );
	
	public void consultar(LocalDateTime fecha);
}
