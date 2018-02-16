package br.com.projeto.gsv.service;

import java.util.List;

import br.com.gsv.cliente.domain.Cliente;
import br.com.gsv.repository.ClienteRepository;

public class CadastroClienteService {
	private ClienteRepository repositorio = new ClienteRepository();

	
	public void Salvar(Cliente cliente){
		this.repositorio.Guardar(cliente);
	}
	
	public void Remover(Cliente cliente){
		this.repositorio.Remover(cliente);
	}
	
	public List<Cliente> ListandoClientes(){
		return repositorio.ListarClientes();
	}
	
	public Cliente BuscandoId(Long id){
		return this.repositorio.BuscarPorId(id);
	}
	
	public List<Cliente> BuscandoPeloNome(String nome){
		return this.repositorio.BuscarPeloNome(nome);
	}
}
