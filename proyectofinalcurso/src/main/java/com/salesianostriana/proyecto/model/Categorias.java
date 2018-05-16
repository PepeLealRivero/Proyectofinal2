package com.salesianostriana.proyecto.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity

public class Categorias {
	
	private String camisetas;
	private String sudaderas;
	private String musica;
	@Id @GeneratedValue
	private long id;
	
	public Categorias(String camisetas, String sudaderas, String musica) {
		super();
		this.camisetas = camisetas;
		this.sudaderas = sudaderas;
		this.musica = musica;
	}

	public String getCamisetas() {
		return camisetas;
	}

	public void setCamisetas(String camisetas) {
		this.camisetas = camisetas;
	}

	public String getSudaderas() {
		return sudaderas;
	}

	public void setSudaderas(String sudaderas) {
		this.sudaderas = sudaderas;
	}

	public String getMusica() {
		return musica;
	}

	public void setMusica(String musica) {
		this.musica = musica;
	}

	@Override
	public String toString() {
		return "Categorias [camisetas=" + camisetas + ", sudaderas=" + sudaderas + ", musica=" + musica + "]";
	}

}
