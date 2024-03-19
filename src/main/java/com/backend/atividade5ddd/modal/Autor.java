package com.backend.atividade5ddd.modal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Autor{
	private String nome;
	
	public Autor criarAutor(String nome) {
		return Autor.builder().nome(nome).build();
	}
}