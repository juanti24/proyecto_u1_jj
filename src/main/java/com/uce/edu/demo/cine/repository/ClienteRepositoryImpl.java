package com.uce.edu.demo.cine.repository;

import org.springframework.stereotype.Repository;
import com.uce.edu.demo.cine.modelo.Cliente;

@Repository
public class ClienteRepositoryImpl implements IClienteRepository {

	@Override
	public void insertar(Cliente c) {
		// TODO Auto-generated method stub
		System.out.println("Se ha insertado en la base el cliente: " + c);
	}

	@Override
	public Cliente buscar(String apellido) {
		System.out.println("Se ha buscado en el cliente con apellido: " + apellido);
		Cliente c = new Cliente();
		c.setApellido(apellido);
		return c;
	}

	@Override
	public void actualizar(Cliente c) {
		System.out.println("Se ha actualizado en la base el cliente: " + c);

	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado en la base el cliente con cedula:  " + cedula);
	}

}
