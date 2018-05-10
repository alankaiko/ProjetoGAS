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

import aaaaatelas.excluindografico;
import br.com.gsv.formularios.ExcluirConvenioDialog;

public class ExcluirConvenioGrafic {
	private ExcluirConvenioDialog formulario;
	
	
	public ExcluirConvenioGrafic(ExcluirConvenioDialog formulario) {
		this.formulario = formulario;
		this.formulario.AdicionaComponentes();
		CriaTela();
		DefineComponentes();
		ArrastandoPainel();
	}
	
	
	public void CriaTela(){
		this.formulario.setModal(true);
		this.formulario.setBounds(100, 100, 376, 155);
		this.formulario.getTela().setLayout(null);
		this.formulario.setUndecorated(true);
		this.formulario.getPanel().setBorder(new LineBorder(new Color(71,120,197)));
		this.formulario.getPanel().setBackground(Color.WHITE);
		this.formulario.getPanel().setBounds(0, 0, 376, 155);
		this.formulario.getTela().add(this.formulario.getPanel());
		
	}
	
	
	public void DefineComponentes(){
		this.formulario.getPainelDrag().setBackground(new Color(20, 34, 56));
		
		JLabel LFechar = new JLabel();
		LFechar.setIcon(new ImageIcon(excluindografico.class.getResource("/imagens/icons8-não-22.png")));
		LFechar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				formulario.dispose();
			}
		});
		
		JLabel Titulo = new JLabel("Excluir");
		Titulo.setForeground(Color.WHITE);
		Titulo.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		
		
		GroupLayout gl_painelTitulo = new GroupLayout(this.formulario.getPainelDrag());
		gl_painelTitulo.setHorizontalGroup(
			gl_painelTitulo.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_painelTitulo.createSequentialGroup()
				.addContainerGap()
				.addComponent(Titulo, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED, 227, Short.MAX_VALUE)
				.addComponent(LFechar, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
		);
		gl_painelTitulo.setVerticalGroup(
			gl_painelTitulo.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_painelTitulo.createSequentialGroup()
				.addGroup(gl_painelTitulo.createParallelGroup(Alignment.TRAILING)
				.addComponent(Titulo, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
				.addComponent(LFechar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addContainerGap())
		);
		this.formulario.getPainelDrag().setLayout(gl_painelTitulo);;
		
		this.formulario.getCancelar().setText("Cancelar");
		this.formulario.getCancelar().setForeground(Color.WHITE);
		this.formulario.getCancelar().setFont(new Font("Segoe UI", Font.PLAIN, 14));
		this.formulario.getCancelar().setBackground(new Color(71, 120, 197));
		
		this.formulario.getOk().setText("Excluir");
		this.formulario.getOk().setForeground(Color.WHITE);
		this.formulario.getOk().setFont(new Font("Segoe UI", Font.PLAIN, 14));
		this.formulario.getOk().setBackground(new Color(71, 120, 197));
		
		this.formulario.getExcluir().setText("Excluir: "+ formulario.getConvenio().getNome() + "?");
		this.formulario.getExcluir().setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		
		JSeparator separator = new JSeparator();
		
		GroupLayout gl_panel = new GroupLayout(this.formulario.getPanel());
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(this.formulario.getPainelDrag(), GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
				.addGap(80)
				.addComponent(this.formulario.getOk(), GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addComponent(this.formulario.getCancelar(), GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(90, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
				.addContainerGap()
				.addComponent(separator, GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
				.addContainerGap())
				.addGroup(gl_panel.createSequentialGroup()
				.addGap(38)
				.addComponent(this.formulario.getExcluir(), GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
				.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
				.addComponent(this.formulario.getPainelDrag(), GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
				.addGap(37)
				.addComponent(this.formulario.getExcluir())
				.addGap(18)
				.addComponent(separator, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
				.addGap(18)
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
				.addComponent(this.formulario.getOk(), GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
				.addComponent(this.formulario.getCancelar(), GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
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
