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
import javax.swing.JSeparator;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.LineBorder;

import br.com.gsv.formularios.DetalhesConvenioDialog;

public class DetalheConvenioGrafic {
	private DetalhesConvenioDialog formulario;
	
	public DetalheConvenioGrafic(DetalhesConvenioDialog formulario) {
		this.formulario = formulario;
		CriarTelaGeralGrafic();
		DadosConvenio();
		ArrastandoPainel();
	}
	
	
	public void CriarTelaGeralGrafic() {
		this.formulario.setBounds(100, 100, 400, 215);
		this.formulario.getTela().setLayout(null);
		this.formulario.setUndecorated(true);
		this.formulario.getPanel().setBorder(new LineBorder(new Color(71,120,197)));
		this.formulario.getPanel().setBackground(Color.WHITE);
		this.formulario.getPanel().setBounds(0, 0, 400, 215);
		this.formulario.getTela().add(this.formulario.getPanel());
		this.formulario.setModal(true);
		
	}
	

	public void DadosConvenio() {
		this.formulario.getPainelDrag().setBackground(new Color(20, 34, 56));
		
		JLabel LFechar = new JLabel();
		LFechar.setIcon(new ImageIcon(DetalheConvenioGrafic.class.getResource("/imagens/icons8-não-22.png")));
		LFechar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				formulario.dispose();
			}
		});
		
		JLabel Titulo = new JLabel("Detalhes Convênio");
		Titulo.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		Titulo.setForeground(Color.WHITE);
		GroupLayout gl_painelTitulo = new GroupLayout(this.formulario.getPainelDrag());
		gl_painelTitulo.setHorizontalGroup(
			gl_painelTitulo.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_painelTitulo.createSequentialGroup()
				.addContainerGap()
				.addComponent(Titulo, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED, 222, Short.MAX_VALUE)
				.addComponent(LFechar)
				.addContainerGap())
		);
		gl_painelTitulo.setVerticalGroup(
			gl_painelTitulo.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_painelTitulo.createSequentialGroup()
				.addGroup(gl_painelTitulo.createParallelGroup(Alignment.TRAILING, false)
				.addComponent(Titulo, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(LFechar, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addContainerGap(11, Short.MAX_VALUE))
		);
		this.formulario.getPainelDrag().setLayout(gl_painelTitulo);
		
		this.formulario.getCancelar().setText("Voltar");
		this.formulario.getCancelar().setForeground(Color.WHITE);
		this.formulario.getCancelar().setFont(new Font("Segoe UI", Font.PLAIN, 14));
		this.formulario.getCancelar().setBackground(new Color(71, 120, 197));
		
		JSeparator separator = new JSeparator();
		
		this.formulario.getLId().setText("Código");
		this.formulario.getLId().setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		
		this.formulario.getTId().setText("New label");
		this.formulario.getTId().setFont(new Font("Segoe UI", Font.PLAIN, 13));
		
		this.formulario.getLConvenio().setText("Convênio");
		this.formulario.getLConvenio().setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		
		this.formulario.getTConvenio().setText("New label");
		this.formulario.getTConvenio().setFont(new Font("Segoe UI", Font.PLAIN, 13));
		
		
		GroupLayout gl_panel = new GroupLayout(this.formulario.getPanel());
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(this.formulario.getPainelDrag(), GroupLayout.PREFERRED_SIZE, 398, GroupLayout.PREFERRED_SIZE)
				.addGroup(gl_panel.createSequentialGroup()
				.addGap(138)
				.addComponent(this.formulario.getCancelar(), GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel.createSequentialGroup()
				.addContainerGap()
				.addComponent(separator, GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
				.addContainerGap())
				.addGroup(gl_panel.createSequentialGroup()
				.addGap(22)
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
				.addComponent(this.formulario.getLConvenio(), GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
				.addGap(18)
				.addComponent(this.formulario.getTConvenio(), GroupLayout.PREFERRED_SIZE, 158, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel.createSequentialGroup()
				.addComponent(this.formulario.getLId(), GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
				.addGap(18)
				.addComponent(this.formulario.getTId(), GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)))
				.addGap(137))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
				.addComponent(this.formulario.getPainelDrag(), GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
				.addGap(39)
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
				.addComponent(this.formulario.getLId())
				.addComponent(this.formulario.getTId()))
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
				.addComponent(this.formulario.getLConvenio(), GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
				.addComponent(this.formulario.getTConvenio(), GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
				.addComponent(separator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addGap(26)
				.addComponent(this.formulario.getCancelar(), GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
				.addContainerGap())
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
