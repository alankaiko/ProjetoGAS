package br.com.gsv.graficoAzul;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.LineBorder;

import aaaaatelas.Gerenciar;
import br.com.gsv.formularios.DetalhesUsuarioDialog;

public class DetalhesUsuarioGrafic {
	private DetalhesUsuarioDialog formulario;
	
	public DetalhesUsuarioGrafic(DetalhesUsuarioDialog formulario) {
		this.formulario = formulario;
		ArrastandoPainel();
	}
	
	private void CriaTela(){
		this.formulario.setBounds(100, 100, 480, 350);
		this.formulario.getTela().setLayout(null);
		this.formulario.setUndecorated(true);
		this.formulario.getPanel().setBorder(new LineBorder(new Color(71,120,197)));
		this.formulario.getPanel().setBackground(Color.WHITE);
		this.formulario.getPanel().setBounds(0, 0, 480, 350);
		this.formulario.getTela().add(this.formulario.getPanel());
	}
	
	private void OrganizaComponentes(){
		this.formulario.getPainelDrag().setBackground(new Color(20, 34, 56));
		
		JLabel LFechar = new JLabel();
		LFechar.setIcon(new ImageIcon(Gerenciar.class.getResource("/imagens/icons8-não-22.png")));
		
		GroupLayout gl_painelTitulo = new GroupLayout(this.formulario.getPainelDrag());
		gl_painelTitulo.setHorizontalGroup(
			gl_painelTitulo.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_painelTitulo.createSequentialGroup()
				.addContainerGap(482, Short.MAX_VALUE)
				.addComponent(LFechar, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
		);
		gl_painelTitulo.setVerticalGroup(
			gl_painelTitulo.createParallelGroup(Alignment.LEADING)
				.addComponent(LFechar, GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
		);
		this.formulario.getPainelDrag().setLayout(gl_painelTitulo);
		
		this.formulario.getLAdicionar().setText("Detalhes Usuário");
		this.formulario.getLAdicionar().setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		
		this.formulario.getLFuncionario().setText("Funcionário");
		this.formulario.getLFuncionario().setFont(new Font("Segoe UI", Font.PLAIN, 12));
		
		this.formulario.getTFuncionario().setBorder(new LineBorder(new Color(71, 120, 197)));;
		
		this.formulario.getLCpf().setText("CPF");
		this.formulario.getLCpf().setFont(new Font("Segoe UI", Font.PLAIN, 12));
		
		this.formulario.getLRg().setText("RG");
		this.formulario.getLRg().setFont(new Font("Segoe UI", Font.PLAIN, 12));
		
		this.formulario.getTCpf().setBorder(new LineBorder(new Color(71, 120, 197)));
		
		this.formulario.getTRg().setBorder(new LineBorder(new Color(71, 120, 197)));
		
		this.formulario.getLLogin().setText("Login");
		this.formulario.getLLogin().setFont(new Font("Segoe UI", Font.PLAIN, 12));
		
		this.formulario.getTLogin().setBorder(new LineBorder(new Color(71, 120, 197)));
		
		this.formulario.getBCancelar().setText("Cancelar");
		this.formulario.getBCancelar().setForeground(Color.WHITE);
		this.formulario.getBCancelar().setFont(new Font("Segoe UI", Font.PLAIN, 14));
		this.formulario.getBCancelar().setBackground(new Color(71, 120, 197));
		
		
		GroupLayout gl_panel = new GroupLayout(this.formulario.getPanel());
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(this.formulario.getPainelDrag(), GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
				.addContainerGap()
				.addComponent(this.formulario.getLAdicionar(), GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(328, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
				.addContainerGap()
				.addComponent(this.formulario.getLFuncionario(), GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(393, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
				.addContainerGap()
				.addComponent(this.formulario.getTFuncionario(), GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
				.addContainerGap())
				.addGroup(gl_panel.createSequentialGroup()
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
				.addContainerGap()
				.addComponent(this.formulario.getLCpf(), GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel.createSequentialGroup()
				.addContainerGap()
				.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
				.addComponent(this.formulario.getTLogin(), Alignment.LEADING)
				.addComponent(this.formulario.getTCpf(), Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE))))
				.addPreferredGap(ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(this.formulario.getLRg(), GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
				.addComponent(this.formulario.getTRg(), GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE))
				.addContainerGap())
				.addGroup(gl_panel.createSequentialGroup()
				.addContainerGap()
				.addComponent(this.formulario.getLLogin(), GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(405, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
				.addGap(184)
				.addComponent(this.formulario.getBCancelar(), GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(197, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
				.addComponent(this.formulario.getPainelDrag(), GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(this.formulario.getLAdicionar())
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addComponent(this.formulario.getLFuncionario())
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(this.formulario.getTFuncionario(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
				.addComponent(this.formulario.getLCpf())
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(this.formulario.getTCpf(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addGap(74)
				.addComponent(this.formulario.getLLogin())
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(this.formulario.getTLogin(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addGap(36)
				.addComponent(this.formulario.getBCancelar(), GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel.createSequentialGroup()
				.addComponent(this.formulario.getLRg())
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(this.formulario.getTRg(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
				.addGap(124))
		);
		this.formulario.getPanel().setLayout(gl_panel);
		
		
	}
	
	
	
	private void ArrastandoPainel(){
		
		this.formulario.getPainelDrag().addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent evt) {
                arrastaPainel(evt);
            }
        });
		
		this.formulario.getPainelDrag().addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                arrastaPressionado(evt);
            }
        });
	}
	
	private void arrastaPressionado(MouseEvent evt) {
		this.formulario.setXx(evt.getX());
		this.formulario.setXy(evt.getY());
        //this.formulario.xx = evt.getX();
        //this.formulario.xy = evt.getY();
    }

    private void arrastaPainel(MouseEvent evt) {
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.formulario.setLocation(x-this.formulario.getXx(),y-this.formulario.getXy());
    }
}
