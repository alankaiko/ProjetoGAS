package br.com.gsv.graficoClassic;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.border.EmptyBorder;

import br.com.gsv.formularios.DetalhesUsuarioDialog;

public class DetalhesUsuarioClassic {
	private DetalhesUsuarioDialog formulario;
	
	public DetalhesUsuarioClassic(DetalhesUsuarioDialog formulario) {
		this.formulario = formulario;
		CriaVariaveis();
		Dados();
	}
	
	
	public void CriaVariaveis() {
		this.formulario.setTitle("Código");
		this.formulario.setModal(true);
		this.formulario.setBounds(100, 100, 516, 330);
		this.formulario.setResizable(false);
		this.formulario.getTela().setLayout(null);
		this.formulario.getTela().add(this.formulario.getPanel(), BorderLayout.CENTER);

		this.formulario.getPanel().setBorder(new EmptyBorder(5, 5, 5, 5));
		this.formulario.getPanel().setLayout(null);
	}
	

	public void Dados() {
		this.formulario.getLFuncionario().setText("Funcionário");
		this.formulario.getLFuncionario().setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		this.formulario.getLFuncionario().setBounds(39, 34, 112, 14);

		this.formulario.getTFuncionario().setBounds(39, 48, 375, 20);

		this.formulario.getLCpf().setText("CPF");
		this.formulario.getLCpf().setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		this.formulario.getLCpf().setBounds(39, 79, 46, 14);

		this.formulario.getTCpf().setBounds(40, 93, 229, 20);

		this.formulario.getLRg().setText("RG");
		this.formulario.getLRg().setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		this.formulario.getLRg().setBounds(293, 79, 46, 14);

		this.formulario.getTRg().setBounds(293, 93, 121, 20);

		this.formulario.getLAdicionar().setText("Detalhe Login");
		this.formulario.getLAdicionar().setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		this.formulario.getLAdicionar().setBounds(39, 147, 205, 20);

		this.formulario.getLLogin().setText("Login");
		this.formulario.getLLogin().setBounds(39, 172, 46, 14);

		this.formulario.getTLogin().setBounds(39, 188, 230, 20);
		
		this.formulario.getBCancelar().setText("Cancelar");
		this.formulario.getBCancelar().setFont(new Font("Calibri", Font.PLAIN, 12));
		this.formulario.getBCancelar().setBounds(208, 268, 89, 23);
	}
}
