package br.com.gsv.paciente.grafico;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import br.com.gsv.paciente.formularios.CodigoPacienteDialog;

public class CodigoPacienteClassic {
	private CodigoPacienteDialog formulario;
	
	public CodigoPacienteClassic(CodigoPacienteDialog formulario) {
		this.formulario = formulario;
		CriaTelaGeral();
		CriarTela();
	}
	
	
	private void CriaTelaGeral() {
		this.formulario.setTitle("Código");
		this.formulario.setModal(true);
		this.formulario.setBounds(100, 100, 200, 120);
		this.formulario.setResizable(false);
		this.formulario.getTela().setLayout(null);
		this.formulario.getTela().add(this.formulario.getPanel(), BorderLayout.CENTER);

		this.formulario.getPanel().setBorder(new EmptyBorder(5, 5, 5, 5));
		this.formulario.getPanel().setLayout(null);

	}
	

	public void CriarTela() {
		this.formulario.getTBuscar().setBounds(50, 13, 100, 23);
		this.formulario.getTBuscar().setFont(new Font("Arial", Font.BOLD, 10));

		this.formulario.getOk().setText("Buscar");
		this.formulario.getOk().setBounds(7, 60, 85, 18);

		this.formulario.getCancelar().setText("Cancelar");
		this.formulario.getCancelar().setBounds(102, 60, 85, 18);

	}

}