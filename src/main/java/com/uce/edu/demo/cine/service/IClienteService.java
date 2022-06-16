package com.uce.edu.demo.cine.service;

import com.uce.edu.demo.cine.modelo.Cliente;

public interface IClienteService {
	
	public void ingresarCliente(Cliente c);
	
	
	public Cliente buscarPorApellido(String apellido);
	
	
	public void actualizarEstudiante(Cliente c);
		
		
	public void borrarCliente(String cedula);	

}
