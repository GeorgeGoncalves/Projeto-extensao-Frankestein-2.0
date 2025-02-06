package com.example.demo.controle;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Produto_ServicoDTO;
import com.example.demo.entidades.Produto_Servico;
import com.example.demo.servico.Produto_ServicoServico;


@RestController
@RequestMapping("/produtos")
public class Produto_ServicoControle {

	@Autowired
	private Produto_ServicoServico psServico;
	
	@GetMapping
	public ResponseEntity<List<Produto_ServicoDTO>> encontrarTodos() {
		List<Produto_Servico> lista = psServico.encontrarTodos();
		List<Produto_ServicoDTO> dto = lista.stream().map(
				x -> new Produto_ServicoDTO(x)).collect(Collectors.toList());
		return ResponseEntity.ok().body(dto);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Produto_ServicoDTO> encontrarPorId(
			@PathVariable int id) {
		Produto_Servico obj = psServico.encontrarPorId(id);
		return ResponseEntity.ok().body(new Produto_ServicoDTO(obj));
	}
}
