package com.backend.atividade5ddd.modal;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Builder
@Data
public class Livro {

	private Long id;
	private String titulo;
	private String isbn;
	private String dirFoto;
	private String descricao;
	private Set<Autor> autores;
	private Set<Livro> livrosRelacionados;
	private Set<Revisao> revisoes;
	private Set<AvaliacaoCliente> avaliacoes;
	private Estoque estoque;
	private Set<Ofertas> ofertas;

	public Livro() {
		this.autores = new HashSet<>();
		this.livrosRelacionados = new HashSet<>();
		this.revisoes = new HashSet<>();
		this.avaliacoes = new HashSet<>();
		this.ofertas = new HashSet<>();
		this.estoque = Estoque.builder().quantidade(0).build();
	}
	public void adicionarEditarAutor(Autor autor) {
		if (this.autores != null) {
			Optional<Autor> aux = autores.stream().filter(a -> a.getNome().equalsIgnoreCase(autor.getNome())).findAny();
			if (aux != null && aux.isPresent()) {
				autores.remove(aux.get());
			}
			autores.add(autor);
		} else {
			this.autores = new HashSet<>();
			autores.add(autor);
		}
	}

	public void removerAutor(String nome) {
		if (this.autores != null) {
			Optional<Autor> autorAux = this.autores.stream().filter(autor -> autor.getNome().equalsIgnoreCase(nome))
					.findAny();
			if (autorAux != null && autorAux.isPresent()) {
				autores.remove(autorAux.get());
			}
		}
	}
	public void adicionarEditarLivrosRelacionados(Livro livro) {
		if (this.livrosRelacionados != null) {
			Optional<Livro> aux = livrosRelacionados.stream().filter(a -> a.getTitulo().equalsIgnoreCase(livro.getTitulo())).findAny();
			if (aux != null && aux.isPresent()) {
				livrosRelacionados.remove(aux.get());
			}
			livrosRelacionados.add(livro);
		} else {
			this.livrosRelacionados = new HashSet<>();
			livrosRelacionados.add(livro);
		}
	}
	
	public void removerLivroRelacionado(String nome) {
		if (this.livrosRelacionados != null) {
			Optional<Livro> livroAux = this.livrosRelacionados.stream().filter(livro -> livro.getTitulo().equalsIgnoreCase(nome))
					.findAny();
			if (livroAux != null && livroAux.isPresent()) {
				livrosRelacionados.remove(livroAux.get());
			}
		}
	}
	public void adicionarEditarRevisoes(Revisao revisao) {
		if (this.revisoes != null) {
			Optional<Revisao> aux = revisoes.stream().filter(a -> a.getNomeCliente().equalsIgnoreCase(revisao.getNomeCliente())).findAny();
			if (aux != null && aux.isPresent()) {
				revisoes.remove(aux.get());
			}
			revisoes.add(revisao);
		} else {
			this.revisoes = new HashSet<>();
			revisoes.add(revisao);
		}
	}
	
	public void removerRevisao(String nomeCliente) {
		if (this.autores != null) {
			Optional<Revisao> revisaoAux = this.revisoes.stream().filter(revisao -> revisao.getNomeCliente().equals(nomeCliente))
					.findAny();
			if (revisaoAux != null && revisaoAux.isPresent()) {
				revisoes.remove(revisaoAux.get());
			}
		}
	}
	public void adicionarEditarAvaliacao(AvaliacaoCliente avaliacao) {
		if (this.avaliacoes != null) {
			Optional<AvaliacaoCliente> aux = this.avaliacoes.stream().filter(a -> a.getNomeCliente().equalsIgnoreCase(avaliacao.getNomeCliente())).findAny();
			if (aux != null && aux.isPresent()) {
				avaliacoes.remove(aux.get());
			}
			avaliacoes.add(avaliacao);
		} else {
			this.avaliacoes = new HashSet<>();
			avaliacoes.add(avaliacao);
		}
	}
	
	public void removerAvaliacao(String nome) {
		if (this.avaliacoes != null) {
			Optional<AvaliacaoCliente> avaliacaoAux = this.avaliacoes.stream().filter(avaliacao -> avaliacao.getNomeCliente().equalsIgnoreCase(nome))
					.findAny();
			if (avaliacaoAux != null && avaliacaoAux.isPresent()) {
				avaliacoes.remove(avaliacaoAux.get());
			}
		}
	}
	public void adicionarEditarOfertas(Ofertas oferta) {
		if (this.ofertas != null) {
			Optional<Ofertas> aux = this.ofertas.stream().filter(a -> a.getVendedor().equalsIgnoreCase(oferta.getVendedor())).findAny();
			if (aux != null && aux.isPresent()) {
				ofertas.remove(aux.get());
			}
			ofertas.add(oferta);
		} else {
			this.ofertas = new HashSet<>();
			ofertas.add(oferta);
		}
	}
	
	public void removerOfertas(String nomeVendedor) {
		if (this.ofertas != null) {
			Optional<Ofertas> ofertaAux = this.ofertas.stream().filter(oferta -> oferta.getVendedor().equalsIgnoreCase(nomeVendedor))
					.findAny();
			if (ofertaAux != null && ofertaAux.isPresent()) {
				ofertas.remove(ofertaAux.get());
			}
		}
	}
	
	public void adicionarNoEstoque(Integer quantidade) {
		if(this.estoque != null) {
			this.estoque.adicionarEstoque(quantidade);
		} else {
			System.out.println("Estoque não cadastrado, crie e adicione ao livro.");
		}
	}
	
	public void removerDoEstoque(Integer qtd) {
		if(this.estoque != null) {
			this.estoque.removerEstoque(qtd);
		} else {
			System.out.println("Estoque não cadastrado, crie e adicione ao livro.");
		}
	}
	
}
