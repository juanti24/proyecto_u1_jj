package com.uce.edu.demo.supermercado.respository;

import com.uce.edu.demo.supermercado.modelo.Inventario;

public interface IInventarioRepository {
	

    public void insertar(Inventario i);
	
	public Inventario consultar();
	
	public void actualizar(Inventario i);
	
	public void eliminar();
	
		
}
