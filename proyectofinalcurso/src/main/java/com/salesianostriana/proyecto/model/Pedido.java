package com.salesianostriana.proyecto.model;

import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity

public class Pedido {
	
	@OneToMany
	private Set<LineaPedido> linePedido;
	@Id @GeneratedValue
	private Long id;
	private LocalDateTime fecha;
	private LineaPedido linPedido;
	
	public Pedido() {
		super();
	}

	public Pedido(LocalDateTime fecha, LineaPedido linPedido) {
		super();
		this.fecha = fecha;
		this.linPedido = linPedido;
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

	public LineaPedido getLinPedido() {
		return linPedido;
	}

	public void setLinPedido(LineaPedido linPedido) {
		this.linPedido = linPedido;
	}

	@Override
	public String toString() {
		return "Pedido [id=" + id + ", fecha=" + fecha + ", linPedido=" + linPedido + "]";
	}
	
	
	
	

}
