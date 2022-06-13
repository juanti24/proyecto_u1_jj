package com.uce.edu.demo.supermercado.modelo;

import java.util.List;

public class Inventario {
	
	private List<Producto> listaProductos;

	//SET Y GET
	public List<Producto> getListaProductos() {
		return listaProductos;
	}

	public void setListaProductos(List<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}

	@Override
	public String toString() {
		return "Inventario [listaProductos=" + listaProductos + "]";
	}
	

}

	