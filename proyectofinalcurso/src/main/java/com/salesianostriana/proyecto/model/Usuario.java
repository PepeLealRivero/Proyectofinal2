package com.salesianostriana.proyecto.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity

public class Usuario {
	
	private String nombre;
	private String apellidos;
	private String edad;
	private String email;
	private String contrasenia;
	private String nombreUsuario;
	@Id @GeneratedValue
	private Long id;
	// TODO: Puede bajar la nota si no se ha escogido correctamente. Falta el atributo mappedBy
	@OneToMany(fetch=FetchType.EAGER, mappedBy="usuario")
	Set<Pedido> pedido = new HashSet<Pedido>();
	
	public Usuario() {
		super();
	}

	public Usuario(String nombre, String apellidos, String edad, String email, String contrasenia, String nombreUsuario) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.email = email;
		this.contrasenia = contrasenia;
		this.nombreUsuario = nombreUsuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", email=" + email
				+ ", contrasenia=" + contrasenia + ", nombreUsuario=" + nombreUsuario + ", id=" + id + "]";
	}
	
	
	
	
	
	
	
	
	

}
