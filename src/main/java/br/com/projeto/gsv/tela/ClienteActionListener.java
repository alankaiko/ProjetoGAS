package br.com.projeto.gsv.tela;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.projeto.gsv.domain.Cliente;
import br.com.projeto.gsv.domain.Contato;
import br.com.projeto.gsv.domain.Endereco;
import br.com.projeto.gsv.domain.SexoType;
import br.com.projeto.gsv.domain.TipoPessoa;
import br.com.projeto.gsv.service.CadastroClienteService;

public class ClienteActionListener implements ActionListener{

	private FrmIncluirClienteCPF formulario;
	private CadastroClienteService service;
	Cliente cliente;
	private Contato contato;
	private Endereco endereco;
	
	
	public ClienteActionListener(FrmIncluirClienteCPF formulario) {
		this.formulario = formulario;
		service = new CadastroClienteService();
		AdicionarListener();
	}
	
private void Inserir(){
		
	}
	
	private void Salvar(){}
	
	//Classe pega os botoes do formulario e atrela à esta classe controller aqui (propria classe ClienteActionListener)
	public void AdicionarListener(){
		formulario.getBTNovo().addActionListener(this);
		formulario.getBTGravar().addActionListener(this);
		formulario.getBTCancelar().addActionListener(this);
	}
	
	
	
	
	
	
	
	/*-----------------------------------------------------------------------------------------------------------------*/
	/*-------------------CLASSES INTERNAS QUE CAPTURAM AS INFORMACOES E INSEREM NOS RESPECTIVOS OBJETOS ---------------*/
	
	//Classe que mapeia os objetos contato e endereco dentro do objeto cliente
	private void AtrelarObjetos(){
		this.cliente.getContato().add(this.contato);
		this.cliente.getEndereco().add(this.endereco);
		
		this.endereco.setCliente(this.cliente);
		this.contato.setCliente(this.cliente);
	}	
	
	//Classe que pega informacoes do cliente e joga dentro do objeto Cliente
	private Cliente FormToCliente(){
		cliente = new Cliente();
		cliente.setNome(this.formulario.getTNome().getText());
		cliente.setDocumento(this.formulario.getJCpf().getText());
		cliente.setRg_insc(this.formulario.getTRg_insc().getText());
		cliente.setDataCad(new Date());
		cliente.setDataNasc(new Date());
		cliente.setSexo(SexoType.MASCULINO);
		cliente.setObservacao(this.formulario.getTObservacao().getText());
		
		return cliente;
	}
	
	//Classe que pega informacoes dos contatos e Joga dentro do objeto Contatos
	private Contato FormToContato(){
		contato = new Contato();
		
		contato.setEmail(this.formulario.getTEmail().getText());
		contato.setCelular(this.formulario.getTCelular().getText());
		contato.setTelefone(this.formulario.getTTelefone().getText());
		
		return contato;
	}
	
	//Classe que pega infromacoes do Endereco e joga dentro do objeto Endereco
	private Endereco FormToEndereco(){
		endereco = new Endereco();
		
		endereco.setLogradouro(this.formulario.getTLogradouro().getText());
		endereco.setComplemento(this.formulario.getTComplemento().getText());
		endereco.setNumero(Double.parseDouble(this.formulario.getTNumero().getText()));
		endereco.setBairro(this.formulario.getTBairro().getText());
		endereco.setCidade(this.formulario.getTCidade().getText());
		endereco.setEstado(this.formulario.getTCep().getText());
		
		return endereco;
	}
	

	
	
	
	/*-----------------------------------------------------------------------------------------------------------------*/
	/*-------------------CLASSES QUE POSSUI AS ACOES DOS BOTOES ---------------*/
	
	//Classe que possui eventos dos botoes da TELA
	public void actionPerformed(ActionEvent event) {
		if(event.getActionCommand().equals("Inserir")){
			
		}
		
		if(event.getActionCommand().equals("Salvar")){
			
		}
		
		if(event.getActionCommand().equals("Cancelar")){
			
		}
		
	}
	
}
