package br.com.marcell.entidade;

import java.util.List;

import org.mongodb.morphia.annotations.Entity;

@Entity
public class Cargo extends BaseEntidade {

	private static final long serialVersionUID = -8661575897844960995L;

	private String descricao;

	private String nome;

	private List<Permissao> permissoes;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Permissao> getPermissoes() {
		return permissoes;
	}

	public void setPermissoes(List<Permissao> permissoes) {
		this.permissoes = permissoes;
	}

}