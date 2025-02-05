package com.example.demo.dto;

import java.io.Serializable;

import com.example.demo.entidades.Cliente;

public class ClienteDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String nome;
	private String telefone;
	
	public ClienteDTO() {
	}

	public ClienteDTO(Cliente obj) {
		nome = obj.getNome();
		telefone = obj.getTelefone();
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
}
