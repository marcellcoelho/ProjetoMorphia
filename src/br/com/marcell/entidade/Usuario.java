package br.com.marcell.entidade;

import java.util.List;

import org.mongodb.morphia.annotations.Entity;

@Entity
public class Usuario extends BaseEntidade {

	private static final long serialVersionUID = -2644240694348222711L;

	private String nome;

	private String login;

	private String senha;

	private List<Cargo> cargos;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public List<Cargo> getCargos() {
		return cargos;
	}

	public void setCargos(List<Cargo> cargos) {
		this.cargos = cargos;
	}

}