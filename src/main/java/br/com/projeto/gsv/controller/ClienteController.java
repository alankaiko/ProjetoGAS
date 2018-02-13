package br.com.projeto.gsv.controller;

import java.util.List;

import br.com.projeto.gsv.domain.Cliente;
import br.com.projeto.gsv.service.CadastroClienteService;

public class ClienteController {
	private Cliente cliente;
	private CadastroClienteService cadastroService;
	
	
	public ClienteController(){
		this.cliente = new Cliente();
		this.cadastroService = new CadastroClienteService();
	}
	
	
	public void SalvarCliente(){
		this.cadastroService.Salvar(this.cliente);
	}
	
	
	public void RemoverCliente(){
		this.cadastroService.Remover(this.cliente);
	}
	
	public List<Cliente> ListaCompletaDeClientes(){
		return cadastroService.ListandoClientes();
	}
	
	public Cliente BuscarPelaID(Long id){
		return this.cadastroService.BuscandoId(id);
	}
	
	public List<Cliente> BuscarPeloNome(String nome){
		return this.cadastroService.BuscandoPeloNome(nome);
	}
	
	
	
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	
}
