package br.com.gsv.graficoAzul;

import java.awt.Color;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.LineBorder;

import aaaaatelas.Gerenciar;
import br.com.gsv.formularios.GerenciaTelaFuncionario;

public class GerenciarFuncionarioGrafic {
	private GerenciaTelaFuncionario formulario;
	private JPanel painelTitulo;
	
	public GerenciarFuncionarioGrafic(GerenciaTelaFuncionario formulario) {
		this.formulario = formulario;
		
		CriarTelaGeral();
		DadosFuncionario();
	}
	
	
	private void CriarTelaGeral(){
		this.formulario.setModal(true);
		this.formulario.setBounds(100, 100, 700, 480);
		this.formulario.getTela().setLayout(null);
		this.formulario.setUndecorated(true);
		this.formulario.getPanel().setBorder(new LineBorder(new Color(71,120,197)));
		this.formulario.getPanel().setBackground(Color.WHITE);
		this.formulario.getPanel().setBounds(0, 0, 700, 480);
		this.formulario.getTela().add(this.formulario.getPanel());
		
	}
		
		
	private void DadosFuncionario(){
		this.formulario.getScrollPane().setBackground(Color.WHITE);
		this.formulario.getScrollPane().setBorder(new LineBorder(new Color(71,120,197)));
		
		
		this.formulario.getTable().setGridColor(new java.awt.Color(255, 255, 255));
		this.formulario.getTable().setRowHeight(20);
		this.formulario.getTable().setSelectionBackground(new Color(92,155,255));
		this.formulario.getTable().setSelectionForeground(Color.WHITE);
		
		painelTitulo = new JPanel();
		painelTitulo.setBackground(new Color(20, 34, 56));
		
		JLabel LFechar = new JLabel("");
		LFechar.setIcon(new ImageIcon(Gerenciar.class.getResource("/imagens/icons8-não-22.png")));
		
		GroupLayout gl_painelTitulo = new GroupLayout(painelTitulo);
		gl_painelTitulo.setHorizontalGroup(
			gl_painelTitulo.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 698, Short.MAX_VALUE)
				.addGroup(gl_painelTitulo.createSequentialGroup()
				.addContainerGap(666, Short.MAX_VALUE)
				.addComponent(LFechar)
				.addContainerGap())
		);
		gl_painelTitulo.setVerticalGroup(
			gl_painelTitulo.createParallelGroup(Alignment.LEADING)
				.addGap(0, 24, Short.MAX_VALUE)
				.addGroup(gl_painelTitulo.createSequentialGroup()
				.addComponent(LFechar)
				.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		painelTitulo.setLayout(gl_painelTitulo);
		
		
		
		this.formulario.getDetalhes().setText("Detalhes");
		this.formulario.getDetalhes().setForeground(Color.WHITE);
		this.formulario.getDetalhes().setFont(new Font("Segoe UI", Font.PLAIN, 14));
		this.formulario.getDetalhes().setBackground(new Color(71, 120, 197));
		
		this.formulario.getCodigo().setText("Código");
		this.formulario.getCodigo().setForeground(Color.WHITE);
		this.formulario.getCodigo().setFont(new Font("Segoe UI", Font.PLAIN, 14));
		this.formulario.getCodigo().setBackground(new Color(71, 120, 197));
		
		this.formulario.getBuscar().setText("Buscar");
		this.formulario.getBuscar().setForeground(Color.WHITE);
		this.formulario.getBuscar().setFont(new Font("Segoe UI", Font.PLAIN, 14));
		this.formulario.getBuscar().setBackground(new Color(71, 120, 197));
		
		this.formulario.getModificar().setText("Modificar");
		this.formulario.getModificar().setForeground(Color.WHITE);
		this.formulario.getModificar().setFont(new Font("Segoe UI", Font.PLAIN, 14));
		this.formulario.getModificar().setBackground(new Color(71, 120, 197));
		
		this.formulario.getIncluir().setText("Incluir");
		this.formulario.getIncluir().setForeground(Color.WHITE);
		this.formulario.getIncluir().setFont(new Font("Segoe UI", Font.PLAIN, 14));
		this.formulario.getIncluir().setBackground(new Color(71, 120, 197));
		
		this.formulario.getExcluir().setText("Excluir");
		this.formulario.getExcluir().setForeground(Color.WHITE);
		this.formulario.getExcluir().setFont(new Font("Segoe UI", Font.PLAIN, 14));
		this.formulario.getExcluir().setBackground(new Color(71, 120, 197));
		
		this.formulario.getFim().setText("Fim");
		this.formulario.getFim().setForeground(Color.WHITE);
		this.formulario.getFim().setFont(new Font("Segoe UI", Font.PLAIN, 14));
		this.formulario.getFim().setBackground(new Color(71, 120, 197));
		
		GroupLayout gl_panel = new GroupLayout(this.formulario.getPanel());
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(painelTitulo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addGroup(gl_panel.createSequentialGroup()
				.addGap(10)
				.addComponent(this.formulario.getScrollPane(), GroupLayout.PREFERRED_SIZE, 511, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(this.formulario.getDetalhes(), GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
				.addComponent(this.formulario.getCodigo(), GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
				.addComponent(this.formulario.getBuscar(), GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
				.addComponent(this.formulario.getModificar(), GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
				.addComponent(this.formulario.getIncluir(), GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
				.addComponent(this.formulario.getExcluir(), GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
				.addComponent(this.formulario.getFim(), GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE))
				.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
				.addComponent(painelTitulo, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(this.formulario.getScrollPane(), GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
				.addComponent(this.formulario.getDetalhes(), GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
				.addGap(11)
				.addComponent(this.formulario.getCodigo(), GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
				.addGap(11)
				.addComponent(this.formulario.getBuscar(), GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
				.addGap(11)
				.addComponent(this.formulario.getModificar(), GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
				.addGap(11)
				.addComponent(this.formulario.getIncluir(), GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
				.addGap(11)
				.addComponent(this.formulario.getExcluir(), GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
				.addGap(11)
				.addComponent(this.formulario.getFim())))
				.addContainerGap())
		);
		this.formulario.getPanel().setLayout(gl_panel);
		
	}


	
	
}
