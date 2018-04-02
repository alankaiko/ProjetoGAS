package br.com.gsv.produtos.grafico;

import java.awt.Color;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.LineBorder;

import br.com.gsv.produtos.formularios.IncluirProdutosForm;
import br.com.projeto.gsv.util.SomenteNumerosUtil;

public class IncluirProdutoGrafic {
	private IncluirProdutosForm formulario;
	private SomenteNumerosUtil soNumero;
	
	public IncluirProdutoGrafic(IncluirProdutosForm formulario) {
		this.formulario = formulario;
		soNumero = new SomenteNumerosUtil();
		
		CriarTelaGeral();
		CriaComponentes();
	}
	
	
	private void CriarTelaGeral(){
		this.formulario.setModal(true);
		this.formulario.setResizable(false);
		this.formulario.setBounds(100, 100, 471, 312);
		this.formulario.setUndecorated(true);
		this.formulario.getPanel().setBorder(new LineBorder(new Color(71,120,197)));
		this.formulario.getPanel().setBackground(Color.WHITE);
		
	}
		
	private void CriaComponentes(){
		GroupLayout groupLayout = new GroupLayout(this.formulario.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
				.addComponent(this.formulario.getPanel(), GroupLayout.PREFERRED_SIZE, 470, Short.MAX_VALUE)
				.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(this.formulario.getPanel(), GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
		);
		
		JPanel painelTitulo = new JPanel();
		painelTitulo.setBackground(new Color(71,120,197));
		
		this.formulario.getLCodigo().setText("Código");
		this.formulario.getLCodigo().setFont(new Font("Segoe UI Symbol", Font.PLAIN, 13));
		
		this.formulario.getTCodigo().setBorder(new LineBorder(new Color(71,120,197)));
		this.formulario.getTCodigo().setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		this.formulario.getTCodigo().setToolTipText("Aceita Letras e Números para composição do Código");
		this.formulario.getTCodigo().setColumns(10);
		
		this.formulario.getLDescricao().setText("Descrição");
		this.formulario.getLDescricao().setFont(new Font("Segoe UI Symbol", Font.PLAIN, 13));
		
		this.formulario.getTDescricao().setBorder(new LineBorder(new Color(71,120,197)));
		this.formulario.getTDescricao().setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		this.formulario.getTDescricao().setColumns(10);
		
		this.formulario.getLQuantidade().setText("Quantidade");
		this.formulario.getLQuantidade().setFont(new Font("Segoe UI Symbol", Font.PLAIN, 13));
		
		this.formulario.getTQuantidade().setBorder(new LineBorder(new Color(71,120,197)));
		this.formulario.getTQuantidade().setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		this.formulario.getTQuantidade().setColumns(10);
		this.formulario.getTQuantidade().addKeyListener(soNumero);
		
		this.formulario.getLFabricante().setText("Fabricante");
		this.formulario.getLFabricante().setFont(new Font("Segoe UI Symbol", Font.PLAIN, 13));
		
		this.formulario.getComboFabricante().setBackground(Color.WHITE);
		this.formulario.getComboFabricante().setForeground(Color.BLACK);
		
		this.formulario.getLAdicionaFabricante().setText("Adicionar?");
		this.formulario.getLAdicionaFabricante().setForeground(Color.BLUE);
		this.formulario.getLAdicionaFabricante().setFont(new Font("SansSerif", Font.PLAIN, 10));
		
		this.formulario.getBTGravar().setText("Gravar");
		this.formulario.getBTGravar().setBounds(215, 381, 84, 23);
		this.formulario.getBTGravar().setBackground(new Color(71, 120, 197));
		this.formulario.getBTGravar().setFont(new Font("Segoe UI", 0, 14));
		this.formulario.getBTGravar().setForeground(new Color(255, 255, 255));
		
		this.formulario.getBTCancelar().setText("Cancelar");
		this.formulario.getBTCancelar().setBounds(215, 381, 84, 23);
		this.formulario.getBTCancelar().setBackground(new Color(71, 120, 197));
		this.formulario.getBTCancelar().setFont(new Font("Segoe UI", 0, 14));
		this.formulario.getBTCancelar().setForeground(new Color(255, 255, 255));
		
		
		
		GroupLayout gl_panel = new GroupLayout(this.formulario.getPanel());
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(painelTitulo, GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(38)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_panel.createSequentialGroup()
					.addComponent(this.formulario.getTDescricao(), GroupLayout.PREFERRED_SIZE, 379, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
					.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
					.addComponent(this.formulario.getLQuantidade())
					.addComponent(this.formulario.getLDescricao())
					.addComponent(this.formulario.getLCodigo())
					.addComponent(this.formulario.getTQuantidade(), GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
					.addComponent(this.formulario.getTCodigo(), GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE))
					.addGap(30)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_panel.createSequentialGroup()
					.addComponent(this.formulario.getLFabricante())
					.addContainerGap())
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
					.addGroup(gl_panel.createSequentialGroup()
					.addComponent(this.formulario.getComboFabricante(), 0, 229, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(this.formulario.getLAdicionaFabricante())
					.addGap(65))
					.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
					.addGap(13)
					.addComponent(this.formulario.getBTGravar(), GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(this.formulario.getBTCancelar())
					.addGap(151)))))))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
				.addComponent(painelTitulo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addGap(18)
				.addComponent(this.formulario.getLCodigo())
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(this.formulario.getTCodigo(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addGap(18)
				.addComponent(this.formulario.getLDescricao())
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(this.formulario.getTDescricao(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
				.addComponent(this.formulario.getLQuantidade())
				.addComponent(this.formulario.getLFabricante()))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
				.addComponent(this.formulario.getTQuantidade(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addComponent(this.formulario.getComboFabricante(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addComponent(this.formulario.getLAdicionaFabricante()))
				.addPreferredGap(ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
				.addComponent(this.formulario.getBTGravar())
				.addComponent(this.formulario.getBTCancelar()))
				.addContainerGap())
		);
		
		
		JLabel LabelTitulo = new JLabel("Inserir Produtos");
		LabelTitulo.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		LabelTitulo.setForeground(Color.WHITE);
		GroupLayout gl_painelTitulo = new GroupLayout(painelTitulo);
		gl_painelTitulo.setHorizontalGroup(
			gl_painelTitulo.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_painelTitulo.createSequentialGroup()
				.addContainerGap()
				.addComponent(LabelTitulo)
				.addContainerGap(367, Short.MAX_VALUE))
		);
		gl_painelTitulo.setVerticalGroup(
			gl_painelTitulo.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_painelTitulo.createSequentialGroup()
				.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(LabelTitulo))
		);
		painelTitulo.setLayout(gl_painelTitulo);
		this.formulario.getPanel().setLayout(gl_panel);
		this.formulario.getContentPane().setLayout(groupLayout);
	}
}
