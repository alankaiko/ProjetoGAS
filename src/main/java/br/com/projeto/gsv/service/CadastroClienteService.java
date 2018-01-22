package br.com.projeto.gsv.service;

import java.util.List;

import br.com.projeto.gsv.domain.Cliente;
import br.com.projeto.gsv.repository.ClienteRepository;

public class CadastroClienteService {
	private ClienteRepository repositorio = new ClienteRepository();

	
	public void Salvar(Cliente cliente){
		this.repositorio.Guardar(cliente);
	}
		
	public void Editar(Cliente cliente){
		this.repositorio.Editar(cliente);
	}
	
	public void Remover(Cliente cliente){
		this.repositorio.Remover(cliente);
	}
	
	public List<Cliente> ListandoClientes(){
		return this.repositorio.ListarClientes();
	}
	
	public Cliente BuscandoId(Long id){
		return this.repositorio.BuscarPorId(id);
	}
}
