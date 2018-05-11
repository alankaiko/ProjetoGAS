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

import aaaaatelas.incluirusergrafico;
import br.com.gsv.formularios.IncluirUsuarioForm;
import br.com.gsv.util.FieldListener;

public class IncluirUsuarioGrafic {
	private IncluirUsuarioForm formulario;
	private FieldListener field = new FieldListener();
	
	public IncluirUsuarioGrafic(IncluirUsuarioForm formulario) {
		this.formulario = formulario;
		
		CriarTelaGeralClassic();
		DadosConvenio();
		ArrastandoPainel();
	}
	
	
	public void CriarTelaGeralClassic() {
		this.formulario.setModal(true);
		this.formulario.setBounds(100, 100, 516, 330);
		this.formulario.getTela().setLayout(null);
		this.formulario.setUndecorated(true);
		this.formulario.getPanel().setBorder(new LineBorder(new Color(71,120,197)));
		this.formulario.getPanel().setBackground(Color.WHITE);
		this.formulario.getPanel().setBounds(0, 0, 516, 330);
		this.formulario.getTela().add(this.formulario.getPanel());
	}
	

	public void DadosConvenio() {
		this.formulario.getPainelDrag().setBackground(new Color(20, 34, 56));
		
		JLabel LFechar = new JLabel();
		LFechar.setIcon(new ImageIcon(IncluirUsuarioGrafic.class.getResource("/imagens/icons8-não-22.png")));
		LFechar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				formulario.dispose();
			}
		});
		
		JLabel lblIncluirUsurio = new JLabel("Incluir Usuário");
		lblIncluirUsurio.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		lblIncluirUsurio.setForeground(Color.WHITE);
		GroupLayout gl_painelTitulo = new GroupLayout(this.formulario.getPainelDrag());
		gl_painelTitulo.setHorizontalGroup(
			gl_painelTitulo.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_painelTitulo.createSequentialGroup()
				.addContainerGap()
				.addComponent(lblIncluirUsurio, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED, 383, Short.MAX_VALUE)
				.addComponent(LFechar, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
		);
		gl_painelTitulo.setVerticalGroup(
			gl_painelTitulo.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_painelTitulo.createSequentialGroup()
				.addGroup(gl_painelTitulo.createParallelGroup(Alignment.LEADING)
				.addComponent(LFechar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(lblIncluirUsurio, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
				.addContainerGap())
		);
		this.formulario.getPainelDrag().setLayout(gl_painelTitulo);;
		
		
		
		this.formulario.getLFuncionario().setText("Funcionário");
		this.formulario.getLFuncionario().setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		
		this.formulario.getTFuncionario().setBorder(new LineBorder(new Color(71,120,197)));
		this.formulario.getTFuncionario().setEditable(false);
		this.formulario.getTFuncionario().addFocusListener(field);
		this.formulario.getTFuncionario().setColumns(10);
		
		this.formulario.getBPesquisar().setText("Pesquisar");
		this.formulario.getBPesquisar().setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		this.formulario.getBPesquisar().setBackground(Color.WHITE);
		this.formulario.getBPesquisar().setBorder(null);
		this.formulario.getBPesquisar().setIcon(new ImageIcon(incluirusergrafico.class.getResource("/imagens/icons8-pesquisar-15.png")));
		
		this.formulario.getLCpf().setText("CPF");
		this.formulario.getLCpf().setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		
		this.formulario.getTCpf().setEditable(false);
		this.formulario.getTCpf().setColumns(10);
		this.formulario.getTCpf().setBorder(new LineBorder(new Color(71,120,197)));
		
		this.formulario.getLRg().setText("RG");
		this.formulario.getLRg().setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		
		this.formulario.getTRg().setEditable(false);
		this.formulario.getTRg().setColumns(10);
		this.formulario.getTRg().setBorder(new LineBorder(new Color(71,120,197)));
		
		JSeparator separator = new JSeparator();
		
		JLabel LAdicionar = new JLabel("Adicionar Login de Usuário");
		LAdicionar.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 13));
		
		JLabel LLogin = new JLabel("Login");
		LLogin.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		
		this.formulario.getTLogin().setColumns(10);
		this.formulario.getTLogin().setBorder(new LineBorder(new Color(71,120,197)));
		
		this.formulario.getLSenha().setText("Senha");
		this.formulario.getLSenha().setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		
		this.formulario.getTSenha().setColumns(10);
		this.formulario.getTSenha().setBorder(new LineBorder(new Color(71,120,197)));
		
		this.formulario.getBCancelar().setText("Voltar");
		this.formulario.getBCancelar().setForeground(Color.WHITE);
		this.formulario.getBCancelar().setFont(new Font("Segoe UI", Font.PLAIN, 14));
		this.formulario.getBCancelar().setBackground(new Color(71, 120, 197));
		
		this.formulario.getBGravar().setText("Gravar");
		this.formulario.getBGravar().setForeground(Color.WHITE);
		this.formulario.getBGravar().setFont(new Font("Segoe UI", Font.PLAIN, 14));
		this.formulario.getBGravar().setBackground(new Color(71, 120, 197));
		
		
		
		
		GroupLayout gl_panel = new GroupLayout(this.formulario.getPanel());
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(this.formulario.getPainelDrag(), GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
				.addContainerGap()
				.addComponent(this.formulario.getLFuncionario(), GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(405, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
				.addContainerGap()
				.addComponent(LAdicionar, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(314, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
				.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
				.addContainerGap(153, Short.MAX_VALUE)
				.addComponent(this.formulario.getBGravar(), GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.UNRELATED))
				.addGroup(gl_panel.createSequentialGroup()
				.addContainerGap()
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(LLogin, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
				.addComponent(this.formulario.getTLogin(), GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE))
				.addGap(48)))
				.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
				.addComponent(this.formulario.getBCancelar(), GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
				.addGap(142))
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(this.formulario.getLSenha(), GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
				.addComponent(this.formulario.getTSenha(), GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE))))
				.addGroup(gl_panel.createSequentialGroup()
				.addContainerGap()
				.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
				.addComponent(this.formulario.getTFuncionario(), GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
				.addGap(18)
				.addComponent(this.formulario.getBPesquisar(), GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED))
				.addGroup(gl_panel.createSequentialGroup()
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(this.formulario.getLCpf(), GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
				.addComponent(this.formulario.getTCpf(), GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(this.formulario.getLRg(), GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
				.addComponent(this.formulario.getTRg(), Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE)))
				.addComponent(separator, GroupLayout.PREFERRED_SIZE, 481, GroupLayout.PREFERRED_SIZE))))
				.addContainerGap(15, GroupLayout.PREFERRED_SIZE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
				.addComponent(this.formulario.getPainelDrag(), GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
				.addGap(32)
				.addComponent(this.formulario.getLFuncionario())
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
				.addComponent(this.formulario.getTFuncionario(), GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
				.addComponent(this.formulario.getBPesquisar()))
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
				.addComponent(this.formulario.getLRg(), GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(this.formulario.getTRg(), GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel.createSequentialGroup()
				.addComponent(this.formulario.getLCpf(), GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(this.formulario.getTCpf(), GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)))
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addComponent(separator, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
				.addComponent(LAdicionar, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(LLogin, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(this.formulario.getTLogin(), GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel.createSequentialGroup()
				.addComponent(this.formulario.getLSenha(), GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(this.formulario.getTSenha(), GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)))
				.addGap(33)
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
				.addComponent(this.formulario.getBGravar(), GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
				.addComponent(this.formulario.getBCancelar(), GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
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
