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

import br.com.gsv.formularios.DetalhesProdutoDialog;

public class DetalheProdutoGrafic {
	DetalhesProdutoDialog formulario;
	
	public DetalheProdutoGrafic(DetalhesProdutoDialog formulario) {
		this.formulario = formulario;
		CriaTela();
		OrganizaTela();
		ArrastandoPainel();
	}
	
	private void CriaTela(){
		this.formulario.setModal(true);
		this.formulario.setBounds(100, 100, 400, 300);
		this.formulario.getTela().setLayout(null);
		this.formulario.setUndecorated(true);
		this.formulario.getPanel().setBorder(new LineBorder(new Color(71,120,197)));
		this.formulario.getPanel().setBackground(Color.WHITE);
		this.formulario.getPanel().setBounds(0, 0, 400, 300);
		this.formulario.getTela().add(this.formulario.getPanel());
	}
	
	private void OrganizaTela(){
		this.formulario.getPainelDrag().setBackground(new Color(20, 34, 56));
		
		JLabel LFechar = new JLabel();
		LFechar.setIcon(new ImageIcon(DetalheProdutoGrafic.class.getResource("/imagens/icons8-não-22.png")));
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
		
		this.formulario.getLDados().setText("Detalhes Produtos");
		this.formulario.getLDados().setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		
		this.formulario.getLCodigo().setText("Código");
		this.formulario.getLCodigo().setFont(new Font("Segoe UI Light", Font.PLAIN, 14));;
		
		this.formulario.getLDescricao().setText("Descrição");
		this.formulario.getLDescricao().setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		
		this.formulario.getBTCancelar().setText("Cancelar");
		this.formulario.getBTCancelar().setForeground(Color.WHITE);
		this.formulario.getBTCancelar().setFont(new Font("Segoe UI", Font.PLAIN, 14));
		this.formulario.getBTCancelar().setBackground(new Color(71, 120, 197));
		
		this.formulario.getTCodigo().setFont(new Font("Segoe UI", Font.PLAIN, 13));
		
		this.formulario.getTDescricao().setFont(new Font("Segoe UI", Font.PLAIN, 13));
		
		this.formulario.getLQuantidade().setText("Quantidade");
		this.formulario.getLQuantidade().setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		
		this.formulario.getTQuantidade().setFont(new Font("Segoe UI", Font.PLAIN, 13));
		
		this.formulario.getLFabricante().setText("Fabricante");
		this.formulario.getLFabricante().setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		
		this.formulario.getTFabricante().setFont(new Font("Segoe UI", Font.PLAIN, 13));
		
		this.formulario.getSepara().setBackground(new Color(71, 120, 197));
		
		
		GroupLayout gl_panel = new GroupLayout(this.formulario.getPanel());
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
				.addContainerGap()
				.addComponent(this.formulario.getLDados(), GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(266, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
				.addContainerGap()
				.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
				.addComponent(this.formulario.getSepara(), Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
				.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
				.addComponent(this.formulario.getLFabricante(), Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
				.addComponent(this.formulario.getLQuantidade(), Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
				.addComponent(this.formulario.getLDescricao(), Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
				.addComponent(this.formulario.getLCodigo(), Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(this.formulario.getTQuantidade(), GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
				.addComponent(this.formulario.getTDescricao(), GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
				.addComponent(this.formulario.getTCodigo(), GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
				.addComponent(this.formulario.getTFabricante(), GroupLayout.PREFERRED_SIZE, 285, GroupLayout.PREFERRED_SIZE))))
				.addGap(40))
				.addGroup(gl_panel.createSequentialGroup()
				.addGap(151)
				.addComponent(this.formulario.getBTCancelar(), GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(168, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
				.addComponent(this.formulario.getPainelDrag(), GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(126, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
				.addComponent(this.formulario.getPainelDrag(), GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(this.formulario.getLDados())
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
				.addComponent(this.formulario.getLCodigo())
				.addComponent(this.formulario.getTCodigo()))
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
				.addComponent(this.formulario.getLDescricao())
				.addComponent(this.formulario.getTDescricao()))
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
				.addComponent(this.formulario.getLQuantidade())
				.addComponent(this.formulario.getTQuantidade()))
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
				.addComponent(this.formulario.getLFabricante())
				.addComponent(this.formulario.getTFabricante()))
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addComponent(this.formulario.getSepara(), GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
				.addComponent(this.formulario.getBTCancelar())
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
