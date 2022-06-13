package com.uce.edu.demo.supermercado.respository;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.stereotype.Repository;
import com.uce.edu.demo.supermercado.modelo.Producto;

@Repository
public class ProductoRepositoryImpl implements IProductoRepository{

	@Override
	public void insertar(Producto p) {
		System.out.println("Se ha insertado en la base un producto: " + p);
	}

	@Override
	public Producto buscar(String nombre) {
		System.out.println("Se ha buscado en la base el producto: " + nombre);
		Producto p = new Producto();
		p.setNombre(nombre);
		p.setCantidad(10);
		p.setFechaIngresoBodega(LocalDateTime.of(2021, 10, 1, 15, 20));
		p.setPrecioDistribuidor(new BigDecimal(9.99).setScale(2, BigDecimal.ROUND_DOWN));
		return p;
	}

	@Override
	public void actualizar(Producto p) {
		System.out.println("Se ha actualizado en la base el producto: " + p);
		
	}

	@Override
	public void eliminar(String nombre) {
		System.out.println("Se ha eliminado en la base el producto: " + nombre);
	}

}
