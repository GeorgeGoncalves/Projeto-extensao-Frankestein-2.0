package com.example.demo.controle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entidades.Cliente;
import com.example.demo.servico.ClienteServico;

@RestController
@RequestMapping("/clientes")
public class ClienteControle {

	@Autowired
	private ClienteServico cServico;
	
	@GetMapping
	public ResponseEntity<List<Cliente>> encontrarTodos() {
		List<Cliente> lista = cServico.encontrarTodos();
		return ResponseEntity.ok().body(lista);
	}
}
