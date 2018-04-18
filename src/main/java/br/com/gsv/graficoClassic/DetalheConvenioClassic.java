package br.com.gsv.graficoClassic;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.border.EmptyBorder;

import br.com.gsv.formularios.DetalhesConvenioDialog;

public class DetalheConvenioClassic {
	private DetalhesConvenioDialog formulario;
	
	public DetalheConvenioClassic(DetalhesConvenioDialog formulario) {
		this.formulario = formulario;
		CriarTelaGeralClassic();
		DadosConvenio();
	}
	
	
	public void CriarTelaGeralClassic() {
		this.formulario.setTitle("Dados de Convenio ");
		this.formulario.setModal(true);
		this.formulario.setResizable(false);
		this.formulario.setBounds(100, 100, 323, 174);
		
		this.formulario.getTela().setLayout(null);		
		this.formulario.getTela().add(this.formulario.getPanel(), BorderLayout.CENTER);
		
		this.formulario.getPanel().setLayout(null);
		this.formulario.getPanel().setBorder(new EmptyBorder(5, 5, 5, 5));
	}
	

	public void DadosConvenio() {
		this.formulario.getLId().setText("Código");
		this.formulario.getLId().setBounds(37, 30, 50, 20);
		this.formulario.getLId().setFont(new Font("Arial", Font.BOLD, 11));
			this.formulario.getTId().setBounds(83, 31, 84, 20);
			this.formulario.getTId().setBackground(new Color(255, 255, 204));
			this.formulario.getTId().setFont(new Font("Arial", Font.BOLD, 10));
			this.formulario.getTId().setForeground(Color.black);

		this.formulario.getLConvenio().setText("Convênio ");
		this.formulario.getLConvenio().setBounds(22, 62, 97, 20);
		this.formulario.getLConvenio().setFont(new Font("Arial", Font.BOLD, 11));
			this.formulario.getTConvenio().setBounds(83, 63, 239, 19);
			this.formulario.getTConvenio().setFont(new Font("Arial", Font.BOLD, 10));
					
			
		this.formulario.getCancelar().setText("Cancelar");
		this.formulario.getCancelar().setFont(new Font("Calibri", Font.PLAIN, 12));
		this.formulario.getCancelar().setBounds(123, 107, 89, 23);
	}

}
