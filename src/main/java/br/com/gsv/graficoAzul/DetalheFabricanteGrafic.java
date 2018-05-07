package br.com.gsv.graficoAzul;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.LineBorder;

import br.com.gsv.formularios.DetalhesFabricanteDialog;

public class DetalheFabricanteGrafic {
private DetalhesFabricanteDialog formulario;
	
	public DetalheFabricanteGrafic(DetalhesFabricanteDialog formulario) {
		this.formulario = formulario;
		CriarTelaGeralGrafic();
		DadosConvenio();
		ArrastandoPainel();
	}
	
	
	public void CriarTelaGeralGrafic() {
		this.formulario.setModal(true);
		this.formulario.setBounds(100, 100, 400, 215);
		this.formulario.getTela().setLayout(null);
		this.formulario.setUndecorated(true);
		this.formulario.getPanel().setBorder(new LineBorder(new Color(71,120,197)));
		this.formulario.getPanel().setBackground(Color.WHITE);
		this.formulario.getPanel().setBounds(0, 0, 400, 215);
		this.formulario.getTela().add(this.formulario.getPanel());
		
	}
	

	public void DadosConvenio() {
		this.formulario.getPainelDrag().setBackground(new Color(20, 34, 56));
		
		JLabel LFechar = new JLabel();
		LFechar.setIcon(new ImageIcon(DetalheFabricanteGrafic.class.getResource("/imagens/icons8-não-22.png")));
		LFechar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				formulario.dispose();
			}
		});
		
		JLabel Titulo = new JLabel("Detalhes de Fabricante");
		Titulo.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 13));
		Titulo.setForeground(Color.WHITE);
		GroupLayout gl_painelTitulo = new GroupLayout(this.formulario.getPainelDrag());
		gl_painelTitulo.setHorizontalGroup(
			gl_painelTitulo.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_painelTitulo.createSequentialGroup()
				.addContainerGap()
				.addComponent(Titulo, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED, 214, Short.MAX_VALUE)
				.addComponent(LFechar, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
		);
		gl_painelTitulo.setVerticalGroup(
			gl_painelTitulo.createParallelGroup(Alignment.LEADING)
				.addComponent(LFechar, GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
				.addComponent(Titulo, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
		);
		this.formulario.getPainelDrag().setLayout(gl_painelTitulo);
		
		this.formulario.getLId().setText("Código");
		this.formulario.getLId().setFont(new Font("Segoe UI Symbol", Font.BOLD, 14));
		
		this.formulario.getLFabricante().setText("Fabricante");
		this.formulario.getLFabricante().setFont(new Font("Segoe UI Symbol", Font.BOLD, 14));

		this.formulario.getTId().setText("New label");
		this.formulario.getTId().setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		
		this.formulario.getTFabricante().setText("New label");
		this.formulario.getTFabricante().setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		
		
		this.formulario.getCancelar().setText("Cancelar");
		this.formulario.getCancelar().setForeground(Color.WHITE);
		this.formulario.getCancelar().setFont(new Font("Segoe UI", Font.PLAIN, 14));
		this.formulario.getCancelar().setBackground(new Color(71, 120, 197));
		
		GroupLayout gl_panel = new GroupLayout(this.formulario.getPanel());
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(this.formulario.getPainelDrag(), GroupLayout.PREFERRED_SIZE, 401, GroupLayout.PREFERRED_SIZE)
				.addGroup(gl_panel.createSequentialGroup()
				.addGap(146)
				.addComponent(this.formulario.getCancelar(), GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel.createSequentialGroup()
				.addGap(18)
				.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
				.addComponent(this.formulario.getSepara(), Alignment.LEADING)
				.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(this.formulario.getLId(), GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
				.addComponent(this.formulario.getLFabricante(), GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
				.addComponent(this.formulario.getTId(), GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(this.formulario.getTFabricante(), GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE))))))
				.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
				.addComponent(this.formulario.getPainelDrag(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addGap(43)
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
				.addComponent(this.formulario.getLId())
				.addComponent(this.formulario.getTId()))
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
				.addComponent(this.formulario.getLFabricante())
				.addComponent(this.formulario.getTFabricante()))
				.addGap(18)
				.addComponent(this.formulario.getSepara(), GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
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
