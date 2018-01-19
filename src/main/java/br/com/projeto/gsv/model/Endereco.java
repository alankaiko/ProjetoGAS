package br.com.projeto.gsv.model;

import java.io.Serializable;

public class Endereco implements Serializable {
	private static final long serialVersionUID = 1L;

	private double id;
	private String logradouro;
	private String complemento;
	private double numero;
	private String bairro;
	private String cidade;
	private String estado;
	
	

	public double getId() {
		return id;
	}

	public void setId(double id) {
		this.id = id;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	
	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public double getNumero() {
		return numero;
	}

	public void setNumero(double numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
