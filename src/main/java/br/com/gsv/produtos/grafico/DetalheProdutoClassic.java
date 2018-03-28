package br.com.gsv.produtos.grafico;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.border.EmptyBorder;

import br.com.gsv.produtos.formularios.DetalhesProdutoDialog;

public class DetalheProdutoClassic {
	private DetalhesProdutoDialog formulario;
	
	public DetalheProdutoClassic(DetalhesProdutoDialog formulario) {
		this.formulario = formulario;
		CriarTelaGeral();
		CriaComponentes();
	}
	

	private void CriarTelaGeral(){
		this.formulario.setTitle("Inserir Dados de Produtos");
		this.formulario.setModal(true);
		this.formulario.setResizable(false);
		this.formulario.setBounds(100, 100, 650, 460);
		
		this.formulario.getTela().setLayout(null);		
		this.formulario.getTela().add(this.formulario.getPanel(), BorderLayout.CENTER);
		
		this.formulario.getPanel().setLayout(null);
		this.formulario.getPanel().setBorder(new EmptyBorder(5, 5, 5, 5));
		
		
	}
		
	
	private void CriaComponentes(){
		this.formulario.getLDados().setText("Dados do Produto");
		this.formulario.setBounds(38, 29, 134, 14);
		
		this.formulario.getLCodigo().setText("Código");
		this.formulario.getLCodigo().setBounds(38, 62, 68, 14);
			this.formulario.getTCodigo().setBounds(86, 59, 86, 20);
		
		this.formulario.getLDescricao().setText("Descrição");
		this.formulario.getLDescricao().setBounds(38, 104, 68, 14);
			this.formulario.getTDescricao().setBounds(106, 101, 328, 20);
		
		this.formulario.getLQuantidade().setText("Quantidade");
		this.formulario.getLQuantidade().setBounds(38, 171, 102, 14);
			this.formulario.getTQuantidade().setBounds(115, 168, 124, 20);
	
		
		this.formulario.getLFabricante().setText("Fabricante");
		this.formulario.getLFabricante().setBounds(38, 304, 102, 14);
			this.formulario.getTFabricante().setBounds(101, 301, 241, 20);
				
		this.formulario.getBTCancelar().setText("Cancelar");
		this.formulario.getBTCancelar().setFont(new Font("Calibri", Font.PLAIN, 12));
		this.formulario.getBTCancelar().setBounds(522, 398, 89, 23);
	}
}
