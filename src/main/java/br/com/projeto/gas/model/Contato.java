package br.com.projeto.gas.model;

import java.io.Serializable;




public class Contato  implements Serializable{
	private static final long serialVersionUID = 1L;
	private String email;
	private String telefone;
	private String celular;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

}
