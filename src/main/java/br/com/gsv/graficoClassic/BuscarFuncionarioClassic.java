package br.com.gsv.graficoClassic;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.border.EmptyBorder;

import br.com.gsv.formularios.BuscarFuncionarioDialog;

public class BuscarFuncionarioClassic {
	private BuscarFuncionarioDialog formulario;
	
	public BuscarFuncionarioClassic(BuscarFuncionarioDialog formulario) {
		this.formulario = formulario;
		
		CriarTelaGeral();
		OrganizaDados();
	}
	
	
	
	private void CriarTelaGeral(){
		this.formulario.setTitle("Buscar Clientes");
		this.formulario.setModal(true);
		this.formulario.setResizable(false);
		this.formulario.setBounds(100, 100, 620, 400);
		
		this.formulario.getTela().setLayout(null);		
		this.formulario.getTela().add(this.formulario.getPanel(), BorderLayout.CENTER);
		
		this.formulario.getPanel().setLayout(null);
		this.formulario.getPanel().setBorder(new EmptyBorder(5, 5, 5, 5));
		
		this.formulario.getScrollPane().setBounds(15, 100, 560, 220);
		this.formulario.getTela().add(this.formulario.getScrollPane());
	}
	
	
	public void OrganizaDados(){
		this.formulario.getBuscarUsuario().setText("Escolha uma Opção: ");
		this.formulario.getBuscarUsuario().setBounds(15,10,150,20);
	
		this.formulario.getBuscaCpf().setText("CPF");
		this.formulario.getBuscaCpf().setFont(new Font("Arial", Font.PLAIN, 13));
		this.formulario.getBuscaCpf().setBounds(201, 40, 53, 23);
		
		
		this.formulario.getBuscaRg().setText("RG");
		this.formulario.getBuscaRg().setFont(new Font("Arial", Font.PLAIN, 13));
		this.formulario.getBuscaRg().setBounds(154, 40, 53, 23);
		
		this.formulario.getBuscaNome().setText("Nome");
		this.formulario.getBuscaNome().setFont(new Font("Arial", Font.PLAIN, 13));
		this.formulario.getBuscaNome().setBounds(82, 40, 60, 23);
		
		this.formulario.getBuscaCodigo().setText("Código");
		this.formulario.getBuscaCodigo().setFont(new Font("Arial", Font.PLAIN, 13));
		this.formulario.getBuscaCodigo().setBounds(15, 40, 65, 23);
	
		this.formulario.getTextoBuscar().setBounds(15,70,260,20);
		this.formulario.getTextoBuscar().setFont(new Font("Arial",Font.BOLD,10));
		this.formulario.getTextoBuscar().setForeground(Color.black);		

		this.formulario.getBuscar().setText("Buscar");
		this.formulario.getBuscar().setBounds(300,68,125,20);

		this.formulario.getOk().setText("OK");
		this.formulario.getOk().setBounds(150,340,125,20);
	
		this.formulario.getCancelar().setText("Cancelar");
		this.formulario.getCancelar().setBounds(290,340,125,20);	
	}
}
