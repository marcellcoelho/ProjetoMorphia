package br.com.marcell.repositorio;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.dao.BasicDAO;

import com.mongodb.MongoClient;

import br.com.marcell.entidade.BaseEntidade;

public abstract class BaseRepositorio<T extends BaseEntidade> extends BasicDAO<T, BaseEntidade>{

    private static MongoClient mongo;
    private static Morphia morphia;
    private static Datastore datastore;
	
	protected BaseRepositorio() {
		super(getEntityManager());
	}

	private static MongoClient getMongo() {
		if (mongo == null) {
			mongo = new MongoClient("localhost");
		}
		return mongo;
	}

	private static Morphia getMorphia() {
		if (morphia == null) {
			morphia = new Morphia();
			morphia.mapPackage("br.com.marcell.entidade");
		}
		return morphia;
	}

	public static Datastore getEntityManager() {
		if (datastore == null) {
			datastore = getMorphia().createDatastore(getMongo(), "usuario");
		}
		return datastore;
	}
	
	
	
	

}
