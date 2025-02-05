package com.example.demo.servico;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entidades.Cliente;
import com.example.demo.repositorio.ClienteRepositorio;

@Service
public class ClienteServico {

	@Autowired
	private ClienteRepositorio cRepositorio;
	
	public List<Cliente> encontrarTodos() {
		return cRepositorio.findAll();
	}
}
