package br.com.projeto.gsv.TESTE;

import java.util.Date;

import br.com.projeto.gsv.controller.ClienteController;
import br.com.projeto.gsv.domain.Cliente;
import br.com.projeto.gsv.domain.Contato;
import br.com.projeto.gsv.domain.Endereco;
import br.com.projeto.gsv.domain.TipoPessoa;

public class TEstando {

	public static void main(String[] args) {
		ClienteController controller = new ClienteController();
		
		Cliente cliente = new Cliente();
		cliente.setId(2L);
		cliente.setNome("juranildeles pacheco silva");
		cliente.setCpf("472258430001-54");
		cliente.setRg("2554");
		cliente.setDataCad(new Date());
		cliente.setDataNasc(new Date());
		cliente.setObservacao("agora vai malucao");
		
		
		Contato contato = new Contato();
		contato.setEmail("teste@hotmail.com");
		contato.setCelular("daff mariasdf");
		contato.setTelefone("14aff maria5");
		contato.setCliente(cliente);
		
		Contato contato1 = new Contato();
		contato1.setEmail("vdafvdsav@hotmail.com");
		contato1.setCelular("143152345235");
		contato1.setTelefone("3425252345");
		contato1.setCliente(cliente);
		
		Contato contato2 = new Contato();
		contato2.setEmail("gernervindo@hotmail.com");
		contato2.setCelular("35");
		contato2.setTelefone("3322");
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
		controller.SalvarCliente();
		//controller.EditarCliente();
		//cliente = controller.BuscarPelaID(1L);
		
		//System.out.println(cliente.getContato().toString());
	}

}
