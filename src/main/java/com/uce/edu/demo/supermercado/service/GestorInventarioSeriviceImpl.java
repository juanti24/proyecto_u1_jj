package com.uce.edu.demo.supermercado.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.supermercado.modelo.Inventario;
import com.uce.edu.demo.supermercado.respository.IInventarioRepository;
import com.uce.edu.demo.supermercado.respository.IProductoRepository;
import com.uce.edu.demo.supermercado.to.InventarioTo;
import com.uce.edu.demo.supermercado.modelo.Producto;

@Service
public class GestorInventarioSeriviceImpl implements IGestorInventarioService {
	
	@Autowired
	private IProductoService iProductoService ; 
	@Autowired
	private IInventarioService iInventarioService;

	@Override
	public void agregarProducto(String nombre, Integer cantidad, BigDecimal precioDist, LocalDateTime fechaIngreso) {
		this.iProductoService.ingresar(nombre, cantidad, precioDist, fechaIngreso);

		Producto producto = new Producto();
		producto.setNombre(nombre);
		producto.setCantidad(cantidad);
		producto.setPrecioDistribuidor(precioDist);
		producto.setFechaIngresoBodega(fechaIngreso);
		this.iInventarioService.agregarProducto(producto);;
	}

	@Override
	public void consultar(LocalDateTime fecha) {
		System.out.println("Inventario de productos ingresados en la fecha: " + fecha);
		System.out.println("Nombre  -  Cantidad  -  Precio Venta  - Fecha Ingreso");
		for (InventarioTo productoR : inventario(fecha)) {
			System.out.println(productoR);
		}
	
		} 

	private BigDecimal precioVenta(Producto p) {
		// TODO Auto-generated method stub
		BigDecimal pC = p.getPrecioDistribuidor();
		BigDecimal g = pC.multiply(new BigDecimal(0.1));
		BigDecimal iva = pC.multiply(new BigDecimal(0.12));
		BigDecimal pV = pC.add(g).add(iva);
		BigDecimal precioFinal = pV.setScale(2, BigDecimal.ROUND_DOWN);
		return precioFinal ;
	}

	private List<InventarioTo> inventario(LocalDateTime fecha) {

		List<Producto> listaProductos = this.iInventarioService.consultar().getListaProductos();;
		List<InventarioTo> listaInventario = new ArrayList<>();
		for (Producto p : listaProductos) {
			if (p.getFechaIngresoBodega().isAfter(fecha)) {
				InventarioTo i = new InventarioTo();
				i.setCantidad(p.getCantidad());
				i.setFechaIngresoBodega(p.getFechaIngresoBodega());
				i.setPrecioVenta(precioVenta(p));
				i.setNombre(p.getNombre());
				listaInventario .add(i);
			}

		}
		return listaInventario ;
	}

}
