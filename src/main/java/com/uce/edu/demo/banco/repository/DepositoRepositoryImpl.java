package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import com.uce.edu.demo.banco.modelo.Deposito;

@Repository
public class DepositoRepositoryImpl implements IDepositoRepository {

	@Override
	public void insertarDeposito(Deposito d) {
		System.out.println("Aqui se crea el deposido: " + d);

	}

	@Override
	public Deposito buscar(String numeroCuentaDestino) {
		// TODO Auto-generated method stub
		System.out.println("Se ha buscado en la base el deposito con la cuenta de destino: " + numeroCuentaDestino);
		Deposito d = new Deposito();
		d.setNumeroCuentaDestino(numeroCuentaDestino);
		return d;
	}

	@Override
	public void actualizar(Deposito d) {
		// TODO Auto-generated method stub
		System.out.println("Deposito actualizado: " + d);
	}

	@Override
	public void eliminar(String numeroCtaDestino) {
		System.out.println("Deposito eliminado en la cuenta: " + numeroCtaDestino);

	}

	@Override
	public List<Deposito> consultar(String cuenta, LocalDateTime fehaInicio, LocalDateTime fehaFin) {
		List<Deposito> listaDepositos = new ArrayList<>();
		Deposito depo1 = new Deposito();
		depo1.setFecha(LocalDateTime.of(2021, 2, 10, 8, 50, 2));
		depo1.setMonto(new BigDecimal(20));
		depo1.setNumeroCuentaDestino("1234");
		listaDepositos.add(depo1);

		Deposito depo2 = new Deposito();
		depo2.setFecha(LocalDateTime.of(2021, 3, 8, 7, 53, 2));
		depo2.setMonto(new BigDecimal(50));
		depo2.setNumeroCuentaDestino("1235");
		listaDepositos.add(depo2);

		return listaDepositos;
	}

}
