package com.salesianostriana.proyecto.model;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity

public class Pedido {
	
	@OneToMany(cascade=CascadeType.ALL, orphanRemoval=true, fetch=FetchType.EAGER)
	Set<LineaPedido> lineasDePedido = new HashSet<LineaPedido>();
	
	@Id @GeneratedValue
	private Long id;
	private LocalDateTime fecha;
	
	public Pedido() {
		super();
	}

	public Pedido(LocalDateTime fecha) {
		super();
		this.fecha = fecha;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Pedido [id=" + id + ", fecha=" + fecha + ","  + "]";
	}
	
	
	
	

}
