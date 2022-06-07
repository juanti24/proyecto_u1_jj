package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.repository.IMatriculaRepository;

@Service
public class MatriculaServiceImpl implements IMatriculaService {

	@Autowired
	private IMatriculaRepository iMatriculaRepository;

	@Override
	public void ingresarMatricula(Matricula m) {
		this.iMatriculaRepository.insertar(m);

	}

	@Override
	public Matricula buscarPorNumero(String numero) {
		return this.iMatriculaRepository.buscar(numero);
	}

	@Override
	public void actualizarMatricula(Matricula m) {
		this.iMatriculaRepository.actualizar(m);

	}

	@Override
	public void borrarMatricula(String numero) {
		this.iMatriculaRepository.eliminar(numero);

	}

}
