package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;
import org.springframework.stereotype.Repository;
import com.uce.edu.demo.banco.modelo.Deposito;

@Repository
public class DepositoRepositoryImpl implements IDepositoRepository {

	@Override
	public void insertarDeposito(Deposito d) {
		System.out.println("Aqui se crea el deposido: " + d);

	}

	@Override
	public void actualizar(Deposito d) {
		// TODO Auto-generated method stub
		System.out.println("Deposito insertado: " + d);
	}

	@Override
	public Deposito buscar(String numeroCtaDestino) {
		System.out.println("Se busca el deposito en la cuenta: " + numeroCtaDestino);
		Deposito deposito = new Deposito();
		deposito.setNumeroCuentaDestino(numeroCtaDestino);
		deposito.setMonto(new BigDecimal(200));
		return deposito;
	}

	@Override
	public void eliminar(String numeroCtaDestino) {
		System.out.println("Deposito eliminado en la cuenta: " + numeroCtaDestino);

	}

}
