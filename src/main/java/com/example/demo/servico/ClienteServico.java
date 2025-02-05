package com.example.demo.servico;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entidades.Cliente;
import com.example.demo.repositorio.ClienteRepositorio;
import com.example.demo.servico.excecao.ObjetoNaoEncontrado;

@Service
public class ClienteServico {

	@Autowired
	private ClienteRepositorio cRepositorio;
	
	public List<Cliente> encontrarTodos() {
		return cRepositorio.findAll();
	}
	
	public Cliente encontrarPorId(int id) {
		Optional<Cliente> obj = cRepositorio.findById(id);
		return obj.orElseThrow(() -> new ObjetoNaoEncontrado(
				"Objeto não encontrado"));
	}
	
	public Cliente inserir(Cliente obj) {
		return cRepositorio.save(obj);
	}
}
