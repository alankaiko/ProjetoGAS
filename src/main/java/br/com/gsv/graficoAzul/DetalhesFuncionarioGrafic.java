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

import br.com.gsv.formularios.DetalhesFuncionariDialog;

public class DetalhesFuncionarioGrafic {
	private DetalhesFuncionariDialog formulario;
	
	public DetalhesFuncionarioGrafic(DetalhesFuncionariDialog formulario) {
		this.formulario = formulario;
		CriaTela();
		OrganizaTela();
		ArrastandoPainel();
	}
	
	
	private void CriaTela(){
		this.formulario.setModal(true);
		this.formulario.setBounds(100, 100, 650, 460);
		this.formulario.getTela().setLayout(null);
		this.formulario.setUndecorated(true);
		this.formulario.getPanel().setBorder(new LineBorder(new Color(71,120,197)));
		this.formulario.getPanel().setBackground(Color.WHITE);
		this.formulario.getPanel().setBounds(0, 0, 650, 460);
		this.formulario.getTela().add(this.formulario.getPanel());
	}
	
	
	
	private void OrganizaTela(){
		this.formulario.getPainelDrag().setBackground(new Color(20, 34, 56));
		
		JLabel LFechar = new JLabel("");
		LFechar.setIcon(new ImageIcon(DetalhesFuncionarioGrafic.class.getResource("/imagens/icons8-não-22.png")));
		LFechar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				formulario.dispose();
			}
		});
		
		JLabel lblNewLabel = new JLabel("Dados Funcionários");
		lblNewLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		lblNewLabel.setForeground(Color.WHITE);
		
		GroupLayout gl_painelTitulo = new GroupLayout(this.formulario.getPainelDrag());
		gl_painelTitulo.setHorizontalGroup(
			gl_painelTitulo.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_painelTitulo.createSequentialGroup()
				.addContainerGap()
				.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED, 485, Short.MAX_VALUE)
				.addComponent(LFechar, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
		);
		gl_painelTitulo.setVerticalGroup(
			gl_painelTitulo.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_painelTitulo.createSequentialGroup()
				.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
				.addGap(11))
				.addGroup(Alignment.LEADING, gl_painelTitulo.createSequentialGroup()
				.addComponent(LFechar, GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
				.addContainerGap())
		);
		this.formulario.getPainelDrag().setLayout(gl_painelTitulo);
		
		this.formulario.getLDados().setText("Dados Pessoais");
		this.formulario.getLDados().setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		
		this.formulario.getLCodigo().setText("Código");
		this.formulario.getLCodigo().setFont(new Font("Segoe UI Light", Font.PLAIN, 14));;
		
		this.formulario.getLNome().setText("Nome");
		this.formulario.getLNome().setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		
		this.formulario.getBTCancelar().setText("Cancelar");
		this.formulario.getBTCancelar().setForeground(Color.WHITE);
		this.formulario.getBTCancelar().setFont(new Font("Segoe UI", Font.PLAIN, 14));
		this.formulario.getBTCancelar().setBackground(new Color(71, 120, 197));
		
		this.formulario.getTCodigo().setFont(new Font("Segoe UI", Font.PLAIN, 13));
		
		this.formulario.getTNome().setFont(new Font("Segoe UI", Font.PLAIN, 13));
		
		this.formulario.getLCpf().setText("CPF");
		this.formulario.getLCpf().setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		
		this.formulario.getTCpf().setFont(new Font("Segoe UI", Font.PLAIN, 13));
		
		this.formulario.getLRg().setText("RG");
		this.formulario.getLRg().setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		
		this.formulario.getTRg().setFont(new Font("Segoe UI", Font.PLAIN, 13));
		
		JSeparator separa = new JSeparator();
		separa.setBackground(new Color(71, 120, 197));
		
		this.formulario.getTRegistro().setFont(new Font("Segoe UI", Font.PLAIN, 13));
		
		this.formulario.getLRegistro().setText("Registro");
		this.formulario.getLRegistro().setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		
		this.formulario.getLEndereco().setText("Endereço");
		this.formulario.getLEndereco().setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		
		this.formulario.getLLogradouro().setText("Logradouro");
		this.formulario.getLLogradouro().setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		
		this.formulario.getLComplemento().setText("Complemento");
		this.formulario.getLComplemento().setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		
		this.formulario.getTLogradouro().setFont(new Font("Segoe UI", Font.PLAIN, 13));
		
		this.formulario.getTComplemento().setFont(new Font("Segoe UI", Font.PLAIN, 13));
		
		this.formulario.getLNumero().setText("Número");
		this.formulario.getLNumero().setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		
		this.formulario.getLCidade().setText("Cidade");
		this.formulario.getLCidade().setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		
		this.formulario.getTNumero().setFont(new Font("Segoe UI", Font.PLAIN, 13));
		
		this.formulario.getTCidade().setFont(new Font("Segoe UI", Font.PLAIN, 13));
		
		this.formulario.getLBairro().setText("Bairro");
		this.formulario.getLBairro().setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		
		this.formulario.getTBairro().setFont(new Font("Segoe UI", Font.PLAIN, 13));
		
		this.formulario.getTEstado().setFont(new Font("Segoe UI", Font.PLAIN, 13));
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(71, 120, 197));
		
		this.formulario.getLContato().setText("Contato");
		this.formulario.getLContato().setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		
		this.formulario.getLEmail().setText("E-mail");
		this.formulario.getLEmail().setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		
		this.formulario.getTEmail().setFont(new Font("Segoe UI", Font.PLAIN, 13));
		
		this.formulario.getLTelefone().setText("Telefone");
		this.formulario.getLTelefone().setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		
		this.formulario.getTTelefone().setFont(new Font("Segoe UI", Font.PLAIN, 13));
		
		this.formulario.getLCelular().setText("Celular");
		this.formulario.getLCelular().setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		
		this.formulario.getTCelular().setFont(new Font("Segoe UI", Font.PLAIN, 13));
		
		this.formulario.getLUf().setText("UF");
		this.formulario.getLUf().setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		
		
		GroupLayout gl_panel = new GroupLayout(this.formulario.getPanel());
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
				.addContainerGap()
				.addComponent(this.formulario.getLDados(), GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(498, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
				.addContainerGap()
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
				.addComponent(this.formulario.getLCodigo(), GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(this.formulario.getLNome(), GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(this.formulario.getLCpf(), GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE))
				.addGap(18)
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(this.formulario.getTNome(), GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
				.addComponent(this.formulario.getTCodigo(), GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
				.addComponent(this.formulario.getLRegistro(), GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addComponent(this.formulario.getTRegistro(), GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel.createSequentialGroup()
				.addComponent(this.formulario.getTCpf(), GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
				.addComponent(this.formulario.getLRg(), GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(this.formulario.getTRg(), GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)))
				.addGap(40))
				.addGroup(gl_panel.createSequentialGroup()
				.addComponent(this.formulario.getPainelDrag(), GroupLayout.PREFERRED_SIZE, 650, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
				.addContainerGap()
				.addComponent(separa, GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
				.addGap(20))
				.addGroup(gl_panel.createSequentialGroup()
				.addContainerGap()
				.addComponent(this.formulario.getLEndereco(), GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(510, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
				.addContainerGap()
				.addComponent(this.formulario.getLLogradouro(), GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(this.formulario.getTLogradouro(), GroupLayout.PREFERRED_SIZE, 486, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(40, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
				.addContainerGap()
				.addComponent(this.formulario.getLCidade(), GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(this.formulario.getTCidade(), GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(345, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
				.addContainerGap()
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
				.addComponent(this.formulario.getLComplemento(), GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(this.formulario.getTComplemento(), GroupLayout.PREFERRED_SIZE, 486, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel.createSequentialGroup()
				.addComponent(this.formulario.getLNumero(), GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(this.formulario.getTNumero(), GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
				.addGap(82)
				.addComponent(this.formulario.getLBairro(), GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
				.addComponent(this.formulario.getLUf(), GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addComponent(this.formulario.getTEstado(), GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE))
				.addComponent(this.formulario.getTBairro(), GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE))))
				.addGap(40))
				.addGroup(gl_panel.createSequentialGroup()
				.addContainerGap()
				.addComponent(separator, GroupLayout.PREFERRED_SIZE, 630, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(20, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
				.addContainerGap()
				.addComponent(this.formulario.getLContato(), GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(554, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
				.addContainerGap()
				.addComponent(this.formulario.getLEmail(), GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(this.formulario.getTEmail(), GroupLayout.PREFERRED_SIZE, 341, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(234, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
				.addContainerGap()
				.addComponent(this.formulario.getLTelefone(), GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(this.formulario.getTTelefone(), GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)
				.addGap(77)
				.addComponent(this.formulario.getLCelular(), GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(this.formulario.getTCelular(), GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(59, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
				.addGap(267)
				.addComponent(this.formulario.getBTCancelar(), GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(286, Short.MAX_VALUE))
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
				.addComponent(this.formulario.getTCodigo())
				.addComponent(this.formulario.getTRegistro(), GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
				.addComponent(this.formulario.getLRegistro(), GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
				.addComponent(this.formulario.getLNome())
				.addComponent(this.formulario.getTNome()))
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
				.addComponent(this.formulario.getLCpf())
				.addComponent(this.formulario.getTCpf())
				.addComponent(this.formulario.getTRg())
				.addComponent(this.formulario.getLRg()))
				.addGap(18)
				.addComponent(separa, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addComponent(this.formulario.getLEndereco(), GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
				.addComponent(this.formulario.getLLogradouro(), GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
				.addComponent(this.formulario.getTLogradouro(), GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
				.addComponent(this.formulario.getLComplemento(), GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
				.addComponent(this.formulario.getTComplemento(), GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
				.addComponent(this.formulario.getLNumero(), GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
				.addComponent(this.formulario.getLCidade(), GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
				.addComponent(this.formulario.getTCidade(), GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)))
				.addGroup(gl_panel.createSequentialGroup()
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
				.addComponent(this.formulario.getTNumero(), GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
				.addComponent(this.formulario.getTBairro(), GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
				.addComponent(this.formulario.getLBairro(), GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
				.addComponent(this.formulario.getTEstado(), GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
				.addComponent(this.formulario.getLUf(), GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))))
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addComponent(separator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addComponent(this.formulario.getLContato(), GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
				.addComponent(this.formulario.getLEmail(), GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
				.addComponent(this.formulario.getTEmail(), GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
				.addComponent(this.formulario.getLTelefone(), GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
				.addComponent(this.formulario.getTTelefone(), GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
				.addComponent(this.formulario.getLCelular(), GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
				.addComponent(this.formulario.getTCelular(), GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)))
				.addPreferredGap(ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
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
