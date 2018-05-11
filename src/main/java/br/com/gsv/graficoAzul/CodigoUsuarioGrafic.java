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

import br.com.gsv.formularios.CodigoUsuarioDialog;
import br.com.gsv.util.FieldListener;

public class CodigoUsuarioGrafic {
	private CodigoUsuarioDialog formulario;
	private FieldListener field = new FieldListener();
	
	
	public CodigoUsuarioGrafic(CodigoUsuarioDialog formulario) {
		this.formulario = formulario;
		CriarTelaGeralGrafic();
		CriarTelaGeral();
		ArrastandoPainel();
	}
	
	
	private void CriarTelaGeralGrafic(){
		this.formulario.setModal(true);
		this.formulario.setBounds(100, 100, 316, 171);
		this.formulario.getTela().setLayout(null);
		this.formulario.setUndecorated(true);
		this.formulario.getPanel().setBorder(new LineBorder(new Color(71,120,197)));
		this.formulario.getPanel().setBackground(Color.WHITE);
		this.formulario.getPanel().setBounds(0, 0, 316, 171);
		this.formulario.getTela().add(this.formulario.getPanel());
	}
	
	
	
	private void CriarTelaGeral() {
this.formulario.getPainelDrag().setBackground(new Color(20, 34, 56));
		
		JLabel LFechar = new JLabel();
		LFechar.setIcon(new ImageIcon(CodigoUsuarioGrafic.class.getResource("/imagens/icons8-não-22.png")));
		LFechar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				formulario.dispose();
			}
		});
		
		GroupLayout gl_painelTitulo = new GroupLayout(this.formulario.getPainelDrag());
		gl_painelTitulo.setHorizontalGroup(
			gl_painelTitulo.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_painelTitulo.createSequentialGroup()
				.addContainerGap(285, Short.MAX_VALUE)
				.addComponent(LFechar, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
		);
		gl_painelTitulo.setVerticalGroup(
			gl_painelTitulo.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_painelTitulo.createSequentialGroup()
				.addComponent(LFechar, GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
				.addContainerGap())
		);
		this.formulario.getPainelDrag().setLayout(gl_painelTitulo);;
		
		this.formulario.getCancelar().setText("Voltar");
		this.formulario.getCancelar().setForeground(Color.WHITE);
		this.formulario.getCancelar().setFont(new Font("Segoe UI", Font.PLAIN, 14));
		this.formulario.getCancelar().setBackground(new Color(71, 120, 197));
		
		this.formulario.getOk().setText("Buscar");
		this.formulario.getOk().setForeground(Color.WHITE);
		this.formulario.getOk().setFont(new Font("Segoe UI", Font.PLAIN, 14));
		this.formulario.getOk().setBackground(new Color(71, 120, 197));
		
		JLabel Lbuscar = new JLabel("Buscar Código");
		Lbuscar.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		
		this.formulario.getTBuscar().addFocusListener(field);
		this.formulario.getTBuscar().setColumns(10);
		
		GroupLayout gl_panel = new GroupLayout(this.formulario.getPanel());
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(this.formulario.getPainelDrag(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addGroup(gl_panel.createSequentialGroup()
				.addGap(53)
				.addComponent(this.formulario.getOk(), GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
				.addGap(18)
				.addComponent(this.formulario.getCancelar(), GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel.createSequentialGroup()
				.addGap(42)
				.addComponent(Lbuscar, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(this.formulario.getTBuscar(), GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
				.addComponent(this.formulario.getPainelDrag(), GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
				.addGap(55)
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(Lbuscar)
				.addComponent(this.formulario.getTBuscar(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(44)
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
				.addComponent(this.formulario.getCancelar(), GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
				.addComponent(this.formulario.getOk(), GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)))
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
