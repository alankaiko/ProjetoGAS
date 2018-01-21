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
		cliente.setId(2L);
		cliente.setNome("abigail e voltando");
		cliente.setTipo(TipoPessoa.FISICA);
		cliente.setDocumento("148.148.548-77");
		cliente.setRg_insc("8447711");
		cliente.setDataCad(new Date());
		cliente.setDataNasc(new Date());
		cliente.setSexo(SexoType.MASCULINO);
		cliente.setObservacao("condas pra falar");
		
		
		Contato contato = new Contato();
		contato.setEmail("fdasf@hotmail.com");
		contato.setCelular("43523452345");
		contato.setTelefone("14145235");
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
		//controller.setContato(contato);
		//controller.setEndereco(endereco);
		controller.EditarCliente();
}

}
