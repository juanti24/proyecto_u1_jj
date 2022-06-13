package com.uce.edu.demo.supermercado.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.uce.edu.demo.supermercado.modelo.Producto;
import com.uce.edu.demo.supermercado.respository.IProductoRepository;

@Service
public class ProductoServiceImpl implements IProductoService {

	@Autowired
	private IProductoRepository iProductoRepository;

	@Override
	public void ingresar(String nombre, int cantidad, BigDecimal precioDist, LocalDateTime fechaIngreso) {
		// TODO Auto-generated method stub

		Producto producto = new Producto();
		producto.setNombre(nombre);
		producto.setCantidad(cantidad);
		producto.setPrecioDistribuidor(precioDist.setScale(2, BigDecimal.ROUND_DOWN));
		producto.setFechaIngresoBodega(fechaIngreso);

		this.iProductoRepository.insertar(producto);
	}

	@Override
	public Producto consultar(String nombre) {
		// TODO Auto-generated method stub
		return this.iProductoRepository.buscar(nombre);
	}

	@Override
	public void actualizar(Producto p) {

		this.iProductoRepository.actualizar(p);
	}

	@Override
	public void borrar(String nombre) {
		this.iProductoRepository.eliminar(nombre);

	}

}
