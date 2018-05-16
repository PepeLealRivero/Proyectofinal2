package com.salesianostriana.proyecto.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity

public class LineaPedido {

	@ManyToOne
	private Pedido pedido;
	@OneToMany(cascade=CascadeType.ALL, orphanRemoval=true, fetch=FetchType.EAGER)
	private Set<Productos> producto = new HashSet<Productos>();
	private int cantidad;
	@Id
	@GeneratedValue
	private Long id;

	public LineaPedido() {

	}

	public LineaPedido(int cantidad) {
		this.cantidad = cantidad;
	}

	public Set<Productos> getProducto() {
		return producto;
	}

	public void setProducto(Set<Productos> producto) {
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
