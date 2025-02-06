package com.example.demo.servico;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entidades.Produto_Servico;
import com.example.demo.repositorio.Produto_ServicoRepositorio;
import com.example.demo.servico.excecao.ObjetoNaoEncontrado;

@Service
public class Produto_ServicoServico {

	@Autowired
	private Produto_ServicoRepositorio psRepositorio;
	
	public List<Produto_Servico> encontrarTodos() {
		return psRepositorio.findAll();
	}
	
	public Produto_Servico encontrarPorId(int id) {
		Optional<Produto_Servico> usuario = psRepositorio.findById(id);
		return usuario.orElseThrow(()-> new ObjetoNaoEncontrado(
				"Objeto não encontrado"));
	}	
}
