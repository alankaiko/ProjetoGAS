package br.com.projeto.gsv.controller;

import br.com.projeto.gsv.domain.Contato;
import br.com.projeto.gsv.domain.Endereco;
import br.com.projeto.gsv.domain.Funcionario;
import br.com.projeto.gsv.service.FuncionarioService;


public class ControlCadFuncionario {
	FuncionarioService service = new FuncionarioService();
	private Funcionario funcionario;
	private Contato contato;
	private Endereco endereco;
	
	
	public void Inicializar(){
		funcionario = new Funcionario();
		contato = new Contato();
		endereco = new Endereco();
	}
	
	
	public void SalvarFuncionario(){
		service.Salvar(this.funcionario, this.contato, this.endereco);
	}
	
	
	
	
	
	
	
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	public void setContato(Contato contato) {
		this.contato = contato;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	
}
