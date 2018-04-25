package br.com.gsv.graficoClassic;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.border.EmptyBorder;

import br.com.gsv.formularios.BuscarUsuarioDialog;

public class BuscarUsuarioClassic {
private BuscarUsuarioDialog formulario;
	
	public BuscarUsuarioClassic(BuscarUsuarioDialog formulario) {
		this.formulario = formulario;
		
		CriarTelaGeral();
		OrganizaDados();
	}
	
	
	
	private void CriarTelaGeral(){
		this.formulario.setTitle("Buscar Usuário");
		this.formulario.setModal(true);
		this.formulario.setResizable(false);
		this.formulario.setBounds(100, 100, 514, 344);

		this.formulario.getTela().setLayout(null);
		this.formulario.getTela().add(this.formulario.getPanel(), BorderLayout.CENTER);

		this.formulario.getPanel().setLayout(null);
		this.formulario.getPanel().setBorder(new EmptyBorder(5, 5, 5, 5));

		this.formulario.getScrollPane().setBounds(15, 100, 478, 177);
		this.formulario.getTela().add(this.formulario.getScrollPane());
	}
	
	
	public void OrganizaDados(){
		this.formulario.getBuscarUsuario().setText("Escolha uma Opção: ");
		this.formulario.getBuscarUsuario().setBounds(15, 10, 150, 20);

		this.formulario.getBuscaLogin().setText("Login");
		this.formulario.getBuscaLogin().setFont(new Font("Arial", Font.PLAIN, 13));
		this.formulario.getBuscaLogin().setBounds(15, 40, 84, 23);

		this.formulario.getBuscaNome().setText("Usuário");
		this.formulario.getBuscaNome().setFont(new Font("Arial", Font.PLAIN, 13));
		this.formulario.getBuscaNome().setBounds(106, 40, 90, 23);

		this.formulario.getTextoBuscar().setBounds(15, 70, 260, 20);
		this.formulario.getTextoBuscar().setFont(new Font("Arial", Font.BOLD, 10));
		this.formulario.getTextoBuscar().setForeground(Color.black);

		this.formulario.getBuscar().setText("Buscar");
		this.formulario.getBuscar().setBounds(300, 68, 125, 20);

		this.formulario.getOk().setText("OK");
		this.formulario.getOk().setBounds(118, 288, 125, 20);

		this.formulario.getCancelar().setText("Cancelar");
		this.formulario.getCancelar().setBounds(253, 288, 125, 20);

	}
}
