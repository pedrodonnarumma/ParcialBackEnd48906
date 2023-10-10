package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.demo.entities.*;
import com.example.demo.repositories.*;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class DemoApplication {
	@Autowired
	AutorRepository autorRepository;

	@Autowired
	DomicilioRepository domicilioRepository;
	@Autowired
	LibroRepository libroRepository;
	@Autowired
	LocalidadRepository localidadRepository;
	@Autowired
	PersonaRepository personaRepository;


	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	CommandLineRunner init(AutorRepository autorRepository,
						   DomicilioRepository domicilioRepository, LibroRepository libroRepository,
						   LocalidadRepository localidadRepository, PersonaRepository personaRepository) {
		return args -> {

		};
	}
}
