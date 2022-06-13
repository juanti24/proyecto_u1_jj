package com.uce.edu.demo.supermercado.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.uce.edu.demo.supermercado.modelo.Inventario;
import com.uce.edu.demo.supermercado.modelo.Producto;
import com.uce.edu.demo.supermercado.respository.IInventarioRepository;

@Service
public class InventarioServiceImpl implements IInventarioService {

	@Autowired
	private IInventarioRepository iInventarioRepository;

	@Override
	public void ingresar(Inventario i) {
		this.iInventarioRepository.insertar(i);

	}

	@Override
	public Inventario consultar() {
		// TODO Auto-generated method stub
		return this.iInventarioRepository.consultar();
	}

	@Override
	public void actualizar(Inventario i) {
		this.iInventarioRepository.actualizar(i);

	}

	@Override
	public void borrar() {
		this.iInventarioRepository.eliminar();
	}

	@Override
	public void agregarProducto(Producto p) {

		Inventario inventario = this.iInventarioRepository.consultar();
		inventario.getListaProductos().add(p);
		this.iInventarioRepository.actualizar(inventario);

		System.out.println("Se ha añadido un producto: " + p.getNombre());
	}

}
