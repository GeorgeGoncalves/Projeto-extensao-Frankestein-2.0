package com.example.demo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entidades.Cliente;

public interface ClienteRepositorio extends JpaRepository<Cliente, Integer>{
	
}
