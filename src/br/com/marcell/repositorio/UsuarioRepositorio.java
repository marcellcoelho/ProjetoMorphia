package br.com.marcell.repositorio;

import java.util.List;

import org.mongodb.morphia.query.Query;

import br.com.marcell.entidade.Usuario;

public class UsuarioRepositorio extends BaseRepositorio<Usuario> {
	
	public Usuario salvar(Usuario usuario) {
		return getPorId(save(usuario).getId());
	}
	
	public void excluir(Usuario usuario) {
		delete(usuario);
	}
	
	public Usuario getPorId(Object id) {
		Query<Usuario> query = createQuery();
		query.and(query.criteria("id").equal(id));
		return findOne(query);
	}
	
	public List<Usuario> getAll() {
		return find().asList();
	}

}
