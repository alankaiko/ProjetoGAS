package br.com.gsv.graficoClassic;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.border.EmptyBorder;

import br.com.gsv.formularios.BuscarFabricanteDialog;

public class BuscarFabricanteClassic {
	private BuscarFabricanteDialog formulario;
	
	public BuscarFabricanteClassic(BuscarFabricanteDialog formulario) {
		this.formulario = formulario;
		CriarTelaGeralClassic();
		DadosConvenio();
	}
	
	
	public void CriarTelaGeralClassic() {
		this.formulario.setTitle("Buscar Fabricantes");
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
	

	public void DadosConvenio() {
		this.formulario.getBuscarUsuario().setText("Escolha uma Opção: ");
		this.formulario.getBuscarUsuario().setBounds(15,10,150,20);
	
		this.formulario.getBuscaId().setText("Código");
		this.formulario.getBuscaId().setFont(new Font("Arial", Font.PLAIN, 13));
		this.formulario.getBuscaId().setBounds(15, 40, 86, 23);
		
		
		this.formulario.getBuscaDescricao().setText("Descrição");
		this.formulario.getBuscaDescricao().setFont(new Font("Arial", Font.PLAIN, 13));
		this.formulario.getBuscaDescricao().setBounds(144, 40, 99, 23);
		
		
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
