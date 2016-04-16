package br.com.marcell.servico;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import br.com.marcell.entidade.Usuario;
import br.com.marcell.repositorio.UsuarioRepositorio;

public class UsuarioServico {

	@Inject
	private UsuarioRepositorio usuarioRepositorio;

	public Usuario salvar(Usuario usuario) {
		return usuarioRepositorio.salvar(usuario);
	}

	public List<Usuario> salvar(List<Usuario> usuarioList) {
		List<Usuario> usuarioRetornoList = new ArrayList<>();
		for (Usuario usuario : usuarioList) {
			usuarioRetornoList.add(salvar(usuario));
		}
		return usuarioRetornoList;
	}

	public Usuario getPorId(Object id) {
		return usuarioRepositorio.getPorId(id);
	}

	public List<Usuario> getAll() {
		return usuarioRepositorio.getAll();
	}

	public void excluir(Usuario usuario) {
		usuarioRepositorio.excluir(usuario);
	}

}
