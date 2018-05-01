package br.com.gsv.graficoClassic;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import br.com.gsv.formularios.CodigoUsuarioDialog;

public class CodigoUsuarioClassic {
	private CodigoUsuarioDialog formulario;
	
	public CodigoUsuarioClassic(CodigoUsuarioDialog formulario) {
		this.formulario = formulario;
		CriarTelaGeralClassic();
		DadosConvenio();
	}
	
	
	public void CriarTelaGeralClassic() {
		this.formulario.setTitle("Buscar Login");
		this.formulario.setModal(true);
		this.formulario.setBounds(100, 100, 281, 124);
		this.formulario.setResizable(false);
		this.formulario.getTela().setLayout(null);
		this.formulario.getTela().add(this.formulario.getPanel(), BorderLayout.CENTER);

		this.formulario.getPanel().setBorder(new EmptyBorder(5, 5, 5, 5));
		this.formulario.getPanel().setLayout(null);
	}
	

	public void DadosConvenio() {
		this.formulario.getTBuscar().setBorder(new LineBorder(Color.BLACK));
		this.formulario.getTBuscar().setBounds(50, 13, 171, 23);
		this.formulario.getTBuscar().setFont(new Font("Arial", Font.BOLD, 10));

		this.formulario.getOk().setText("Buscar");
		this.formulario.getOk().setFont(new Font("Segoe UI", Font.PLAIN, 13));
		this.formulario.getOk().setBounds(41, 67, 85, 18);

		this.formulario.getCancelar().setText("Cancelar");
		this.formulario.getCancelar().setFont(new Font("Segoe UI", Font.PLAIN, 13));
		this.formulario.getCancelar().setBounds(136, 67, 85, 18);		
	}
}
