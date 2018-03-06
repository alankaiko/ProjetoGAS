package br.com.gsv.convenio.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JRootPane;
import javax.swing.KeyStroke;

import br.com.gsv.convenio.domain.Convenio;
import br.com.gsv.convenio.formularios.IncluirConvenioForm;
import br.com.projeto.gsv.controller.ConvenioController;

public class IncluirConvenioListener implements ActionListener{
	private IncluirConvenioForm formulario;
	private ConvenioController con;
	private Convenio convenio;

	public IncluirConvenioListener(IncluirConvenioForm formulario) {
		this.formulario = formulario;
		con = new ConvenioController();
		AdicionarListener();
		TeclaEsc();
		UpCase();
		UsandoTAB();
	}

	private void Salvar() {
		FormToConvenio();
		con.setConvenio(this.convenio);
		con.SalvarConvenio();
	}

	private void Editar() {
		EditToConvenio();
		con.setConvenio(this.convenio);
		con.SalvarConvenio();
	}

	// Classe pega os botoes do formulario e atrela à esta classe controller
	// aqui (propria classe ClienteActionListener)
	private void AdicionarListener() {
		formulario.getBTGravar().addActionListener(this);
		formulario.getBTCancelar().addActionListener(this);
	}

	/*-----------------------------------------------------------------------------------------------------------------*/
	/*-------------------CLASSES INTERNAS QUE CAPTURAM AS INFORMACOES E INSEREM NOS RESPECTIVOS OBJETOS ---------------*/

	// Método que pega informacoes do cliente e joga dentro do objeto Cliente
	private void FormToConvenio() {
		convenio = new Convenio();
		convenio.setNome(this.formulario.getTConvenio().getText());
	}

	/*-----------------------------------------------------------------------------------------------------------------*/
	/*---------------------------------------CLASSES PARA EDICAO DOS OBJETOS-------------------------------------------*/
	public void AlterandoObjetos() {
		this.formulario.getTId().setText(String.valueOf(this.convenio.getId()));
		this.formulario.getTConvenio().setText(this.convenio.getNome());
	}

	// Método para Edicao de clientes
	private void EditToConvenio() {
		convenio.setId(Long.parseLong(this.formulario.getTId().getText()));
		convenio.setNome(this.formulario.getTConvenio().getText());
	}

	/*-----------------------------------------------------------------------------------------------------------------*/
	/*---------------------------------------CLASSES PARA DETALHAR OBJETOS-------------------------------------------*/
	public void DetalhandoObjetos() {
		this.formulario.getTId().setEditable(false);
		this.formulario.getTConvenio().setEditable(false);

	}

	/*-----------------------------------------------------------------------------------------------------------------*/
	/*-------------------CLASSES QUE POSSUI AS ACOES DOS BOTOES ---------------*/

	// Classe que possui eventos dos botoes da TELA
	public void actionPerformed(ActionEvent event) {
		if (event.getSource().equals(this.formulario.getBTGravar())) {
			if (this.formulario.getTId().getText().isEmpty()){
				Salvar();
			}else{
				Editar();
			}
			this.formulario.dispose();
		}

		if (event.getSource().equals(this.formulario.getBTCancelar())) {
			this.formulario.dispose();
		}

	}

	private void UsandoTAB() {
		this.formulario.getRootPane().setDefaultButton(
				this.formulario.getBTGravar());
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

	public void TeclaEsc() {
		JRootPane meurootpane = this.formulario.getRootPane();
		meurootpane.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), "ESCAPE");
		meurootpane.getRootPane().getActionMap().put("ESCAPE", new AbstractAction("ESCAPE") {
			public void actionPerformed(ActionEvent e) {
				formulario.dispose();
			}
		});
	}
	
	
	private void UpCase(){
		this.formulario.getTConvenio().addKeyListener(new KeyAdapter() {  
			public void keyReleased(KeyEvent ke) {  
				if (ke.getKeyCode() != KeyEvent.VK_HOME) {  
					String s = formulario.getTConvenio().getText();  
					formulario.getTConvenio().setText(s.toUpperCase());  
				}  
			}  
		}); 	
	}

	public void setConvenio(Convenio convenio) {
		this.convenio = convenio;
	}
	
	public Convenio getConvenio() {
		return convenio;
	}
}
