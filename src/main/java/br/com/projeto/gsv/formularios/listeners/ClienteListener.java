package br.com.projeto.gsv.formularios.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JTextField;

import br.com.projeto.gsv.domain.Cliente;
import br.com.projeto.gsv.domain.Contato;
import br.com.projeto.gsv.domain.Endereco;
import br.com.projeto.gsv.domain.TipoPessoa;
import br.com.projeto.gsv.formularios.FrmIncluirCliente;
import br.com.projeto.gsv.service.CadastroClienteService;
import br.com.projeto.gsv.util.ConverteDadosUtil;

public class ClienteListener implements ActionListener{

	private FrmIncluirCliente formulario;
	private CadastroClienteService service;
	private Cliente cliente;
	private Contato contato;
	private Endereco endereco;
	
	
	public ClienteListener(FrmIncluirCliente formulario) {
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
	
	private void Editar(){
		EditToCliente();
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
		cliente.setCpf(this.formulario.getJCpf().getText());
		cliente.setRg(this.formulario.getTRg().getText());
		cliente.setDataCad(new Date());
		cliente.setDataNasc(ConverteDadosUtil.TransformandoEmDate(this.formulario.getJDataNasc().getText()));
		cliente.setObservacao(this.formulario.getTObservacao().getText());
	}
	
	private void EditToCliente(){
		cliente.setId(Long.parseLong(this.formulario.getTId().getText()));
		cliente.setNome(this.formulario.getTNome().getText());
		cliente.setCpf(this.formulario.getJCpf().getText());
		cliente.setRg(this.formulario.getTRg().getText());
		//cliente.setDataNasc(ConverteDadosUtil.TransformandoEmDate(this.formulario.getJDataNasc().getText()));
		/*cliente.getEndereco().get(0).setLogradouro(this.formulario.getTLogradouro().getText());
		cliente.getEndereco().get(0).setComplemento(this.formulario.getTComplemento().getText());
		cliente.getEndereco().get(0).setNumero(Integer.parseInt(this.formulario.getTNumero().getText()));
		cliente.getEndereco().get(0).setBairro(this.formulario.getTBairro().getText());
		cliente.getEndereco().get(0).setCidade(this.formulario.getTCidade().getText());
		cliente.getEndereco().get(0).setEstado((String)this.formulario.getComboEstado().getSelectedItem());
		cliente.getEndereco().get(0).setCep(this.formulario.getTCep().getText());
		cliente.getContato().get(0).setEmail(this.formulario.getTEmail().getText());
		cliente.getContato().get(0).setCelular(this.formulario.getTCelular().getText());
		cliente.getContato().get(0).setTelefone(this.formulario.getTTelefone().getText());*/
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
		endereco.setNumero(Integer.parseInt(this.formulario.getTNumero().getText()));
		endereco.setBairro(this.formulario.getTBairro().getText());
		endereco.setCidade(this.formulario.getTCidade().getText());
		endereco.setEstado((String)this.formulario.getComboEstado().getSelectedItem());
		endereco.setCep(this.formulario.getTCep().getText());
	}

	
	
	
	
	
	
	/*-----------------------------------------------------------------------------------------------------------------*/
	/*---------------------------------------CLASSES PARA EDICAO DOS OBJETOS-------------------------------------------*/
	public void PegaCliente(Cliente cliente){
		this.cliente = cliente;
	}
	
	public void AlterandoObjetos(){
		this.formulario.getTId().setText(String.valueOf(this.cliente.getId()));
		this.formulario.getTNome().setText(this.cliente.getNome());
		this.formulario.getTRg().setText(this.cliente.getRg());
		this.formulario.getJCpf().setText(this.cliente.getCpf());
		this.formulario.getTObservacao().setText(this.cliente.getObservacao());
		this.formulario.getJDataNasc().setText(ConverteDadosUtil.TransformandoEmString(this.cliente.getDataNasc()));
		this.formulario.getJDataCadastro().setText(ConverteDadosUtil.TransformandoEmString(this.cliente.getDataCad()));
		this.formulario.getTLogradouro().setText(this.cliente.getEndereco().get(0).getLogradouro());
		this.formulario.getTComplemento().setText(this.cliente.getEndereco().get(0).getComplemento());
		this.formulario.getTNumero().setText(String.valueOf(this.cliente.getEndereco().get(0).getNumero()));
		this.formulario.getTBairro().setText(this.cliente.getEndereco().get(0).getBairro());
		this.formulario.getTCidade().setText(this.cliente.getEndereco().get(0).getCidade());
		this.formulario.getTCep().setText(this.cliente.getEndereco().get(0).getCep());
		this.formulario.getTEmail().setText(this.cliente.getContato().get(0).getEmail());
		this.formulario.getTCelular().setText(this.cliente.getContato().get(0).getCelular());
		this.formulario.getTTelefone().setText(this.cliente.getContato().get(0).getTelefone());
	}

	
	
	
	/*-----------------------------------------------------------------------------------------------------------------*/
	/*---------------------------------------CLASSES PARA DETALHAR OBJETOS-------------------------------------------*/
	public void DetalhandoObjetos(){
		this.formulario.getTId().setEditable(false);
		this.formulario.getTNome().setEditable(false);
		this.formulario.getTRg().setEditable(false);
		this.formulario.getJCpf().setEditable(false);
		this.formulario.getTObservacao().setEditable(false);
		this.formulario.getTLogradouro().setEditable(false);
		this.formulario.getTComplemento().setEditable(false);
		this.formulario.getTNumero().setEditable(false);
		this.formulario.getTBairro().setEditable(false);
		this.formulario.getTCidade().setEditable(false);
		this.formulario.getTCep().setEditable(false);
		this.formulario.getTEmail().setEditable(false);
		this.formulario.getTTelefone().setEditable(false);
		this.formulario.getTCelular().setEditable(false);
				
	}
	
	
	
	/*-----------------------------------------------------------------------------------------------------------------*/
	/*-------------------CLASSES QUE POSSUI AS ACOES DOS BOTOES ---------------*/
	
	//Classe que possui eventos dos botoes da TELA
	public void actionPerformed(ActionEvent event) {
		if(event.getActionCommand().equals("Novo")){
			this.formulario = new FrmIncluirCliente();
		}
		
		if(event.getActionCommand().equals("Gravar")){
			if(this.formulario.getTId().getText().isEmpty())
				Salvar();
			else
				Editar();
			
			//this.formulario.dispose();
		}
		
		if(event.getActionCommand().equals("Cancelar")){
			this.formulario.dispose();
		}
		
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	
	
	
}
