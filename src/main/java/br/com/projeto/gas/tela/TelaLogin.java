package br.com.projeto.gas.tela;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import java.awt.Button;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;

public class TelaLogin extends JFrame {

	private JPanel PainelPrincipal;
	private JTextField campoTexto;
	private JTextField campoSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin frame = new TelaLogin();
					frame.setUndecorated(true);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaLogin() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 300);
		this.setLocationRelativeTo(null);
		PainelPrincipal = new JPanel();
		PainelPrincipal.setBackground(Color.WHITE);
		PainelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(PainelPrincipal);
		PainelPrincipal.setLayout(null);

		JPanel PainelLogo = new JPanel();
		PainelLogo.setBackground(SystemColor.textHighlight);
		PainelLogo.setBounds(0, 0, 233, 324);
		PainelPrincipal.add(PainelLogo);
		PainelLogo.setLayout(null);
		
		JLabel labelGas = new JLabel("Projeto GAS");
		labelGas.setFont(new Font("Century", Font.BOLD | Font.ITALIC, 20));
		labelGas.setBounds(51, 239, 142, 35);
		PainelLogo.add(labelGas);
		
		Button botaoEntrar = new Button("Entrar");
		botaoEntrar.setForeground(Color.WHITE);
		botaoEntrar.setBackground(Color.DARK_GRAY);
		botaoEntrar.setBounds(239, 219, 215, 22);
		PainelPrincipal.add(botaoEntrar);
		
		campoTexto = new JTextField();
		campoTexto.setBounds(243, 69, 211, 20);
		PainelPrincipal.add(campoTexto);
		campoTexto.setColumns(10);
		
		campoSenha = new JTextField();
		campoSenha.setBounds(243, 137, 209, 20);
		PainelPrincipal.add(campoSenha);
		campoSenha.setColumns(10);
		
		JLabel usuario = new JLabel("USU\u00C1RIO");
		usuario.setBounds(243, 44, 88, 14);
		PainelPrincipal.add(usuario);
		
		JLabel senha = new JLabel("SENHA");
		senha.setBounds(243, 112, 58, 14);
		PainelPrincipal.add(senha);
		
		JTextPane esqueciSenha = new JTextPane();
		esqueciSenha.setText("Esqueci a Senha");
		esqueciSenha.setBounds(363, 247, 154, 20);
		PainelPrincipal.add(esqueciSenha);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(TelaLogin.class.getResource("/images/close.jpg")));
		lblNewLabel_1.setBounds(436, 0, 46, 31);
		PainelPrincipal.add(lblNewLabel_1);
	}
}
