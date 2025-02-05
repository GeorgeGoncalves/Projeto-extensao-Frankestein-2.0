package com.example.demo.controle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entidades.Cliente;

@RestController
@RequestMapping("/clientes")
public class ClienteControle {

	@GetMapping
	public ResponseEntity<List<Cliente>> encontrarTodos() {
		
		List<Cliente> lista = new ArrayList<>();
		
		Cliente c1 = new Cliente(null, "Jane Eyre", "Belvedere",
				"(031) 9999-4455", "jane@mail.com");
		Cliente c2 = new Cliente(null, "Maria Aparecida", "Alpha Ville",
				"(031) 9888-1234","maria@mail.com");
		
		lista.addAll(Arrays.asList(c1, c2));
		
		return ResponseEntity.ok().body(lista);
	}
}
