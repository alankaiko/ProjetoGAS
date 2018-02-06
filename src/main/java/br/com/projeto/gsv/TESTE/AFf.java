package br.com.projeto.gsv.TESTE;

import java.util.List;

import br.com.projeto.gsv.controller.ClienteController;
import br.com.projeto.gsv.domain.Cliente;
import br.com.projeto.gsv.service.CadastroClienteService;

public class AFf {

	public static void main(String[] args) {
		ClienteController con = new ClienteController();
		
		List<Cliente> lista = con.ListaCompletaDeClientes();
		
		
		for(Cliente cliente : lista){
			System.out.println(cliente.getNome());
		}
	}

}
