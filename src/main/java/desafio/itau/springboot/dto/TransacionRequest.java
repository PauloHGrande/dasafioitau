package desafio.itau.springboot.dto;

import java.time.OffsetDateTime;

import jakarta.validation.constraints.NotNull;

public class TransacionRequest {

	@NotNull
	//@Min(0)
	private double valor;
	
	@NotNull
	private OffsetDateTime dataHota;

	public double getValor() {
		return valor;
	}

	public OffsetDateTime getDataHota() {
		return dataHota;
	}

}
