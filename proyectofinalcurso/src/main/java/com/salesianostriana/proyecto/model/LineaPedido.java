package com.salesianostriana.proyecto.model;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity

public class LineaPedido {

	@ManyToOne
	private Pedido pedido;
	@ManyToOne
	private Productos producto;
	private int cantidad;
	@Id
	@GeneratedValue	
	private Long id;

	public LineaPedido() {

	}

	public LineaPedido(int cantidad) {
		this.cantidad = cantidad;
	}

	

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
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
		return "LineaPedido [pedido=" + pedido + ", producto=" + producto + ", cantidad=" + cantidad + ", id=" + id
				+ "]";
	}

	

}
