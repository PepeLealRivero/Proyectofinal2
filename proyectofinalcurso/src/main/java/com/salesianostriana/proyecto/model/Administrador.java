package com.salesianostriana.proyecto.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity

public class Administrador {
	
	private String nombre;
	private String apellidos;
	private String edad;
	private String email;
	private String contrasenia;
	private String nombreUsuario;
	@Id @GeneratedValue
	private Long id;
	private boolean admin;
	@OneToMany
	private Set<Usuario> usuario;
	
	
	public Administrador() {
		super();
	}


	public Administrador(String nombre, String apellidos, String edad, String email, String contrasenia,
			String nombreUsuario, boolean admin) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.email = email;
		this.contrasenia = contrasenia;
		this.nombreUsuario = nombreUsuario;
		this.admin = admin;
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


	public boolean isAdmin() {
		return admin;
	}


	public void setAdmin(boolean admin) {
		this.admin = admin;
	}


	@Override
	public String toString() {
		return "Administrador [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", email=" + email
				+ ", contrasenia=" + contrasenia + ", nombreUsuario=" + nombreUsuario + ", id=" + id + ", admin="
				+ admin + "]";
	}
	
	
	
	

}
