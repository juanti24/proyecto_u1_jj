package com.uce.edu.demo.supermercado.respository;

import com.uce.edu.demo.supermercado.modelo.Producto;

public interface IProductoRepository {
	
	public void insertar(Producto p);
	
	public Producto buscar(String nombre);
	
	public void actualizar(Producto p);
	
	public void eliminar(String nombre);

}
