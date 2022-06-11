package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import com.uce.edu.demo.banco.modelo.Transferencia;

@Repository
public class TransferenciaRepositoryImpl implements ITransferenciaRepository {

	@Override
	public void insertar(Transferencia t) {
		System.out.println("Aqui se va a insertar en la base de datos a: " + t);

	}

	@Override
	public void actualizar(Transferencia t) {
		System.out.println("Se ha actualizado en la base la transferencia: " + t);
	}

	

	@Override
	public void eliminar(String numeroCtaDestino) {
		System.out.println("Transferencia eliminada en la cuenta: " + numeroCtaDestino);

	}

	@Override
	public List<Transferencia> consultar(String cuenta, LocalDateTime fehaA, LocalDateTime fehaB) {
		List<Transferencia> listaConsultada= new ArrayList<>();
		
		Transferencia trans1 = new Transferencia ();
		trans1.setFechaTransferencia(fehaB);
		trans1.setMontoTransferir(new BigDecimal(100));
		trans1.setNumeroCuentaDestino("1212");
		trans1.setNumeroCuentaOrigen("1211");
		
		listaConsultada.add(null);
		return listaConsultada;
		
	}

}
