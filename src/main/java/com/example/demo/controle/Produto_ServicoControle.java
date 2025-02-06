package com.example.demo.controle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entidades.Produto_Servico;
import com.example.demo.servico.Produto_ServicoServico;


@RestController
@RequestMapping("/produtos")
public class Produto_ServicoControle {

	@Autowired
	private Produto_ServicoServico psServico;
	
	@GetMapping
	public ResponseEntity<List<Produto_Servico>> encontrarTodos() {
		List<Produto_Servico> lista = psServico.encontrarTodos();		
		return ResponseEntity.ok().body(lista);
	}	
}
