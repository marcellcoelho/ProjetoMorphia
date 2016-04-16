package br.com.marcell.repositorio;

import br.com.marcell.entidade.Usuario;

public class Main {
	
	public static void main(String[] args) {
		UsuarioRepositorio usuarioRepositorio = new UsuarioRepositorio();
		Usuario usuario = new Usuario();
		usuario.setLogin("teste");
		usuario.setNome("teste");
		usuario.setSenha("teste");
		usuarioRepositorio.salvar(usuario);
	}
	
}
