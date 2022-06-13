package com.uce.edu.demo.supermercado.to;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class InventarioTo {

	private String nombre;
	private int cantidad;
	private BigDecimal precioVenta;
	private LocalDateTime fechaIngresoBodega;

	// SET Y GET
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public BigDecimal getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(BigDecimal precioVenta) {
		this.precioVenta = precioVenta;
	}

	public LocalDateTime getFechaIngresoBodega() {
		return fechaIngresoBodega;
	}

	public void setFechaIngresoBodega(LocalDateTime fechaIngresoBodega) {
		this.fechaIngresoBodega = fechaIngresoBodega;
	}

	@Override
	public String toString() {
		return "Inventario [nombre=" + nombre + ", cantidad=" + cantidad + ", precioVenta=" + precioVenta
				+ ", fechaIngresoBodega=" + fechaIngresoBodega + "]";
	}

}
