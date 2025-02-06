package com.example.demo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entidades.Produto_Servico;

public interface Produto_ServicoRepositorio extends JpaRepository<Produto_Servico, Integer>{
	
}
