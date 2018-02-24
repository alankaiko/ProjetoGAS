package br.com.gsv.fabricantes.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JRootPane;
import javax.swing.KeyStroke;

import br.com.gsv.fabricantes.domain.Fabricante;
import br.com.gsv.fabricantes.formularios.IncluirFabricantesForm;
import br.com.projeto.gsv.controller.FabricanteController;

public class IncluirFabricantesListener implements ActionListener {
	private IncluirFabricantesForm formulario;
	private FabricanteController con;
	private Fabricante fabricante;

	public IncluirFabricantesListener(IncluirFabricantesForm formulario) {
		this.formulario = formulario;
		con = new FabricanteController();
		AdicionarListener();
		TeclaEsc();
		UsandoTAB();
	}

	private void Salvar() {
		FormToFabricante();
		con.setFabricante(this.fabricante);
		con.SalvarFabricante();
	}

	private void Editar() {
		EditToFabricante();
		con.setFabricante(this.fabricante);
		con.SalvarFabricante();
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
	private void FormToFabricante() {
		fabricante = new Fabricante();
		fabricante.setDescricao(this.formulario.getTFabricante().getText());
	}

	/*-----------------------------------------------------------------------------------------------------------------*/
	/*---------------------------------------CLASSES PARA EDICAO DOS OBJETOS-------------------------------------------*/
	public void AlterandoObjetos() {
		this.formulario.getTId().setText(
				String.valueOf(this.fabricante.getId()));
		this.formulario.getTFabricante()
				.setText(this.fabricante.getDescricao());
	}

	// Método para Edicao de clientes
	private void EditToFabricante() {
		fabricante.setId(Long.parseLong(this.formulario.getTId().getText()));
		fabricante.setDescricao(this.formulario.getTFabricante().getText());
	}

	/*-----------------------------------------------------------------------------------------------------------------*/
	/*---------------------------------------CLASSES PARA DETALHAR OBJETOS-------------------------------------------*/
	public void DetalhandoObjetos() {
		this.formulario.getTId().setEditable(false);
		this.formulario.getTFabricante().setEditable(false);

	}

	/*-----------------------------------------------------------------------------------------------------------------*/
	/*-------------------CLASSES QUE POSSUI AS ACOES DOS BOTOES ---------------*/

	// Classe que possui eventos dos botoes da TELA
	public void actionPerformed(ActionEvent event) {
		if (event.getSource().equals(this.formulario.getBTGravar())) {
			if (this.formulario.getTId().getText().isEmpty())
				Salvar();
			else
				Editar();

			// this.formulario.dispose();
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

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}

	public Fabricante getFabricante() {
		return fabricante;
	}

}
