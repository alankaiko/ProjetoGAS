package br.com.projeto.gsv.controller;

import java.util.List;

import br.com.projeto.gsv.domain.Cliente;
import br.com.projeto.gsv.domain.Contato;
import br.com.projeto.gsv.domain.Endereco;
import br.com.projeto.gsv.domain.TipoPessoa;
import br.com.projeto.gsv.service.CadastroClienteService;
import br.com.projeto.gsv.util.NegocioException;

public class ClienteController {
	private Cliente cliente;
	private CadastroClienteService cadastroService;
	
	
	public void Inicializar(){
			this.cliente = new Cliente();
			this.cadastroService = new CadastroClienteService();
	}
	
	
	public void SalvarCliente(){
		this.cadastroService.Salvar(this.cliente);
	}
	
	public void EditarCliente(){
		this.cadastroService.Editar(this.cliente);
	}
	
	public void RemoverCliente(){
		this.cadastroService.Remover(this.cliente);
	}
	
	public List<Cliente> ListaCompletaDeClientes(){
		return this.cadastroService.ListandoClientes();
	}
	
	public Cliente BuscarPelaID(Long id){
		return this.cadastroService.BuscandoId(id);
	}
	
	
	
	
	
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	
}
