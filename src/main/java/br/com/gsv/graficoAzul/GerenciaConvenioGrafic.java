package br.com.gsv.graficoAzul;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.LineBorder;

import aaaaatelas.telagerenciar;
import br.com.gsv.formularios.GerenciaTelaConvenio;
import br.com.gsv.util.FieldListener;

public class GerenciaConvenioGrafic {
	private GerenciaTelaConvenio formulario;
	private FieldListener field = new FieldListener();
	
	
	public GerenciaConvenioGrafic(GerenciaTelaConvenio formulario) {
		this.formulario = formulario;
		CriarTelaGeralGrafic();
		CriarTelaGeral();
	}
	
	
	private void CriarTelaGeralGrafic(){
		this.formulario.setBounds(100, 100, 700, 480);
		//////this.formulario.getTela().setLayout(null);
		this.formulario.setUndecorated(true);
		this.formulario.setModal(true);
		this.formulario.setResizable(false);
		//this.formulario.getTela().setBorder(new LineBorder(new Color(71,120,197)));
		this.formulario.getTela().setBackground(Color.WHITE);
		
		this.formulario.getScrollPane().setBackground(Color.WHITE);
		this.formulario.getScrollPane().setBorder(new LineBorder(new Color(71,120,197)));
		
		
		
		this.formulario.getTela().setLayout(null);
		this.formulario.getTela().add(this.formulario.getPanel(), BorderLayout.CENTER);
	}
	
	
	
	private void CriarTelaGeral() {
		JPanel painelTitulo = new JPanel();
		painelTitulo.setBackground(new Color(20,34,56));
		
		this.formulario.getDetalhes().setText("Detalhes");
		this.formulario.getDetalhes().setBounds(215, 381, 84, 23);
		this.formulario.getDetalhes().setBackground(new Color(71, 120, 197));
		this.formulario.getDetalhes().setFont(new Font("Segoe UI", 0, 14));
		this.formulario.getDetalhes().setForeground(new Color(255, 255, 255));
		
		this.formulario.getCodigo().setText("Código");
		this.formulario.getCodigo().setBounds(215, 381, 84, 23);
		this.formulario.getCodigo().setBackground(new Color(71, 120, 197));
		this.formulario.getCodigo().setFont(new Font("Segoe UI", 0, 14));
		this.formulario.getCodigo().setForeground(new Color(255, 255, 255));
		
		this.formulario.getBuscar().setText("Buscar");
		this.formulario.getBuscar().setBounds(215, 381, 84, 23);
		this.formulario.getBuscar().setBackground(new Color(71, 120, 197));
		this.formulario.getBuscar().setFont(new Font("Segoe UI", 0, 14));
		this.formulario.getBuscar().setForeground(new Color(255, 255, 255));
		
		this.formulario.getModificar().setText("Modificar");
		this.formulario.getModificar().setBounds(215, 381, 84, 23);
		this.formulario.getModificar().setBackground(new Color(71, 120, 197));
		this.formulario.getModificar().setFont(new Font("Segoe UI", 0, 14));
		this.formulario.getModificar().setForeground(new Color(255, 255, 255));
		
		this.formulario.getIncluir().setText("Incluir");
		this.formulario.getIncluir().setBounds(215, 381, 84, 23);
		this.formulario.getIncluir().setBackground(new Color(71, 120, 197));
		this.formulario.getIncluir().setFont(new Font("Segoe UI", 0, 14));
		this.formulario.getIncluir().setForeground(new Color(255, 255, 255));
		
		this.formulario.getExcluir().setText("Excluir");
		this.formulario.getExcluir().setBounds(215, 381, 84, 23);
		this.formulario.getExcluir().setBackground(new Color(71, 120, 197));
		this.formulario.getExcluir().setFont(new Font("Segoe UI", 0, 14));
		this.formulario.getExcluir().setForeground(new Color(255, 255, 255));
		
		
		this.formulario.getFim().setText("Fim");
		this.formulario.getFim().setBounds(215, 381, 84, 23);
		this.formulario.getFim().setBackground(new Color(71, 120, 197));
		this.formulario.getFim().setFont(new Font("Segoe UI", 0, 14));
		this.formulario.getFim().setForeground(new Color(255, 255, 255));
		
		
		
		GroupLayout gl_panel = new GroupLayout(this.formulario.getPanel());
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(painelTitulo, GroupLayout.PREFERRED_SIZE, 698, GroupLayout.PREFERRED_SIZE)
				.addGroup(gl_panel.createSequentialGroup()
				.addContainerGap()
				.addComponent(this.formulario.getScrollPane(), GroupLayout.PREFERRED_SIZE, 511, GroupLayout.PREFERRED_SIZE)
				.addGap(18)
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(this.formulario.getFim(), GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
				.addComponent(this.formulario.getExcluir(), GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
				.addComponent(this.formulario.getIncluir(), GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
				.addComponent(this.formulario.getModificar(), GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
				.addComponent(this.formulario.getBuscar(), GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
				.addComponent(this.formulario.getCodigo(), GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
				.addComponent(this.formulario.getDetalhes(), GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
				.addComponent(painelTitulo, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
				.addGap(18)
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
				.addComponent(this.formulario.getDetalhes())
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addComponent(this.formulario.getCodigo())
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addComponent(this.formulario.getBuscar())
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addComponent(this.formulario.getModificar())
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addComponent(this.formulario.getIncluir())
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addComponent(this.formulario.getExcluir())
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addComponent(this.formulario.getFim()))
				.addComponent(this.formulario.getScrollPane(), GroupLayout.PREFERRED_SIZE, 425, GroupLayout.PREFERRED_SIZE))
				.addContainerGap())
		);
		
		JLabel LFechar = new JLabel("");
		LFechar.setIcon(new ImageIcon(telagerenciar.class.getResource("/imagens/icons8-não-22.png")));
		GroupLayout gl_painelTitulo = new GroupLayout(painelTitulo);
		gl_painelTitulo.setHorizontalGroup(
			gl_painelTitulo.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_painelTitulo.createSequentialGroup()
				.addContainerGap(642, Short.MAX_VALUE)
				.addComponent(LFechar)
				.addContainerGap())
		);
		gl_painelTitulo.setVerticalGroup(
			gl_painelTitulo.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_painelTitulo.createSequentialGroup()
				.addComponent(LFechar)
				.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		painelTitulo.setLayout(gl_painelTitulo);
		this.formulario.getPanel().setLayout(gl_panel);
		
	}
}
