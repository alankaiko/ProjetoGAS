package br.com.projeto.gsv.formularios.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Date;

import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JRootPane;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

import br.com.projeto.gsv.controller.ClienteController;
import br.com.projeto.gsv.domain.Cliente;
import br.com.projeto.gsv.domain.Contato;
import br.com.projeto.gsv.domain.Endereco;
import br.com.projeto.gsv.domain.TipoPessoa;
import br.com.projeto.gsv.formularios.IncluirClienteForm;
import br.com.projeto.gsv.service.CadastroClienteService;
import br.com.projeto.gsv.util.ConverteDadosUtil;

public class ClienteFormListener implements ActionListener{

	private IncluirClienteForm formulario;
	private ClienteController con;
	private Cliente cliente;
	private Contato contato;
	private Endereco endereco;
	
	
	public ClienteFormListener(IncluirClienteForm formulario) {
		this.formulario = formulario;
		con = new ClienteController();
		AdicionarListener();
		TeclaEsc();
		UsandoTAB();
		UpCase();
	}
	
	
	private void Salvar(){
		FormToCliente();
		FormToContato();
		FormToEndereco();
		AtrelarObjetos();
		con.setCliente(this.cliente);
		con.SalvarCliente();
	}
	
	private void Editar(){
		EditToCliente();
		con.setCliente(this.cliente);
		con.SalvarCliente();
	}
	
	
	
	//Classe pega os botoes do formulario e atrela à esta classe controller aqui (propria classe ClienteActionListener)
	private void AdicionarListener(){
		formulario.getBTNovo().addActionListener(this);
		formulario.getBTGravar().addActionListener(this);
		formulario.getBTCancelar().addActionListener(this);
	}
	
	
	
	
	
	
	
	/*-----------------------------------------------------------------------------------------------------------------*/
	/*-------------------CLASSES INTERNAS QUE CAPTURAM AS INFORMACOES E INSEREM NOS RESPECTIVOS OBJETOS ---------------*/
		
	//Método que pega informacoes do cliente e joga dentro do objeto Cliente
	private void FormToCliente(){
		cliente = new Cliente();
		cliente.setNome(this.formulario.getTNome().getText());
		cliente.setCpf(this.formulario.getJCpf().getText().replaceAll("[_.-]", ""));
		cliente.setRg(this.formulario.getTRg().getText());
		cliente.setDataCad(new Date());
		cliente.setDataNasc(ConverteDadosUtil.TransformandoEmDate(this.formulario.getJDataNasc().getText()));
		cliente.setObservacao(this.formulario.getTObservacao().getText());
	}
	
	
	//Método que pega informacoes dos contatos e Joga dentro do objeto Contatos
	private void FormToContato(){
		contato = new Contato();
		contato.setEmail(this.formulario.getTEmail().getText());
		contato.setCelular(this.formulario.getTCelular().getText());
		contato.setTelefone(this.formulario.getTTelefone().getText());
	}
	
	//Método que pega infromacoes do Endereco e joga dentro do objeto Endereco
	private void FormToEndereco(){
		endereco = new Endereco();
		endereco.setLogradouro(this.formulario.getTLogradouro().getText());
		endereco.setComplemento(this.formulario.getTComplemento().getText());
		endereco.setNumero(Integer.parseInt(this.formulario.getTNumero().getText()));
		endereco.setBairro(this.formulario.getTBairro().getText());
		endereco.setCidade(this.formulario.getTCidade().getText());
		endereco.setEstado((String)this.formulario.getComboEstado().getSelectedItem());
		endereco.setCep(this.formulario.getJCep().getText().replaceAll("[_.-]", ""));
	}
	
	//Método que mapeia os objetos contato e endereco dentro do objeto cliente
	private void AtrelarObjetos(){
		this.cliente.getContato().add(this.contato);
		this.cliente.getEndereco().add(this.endereco);
		
		this.endereco.setCliente(this.cliente);
		this.contato.setCliente(this.cliente);
	}	

	
	
	
	
	
	
	
	
	/*-----------------------------------------------------------------------------------------------------------------*/
	/*---------------------------------------CLASSES PARA EDICAO DOS OBJETOS-------------------------------------------*/
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
		this.formulario.getJCep().setText(this.cliente.getEndereco().get(0).getCep());
		this.formulario.getTEmail().setText(this.cliente.getContato().get(0).getEmail());
		this.formulario.getTCelular().setText(this.cliente.getContato().get(0).getCelular());
		this.formulario.getTTelefone().setText(this.cliente.getContato().get(0).getTelefone());
	}

	
	//Método para Edicao de clientes
		private void EditToCliente(){
			cliente.setId(Long.parseLong(this.formulario.getTId().getText()));
			cliente.setNome(this.formulario.getTNome().getText());
			cliente.setCpf(this.formulario.getJCpf().getText().replaceAll("[_.-]", ""));
			cliente.setRg(this.formulario.getTRg().getText());
			cliente.setDataNasc(ConverteDadosUtil.TransformandoEmDate(this.formulario.getJDataNasc().getText()));
			cliente.getEndereco().get(0).setLogradouro(this.formulario.getTLogradouro().getText());
			cliente.getEndereco().get(0).setComplemento(this.formulario.getTComplemento().getText());
			cliente.getEndereco().get(0).setNumero(Integer.parseInt(this.formulario.getTNumero().getText()));
			cliente.getEndereco().get(0).setBairro(this.formulario.getTBairro().getText());
			cliente.getEndereco().get(0).setCidade(this.formulario.getTCidade().getText());
			cliente.getEndereco().get(0).setEstado((String)this.formulario.getComboEstado().getSelectedItem());
			cliente.getEndereco().get(0).setCep(this.formulario.getJCep().getText());
			cliente.getContato().get(0).setEmail(this.formulario.getTEmail().getText());
			cliente.getContato().get(0).setCelular(this.formulario.getTCelular().getText());
			cliente.getContato().get(0).setTelefone(this.formulario.getTTelefone().getText());
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
		this.formulario.getJCep().setEditable(false);
		this.formulario.getTEmail().setEditable(false);
		this.formulario.getTTelefone().setEditable(false);
		this.formulario.getTCelular().setEditable(false);
				
	}
	
	
	
	/*-----------------------------------------------------------------------------------------------------------------*/
	/*-------------------CLASSES QUE POSSUI AS ACOES DOS BOTOES ---------------*/
	
	//Classe que possui eventos dos botoes da TELA
	public void actionPerformed(ActionEvent event) {
		if(event.getActionCommand().equals("Novo")){
			this.formulario = new IncluirClienteForm();
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
	
	
	private void UsandoTAB(){
		this.formulario.getRootPane().setDefaultButton(this.formulario.getBTGravar());
		this.formulario.getBTGravar().addKeyListener(new KeyAdapter() {  
            public void keyPressed(KeyEvent e) {  
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {  
                	formulario.getBTGravar().doClick();
                }  
            }  
        });
		
		
		
		this.formulario.getBTCancelar().addKeyListener(new KeyAdapter() {  
            public void keyPressed(KeyEvent e) {  
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {  
                	formulario.getBTCancelar().doClick();  
                }  
            }  
        });
	}
	
	
	private void UpCase(){
		this.formulario.getTNome().addKeyListener(new KeyAdapter() {  
			public void keyReleased(KeyEvent ke) {  
				if (ke.getKeyCode() != KeyEvent.VK_HOME) {  
					String s = formulario.getTNome().getText();  
					formulario.getTNome().setText(s.toUpperCase());  
				}  
			}  
		}); 	
		
		
		this.formulario.getTObservacao().addKeyListener(new KeyAdapter() {  
			public void keyReleased(KeyEvent ke) {  
				if (ke.getKeyCode() != KeyEvent.VK_HOME) {  
					String s = formulario.getTObservacao().getText();  
					formulario.getTObservacao().setText(s.toUpperCase());  
				}  
			}  
		}); 
	}
	
	
	public void TeclaEsc(){
        JRootPane meurootpane = this.formulario.getRootPane();  
        meurootpane.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), "ESCAPE");  
        meurootpane.getRootPane().getActionMap().put("ESCAPE", new AbstractAction("ESCAPE") {  
  
            public void actionPerformed(ActionEvent e) {  
            	formulario.dispose();  
            }  
        });  
    }  




	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	
	
	
}
