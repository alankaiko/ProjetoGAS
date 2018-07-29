package br.com.gsv.graficoClassic;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.border.EmptyBorder;

import br.com.gsv.formularios.IncluirProdutosForm;
import br.com.gsv.util.SomenteNumerosUtil;

public class IncluirProdutosClassic {
	private IncluirProdutosForm formulario;
	private SomenteNumerosUtil soNumeros;
	
	public IncluirProdutosClassic(IncluirProdutosForm formulario) {
		this.formulario = formulario;
		soNumeros = new SomenteNumerosUtil();
		
		CriarTelaGeral();
		CriaComponentes();
	}
	
	
	private void CriarTelaGeral(){
		this.formulario.setTitle("Inserir Dados de Produtos");
		this.formulario.setModal(true);
		this.formulario.setResizable(false);
		this.formulario.setBounds(100, 100, 489, 356);
		
		this.formulario.getTela().setLayout(null);		
		this.formulario.getTela().add(this.formulario.getPanel(), BorderLayout.CENTER);
		
		this.formulario.getPanel().setLayout(null);
		this.formulario.getPanel().setBorder(new EmptyBorder(5, 5, 5, 5));
		
	}
		
	private void CriaComponentes(){
		this.formulario.getLDados().setText("Dados do Produto");
		this.formulario.getLDados().setBounds(38, 29, 130, 14);
		
		this.formulario.getLCodigo().setText("Código");
		this.formulario.getLCodigo().setBounds(38, 62, 70, 14);
			this.formulario.getTCodigo().setBounds(100, 59, 86, 20);
			this.formulario.getTCodigo().setColumns(10);
			this.formulario.getTCodigo().setToolTipText("Aceita Letras e Números para composição do Código");
		
		this.formulario.getLDescricao().setText("Descrição");
		this.formulario.getLDescricao().setBounds(38, 104, 70, 14);
			this.formulario.getTDescricao().setBounds(108, 101, 328, 20);
			this.formulario.getTDescricao().setColumns(10);
	
		
		this.formulario.getLQuantidade().setText("Quantidade");
		this.formulario.getLQuantidade().setBounds(38, 145, 94, 14);
			this.formulario.getTQuantidade().setBounds(109, 142, 124, 20);
			this.formulario.getTQuantidade().setColumns(10);
			this.formulario.getTQuantidade().addKeyListener(soNumeros);
		
		
		this.formulario.getLFabricante().setText("Fabricante");
		this.formulario.getLFabricante().setBounds(38, 196, 113, 14);
			this.formulario.getComboFabricante().setBounds(106, 193, 241, 20);

			this.formulario.getLAdicionaFabricante().setText("Adicionar?");
			this.formulario.getLAdicionaFabricante().setForeground(Color.BLUE);
			this.formulario.getLAdicionaFabricante().setFont(new Font("Palatino Linotype", Font.PLAIN, 10));
			this.formulario.getLAdicionaFabricante().setBounds(357, 202, 123, 14);
		
		this.formulario.getBTGravar().setText("Gravar");
		this.formulario.getBTGravar().setFont(new Font("Calibri", Font.PLAIN, 12));
		this.formulario.getBTGravar().setBounds(142, 276, 89, 23);
		
		this.formulario.getBTCancelar().setText("Cancelar");
		this.formulario.getBTCancelar().setFont(new Font("Calibri", Font.PLAIN, 12));
		this.formulario.getBTCancelar().setBounds(250, 276, 89, 23);
	}
		
}
