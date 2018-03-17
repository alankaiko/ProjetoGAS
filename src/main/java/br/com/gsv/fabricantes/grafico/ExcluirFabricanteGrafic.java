package br.com.gsv.fabricantes.grafico;

import java.awt.Color;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.LineBorder;

import br.com.gsv.fabricantes.formularios.ExcluirFabricanteDialog;

public class ExcluirFabricanteGrafic {
private ExcluirFabricanteDialog formulario;
	
	
	public ExcluirFabricanteGrafic(ExcluirFabricanteDialog formulario) {
		this.formulario = formulario;
		this.formulario.AdicionaComponentes();
		CriaTela();
		DefineComponentes();
		
	}
	
	
	public void CriaTela(){
		this.formulario.setModal(true);
		this.formulario.setBounds(100, 100, 376, 155);
		this.formulario.setUndecorated(true);
		this.formulario.getPanel().setBorder(new LineBorder(new Color(71, 120, 197)));
		this.formulario.getPanel().setBackground(Color.WHITE);
		
	}
	
	
	public void DefineComponentes(){
		GroupLayout groupLayout = new GroupLayout(this.formulario.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(this.formulario.getPanel(), GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(this.formulario.getPanel(), GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
		);
		
		
		this.formulario.getExcluir().setText("Excluir: "+ formulario.getFabricante().getDescricao() + "?");
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
		
		
		this.formulario.getSepara().setBackground(new Color(71, 120, 197));
		
		GroupLayout gl_panel = new GroupLayout(this.formulario.getPanel());
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
				.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
				.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
				.addGap(59)
				.addComponent(this.formulario.getSepara()))
				.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
				.addGap(87)
				.addComponent(this.formulario.getOk())
				.addGap(52)
				.addComponent(this.formulario.getCancelar()))
				.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
				.addGap(38)
				.addComponent(this.formulario.getExcluir())))
				.addContainerGap(56, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
				.addContainerGap(41, Short.MAX_VALUE)
				.addComponent(this.formulario.getExcluir())
				.addGap(18)
				.addComponent(this.formulario.getSepara(), GroupLayout.PREFERRED_SIZE, 8, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
				.addComponent(this.formulario.getCancelar())
				.addComponent(this.formulario.getOk()))
				.addGap(22))
		);
		
		this.formulario.getPanel().setLayout(gl_panel);
		this.formulario.getContentPane().setLayout(groupLayout);
		
			
	}
}
