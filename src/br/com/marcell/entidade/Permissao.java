package br.com.marcell.entidade;

import javax.persistence.Entity;

@Entity
public class Permissao extends BaseEntidade {

	private static final long serialVersionUID = 8115095014225327677L;

	private String descricao;

	private String permissao;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getPermissao() {
		return permissao;
	}

	public void setPermissao(String permissao) {
		this.permissao = permissao;
	}
}