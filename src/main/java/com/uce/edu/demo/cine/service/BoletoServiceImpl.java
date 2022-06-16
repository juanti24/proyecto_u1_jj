package com.uce.edu.demo.cine.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.cine.modelo.Boleto;
import com.uce.edu.demo.cine.modelo.Cliente;
import com.uce.edu.demo.cine.modelo.Pelicula;
import com.uce.edu.demo.cine.repository.IBoletoRepository;

@Service
public class BoletoServiceImpl implements IBoletoService {

	@Autowired
	private IBoletoRepository boletoRepository;

	@Autowired
	private Pelicula pelicula;

	@Autowired
	private Cliente cliente;

	@Override
	public void ingresarBoleto(Boleto b) {
		// TODO Auto-generated method stub
		this.cliente.setNombre("Juan");
		this.cliente.setApellido("Jumbo");
		this.cliente.setCedula("1723920979");
		System.out.println("PROTOTYPE " + this.cliente);
		this.boletoRepository.insertar(b);

	}

	@Override
	public Boleto buscarPorNumero(String numero) {
		// TODO Auto-generated method stub
		this.boletoRepository.buscar(numero);
		return null;
	}

	@Override
	public void actualizarBoleto(Boleto b) {
		// TODO Auto-generated method stub

		System.out.println("SINGLETON " + this.pelicula);
		this.boletoRepository.actualizar(b);

	}

	@Override
	public void borrarBoleto(String numero) {
		// TODO Auto-generated method stub
		this.boletoRepository.eliminar(numero);

	}

}
