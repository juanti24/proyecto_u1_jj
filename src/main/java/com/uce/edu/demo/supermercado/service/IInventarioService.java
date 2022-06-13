package com.uce.edu.demo.supermercado.service;

import com.uce.edu.demo.supermercado.modelo.Inventario;
import com.uce.edu.demo.supermercado.modelo.Producto;

public interface IInventarioService {
	
	public void ingresar(Inventario i);
	
	public Inventario consultar();
	
	public void actualizar(Inventario i);
	
	public void borrar();
	
	public void agregarProducto(Producto p);

}
