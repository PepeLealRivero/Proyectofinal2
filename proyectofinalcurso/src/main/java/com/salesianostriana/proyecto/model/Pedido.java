package com.salesianostriana.proyecto.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity

public class Pedido {
	
	@ManyToOne
	private Usuario usuario;
	
	
	@OneToMany(cascade=CascadeType.ALL, orphanRemoval=true, fetch=FetchType.EAGER, mappedBy="pedido")
	private List<LineaPedido> lineaPedido;
	
	@Id @GeneratedValue
	private Long id;
	private LocalDateTime fecha;
	
	public Pedido() {
		super();
	}

	public Pedido(LocalDateTime fecha, LineaPedido lineaPedido) {
		super();
		this.fecha = fecha;
		this.lineaPedido = new ArrayList<LineaPedido>();
	}
	

	public List<LineaPedido> getLineaPedido() {
		return lineaPedido;
	}

	public void setLineaPedido(List<LineaPedido> lineaPedido) {
		this.lineaPedido = lineaPedido;
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
	 
	
	public void addLinea(LineaPedido lp) {
		if (lp != null) {
			lp.setPedido(this);
			this.getLineaPedido().add(lp);
		}
	}
	

	public void removeLinea(LineaPedido lp) {
		if (lp != null) {
			lp.setPedido(null);
			this.getLineaPedido().remove(lp);
		}
	}

}
