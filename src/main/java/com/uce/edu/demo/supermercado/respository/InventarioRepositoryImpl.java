package com.uce.edu.demo.supermercado.respository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import com.uce.edu.demo.supermercado.modelo.Inventario;
import com.uce.edu.demo.supermercado.modelo.Producto;

@Repository
public class InventarioRepositoryImpl implements IInventarioRepository {

	@Override
	public void insertar(Inventario i) {
		// TODO Auto-generated method stub
		System.out.println("Se ha creado el inventario en la Base: " + i);
	}

	@Override
	public Inventario consultar() {
		// TODO Auto-generated method stub
		System.out.println("Consultando el inventario de la Base");
		
		//Simulamos que el inventario en DB tiene estos 4 productos
		Inventario inventario = new Inventario();
		List<Producto> listaConsultada = new ArrayList<>();
		Producto producto1 = new Producto();
		producto1.setNombre("Pera");
		producto1.setCantidad(100);
		producto1.setFechaIngresoBodega(LocalDateTime.of(2022,7,10,0,0));
		producto1.setPrecioDistribuidor(new BigDecimal(0.5));
		
		Producto producto2 = new Producto();
		producto2.setNombre("Aceite");
		producto2.setCantidad(36);
		producto2.setFechaIngresoBodega(LocalDateTime.of(2022,7,9,0,0));
		producto2.setPrecioDistribuidor(new BigDecimal(4.75));
		
		Producto producto3 = new Producto();
		producto3.setNombre("Gaseosa");
		producto3.setCantidad(30);
		producto3.setFechaIngresoBodega(LocalDateTime.of(2022,5,7,0,0));
		producto3.setPrecioDistribuidor(new BigDecimal(1.00));
		
		Producto producto4 = new Producto();
		producto4.setNombre("Leche");
		producto4.setCantidad(46);
		producto4.setFechaIngresoBodega(LocalDateTime.of(2022,6,11,0,0));
		producto4.setPrecioDistribuidor(new BigDecimal(0.95));
		
		Producto producto5 = new Producto();
		producto5.setNombre("Sardina");
		producto5.setCantidad(25);
		producto5.setFechaIngresoBodega(LocalDateTime.of(2022,6,6,0,0));
		producto5.setPrecioDistribuidor(new BigDecimal(0.85));
		
		listaConsultada.add(producto1);
		listaConsultada.add(producto2);
		listaConsultada.add(producto3);
		listaConsultada.add(producto4);
		listaConsultada.add(producto5);
		inventario.setListaProductos(listaConsultada);
		
		return inventario;
	}

	@Override
	public void actualizar(Inventario i) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado el inventario en la Base: " + i);
	}

	@Override
	public void eliminar() {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado el inventario de la Base");
	}


}