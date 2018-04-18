package br.com.gsv.graficoClassic;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.border.EmptyBorder;

import br.com.gsv.formularios.CodigoConvenioDialog;

public class CodigoConvenioClassic {
	private CodigoConvenioDialog formulario;
	
	public CodigoConvenioClassic(CodigoConvenioDialog formulario) {
		this.formulario = formulario;
		CriarTelaGeralClassic();
		DadosConvenio();
	}
	
	
	public void CriarTelaGeralClassic() {
		this.formulario.setTitle("Código");
		this.formulario.setModal(true);
		this.formulario.setBounds(100, 100, 200, 120);
		this.formulario.setResizable(false);
		this.formulario.getTela().setLayout(null);
		this.formulario.getTela().add(this.formulario.getPanel(), BorderLayout.CENTER);
		
		this.formulario.getPanel().setBorder(new EmptyBorder(5, 5, 5, 5));
		this.formulario.getPanel().setLayout(null);
	}
	

	public void DadosConvenio() {
		this.formulario.getTBuscar().setBounds(50,13,100,23);
		this.formulario.getTBuscar() .setFont(new Font("Arial",Font.BOLD,10));
		
		this.formulario.getOk().setText("Buscar");
		this.formulario.getOk().setBounds(7, 60, 85, 18);
		
		this.formulario.getCancelar().setText("Cancelar");
		this.formulario.getCancelar().setBounds(102, 60, 85, 18);
		
	}

}
