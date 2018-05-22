package com.salesianostriana.proyecto.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Productos {
	
	private String nombre;
	@Id @GeneratedValue
	private Long id;
	private String descripcion;
	private double precio;
	private String marca;
	private String color;
	private String talla;
	private int cantidad;
	
	
	@ManyToOne
	private Categorias categorias;
	
	
	public Productos(String nombre, String descripcion, double precio, String marca, String color,
			String talla, int cantidad) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.marca = marca;
		this.color = color;
		this.talla = talla;
		this.cantidad = cantidad;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getTalla() {
		return talla;
	}


	public void setTalla(String talla) {
		this.talla = talla;
	}


	public int getCantidad() {
		return cantidad;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}


	@Override
	public String toString() {
		return "Productos [nombre=" + nombre + ", id=" + id + ", descripcion=" + descripcion + ", precio=" + precio
				+ ", marca=" + marca + ", color=" + color + ", talla=" + talla + ", cantidad=" + cantidad + "]";
	}
	
	
	
	
		
	
}