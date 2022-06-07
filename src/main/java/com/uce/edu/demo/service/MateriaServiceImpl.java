package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.uce.edu.demo.modelo.Materia;
import com.uce.edu.demo.repository.IMateriaRepository;

@Service
public class MateriaServiceImpl implements IMateriaService {

	@Autowired
	private IMateriaRepository iMateriaRepository;

	@Override
	public void ingresarMateria(Materia m) {
		this.iMateriaRepository.insertar(m);

	}

	@Override
	public Materia buscarPorNombre(String nombre) {
		return this.iMateriaRepository.buscar(nombre);
	}

	@Override
	public void actualizarMateria(Materia m) {
		this.iMateriaRepository.actualizar(m);

	}

	@Override
	public void borrarMateria(String nombre) {
		this.iMateriaRepository.eliminar(nombre);

	}

}
