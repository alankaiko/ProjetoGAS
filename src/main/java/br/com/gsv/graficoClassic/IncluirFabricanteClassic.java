package br.com.gsv.graficoClassic;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.border.EmptyBorder;

import br.com.gsv.formularios.IncluirFabricantesForm;

public class IncluirFabricanteClassic {
	IncluirFabricantesForm formulario;
	
	public IncluirFabricanteClassic(IncluirFabricantesForm formulario) {
		this.formulario = formulario;
		CriarTelaGeral();
		DadosFuncionario();
	}
	
	
	
	private void CriarTelaGeral() {
		this.formulario.setTitle("Inserir Dados de Fabricante");
		this.formulario.setModal(true);
		this.formulario.setResizable(false);
		this.formulario.setBounds(100, 100, 350, 200);

		this.formulario.getTela().setLayout(null);
		this.formulario.getTela().add(this.formulario.getPanel(), BorderLayout.CENTER);

		this.formulario.getPanel().setLayout(null);
		this.formulario.getPanel().setBorder(new EmptyBorder(5, 5, 5, 5));

	}



	public void DadosFuncionario() {
		this.formulario.getLId().setText("Código");
		this.formulario.getLId().setBounds(37, 30, 50, 20);
		this.formulario.getLId().setFont(new Font("Arial", Font.BOLD, 11));
			this.formulario.getTId().setBounds(83, 31, 84, 20);
			this.formulario.getTId().setBackground(new Color(255, 255, 204));
			this.formulario.getTId().setFont(new Font("Arial", Font.BOLD, 10));
			this.formulario.getTId().setForeground(Color.black);
			this.formulario.getTId().setEditable(false);

		this.formulario.getLFabricante().setText("Fabricante ");
		this.formulario.getLFabricante().setBounds(22, 62, 97, 20);
		this.formulario.getLFabricante().setFont(new Font("Arial", Font.BOLD, 11));
			this.formulario.getTFabricante().setBounds(83, 63, 239, 19);
			this.formulario.getTFabricante().setFont(new Font("Arial", Font.BOLD, 10));
			

		this.formulario.getBTGravar().setText("Gravar");
		this.formulario.getBTGravar().setFont(new Font("Calibri", Font.PLAIN, 12));
		this.formulario.getBTGravar().setBounds(85, 121, 89, 23);

		this.formulario.getBTCancelar().setText("Cancelar");
		this.formulario.getBTCancelar().setFont(new Font("Calibri", Font.PLAIN, 12));
		this.formulario.getBTCancelar().setBounds(180, 121, 89, 23);
	}

}
