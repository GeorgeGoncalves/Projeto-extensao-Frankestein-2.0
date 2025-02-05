package com.example.demo.controle;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ClienteDTO;
import com.example.demo.entidades.Cliente;
import com.example.demo.servico.ClienteServico;

@RestController
@RequestMapping("/clientes")
public class ClienteControle {

	@Autowired
	private ClienteServico cServico;
	
	@GetMapping
	public ResponseEntity<List<ClienteDTO>> encontrarTodos() {
		List<Cliente> lista = cServico.encontrarTodos();
		List<ClienteDTO> dto = lista.stream().map(x -> new ClienteDTO(x))
				.collect(Collectors.toList());
		return ResponseEntity.ok().body(dto);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<ClienteDTO> encontrarPorId(@PathVariable int id) {
		Cliente obj = cServico.encontrarPorId(id);
		return ResponseEntity.ok().body(new ClienteDTO(obj));
	}
}
