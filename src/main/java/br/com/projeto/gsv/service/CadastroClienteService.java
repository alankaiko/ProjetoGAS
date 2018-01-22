package br.com.projeto.gsv.service;

import br.com.projeto.gsv.domain.Cliente;
import br.com.projeto.gsv.repository.ClienteRepository;
import br.com.projeto.gsv.util.NegocioException;

public class CadastroClienteService {
	private ClienteRepository repositorio = new ClienteRepository();

	
	public void Salvar(Cliente cliente){
		this.repositorio.Guardar(cliente);
	}
	
	
	
	public void Editar(Cliente cliente){
		this.repositorio.Editar(cliente);
	}
	
	
	public Cliente BuscandoId(Long id){
		return this.repositorio.BuscarPorId(id);
	}
}
