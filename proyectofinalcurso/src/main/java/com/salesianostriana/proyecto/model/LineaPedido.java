package com.salesianostriana.proyecto.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity

public class LineaPedido {
	
	
	@ManyToOne
	private Set<Pedido> pedido;
	private Productos producto;
	private int cantidad;
	@Id @GeneratedValue
	private Long id;
	
	public LineaPedido() {
		super();
	}

	public LineaPedido(Productos producto, int cantidad) {
		super();
		this.producto = producto;
		this.cantidad = cantidad;
	}

	public Productos getProducto() {
		return producto;
	}

	public void setProducto(Productos producto) {
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "LineaPedido [producto=" + producto + ", cantidad=" + cantidad + ", id=" + id + "]";
	}
	
	
	
	
	
}
