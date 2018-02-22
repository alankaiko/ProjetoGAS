package br.com.projeto.gsv.service;

import java.util.List;

import br.com.gsv.funcionario.domain.Funcionario;
import br.com.gsv.repository.FuncionarioRepository;



public class CadastroFuncionarioService {
	private FuncionarioRepository repositorio = new FuncionarioRepository();

	
	public void Salvar(Funcionario funcionario){
		this.repositorio.Guardar(funcionario);
	}
	
	public void Remover(Funcionario funcionario){
		this.repositorio.Remover(funcionario);
	}
	
	public List<Funcionario> ListandoFuncionarios(){
		return repositorio.ListarFuncionarios();
	}
	
	public Funcionario BuscandoId(Long id){
		return this.repositorio.BuscarPorId(id);
	}
	
	public List<Funcionario> BuscandoPeloNome(String nome){
		return this.repositorio.BuscarPeloNome(nome);
	}
}