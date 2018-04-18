package br.com.gsv.graficoAzul;

import java.awt.Color;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.LineBorder;

import br.com.gsv.formularios.IncluirConvenioForm;
import br.com.gsv.util.FieldListener;

public class IncluirConvenioGrafic {
	private IncluirConvenioForm formulario;
	private FieldListener field = new FieldListener();
	
	
	public IncluirConvenioGrafic(IncluirConvenioForm formulario) {
		this.formulario = formulario;
		CriarTelaGeralGrafic();
		CriarTelaGeral();
	}
	
	
	private void CriarTelaGeralGrafic(){
		this.formulario.setModal(true);
		this.formulario.setResizable(false);
		this.formulario.setBounds(100, 100, 401, 215);
		this.formulario.setUndecorated(true);	
		this.formulario.getPanel().setBorder(new LineBorder(new Color(71, 120, 197)));
		this.formulario.getPanel().setBackground(Color.WHITE);
	}
	
	
	
	private void CriarTelaGeral() {
		
		GroupLayout groupLayout = new GroupLayout(this.formulario.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(this.formulario.getPanel(), GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(this.formulario.getPanel(), GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
		);
		
		this.formulario.getLId().setText("Código: ");
		this.formulario.getLId().setFont(new Font("Segoe UI", Font.PLAIN, 13));
			this.formulario.getTId().setBorder(new LineBorder(new Color(71, 120, 197)));
			this.formulario.getTId().setColumns(10);
			this.formulario.getTId().setEditable(false);
		
		
		this.formulario.getLConvenio().setText("Convênio: ");
		this.formulario.getLConvenio().setFont(new Font("Segoe UI", Font.PLAIN, 13));
			this.formulario.getTConvenio().setColumns(10);
			this.formulario.getTConvenio().setBorder(new LineBorder(new Color(71, 120, 197)));
			this.formulario.getTConvenio().addFocusListener(field);
			this.formulario.getTConvenio().setToolTipText("Ex: IPASGO / UNIMED");
		
		this.formulario.getBTGravar().setText("Cadastrar");
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
				.addGroup(gl_panel.createSequentialGroup()
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
				.addGap(37)
				.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
				.addComponent(this.formulario.getLConvenio())
				.addComponent(this.formulario.getLId()))
				.addGap(18)
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(this.formulario.getTId(), GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
				.addComponent(this.formulario.getTConvenio(), GroupLayout.PREFERRED_SIZE, 246, GroupLayout.PREFERRED_SIZE)))
				.addGroup(gl_panel.createSequentialGroup()
				.addGap(87)
				.addComponent(this.formulario.getBTGravar())
				.addGap(26)
				.addComponent(this.formulario.getBTCancelar())))
				.addContainerGap(33, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
				.addContainerGap(20, Short.MAX_VALUE)
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
				.addComponent(this.formulario.getTId(), GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
				.addComponent(this.formulario.getLId()))
				.addGap(30)
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
				.addComponent(this.formulario.getLConvenio())
				.addComponent(this.formulario.getTConvenio(), GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
				.addComponent(this.formulario.getBTGravar())
				.addComponent(this.formulario.getBTCancelar()))
				.addContainerGap())
		);
		
		
		this.formulario.getPanel().setLayout(gl_panel);
		this.formulario.getContentPane().setLayout(groupLayout);

	}
}
