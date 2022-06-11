package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.uce.edu.demo.banco.modelo.Retiro;

@Repository
public class RetiroRepositoryImpl implements IRetiroRepository {

	@Override
	public void retirar(Retiro r) {
		System.out.println("Aqui se realiza el retiro: " + r);
		
	}

	@Override
	public List<Retiro> consultar(String cuenta, LocalDateTime fehaInicio, LocalDateTime fehaFin) {
		List<Retiro> listaRetiros = new ArrayList<>();
		Retiro retiro1 = new Retiro();
		retiro1.setFecha(LocalDateTime.of(2021, 12, 1, 8, 45, 3));
		retiro1.setMonto(new BigDecimal(25));
		retiro1.setNumeroCuentaOrigen("1214");
		
		listaRetiros.add(retiro1);
		
		return listaRetiros;
	}

}
