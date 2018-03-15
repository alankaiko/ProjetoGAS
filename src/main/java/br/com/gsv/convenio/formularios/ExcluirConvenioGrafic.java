package br.com.gsv.convenio.formularios;

import java.awt.Color;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.LineBorder;

public class ExcluirConvenioGrafic {
	ExcluirConvenioDialog formulario;
	
	public ExcluirConvenioGrafic(ExcluirConvenioDialog formulario) {
		this.formulario = formulario;
		CriarTela();
		DefineComponentes();
		//this.formulario.AdicionaComponentes();
	}
	
	private void CriarTela(){
		this.formulario.setBounds(100, 100, 376, 155);
		this.formulario.setUndecorated(true);
		this.formulario.getPanel().setBorder(new LineBorder(new Color(71, 120, 197)));
		this.formulario.getPanel().setBackground(Color.WHITE);
	}
	
	private void DefineComponentes(){
		GroupLayout groupLayout = new GroupLayout(this.formulario.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(this.formulario.getPanel(), GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(this.formulario.getPanel(), GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
		);
		
		
		this.formulario.getExcluir().setText("Excluir: Jacaranda de Souza Gimenes");
		this.formulario.getExcluir().setFont(new Font("Segoe UI Symbol", Font.PLAIN, 17));
		
		
		this.formulario.getOk().setText("Excluir");
		this.formulario.getOk().setBounds(215, 381, 84, 23);
		this.formulario.getOk().setBackground(new Color(71, 120, 197));
		this.formulario.getOk().setFont(new Font("Segoe UI", 0, 14));
		this.formulario.getOk().setForeground(new Color(255, 255, 255));
		
		this.formulario.getCancelar().setText("Cancelar");
		this.formulario.getCancelar().setBounds(215, 381, 84, 23);
		this.formulario.getCancelar().setBackground(new Color(71, 120, 197));
		this.formulario.getCancelar().setFont(new Font("Segoe UI", 0, 14));
		this.formulario.getCancelar().setForeground(new Color(255, 255, 255));
		
		GroupLayout gl_panel = new GroupLayout(this.formulario.getPanel());
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
				.addGap(87)
				.addComponent(this.formulario.getOk())
				.addGap(52)
				.addComponent(this.formulario.getCancelar()))
				.addGroup(gl_panel.createSequentialGroup()
				.addGap(38)
				.addComponent(this.formulario.getExcluir())))
				.addContainerGap(56, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
				.addContainerGap(41, Short.MAX_VALUE)
				.addComponent(this.formulario.getExcluir())
				.addGap(37)
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
				.addComponent(this.formulario.getCancelar())
				.addComponent(this.formulario.getOk()))
				.addGap(22))
		);
		this.formulario.getPanel().setLayout(gl_panel);
		this.formulario.getContentPane().setLayout(groupLayout);
		
	}
	
	
}
