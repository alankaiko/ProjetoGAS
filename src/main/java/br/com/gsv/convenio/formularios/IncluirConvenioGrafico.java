package br.com.gsv.convenio.formularios;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.border.EmptyBorder;

public class IncluirConvenioGrafico {
	private IncluirConvenioForm formulario;
	
	public IncluirConvenioGrafico(IncluirConvenioForm formulario) {
		this.formulario = formulario;
		DadosFuncionario();
		this.formulario.InicializaCompomentes();
	}
	
	
	
	// cria os componentes jbutton jlabel jtexfield etc etc etc e organiza
	// dentro do layout geral
	public void DadosFuncionario() {
		this.formulario.getLId().setText("Código");
		this.formulario.getLId().setFont(new Font("Arial", Font.BOLD, 11));
		this.formulario.getLId().setBounds(37, 30, 50, 20);
			this.formulario.getTId().setBounds(83, 31, 84, 20);
			this.formulario.getTId().setBackground(new Color(255, 255, 204));
			this.formulario.getTId().setFont(new Font("Arial", Font.BOLD, 10));
			this.formulario.getTId().setForeground(Color.black);
			this.formulario.getTId().setEditable(false);

		this.formulario.getLConvenio().setText("Convenio");
		this.formulario.getLConvenio().setBounds(22, 62, 104, 20);
		this.formulario.getLConvenio().setFont(new Font("Arial", Font.BOLD, 11));
			this.formulario.getTConvenio().setBounds(83, 63, 239, 19);
			this.formulario.getTConvenio().setFont(new Font("Arial", Font.BOLD, 10));

		this.formulario.getBTGravar().setText("Gravar");
		this.formulario.getBTGravar().setFont(new Font("Calibri", Font.PLAIN, 12));
		this.formulario.getBTGravar().setBounds(59, 93, 89, 23);

		this.formulario.getBTCancelar().setText("Cancelar");
		this.formulario.getBTCancelar().setFont(new Font("Calibri", Font.PLAIN, 12));
		this.formulario.getBTCancelar().setBounds(170, 93, 89, 23);
	}

}
