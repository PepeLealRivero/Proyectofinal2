package com.salesianostriana.proyecto;

import java.time.LocalDateTime;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.salesianostriana.proyecto.model.Pedido;
import com.salesianostriana.proyecto.model.Usuario;
import com.salesianostriana.proyecto.service.PedidoService;
import com.salesianostriana.proyecto.service.UsuarioService;

@SpringBootApplication
public class ProyectofinalcursoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectofinalcursoApplication.class, args);
		

	}
}
