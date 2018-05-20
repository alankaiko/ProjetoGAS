package br.com.gsv.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JRootPane;
import javax.swing.KeyStroke;

import br.com.gsv.domain.Funcionario;
import br.com.gsv.domain.sub.Contato_fun;
import br.com.gsv.domain.sub.Endereco_fun;
import br.com.gsv.domain.sub.RegistroCoren;
import br.com.gsv.formularios.IncluirFuncionariosForm;
import br.com.gsv.util.ConverteDadosUtil;
import br.com.gsv.util.MensagemPainelUtil;
import br.com.gsv.util.ValidaCampos;
import br.com.projeto.gsv.controller.FuncionarioController;


public class IncluirFuncionarioListener implements ActionListener{

	private IncluirFuncionariosForm formulario;
	private FuncionarioController con;
	private Funcionario funcionario;
	private Contato_fun contato;
	private Endereco_fun endereco;
	private RegistroCoren coren;
	
	
	public IncluirFuncionarioListener(IncluirFuncionariosForm formulario) {
		this.formulario = formulario;
		con = new FuncionarioController();
		AdicionarListener();
		TeclaEsc();
		UsandoTAB();
		UpCase();
		LimitaCaracteres();
	}
	
	
	private void Salvar(){
		FormToFuncionario();
		FormToRegistro();
		FormToContato();
		FormToEndereco();
		AtrelarObjetos();
		con.setFuncionario(this.funcionario);
		con.SalvarFuncionario();
	}
	
	private void Editar(){
		EditToFuncionario();
		con.setFuncionario(this.funcionario);
		con.SalvarFuncionario();
	}
	
	
	
	//Classe pega os botoes do formulario e atrela à esta classe controller aqui (propria classe ClienteActionListener)
	private void AdicionarListener(){
		formulario.getBTGravar().addActionListener(this);
		formulario.getBTCancelar().addActionListener(this);
	}
	
	
	
	
	/*-----------------------------------------------------------------------------------------------------------------*/
	/*-------------------CLASSES INTERNAS QUE CAPTURAM AS INFORMACOES E INSEREM NOS RESPECTIVOS OBJETOS ---------------*/
		
	//Método que pega informacoes do cliente e joga dentro do objeto Cliente
	private void FormToFuncionario(){
		funcionario = new Funcionario();
		funcionario.setNome(this.formulario.getTNome().getText());
		funcionario.setCpf(this.formulario.getJCpf().getText().replaceAll("[_.-]", ""));
		funcionario.setRg(this.formulario.getTRg().getText());
	}
	
	
	//Método que pega informacoes dos contatos e Joga dentro do objeto Contatos
	private void FormToContato(){
		contato = new Contato_fun();
		contato.setEmail(this.formulario.getTEmail().getText());
		contato.setCelular(this.formulario.getTCelular().getText());
		contato.setTelefone(this.formulario.getTTelefone().getText());
	}
	
	//Método que pega infromacoes do Endereco e joga dentro do objeto Endereco
	private void FormToEndereco(){
		endereco = new Endereco_fun();
		endereco.setLogradouro(this.formulario.getTLogradouro().getText());
		endereco.setComplemento(this.formulario.getTComplemento().getText());
		endereco.setNumero(ConverteDadosUtil.RetornaInt(this.formulario.getTNumero().getText()));
		endereco.setBairro(this.formulario.getTBairro().getText());
		endereco.setCidade(this.formulario.getTCidade().getText());
		endereco.setEstado((String)this.formulario.getComboEstado().getSelectedItem());
		endereco.setCep(this.formulario.getJCep().getText().replaceAll("[_.-]", ""));
	}
	
	private void FormToRegistro(){
		coren = new RegistroCoren();
		coren.setCoren((String) this.formulario.getComboCoren().getSelectedItem());
		coren.setInscricao(this.formulario.getTCoren().getText());
		coren.setUf((String) this.formulario.getComboCorenEst().getSelectedItem());
	}
	
	//Método que mapeia os objetos contato e endereco dentro do objeto cliente
	private void AtrelarObjetos(){
		this.funcionario.setRegistroCoren(this.coren);
		this.funcionario.getContato().add(this.contato);
		this.funcionario.getEndereco().add(this.endereco);
		
		this.endereco.setFuncionario(this.funcionario);
		this.contato.setFuncionario(this.funcionario);
	}	

	
	
	
	
	
	
	
	
	/*-----------------------------------------------------------------------------------------------------------------*/
	/*---------------------------------------CLASSES PARA EDICAO DOS OBJETOS-------------------------------------------*/
	public void AlterandoObjetos(){
		this.formulario.getTId().setText(String.valueOf(this.funcionario.getId()));
		this.formulario.getTNome().setText(this.funcionario.getNome());
		this.formulario.getTRg().setText(this.funcionario.getRg());
		this.formulario.getJCpf().setText(this.funcionario.getCpf());
		this.formulario.getTLogradouro().setText(this.funcionario.getEndereco().get(0).getLogradouro());
		this.formulario.getTComplemento().setText(this.funcionario.getEndereco().get(0).getComplemento());
		this.formulario.getTNumero().setText(String.valueOf(this.funcionario.getEndereco().get(0).getNumero()));
		this.formulario.getTBairro().setText(this.funcionario.getEndereco().get(0).getBairro());
		this.formulario.getTCidade().setText(this.funcionario.getEndereco().get(0).getCidade());
		this.formulario.getComboEstado().setSelectedItem(this.funcionario.getEndereco().get(0).getEstado());
		this.formulario.getJCep().setText(this.funcionario.getEndereco().get(0).getCep());
		this.formulario.getTEmail().setText(this.funcionario.getContato().get(0).getEmail());
		this.formulario.getTCelular().setText(this.funcionario.getContato().get(0).getCelular());
		this.formulario.getTTelefone().setText(this.funcionario.getContato().get(0).getTelefone());
		this.formulario.getComboCoren().setSelectedItem(this.funcionario.getRegistroCoren().getCoren());
		this.formulario.getTCoren().setText(this.funcionario.getRegistroCoren().getInscricao());
		this.formulario.getComboCorenEst().setSelectedItem(this.funcionario.getRegistroCoren().getUf());
	}

	
	//Método para Edicao de clientes
		private void EditToFuncionario(){
			funcionario.setId(Long.parseLong(this.formulario.getTId().getText()));
			funcionario.setNome(this.formulario.getTNome().getText());
			funcionario.setCpf(this.formulario.getJCpf().getText().replaceAll("[_.-]", ""));
			funcionario.setRg(this.formulario.getTRg().getText());
			funcionario.getEndereco().get(0).setLogradouro(this.formulario.getTLogradouro().getText());
			funcionario.getEndereco().get(0).setComplemento(this.formulario.getTComplemento().getText());
			funcionario.getEndereco().get(0).setNumero(ConverteDadosUtil.RetornaInt(this.formulario.getTNumero().getText()));
			funcionario.getEndereco().get(0).setBairro(this.formulario.getTBairro().getText());
			funcionario.getEndereco().get(0).setCidade(this.formulario.getTCidade().getText());
			funcionario.getEndereco().get(0).setEstado((String)this.formulario.getComboEstado().getSelectedItem());
			funcionario.getEndereco().get(0).setCep(this.formulario.getJCep().getText());
			funcionario.getContato().get(0).setEmail(this.formulario.getTEmail().getText());
			funcionario.getContato().get(0).setCelular(this.formulario.getTCelular().getText());
			funcionario.getContato().get(0).setTelefone(this.formulario.getTTelefone().getText());
			funcionario.getRegistroCoren().setCoren((String) this.formulario.getComboCoren().getSelectedItem());
			funcionario.getRegistroCoren().setInscricao(this.formulario.getTCoren().getText());
			funcionario.getRegistroCoren().setUf((String) this.formulario.getComboCorenEst().getSelectedItem());
		}
		
		
		
	
	/*-----------------------------------------------------------------------------------------------------------------*/
	/*-------------------CLASSES QUE POSSUI AS ACOES DOS BOTOES ---------------*/
	
	//Classe que possui eventos dos botoes da TELA
	public void actionPerformed(ActionEvent event) {		
		
		if(event.getSource().equals(this.formulario.getBTGravar()) && Validando()){
			if(this.formulario.getTId().getText().isEmpty())
				Salvar();
			else
				Editar();
			this.formulario.dispose();
			
		}else if(event.getSource().equals(this.formulario.getBTCancelar())){
			this.formulario.dispose();
		}
		else
			MensagemPainelUtil.ErroDuplicacao("Campos Nome, Cpf e Rg devem ser preenchido");
	}
	
	
	private boolean Validando(){
		return ValidaCampos.Validar(this.formulario.getTNome().getText())
				&& ValidaCampos.Validar(this.formulario.getTRg().getText())
				&& ValidaCampos.Validar(this.formulario.getJCpf().getText());
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
	
	
	
	private void LimitaCaracteres(){
		this.formulario.getTRg().addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {			    
                if ((formulario.getTRg().getText().length() > 8)) {
                	e.setKeyChar((char) KeyEvent.VK_CLEAR);      
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

	
	public Funcionario getFuncionario() {
		return funcionario;
	}
	
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	
	
	
}
