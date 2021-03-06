package br.com.projeto.gsv.controller;

import java.util.List;

import br.com.gsv.domain.Funcionario;
import br.com.projeto.gsv.service.FuncionarioService;

public class FuncionarioController {

	private Funcionario funcionario;
	private FuncionarioService cadastroService;

	
	
	public FuncionarioController() {
		this.funcionario = new Funcionario();
		this.cadastroService = new FuncionarioService();
	}

	public void SalvarFuncionario() {
		this.cadastroService.Salvar(this.funcionario);
	}

	public void RemoverFuncionario() {
		this.cadastroService.Remover(this.funcionario);
	}

	public List<Funcionario> ListaCompletaDeFuncionarios() {
		return cadastroService.ListandoFuncionarios();
	}

	public Funcionario BuscarPelaID(Long id) {
		return this.cadastroService.BuscandoId(id);
	}
	
	public List<Funcionario> BuscandoPeloRegistro(String coren){
		return this.cadastroService.BuscaRegistroCoren(coren);
	}

	public List<Funcionario> BuscarPeloNome(String nome) {
		return this.cadastroService.BuscandoPeloNome(nome);
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

}
