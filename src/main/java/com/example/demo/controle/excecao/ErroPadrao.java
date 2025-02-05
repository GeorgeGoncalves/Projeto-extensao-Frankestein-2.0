package com.example.demo.controle.excecao;

import java.io.Serializable;
import java.time.Instant;

public class ErroPadrao implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Instant momentoErro;
	private Integer status;
	private String erro;
	private String caminho;
	
	public ErroPadrao() {
	}

	public ErroPadrao(Instant momentoErro, Integer status, String erro,
			String caminho) {
		this.momentoErro = momentoErro;
		this.status = status;
		this.erro = erro;
		this.caminho = caminho;
	}

	public Instant getMomentoErro() {
		return momentoErro;
	}

	public void setMomentoErro(Instant momentoErro) {
		this.momentoErro = momentoErro;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getErro() {
		return erro;
	}

	public void setErro(String erro) {
		this.erro = erro;
	}

	public String getCaminho() {
		return caminho;
	}

	public void setCaminho(String caminho) {
		this.caminho = caminho;
	}	
}
