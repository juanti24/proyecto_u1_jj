package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Service;
import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.modelo.ProfesorGeneral;
import com.uce.edu.demo.modelo.ProfesorMateria;
import com.uce.edu.demo.repository.IMatriculaRepository;

@Service
public class MatriculaServiceImpl implements IMatriculaService {

	@Autowired
	private IMatriculaRepository iMatriculaRepository;
	
	@Autowired
	private ProfesorGeneral profesorGeneral;

	@Autowired
	private ProfesorMateria profesorMateria;
	
	@Override
	public void ingresarMatricula(Matricula m) {
		
		System.out.println("DI desde service SINGLETON " + this.profesorGeneral);
		System.out.println("DI desde service PROTOTYPE " + this.profesorMateria);
		
		System.out.println("DI un metodo General" + this.obtnerProfesorG());
		System.out.println("DI un metodo Materia" + this.obtnerProfesorM());
		
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
	
	@Lookup
    public ProfesorGeneral obtnerProfesorG() {
    	
//    	System.out.println("rrrrrrrrrrrrrrrrr");
		//Anula todo lo que esta aqui
    	//Inyecta lo que esta en la memoria 
    	return null;
		
	}
	
	@Lookup
    public ProfesorMateria obtnerProfesorM() {
//    	System.out.println("rrrrrrrrrrrrrrrrr");
//    	ProfesorMateria profeM = new ProfesorMateria();
//		profeM.setApellido("Tapia");
//		profeM.setNombre("Jose");
		return null;
		
	}

}
