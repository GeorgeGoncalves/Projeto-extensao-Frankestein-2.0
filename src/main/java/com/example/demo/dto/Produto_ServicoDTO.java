package com.example.demo.dto;

import java.io.Serializable;

import com.example.demo.entidades.Cliente;
import com.example.demo.entidades.Produto_Servico;

public class Produto_ServicoDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String nome;
	private Double preco;
	private Integer quantidade;
	
	private Cliente cliente;
	
	public Produto_ServicoDTO() {
	}

	public Produto_ServicoDTO(Produto_Servico obj) {
		nome = obj.getNome();
		preco = obj.getPreco();
		quantidade = obj.getQuantidade();
		cliente = obj.getCliente();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}	
}
