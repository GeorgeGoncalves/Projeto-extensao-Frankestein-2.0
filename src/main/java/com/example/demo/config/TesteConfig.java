package com.example.demo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.example.demo.entidades.Cliente;
import com.example.demo.repositorio.ClienteRepositorio;

@Configuration
public class TesteConfig implements CommandLineRunner {

	@Autowired
	private ClienteRepositorio cRepositorio;
	
	@Override
	public void run(String... args) throws Exception {
		
		Cliente c1 = new Cliente(null, "Jane Eyre", "Belvedere",
				"(031) 9999-4455", "jane@mail.com");
		Cliente c2 = new Cliente(null, "Maria Aparecida", "Alpha Ville",
				"(031) 9888-1234","maria@mail.com");
		
	    cRepositorio.saveAll(Arrays.asList(c1, c2));	
	}
}
