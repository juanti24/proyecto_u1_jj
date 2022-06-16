package com.uce.edu.demo.cine.modelo;

public class Boleto {

	private String numero;
	private Cliente cliente;
	private Pelicula pelicula;

	// SET Y GET
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

	@Override
	public String toString() {
		return "CompraBoleto [numero=" + numero + ", cliente=" + cliente + ", pelicula=" + pelicula + "]";
	}

}
