package com.salesianostriana.proyecto.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity

public class Categorias {
	
	private String camisetas;
	private String sudaderas;
	private String musica;
	@Id @GeneratedValue
	private Long id;
	
	@OneToMany(fetch=FetchType.EAGER)
	Set<Productos> productos = new HashSet<Productos>();
	
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
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Categorias [camisetas=" + camisetas + ", sudaderas=" + sudaderas + ", musica=" + musica + "]";
	}

}
