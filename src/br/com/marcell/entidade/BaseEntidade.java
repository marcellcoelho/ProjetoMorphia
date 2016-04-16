package br.com.marcell.entidade;

import java.io.Serializable;

import org.bson.types.ObjectId;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;

public abstract class BaseEntidade implements Serializable {

	private static final long serialVersionUID = -3711065710407993086L;

	@Id
	@Property("id")
	@JsonIgnore
	protected ObjectId id;

	public BaseEntidade() {
		super();
	}

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

}