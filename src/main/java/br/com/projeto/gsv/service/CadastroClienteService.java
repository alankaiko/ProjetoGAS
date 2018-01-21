package br.com.projeto.gsv.service;

import br.com.projeto.gsv.domain.Cliente;
import br.com.projeto.gsv.repository.ClienteRepository;

public class CadastroClienteService {
	private ClienteRepository repositorio = new ClienteRepository();

	public void Salvar(Cliente cliente) {
		if (cliente.getContato() == null || cliente.getEndereco() == null) {
		} else {
			repositorio.Guardar(cliente);
		}
	}
}
