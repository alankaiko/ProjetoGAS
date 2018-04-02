package br.com.gsv.convenio.grafico;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import br.com.gsv.convenio.formularios.DetalhesConvenioDialog;

public class DetalheConvenioGrafic {
	private DetalhesConvenioDialog formulario;
	
	public DetalheConvenioGrafic(DetalhesConvenioDialog formulario) {
		this.formulario = formulario;
		CriarTelaGeralGrafic();
		DadosConvenio();
	}
	
	
	public void CriarTelaGeralGrafic() {
		this.formulario.setBounds(100, 100, 401, 215);
		this.formulario.setUndecorated(true);
		this.formulario.getPanel().setBorder(new LineBorder(new Color(71, 120, 197)));
		this.formulario.getPanel().setBackground(Color.WHITE);
				
		this.formulario.getTela().setLayout(null);		
		this.formulario.getTela().add(this.formulario.getPanel(), BorderLayout.CENTER);
		
		this.formulario.setModal(true);
		this.formulario.setResizable(false);
		
	}
	

	public void DadosConvenio() {
		GroupLayout groupLayout = new GroupLayout(this.formulario.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(this.formulario.getPanel(), GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(this.formulario.getPanel(), GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
		);
		
		this.formulario.getLId().setText("Código: ");
		this.formulario.getLId().setFont(new Font("Segoe UI Symbol", Font.BOLD, 14));
		
		this.formulario.getLConvenio().setText("Convênio: ");
		this.formulario.getLConvenio().setFont(new Font("Segoe UI Symbol", Font.BOLD, 14));
		
		this.formulario.getTId().setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		
		this.formulario.getTConvenio().setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		
		this.formulario.getCancelar().setText("Voltar");
		this.formulario.getCancelar().setBounds(215, 381, 84, 23);
		this.formulario.getCancelar().setBackground(new Color(71, 120, 197));
		this.formulario.getCancelar().setFont(new Font("Segoe UI", 0, 14));
		this.formulario.getCancelar().setForeground(new Color(255, 255, 255));
		
		this.formulario.getSepara().setBackground(new Color(71, 120, 197));
		
		GroupLayout gl_panel = new GroupLayout(this.formulario.getPanel());
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
				.addContainerGap(103, Short.MAX_VALUE)
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(this.formulario.getLId())
				.addComponent(this.formulario.getLConvenio(), GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
				.addGap(46)
				.addComponent(this.formulario.getTId(), GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
				.addGap(36))
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
				.addPreferredGap(ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
				.addComponent(this.formulario.getTConvenio(), GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
				.addGap(14))))
				.addGroup(gl_panel.createSequentialGroup()
				.addGap(155)
				.addComponent(this.formulario.getCancelar())
				.addPreferredGap(ComponentPlacement.RELATED, 159, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
				.addGap(28)
				.addComponent(this.formulario.getSepara(), GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)))
				.addGap(26))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
				.addGap(61)
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
				.addComponent(this.formulario.getTId())
				.addComponent(this.formulario.getLId()))
				.addGap(29)
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
				.addComponent(this.formulario.getTConvenio())
				.addComponent(this.formulario.getLConvenio()))
				.addGap(18)
				.addComponent(this.formulario.getSepara(), GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
				.addComponent(this.formulario.getCancelar())
				.addGap(23))
		);
		this.formulario.getPanel().setLayout(gl_panel);
		this.formulario.getContentPane().setLayout(groupLayout);
		
		
	}

}
