package desafio.itau.springboot.model;

import java.time.OffsetDateTime;

public class Transaction {
	
	private double valor;
	private OffsetDateTime dataHota;
	
	public Transaction(final double valor, final OffsetDateTime dataHota) {
		this.valor = valor;
		this.dataHota = dataHota;
	}

	public double getValor() {
		return valor;
	}

	public OffsetDateTime getDataHota() {
		return dataHota;
	}
	
	
	
}
