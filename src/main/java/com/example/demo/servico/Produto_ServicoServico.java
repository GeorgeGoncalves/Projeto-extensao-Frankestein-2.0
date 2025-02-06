package com.example.demo.servico;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entidades.Produto_Servico;
import com.example.demo.repositorio.Produto_ServicoRepositorio;

@Service
public class Produto_ServicoServico {

	@Autowired
	private Produto_ServicoRepositorio psRepositorio;
	
	public List<Produto_Servico> encontrarTodos() {
		return psRepositorio.findAll();
	}
}
