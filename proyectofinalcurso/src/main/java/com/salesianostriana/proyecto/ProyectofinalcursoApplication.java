package com.salesianostriana.proyecto;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.salesianostriana.proyecto.model.Usuario;
import com.salesianostriana.proyecto.service.UsuarioService;

@SpringBootApplication
public class ProyectofinalcursoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectofinalcursoApplication.class, args);

	}
	
	@Bean
	public CommandLineRunner insertInitialData(UsuarioService service) {
		return args -> {
			Usuario nuevoUsuario = new Usuario("Pepe", "Leal", 20, "admin@admin.com", "admin", "admin", true);
			service.save(nuevoUsuario);
			
			Usuario nuevoUsuario1 = new Usuario("Juan", "Campillo", 23, "usuario@usuario.com", "1234", "user", false);
		};
	}
}
