package com.example.demo.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.entidades.Cliente;
import com.example.demo.entidades.Produto_Servico;

public class ClienteDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String nome;
	private String telefone;
	
	private List<Produto_Servico> produtos = new ArrayList<>();
	
	public ClienteDTO() {
	}

	public ClienteDTO(Cliente obj) {
		nome = obj.getNome();
		telefone = obj.getTelefone();
		produtos = obj.getProdutos();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public List<Produto_Servico> getProdutos() {
		return produtos;
	}	
}
