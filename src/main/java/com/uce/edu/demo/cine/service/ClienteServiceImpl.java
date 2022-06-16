package com.uce.edu.demo.cine.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.uce.edu.demo.cine.modelo.Cliente;
import com.uce.edu.demo.cine.repository.IClienteRepository;

@Service
public class ClienteServiceImpl implements IClienteService {

	@Autowired
	private IClienteRepository clienteRepository;

	@Override
	public void ingresarCliente(Cliente c) {
		// TODO Auto-generated method stub
		this.clienteRepository.insertar(c);

	}

	@Override
	public Cliente buscarPorApellido(String apellido) {
		// TODO Auto-generated method stub
		this.clienteRepository.buscar(apellido);
		return null;
	}

	@Override
	public void actualizarEstudiante(Cliente c) {
		// TODO Auto-generated method stub
		this.clienteRepository.actualizar(c);

	}

	@Override
	public void borrarCliente(String cedula) {
		// TODO Auto-generated method stub
		this.clienteRepository.eliminar(cedula);

	}

}
