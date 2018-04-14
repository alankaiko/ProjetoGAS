package br.com.gsv.grafico;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.border.EmptyBorder;

import br.com.gsv.formularios.ExcluirConvenioDialog;

public class ExcluirConvenioClassic {
	private ExcluirConvenioDialog formulario;

	public ExcluirConvenioClassic(ExcluirConvenioDialog formulario) {
		this.formulario = formulario;
		this.formulario.AdicionaComponentes();
		CriaTela();
		DefineComponentes();
		
	}
	
	
	public void CriaTela(){
		this.formulario.setBounds(100, 100,320, 100);
		this.formulario.setLayout(new BorderLayout());
		this.formulario.getPanel().setBorder(new EmptyBorder(5, 5, 5, 5));
		this.formulario.getTela().add(this.formulario.getPanel(), BorderLayout.CENTER);
		
		this.formulario.setTitle("Excluir Convenio / Plano / Credencial");
		this.formulario.setModal(true);
		this.formulario.setResizable(false);
		this.formulario.getTela().setLayout(null);		
		
		this.formulario.getPanel().setLayout(null);
		this.formulario.getPanel().setBorder(new EmptyBorder(5, 5, 5, 5));
		this.formulario.getPanel().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
	}
	
	
	public void DefineComponentes(){
		this.formulario.getExcluir().setText("Excluir: "+ formulario.getConvenio().getNome() + "?");
		this.formulario.getExcluir().setForeground(Color.black);
		this.formulario.getExcluir().setBounds(10, 10, 300, 18);
			
		this.formulario.getOk().setText("OK");
		this.formulario.getOk().setBounds(45, 50, 90, 18);
		
		this.formulario.getCancelar().setText("Cancelar");
		this.formulario.getCancelar().setBounds(140, 50, 90, 18);
			
	}

}
