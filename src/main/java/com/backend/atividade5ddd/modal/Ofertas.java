package com.backend.atividade5ddd.modal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Ofertas {

	private String vendedor;
	private Double preco;

	public Ofertas criarOferta(String vendedor, Double preco) {
		return Ofertas.builder().vendedor(vendedor).preco(preco).build();
	}
}
