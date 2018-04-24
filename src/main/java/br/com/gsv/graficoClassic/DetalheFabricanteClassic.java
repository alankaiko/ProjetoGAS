package br.com.gsv.graficoClassic;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;

import br.com.gsv.formularios.DetalhesFabricanteDialog;

public class DetalheFabricanteClassic {
	private DetalhesFabricanteDialog formulario;
	
	public DetalheFabricanteClassic(DetalhesFabricanteDialog formulario) {
		this.formulario = formulario;
		CriarTelaGeral();
		Dados();
	}
	
	
	//cria e tela geral onde todos os componentes serao inseridos, é a tela geral do sistema
	private void CriarTelaGeral(){
		this.formulario.setTitle("Dados de Fabricante ");
		this.formulario.setModal(true);
		this.formulario.setResizable(false);
		this.formulario.setBounds(100, 100, 350, 200);
		
		this.formulario.getTela().setLayout(null);		
		this.formulario.getTela().add(this.formulario.getPanel(), BorderLayout.CENTER);
		
		this.formulario.getPanel().setLayout(null);
		this.formulario.getPanel().setBorder(new EmptyBorder(5, 5, 5, 5));
		
	}
		

	
	public void Dados(){
		this.formulario.getLId().setText("Código");
		this.formulario.getLId().setBounds(37, 30, 50, 20);
		this.formulario.getLId().setFont(new Font("Arial", Font.BOLD, 11));
			this.formulario.getTId().setBounds(83, 31, 84, 20);
			this.formulario.getTId().setBackground(new Color(255, 255, 204));
			this.formulario.getTId().setFont(new Font("Arial", Font.BOLD, 10));
			this.formulario.getTId().setForeground(Color.black);

		this.formulario.getLFabricante().setText("Fabricante ");
		this.formulario.getLFabricante().setBounds(22, 62, 97, 20);
		this.formulario.getLFabricante().setFont(new Font("Arial", Font.BOLD, 11));
			this.formulario.getTFabricante().setBounds(83, 63, 239, 19);
			this.formulario.getTFabricante().setFont(new Font("Arial", Font.BOLD, 10));
					
			
		this.formulario.getCancelar().setText("Cancelar");
		this.formulario.getCancelar().setFont(new Font("Calibri", Font.PLAIN, 12));
		this.formulario.getCancelar().setBounds(522, 398, 89, 23);
	}
		
		
		
			
			
}
