package br.com.gsv.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Date;
import java.util.Vector;

import javax.swing.AbstractAction;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComponent;
import javax.swing.JRootPane;
import javax.swing.KeyStroke;

import br.com.gsv.domain.Convenio;
import br.com.gsv.domain.Paciente;
import br.com.gsv.domain.sub.Contato_cli;
import br.com.gsv.domain.sub.Endereco_cli;
import br.com.gsv.formularios.IncluirConvenioForm;
import br.com.gsv.formularios.IncluirPacienteForm;
import br.com.gsv.util.ConverteDadosUtil;
import br.com.gsv.util.MensagemPainelUtil;
import br.com.gsv.util.ValidaCampos;
import br.com.projeto.gsv.controller.PacienteController;

public class IncluirPacienteListener implements ActionListener{

	private IncluirPacienteForm formulario;
	private PacienteController con;
	private Paciente paciente;
	private Convenio convenio;
	private Contato_cli contato;
	private Endereco_cli endereco;
	
	
	public IncluirPacienteListener(IncluirPacienteForm formulario) {
		this.formulario = formulario;
		con = new PacienteController();
		AdicionarListener();
		ListaConvenios();
		TeclaEsc();
		UsandoTAB();
		HiperlinkAdicionarConv();
		UpCase();
		LimitaCaracteres();
	}
	
	
	private void Salvar(){
		FormToCliente();
		FormToContato();
		FormToEndereco();
		AtrelarObjetos();
		con.setPaciente(this.paciente);
		con.SalvarPaciente();
	}
	
	private void Editar(){
		EditToCliente();
		con.setPaciente(this.paciente);
		con.SalvarPaciente();
	}
	
	
	
	//Classe pega os botoes do formulario e atrela à esta classe controller aqui (propria classe ClienteActionListener)
	private void AdicionarListener(){
		formulario.getBTGravar().addActionListener(this);
		formulario.getBTCancelar().addActionListener(this);
	}
	
	
	
	
	
	/*-----------------------------------------------------------------------------------------------------------------*/
	/*-------------------CLASSES INTERNAS QUE CAPTURAM AS INFORMACOES E INSEREM NOS RESPECTIVOS OBJETOS ---------------*/
		
	//Método que pega informacoes do cliente e joga dentro do objeto Cliente
	private void FormToCliente(){
		paciente = new Paciente();
		paciente.setNome(this.formulario.getTNome().getText());
		paciente.setCpf(this.formulario.getJCpf().getText().replaceAll("[_.-]", ""));
		paciente.setRg(this.formulario.getTRg().getText());
		paciente.setDataCad(new Date());
		paciente.setDataNasc(ConverteDadosUtil.TransformandoEmDate(this.formulario.getJDataNasc().getText()));
		paciente.setObservacao(this.formulario.getTObservacao().getText());
		FormaFab();
	}
	
	
	private void FormaFab(){
		if(this.formulario.getComboConvenio().getSelectedIndex() != -1){
			this.paciente.setConvenio((Convenio) this.formulario.getComboConvenio().getSelectedItem()); 
		}else{
			convenio = new Convenio();
			this.paciente.setConvenio(this.convenio);
		}
	}
	
	
	
	
	//Método que pega informacoes dos contatos e Joga dentro do objeto Contatos
	private void FormToContato(){
		contato = new Contato_cli();
		contato.setEmail(this.formulario.getTEmail().getText());
		contato.setCelular(this.formulario.getTCelular().getText());
		contato.setTelefone(this.formulario.getTTelefone().getText());
	}
	
	//Método que pega infromacoes do Endereco e joga dentro do objeto Endereco
	private void FormToEndereco(){
		endereco = new Endereco_cli();
		endereco.setLogradouro(this.formulario.getTLogradouro().getText());
		endereco.setComplemento(this.formulario.getTComplemento().getText());
		endereco.setNumero(ConverteDadosUtil.RetornaInt(this.formulario.getTNumero().getText()));
		endereco.setBairro(this.formulario.getTBairro().getText());
		endereco.setCidade(this.formulario.getTCidade().getText());
		endereco.setEstado((String)this.formulario.getComboEstado().getSelectedItem());
		endereco.setCep(this.formulario.getJCep().getText().replaceAll("[_.-]", ""));
	}
	
	//Método que mapeia os objetos contato e endereco dentro do objeto cliente
	private void AtrelarObjetos(){
		this.paciente.getContato().add(this.contato);
		this.paciente.getEndereco().add(this.endereco);
		
		this.endereco.setPaciente(this.paciente);
		this.contato.setPaciente(this.paciente);
	}	

	
	
	
	
	
	
	
	
	/*-----------------------------------------------------------------------------------------------------------------*/
	/*---------------------------------------CLASSES PARA EDICAO DOS OBJETOS-------------------------------------------*/
	public void AlterandoObjetos(){
		this.formulario.getTId().setText(String.valueOf(this.paciente.getId()));
		this.formulario.getTNome().setText(this.paciente.getNome());
		this.formulario.getTRg().setText(this.paciente.getRg());
		this.formulario.getJCpf().setText(this.paciente.getCpf());
		this.formulario.getTObservacao().setText(this.paciente.getObservacao());
		this.formulario.getComboConvenio().setSelectedItem(this.paciente.getConvenio());
		this.formulario.getJDataNasc().setText(ConverteDadosUtil.TransformandoEmString(this.paciente.getDataNasc()));
		this.formulario.getJDataCadastro().setText(ConverteDadosUtil.TransformandoEmString(this.paciente.getDataCad()));
		this.formulario.getTLogradouro().setText(this.paciente.getEndereco().get(0).getLogradouro());
		this.formulario.getTComplemento().setText(this.paciente.getEndereco().get(0).getComplemento());
		this.formulario.getTNumero().setText(String.valueOf(this.paciente.getEndereco().get(0).getNumero()));
		this.formulario.getTBairro().setText(this.paciente.getEndereco().get(0).getBairro());
		this.formulario.getTCidade().setText(this.paciente.getEndereco().get(0).getCidade());
		this.formulario.getComboEstado().setSelectedItem(this.paciente.getEndereco().get(0).getEstado());
		this.formulario.getJCep().setText(this.paciente.getEndereco().get(0).getCep());
		this.formulario.getTEmail().setText(this.paciente.getContato().get(0).getEmail());
		this.formulario.getTCelular().setText(this.paciente.getContato().get(0).getCelular());
		this.formulario.getTTelefone().setText(this.paciente.getContato().get(0).getTelefone());
	}

	
	//Método para Edicao de clientes
		private void EditToCliente(){
			paciente.setId(Long.parseLong(this.formulario.getTId().getText()));
			paciente.setNome(this.formulario.getTNome().getText());
			paciente.setCpf(this.formulario.getJCpf().getText().replaceAll("[_.-]", ""));
			paciente.setRg(this.formulario.getTRg().getText());
			paciente.setConvenio((Convenio)this.formulario.getComboConvenio().getSelectedItem());
			paciente.setDataNasc(ConverteDadosUtil.TransformandoEmDate(this.formulario.getJDataNasc().getText()));
			paciente.getEndereco().get(0).setLogradouro(this.formulario.getTLogradouro().getText());
			paciente.getEndereco().get(0).setComplemento(this.formulario.getTComplemento().getText());
			paciente.getEndereco().get(0).setNumero(ConverteDadosUtil.RetornaInt(this.formulario.getTNumero().getText()));
			paciente.getEndereco().get(0).setBairro(this.formulario.getTBairro().getText());
			paciente.getEndereco().get(0).setCidade(this.formulario.getTCidade().getText());
			paciente.getEndereco().get(0).setEstado((String)this.formulario.getComboEstado().getSelectedItem());
			paciente.getEndereco().get(0).setCep(this.formulario.getJCep().getText());
			paciente.getContato().get(0).setEmail(this.formulario.getTEmail().getText());
			paciente.getContato().get(0).setCelular(this.formulario.getTCelular().getText());
			paciente.getContato().get(0).setTelefone(this.formulario.getTTelefone().getText());
		}
		
		
		

	
	
	/*-----------------------------------------------------------------------------------------------------------------*/
	/*-------------------CLASSES QUE POSSUI AS ACOES DOS BOTOES ---------------*/
	
	//Classe que possui eventos dos botoes da TELA
	public void actionPerformed(ActionEvent event) {
				
		if(event.getSource().equals(this.formulario.getBTGravar()) && ValidandoField()){
			if(this.formulario.getTId().getText().isEmpty())
				Salvar();
			else
				Editar();
			
			this.formulario.dispose();
		}else if(event.getActionCommand().equals("Cancelar")){
			this.formulario.dispose();
		}else{
			MensagemPainelUtil.CampoVazio("Nome, Cpf e Rg devem ser preenchidos");
		}
		
	}
	
	private boolean ValidandoField(){
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
	
	private void HiperlinkAdicionarConv(){
		this.formulario.getLAdicionaConvenio().addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseClicked(MouseEvent e) {
		         IncluirConvenioForm formu = new IncluirConvenioForm();
				     if(formulario.getVersao() == 'c')
				    	 formu.IniciaClassic();
					 if(formulario.getVersao() == 'g')
						 formu.IniciaGrafic();
		         formu.setLocationRelativeTo(formulario.getTela());
		         formu.setVisible(true);
		         ListaConvenios();
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
	
	
	public void TeclaEsc(){
        JRootPane meurootpane = this.formulario.getRootPane();  
        meurootpane.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), "ESCAPE");  
        meurootpane.getRootPane().getActionMap().put("ESCAPE", new AbstractAction("ESCAPE") {  
  
            public void actionPerformed(ActionEvent e) {  
            	formulario.dispose();  
            }  
        });  
    }  
	
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void ListaConvenios(){
		this.formulario.getComboConvenio().setModel(new DefaultComboBoxModel(new Vector(con.RetornaConvenio())));
		this.formulario.getComboConvenio().setSelectedIndex(-1);
	}

	
	
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	
	public Paciente getPaciente() {
		return paciente;
	}
	
	
	
	
}
