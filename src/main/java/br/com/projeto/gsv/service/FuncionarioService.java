package br.com.projeto.gsv.service;

import br.com.projeto.gsv.domain.Contato;
import br.com.projeto.gsv.domain.Endereco;
import br.com.projeto.gsv.domain.Funcionario;
import br.com.projeto.gsv.repository.FuncionarioRepository;

public class FuncionarioService {
	FuncionarioRepository repositorio= new FuncionarioRepository();
	
	public void Salvar(Funcionario funcionario, Contato contato, Endereco endereco){
		funcionario.setContato(contato);
		funcionario.setEndereco(endereco);
		
		this.repositorio.Adicionar(funcionario);
	}
	
	public void BuscarCPF(String cpf){
		this.repositorio.BuscarPorCPF(cpf);
	}
	
	public void BuscarRG(String rg){
		this.repositorio.BuscarPorRG(rg);
	}
	
	public void BuscarNome(String nome){
		this.repositorio.BuscarPorNome(nome);
	}
}
