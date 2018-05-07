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

import br.com.gsv.formularios.BuscarPacienteDialog;
import br.com.gsv.util.FieldListener;

public class BuscarPacienteGrafic {
	private BuscarPacienteDialog formulario;
	private FieldListener field = new FieldListener();
	
	
	public BuscarPacienteGrafic(BuscarPacienteDialog formulario) {
		this.formulario = formulario;
		CriarTelaGeralGrafic();
		CriarTelaGeral();
		ArrastandoPainel();
	}
	
	
	private void CriarTelaGeralGrafic(){
		this.formulario.setModal(true);
		this.formulario.setBounds(100, 100, 620, 400);
		this.formulario.getTela().setLayout(null);
		this.formulario.setUndecorated(true);
		this.formulario.getPanel().setBorder(new LineBorder(new Color(71,120,197)));
		this.formulario.getPanel().setBackground(Color.WHITE);
		this.formulario.getPanel().setBounds(0, 0, 620, 400);
		this.formulario.getTela().add(this.formulario.getPanel());
	}
	
	
	
	private void CriarTelaGeral() {
		this.formulario.getScrollPane().setBackground(Color.WHITE);
		this.formulario.getScrollPane().setBorder(new LineBorder(new Color(71,120,197)));
		
		this.formulario.getPainelDrag().setBackground(new Color(20, 34, 56));
		
		JLabel LFechar = new JLabel("");
		LFechar.setIcon(new ImageIcon(BuscarPacienteGrafic.class.getResource("/imagens/icons8-não-22.png")));
		LFechar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				formulario.dispose();
			}
		});
		
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
		
		this.formulario.getTextoBuscar().setColumns(10);
		this.formulario.getTextoBuscar().setBorder(new LineBorder(new Color(71, 120, 197)));
		this.formulario.getTextoBuscar().addFocusListener(field);
		this.formulario.getTextoBuscar().setToolTipText("Ex: IPASGO / UNIMED");
		
		this.formulario.getBuscar().setText("Buscar");
		this.formulario.getBuscar().setBounds(215, 381, 84, 23);
		this.formulario.getBuscar().setBackground(new Color(71, 120, 197));
		this.formulario.getBuscar().setFont(new Font("Segoe UI", 0, 14));
		this.formulario.getBuscar().setForeground(new Color(255, 255, 255));
		
		this.formulario.getOk().setText("OK");
		this.formulario.getOk().setForeground(Color.WHITE);
		this.formulario.getOk().setFont(new Font("Segoe UI", Font.PLAIN, 14));
		this.formulario.getOk().setBackground(new Color(71, 120, 197));
		
		this.formulario.getCancelar().setText("Cancelar");
		this.formulario.getCancelar().setForeground(Color.WHITE);
		this.formulario.getCancelar().setFont(new Font("Segoe UI", Font.PLAIN, 14));
		this.formulario.getCancelar().setBackground(new Color(71, 120, 197));
		
		this.formulario.getBuscarUsuario().setText("Escolha Uma Opção");
		this.formulario.getBuscarUsuario().setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		
		this.formulario.getBuscaCodigo().setText("Código");
		this.formulario.getBuscaCodigo().setFont(new Font("Segoe UI", Font.PLAIN, 12));
		this.formulario.getBuscaCodigo().setBackground(Color.WHITE);
		
		this.formulario.getBuscaNome().setText("Nome");
		this.formulario.getBuscaNome().setFont(new Font("Segoe UI", Font.PLAIN, 12));
		this.formulario.getBuscaNome().setBackground(Color.WHITE);
		
		this.formulario.getBuscaRg().setText("RG");
		this.formulario.getBuscaRg().setFont(new Font("Segoe UI", Font.PLAIN, 12));
		this.formulario.getBuscaRg().setBackground(Color.WHITE);
		
		this.formulario.getBuscaCpf().setText("CPF");
		this.formulario.getBuscaCpf().setFont(new Font("Segoe UI", Font.PLAIN, 12));
		this.formulario.getBuscaCpf().setBackground(Color.WHITE);
		
		
		GroupLayout gl_panel = new GroupLayout(this.formulario.getPanel());
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(this.formulario.getPainelDrag(), GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
				.addContainerGap()
				.addComponent(this.formulario.getBuscarUsuario(), GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(this.formulario.getBuscaCodigo(), GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(this.formulario.getBuscaNome(), GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(this.formulario.getBuscaRg(), GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(this.formulario.getBuscaCpf(), GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(166, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
				.addGap(209)
				.addComponent(this.formulario.getOk(), GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addComponent(this.formulario.getCancelar(), GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(209, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
				.addContainerGap()
				.addComponent(this.formulario.getTextoBuscar(), GroupLayout.PREFERRED_SIZE, 302, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(this.formulario.getBuscar(), GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(132, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
				.addContainerGap()
				.addComponent(this.formulario.getScrollPane(), GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE)
				.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
				.addComponent(this.formulario.getPainelDrag(), GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
				.addComponent(this.formulario.getBuscarUsuario())
				.addComponent(this.formulario.getBuscaCodigo())
				.addComponent(this.formulario.getBuscaNome())
				.addComponent(this.formulario.getBuscaRg(), GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
				.addComponent(this.formulario.getBuscaCpf(), GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
				.addComponent(this.formulario.getTextoBuscar(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addComponent(this.formulario.getBuscar(), 0, 0, Short.MAX_VALUE))
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addComponent(this.formulario.getScrollPane(), GroupLayout.PREFERRED_SIZE, 270, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(this.formulario.getCancelar(), GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
				.addComponent(this.formulario.getOk(), GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
				.addContainerGap())
		);
		
		this.formulario.getTable().setGridColor(new java.awt.Color(255, 255, 255));
		this.formulario.getTable().setRowHeight(20);
		this.formulario.getTable().setSelectionBackground(new Color(84,101,127));
		this.formulario.getTable().setSelectionForeground(Color.WHITE);
		this.formulario.getScrollPane().setColumnHeaderView(this.formulario.getTable());
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
