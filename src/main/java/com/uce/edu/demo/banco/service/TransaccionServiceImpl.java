package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.Deposito;
import com.uce.edu.demo.banco.modelo.Retiro;
import com.uce.edu.demo.banco.modelo.Transferencia;
import com.uce.edu.demo.banco.repository.IDepositoRepository;
import com.uce.edu.demo.banco.repository.IRetiroRepository;
import com.uce.edu.demo.banco.repository.ITransferenciaRepository;
import com.uce.edu.demo.banco.to.TransaccionTo;

@Service
public class TransaccionServiceImpl implements ITransaccionService {

	@Autowired
	private ITransferenciaService iTransferenciaService;
	
	@Autowired
	private IDepositoService iDepositoService;
	
	@Autowired
	private IRetiroService iRetiroService;
	
	@Autowired
	private ITransferenciaRepository iTransferenciaRepository;
	
	@Autowired
	private IDepositoRepository iDepositoRespository;
	
	@Autowired
	private IRetiroRepository iRetiroRepository;

	@Override
	public void transferencia(String origen, String destino, BigDecimal monto) {
		// TODO Auto-generated method stub
		this.iTransferenciaService.realizarTransferencia(origen, destino, monto);
	}

	@Override
	public void deposito(String destino, BigDecimal monto) {
		this.iDepositoService.realizarDeposito(destino, monto);

	}

	@Override
	public void retiro(String ctaRetiro, BigDecimal monto) {
		// TODO Auto-generated method stub
		this.iRetiroService.realizarRetiro(ctaRetiro, monto);
	}

	@Override
	public List<TransaccionTo> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
		// TODO Auto-generated method stub
		List<Transferencia> listaTrans = this.iTransferenciaRepository.consultar(cuenta, fechaInicio, fechaFin);
		List<Deposito> listaDepo = this.iDepositoRespository.consultar(cuenta, fechaInicio, fechaFin);
		List<Retiro> listaReti = this.iRetiroRepository.consultar(cuenta, fechaInicio, fechaFin);
		// Vamos a unir todas las lista
		List<TransaccionTo> listaFinal = new ArrayList<>();

		for (Transferencia t : listaTrans) {
			TransaccionTo transaccionTo = this.transformar(t);
			listaFinal.add(transaccionTo);
		}

		for (Deposito d : listaDepo) {
			TransaccionTo transaccionTo = this.transformar(d);
			listaFinal.add(transaccionTo);
		}

		for (Retiro r : listaReti) {
			TransaccionTo transaccionTo = this.transformar(r);
			listaFinal.add(transaccionTo);
		}

		return listaFinal;
	}

	private TransaccionTo transformar(Transferencia transferencia) {

		TransaccionTo transaccionTo = new TransaccionTo();
		transaccionTo.setFecha(transaccionTo.getFecha());
		transaccionTo.setMonto(transaccionTo.getMonto());
		transaccionTo.setTipo("T");
		return transaccionTo;

	}

	private TransaccionTo transformar(Deposito deposito) {
		TransaccionTo transaccionTo = new TransaccionTo();
		transaccionTo.setFecha(deposito.getFecha());
		transaccionTo.setMonto(deposito.getMonto());
		transaccionTo.setTipo("D");
		return transaccionTo;

	}

	private TransaccionTo transformar(Retiro retiro) {
		TransaccionTo transaccionTo = new TransaccionTo();
		transaccionTo.setFecha(retiro.getFecha());
		transaccionTo.setMonto(retiro.getMonto());
		transaccionTo.setTipo("R");
		return transaccionTo;

	}

}
