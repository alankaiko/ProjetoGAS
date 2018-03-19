package br.com.gsv.funcionario.grafico;

import java.awt.Color;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.LineBorder;

import br.com.gsv.convenio.formularios.CodigoConvenioDialog;
import br.com.gsv.funcionario.formularios.CodigoFuncionarioDialog;
import br.com.projeto.gsv.util.FieldListener;

public class CodigoFuncionarioGrafic {
	private CodigoFuncionarioDialog formulario;
	private FieldListener field = new FieldListener();
	
	
	public CodigoFuncionarioGrafic(CodigoFuncionarioDialog formulario) {
		this.formulario = formulario;
		CriarTelaGeralGrafic();
		CriarTelaGeral();
	}
	
	
	private void CriarTelaGeralGrafic(){
		this.formulario.setModal(true);
		this.formulario.setBounds(100, 100, 316, 171);
		this.formulario.setUndecorated(true);
		this.formulario.getPanel().setBorder(new LineBorder(new Color(71,120,197)));
		this.formulario.getPanel().setBackground(Color.WHITE);
	}
	
	
	
	private void CriarTelaGeral() {
		
		GroupLayout groupLayout = new GroupLayout(this.formulario.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(this.formulario.getPanel(), GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(this.formulario.getPanel(), GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
		);
		
		JLabel LCodigo = new JLabel("Buscar Código");
		LCodigo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 16));
		
		this.formulario.getTBuscar().setColumns(10);
		this.formulario.getTBuscar().addFocusListener(field);
		
		this.formulario.getOk().setText("Buscar");
		this.formulario.getOk().setBounds(215, 381, 84, 23);
		this.formulario.getOk().setBackground(new Color(71, 120, 197));
		this.formulario.getOk().setFont(new Font("Segoe UI", 0, 14));
		this.formulario.getOk().setForeground(new Color(255, 255, 255));
		
		this.formulario.getCancelar().setText("Voltar");
		this.formulario.getCancelar().setBounds(215, 381, 84, 23);
		this.formulario.getCancelar().setBackground(new Color(71, 120, 197));
		this.formulario.getCancelar().setFont(new Font("Segoe UI", 0, 14));
		this.formulario.getCancelar().setForeground(new Color(255, 255, 255));
		
		JPanel painelDrag = new JPanel();
		painelDrag.setBackground(new Color(0, 102, 204));
		
		
		
		GroupLayout gl_panel = new GroupLayout(this.formulario.getPanel());
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
				.addGap(73)
				.addComponent(this.formulario.getOk())
				.addGap(18)
				.addComponent(this.formulario.getCancelar()))
				.addGroup(gl_panel.createSequentialGroup()
				.addGap(26)
				.addComponent(LCodigo, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addComponent(this.formulario.getTBuscar(), GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)))
				.addContainerGap(50, Short.MAX_VALUE))
				.addComponent(painelDrag, GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
				.addComponent(painelDrag, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
				.addGap(26)
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
				.addComponent(this.formulario.getTBuscar(), GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
				.addComponent(LCodigo))
				.addGap(45)
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
				.addComponent(this.formulario.getOk())
				.addComponent(this.formulario.getCancelar()))
				.addContainerGap())
		);
		this.formulario.getPanel().setLayout(gl_panel);
		this.formulario.getContentPane().setLayout(groupLayout);

	}
}
