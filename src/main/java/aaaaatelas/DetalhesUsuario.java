package aaaaatelas;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;

public class DetalhesUsuario extends JDialog {
	private JPanel panel = new JPanel();
	private Container tela = getContentPane();
	private JTextField TFuncionario;
	private JTextField TCpf;
	private JTextField TRg;
	private JTextField TLogin;
	
	
	public static void main(String[] args) {
		try {
			DetalhesUsuario dialog = new DetalhesUsuario();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}



	public DetalhesUsuario() {
		this.setBounds(100, 100, 480, 350);
		tela.setLayout(null);
		this.setUndecorated(true);
		panel.setBorder(new LineBorder(new Color(71,120,197)));
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 480, 350);
		tela.add(panel);
		
		JPanel painelTitulo = new JPanel();
		painelTitulo.setBackground(new Color(20, 34, 56));
		
		JLabel LFechar = new JLabel("");
		LFechar.setIcon(new ImageIcon(Gerenciar.class.getResource("/imagens/icons8-não-22.png")));
		GroupLayout gl_painelTitulo = new GroupLayout(painelTitulo);
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
		painelTitulo.setLayout(gl_painelTitulo);
		
		JLabel LDescricao = new JLabel("Detalhes Usuário");
		LDescricao.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		
		JLabel LFuncionario = new JLabel("Funcionário");
		LFuncionario.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		
		TFuncionario = new JTextField();
		TFuncionario.setBorder(new LineBorder(new Color(71, 120, 197)));;
		TFuncionario.setColumns(10);
		
		JLabel LCpf = new JLabel("CPF");
		LCpf.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		
		JLabel LRg = new JLabel("RG");
		LRg.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		
		TCpf = new JTextField();
		TCpf.setBorder(new LineBorder(new Color(71, 120, 197)));
		TCpf.setColumns(10);
		
		TRg = new JTextField();
		TRg.setBorder(new LineBorder(new Color(71, 120, 197)));
		TRg.setColumns(10);
		
		JLabel LLogin = new JLabel("Login");
		LLogin.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		
		TLogin = new JTextField();
		TLogin.setBorder(new LineBorder(new Color(71, 120, 197)));
		TLogin.setColumns(10);
		
		JButton BCancelar = new JButton("Cancelar");
		BCancelar.setForeground(Color.WHITE);
		BCancelar.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		BCancelar.setBackground(new Color(71, 120, 197));
		
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(painelTitulo, GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(LDescricao, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(328, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(LFuncionario, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(393, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(TFuncionario, GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(LCpf, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(TLogin, Alignment.LEADING)
								.addComponent(TCpf, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE))))
					.addPreferredGap(ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(LRg, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addComponent(TRg, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(LLogin, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(405, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(184)
					.addComponent(BCancelar, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(197, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(painelTitulo, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(LDescricao)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(LFuncionario)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(TFuncionario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(LCpf)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(TCpf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(74)
							.addComponent(LLogin)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(TLogin, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(36)
							.addComponent(BCancelar, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(LRg)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(TRg, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(124))
		);
		panel.setLayout(gl_panel);
		
	}
}
