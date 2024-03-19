package com.backend.atividade5ddd.modal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Revisao {

	private String nomeCliente;
	private String revisao;
	
	public Revisao criarRevisao(String nomeCliente, String revisao) {
		return Revisao.builder().nomeCliente(nomeCliente).revisao(revisao).build();
	}
}