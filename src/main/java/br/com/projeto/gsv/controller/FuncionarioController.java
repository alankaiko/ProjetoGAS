package br.com.projeto.gsv.controller;

import java.util.List;

import br.com.gsv.funcionario.domain.Funcionario;
import br.com.projeto.gsv.service.CadastroFuncionarioService;

public class FuncionarioController {

	private Funcionario funcionario;
	private CadastroFuncionarioService cadastroService;

	
	
	public FuncionarioController() {
		this.funcionario = new Funcionario();
		this.cadastroService = new CadastroFuncionarioService();
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
