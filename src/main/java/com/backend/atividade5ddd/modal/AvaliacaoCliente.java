package com.backend.atividade5ddd.modal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class AvaliacaoCliente {

	private String nomeCliente;
	private Double nota;
	
	public void avaliar(String nome, Double nota) {
		this.nomeCliente = nome;
		this.nota = nota;
	}
	
	public void editarAvaliacao(String nome, Double nota) {
		this.nomeCliente = nome;
		this.nota = nota;
	}
}