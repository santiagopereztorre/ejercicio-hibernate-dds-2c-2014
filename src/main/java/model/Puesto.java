package model;

import javax.persistence.Entity;

@SuppressWarnings("serial")
@Entity
public class Puesto extends EntidadPersistente {

	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
