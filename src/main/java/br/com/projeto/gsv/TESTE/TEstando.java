package br.com.projeto.gsv.TESTE;

import java.util.Date;

import br.com.projeto.gsv.controller.ClienteController;
import br.com.projeto.gsv.domain.Cliente;
import br.com.projeto.gsv.domain.Contato;
import br.com.projeto.gsv.domain.Endereco;
import br.com.projeto.gsv.domain.SexoType;
import br.com.projeto.gsv.domain.TipoPessoa;

public class TEstando {

	public static void main(String[] args) {
		ClienteController controller = new ClienteController();
		
		Cliente cliente = new Cliente();
		cliente.setNome("João das Couves");
		cliente.setTipo(TipoPessoa.FISICA);
		cliente.setDocumento("123.456.789-90");
		cliente.setTipo(TipoPessoa.FISICA);
		cliente.setRg("4112254");
		cliente.setDataCad(new Date());
		cliente.setDataNasc(new Date());
		cliente.setSexo(SexoType.MASCULINO);
		cliente.setObservacao("nada a declarar");
		
		
		Contato contato = new Contato();
		contato.setEmail("vinicius_cok@hotmail.com");
		contato.setCelular("11111111");
		contato.setTelefone("111111");
		contato.setCliente(cliente);
		
		Contato contato1 = new Contato();
		contato1.setEmail("vinicius_cok@hotmail.com");
		contato1.setCelular("11111111");
		contato1.setTelefone("111111");
		contato1.setCliente(cliente);
		
		Contato contato2 = new Contato();
		contato2.setEmail("vinicius_cok@hotmail.com");
		contato2.setCelular("11111111");
		contato2.setTelefone("111111");
		contato2.setCliente(cliente);
		
		Endereco endereco = new Endereco();
		endereco.setLogradouro("Rua das Aboboras Vermelhas");
		endereco.setNumero(111);
		endereco.setCidade("Uberlândia");
		endereco.setEstado("MG");
		endereco.setCep("38400-000");
		endereco.setComplemento("nem sei mais");
		endereco.setBairro("aff maria");
		endereco.setCliente(cliente);

		
		cliente.getContato().add(contato);
		cliente.getContato().add(contato1);
		cliente.getContato().add(contato2);
		cliente.getEndereco().add(endereco);
		

		
		controller.Inicializar();
		controller.setCliente(cliente);
		//controller.setContato(contato);
		//controller.setEndereco(endereco);
		controller.SalvarCliente();
	}

}
