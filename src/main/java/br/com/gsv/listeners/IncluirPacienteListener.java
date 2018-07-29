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
	
	
	public IncluirPacienteListener(IncluirPacienteForm formulario) {
		this.formulario = formulario;
		con = new PacienteController();
		AdicionarListener();
		ListaConvenios();
		TeclaEsc();
		UsandoTAB();
		HiperlinkAdicionarConv();
		LimitaCaracteres();
	}
	
	public void IniciarObjetos(){
		this.paciente = new Paciente();
		this.convenio = new Convenio();
	}
	
	
	private void Salvar(){
		PegarDados();
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
	private void PegarDados(){
		paciente.setNome(this.formulario.getTNome().getText());
		paciente.setCpf(this.formulario.getJCpf().getText().replaceAll("[_.-]", ""));
		paciente.setRg(this.formulario.getTRg().getText());
		paciente.setDataCad(new Date());
		paciente.setDataNasc(ConverteDadosUtil.TransformandoEmDate(this.formulario.getJDataNasc().getText()));
		paciente.setObservacao(this.formulario.getTObservacao().getText());
		
		FormaFab();
		
		paciente.getContato().setEmail(this.formulario.getTEmail().getText());
		paciente.getContato().setCelular(this.formulario.getTCelular().getText());
		paciente.getContato().setTelefone(this.formulario.getTTelefone().getText());
		
		paciente.getEndereco().setLogradouro(this.formulario.getTLogradouro().getText());
		paciente.getEndereco().setComplemento(this.formulario.getTComplemento().getText());
		paciente.getEndereco().setNumero(ConverteDadosUtil.RetornaInt(this.formulario.getTNumero().getText()));
		paciente.getEndereco().setBairro(this.formulario.getTBairro().getText());
		paciente.getEndereco().setCidade(this.formulario.getTCidade().getText());
		paciente.getEndereco().setEstado((String)this.formulario.getComboEstado().getSelectedItem());
		paciente.getEndereco().setCep(this.formulario.getJCep().getText().replaceAll("[_.-]", ""));
		
	}
	
	
	private void FormaFab(){
		if(this.formulario.getComboConvenio().getSelectedIndex() != -1){
			this.paciente.setConvenio((Convenio) this.formulario.getComboConvenio().getSelectedItem()); 
		}else{
			convenio = new Convenio();
			this.paciente.setConvenio(this.convenio);
		}
	}
	
	
	/*-----------------------------------------------------------------------------------------------------------------*/
	/*---------------------------------------CLASSES PARA EDICAO DOS OBJETOS-------------------------------------------*/
	public void AlterandoObjetos(){
		this.convenio = this.paciente.getConvenio();
		
		this.formulario.getTId().setText(String.valueOf(this.paciente.getId()));
		this.formulario.getTNome().setText(this.paciente.getNome());
		this.formulario.getTRg().setText(this.paciente.getRg());
		this.formulario.getJCpf().setText(this.paciente.getCpf());
		this.formulario.getTObservacao().setText(this.paciente.getObservacao());
		this.formulario.getComboConvenio().setSelectedItem(this.paciente.getConvenio());
		this.formulario.getJDataNasc().setText(ConverteDadosUtil.TransformandoEmString(this.paciente.getDataNasc()));
		this.formulario.getJDataCadastro().setText(ConverteDadosUtil.TransformandoEmString(this.paciente.getDataCad()));
		this.formulario.getTLogradouro().setText(this.paciente.getEndereco().getLogradouro());
		this.formulario.getTComplemento().setText(this.paciente.getEndereco().getComplemento());
		this.formulario.getTNumero().setText(String.valueOf(this.paciente.getEndereco().getNumero()));
		this.formulario.getTBairro().setText(this.paciente.getEndereco().getBairro());
		this.formulario.getTCidade().setText(this.paciente.getEndereco().getCidade());
		this.formulario.getComboEstado().setSelectedItem(this.paciente.getEndereco().getEstado());
		this.formulario.getJCep().setText(this.paciente.getEndereco().getCep());
		this.formulario.getTEmail().setText(this.paciente.getContato().getEmail());
		this.formulario.getTCelular().setText(this.paciente.getContato().getCelular());
		this.formulario.getTTelefone().setText(this.paciente.getContato().getTelefone());
	}

	
	
	/*-----------------------------------------------------------------------------------------------------------------*/
	/*-------------------CLASSES QUE POSSUI AS ACOES DOS BOTOES ---------------*/
	
	//Classe que possui eventos dos botoes da TELA
	public void actionPerformed(ActionEvent event) {
		if(event.getSource().equals(this.formulario.getBTGravar()) && ValidandoField()){
			Salvar();

			this.formulario.dispose();
		}else if(event.getSource().equals(this.formulario.getBTCancelar())){
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

	private void HiperlinkAdicionarConv(){
		this.formulario.getLAdicionaConvenio().addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseClicked(MouseEvent e) {
		         IncluirConvenioForm formu = new IncluirConvenioForm();
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
		
		this.formulario.getTTelefone().addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {			    
                if ((formulario.getTTelefone().getText().length() > 11)) {
                	e.setKeyChar((char) KeyEvent.VK_CLEAR);      
			    } 
			}
		});
		
		this.formulario.getTCelular().addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {			    
                if ((formulario.getTCelular().getText().length() > 11)) {
                	e.setKeyChar((char) KeyEvent.VK_CLEAR);      
			    } 
			}
		});
	}
	
	
	@SuppressWarnings("serial")
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
