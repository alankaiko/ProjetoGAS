package br.com.gsv.produtos.grafico;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.border.EmptyBorder;

import br.com.gsv.produtos.formularios.ExcluirProdutoDialog;

public class ExcluirProdutoClassic {
	private ExcluirProdutoDialog formulario;
	
	public ExcluirProdutoClassic(ExcluirProdutoDialog formulario) {
		this.formulario = formulario;
		CriaTela();
		CriaCompomentes();
	}
	
	
	

	public void CriaTela(){
		this.formulario.setBounds(100, 100,320, 100);
		this.formulario.getTela().setLayout(new BorderLayout());
		this.formulario.getTela().add(this.formulario.getPanel(), BorderLayout.CENTER);
		
		this.formulario.setTitle("Excluir Produto");
		this.formulario.setModal(true);
		this.formulario.setResizable(false);	
		this.formulario.getTela().add(this.formulario.getPanel(), BorderLayout.CENTER);
		
		this.formulario.getPanel().setLayout(null);
		this.formulario.getPanel().setBorder(new EmptyBorder(5, 5, 5, 5));
		this.formulario.getPanel().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
	}
	
	public void CriaCompomentes(){
		this.formulario.getExcluir().setText("Excluir: "+ this.formulario.getProduto().getDescricao() +" ?");
		this.formulario.getExcluir().setForeground(Color.black);
		this.formulario.getExcluir().setBounds(10, 10, 300, 18);
			this.formulario.getRootPane().setDefaultButton(this.formulario.getOk()); 
			this.formulario.getOk().setText("OK");
			this.formulario.getOk().setBounds(45, 50, 90, 18);
			
			this.formulario.getCancelar().setText("cancelar");
			this.formulario.getCancelar().setBounds(140, 50, 90, 18);
	}

}
