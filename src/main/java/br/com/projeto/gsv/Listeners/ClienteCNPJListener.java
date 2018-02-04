package br.com.projeto.gsv.Listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import br.com.projeto.gsv.domain.Cliente;
import br.com.projeto.gsv.domain.Contato;
import br.com.projeto.gsv.domain.Endereco;
import br.com.projeto.gsv.domain.TipoPessoa;
import br.com.projeto.gsv.formularios.FrmIncluirClienteCNPJ;
import br.com.projeto.gsv.service.CadastroClienteService;
import br.com.projeto.gsv.util.TransformaDate;

public class ClienteCNPJListener implements ActionListener{
	private FrmIncluirClienteCNPJ formulario;
	private CadastroClienteService service;
	Cliente cliente;
	private Contato contato;
	private Endereco endereco;
	
	public ClienteCNPJListener(FrmIncluirClienteCNPJ formulario) {
		this.formulario = formulario;
		service = new CadastroClienteService();
		AdicionarListener();
	}
	
	private void Salvar(){
		FormToCliente();
		FormToContato();
		FormToEndereco();
		AtrelarObjetos();
		service.Salvar(this.cliente);
	}
	
	//Classe pega os botoes do formulario e atrela à esta classe controller aqui (propria classe ClienteActionListener)
	private void AdicionarListener(){
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
	private void FormToCliente(){
		cliente = new Cliente();
		cliente.setNome(this.formulario.getTNome().getText());
		cliente.setDocumento(this.formulario.getJCpf().getText());
		cliente.setRg_insc(this.formulario.getTRg_insc().getText());
		cliente.setDataCad(new Date());
		cliente.setDataNasc(TransformaDate.Transformando(this.formulario.getJDataNasc().getText()));
		cliente.setTipo(TipoPessoa.FISICA);
		cliente.setObservacao(this.formulario.getTObservacao().getText());
	}
	
	//Classe que pega informacoes dos contatos e Joga dentro do objeto Contatos
	private void FormToContato(){
		contato = new Contato();
		
		contato.setEmail(this.formulario.getTEmail().getText());
		contato.setCelular(this.formulario.getTCelular().getText());
		contato.setTelefone(this.formulario.getTTelefone().getText());
	}
	
	//Classe que pega infromacoes do Endereco e joga dentro do objeto Endereco
	private void FormToEndereco(){
		endereco = new Endereco();
		
		endereco.setLogradouro(this.formulario.getTLogradouro().getText());
		endereco.setComplemento(this.formulario.getTComplemento().getText());
		endereco.setNumero(Double.parseDouble(this.formulario.getTNumero().getText()));
		endereco.setBairro(this.formulario.getTBairro().getText());
		endereco.setCidade(this.formulario.getTCidade().getText());
		endereco.setEstado((String)this.formulario.getComboEstado().getSelectedItem());
		endereco.setCep(this.formulario.getTCep().getText());
	}

	
	
	
	
	
	
	/*-----------------------------------------------------------------------------------------------------------------*/
	/*---------------------------------------CLASSES PARA EDICAO DOS OBJETOS-------------------------------------------*/
	public void AlterandoObjetos(){
		this.formulario.getTId().setText(String.valueOf(this.cliente.getId()));
		this.formulario.getTNome().setText(this.cliente.getNome());
		this.formulario.getTRg_insc().setText(this.cliente.getRg_insc());
		this.formulario.getJCpf().setText(this.cliente.getDocumento());
		this.formulario.getTObservacao().setText(this.cliente.getObservacao());
		this.formulario.getTLogradouro().setText(this.endereco.getLogradouro());
		this.formulario.getTComplemento().setText(this.endereco.getComplemento());
		this.formulario.getTNumero().setText(String.valueOf(this.endereco.getNumero()));
		this.formulario.getTBairro().setText(this.endereco.getBairro());
		this.formulario.getTCidade().setText(this.endereco.getCidade());
		this.formulario.getTCep().setText(this.endereco.getCep());
		this.formulario.getTEmail().setText(this.contato.getEmail());
		this.formulario.getTTelefone().setText(this.contato.getTelefone());
		this.formulario.getTCelular().setText(this.contato.getCelular());
		
	}

	
	
	
	
	/*-----------------------------------------------------------------------------------------------------------------*/
	/*-------------------CLASSES QUE POSSUI AS ACOES DOS BOTOES ---------------*/
	
	//Classe que possui eventos dos botoes da TELA
	public void actionPerformed(ActionEvent event) {
		if(event.getActionCommand().equals("Novo")){
			
		}
		
		if(event.getActionCommand().equals("Gravar")){
			Salvar();
		}
		
		if(event.getActionCommand().equals("Cancelar")){
			
		}
		
	}
}
