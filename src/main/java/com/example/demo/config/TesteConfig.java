package com.example.demo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.example.demo.entidades.Cliente;
import com.example.demo.entidades.Produto_Servico;
import com.example.demo.repositorio.ClienteRepositorio;
import com.example.demo.repositorio.Produto_ServicoRepositorio;

@Configuration
public class TesteConfig implements CommandLineRunner {

	@Autowired
	private ClienteRepositorio cRepositorio;
	
	@Autowired
	private Produto_ServicoRepositorio psRepositorio;
	
	@Override
	public void run(String... args) throws Exception {
		
		Cliente c1 = new Cliente(null, "Jane Eyre", "Belvedere",
				"(031) 9999-4455", "jane@mail.com");
		Cliente c2 = new Cliente(null, "Maria Aparecida", "Alpha Ville",
				"(031) 9888-1234","maria@mail.com");
		
	    cRepositorio.saveAll(Arrays.asList(c1, c2));
	    
	    Produto_Servico ps1 = new Produto_Servico(null, "corte", 40.0, 1, c1);
		Produto_Servico ps2 = new Produto_Servico(null, "pintura de cabelo",
				35.0, 1, c2);
		Produto_Servico ps3 = new Produto_Servico(null, "refrigerante", 5.0,
				2, c1);
		
		psRepositorio.saveAll(Arrays.asList(ps1, ps2, ps3));
	}
}
