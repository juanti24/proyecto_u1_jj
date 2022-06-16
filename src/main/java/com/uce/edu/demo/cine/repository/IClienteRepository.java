package com.uce.edu.demo.cine.repository;

import com.uce.edu.demo.cine.modelo.Cliente;

public interface IClienteRepository {

	public void insertar(Cliente c);

	public Cliente buscar(String apellido);

	public void actualizar(Cliente c);

	public void eliminar(String cedula);

}
