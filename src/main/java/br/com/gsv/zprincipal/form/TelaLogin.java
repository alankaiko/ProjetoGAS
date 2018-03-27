package br.com.gsv.zprincipal.form;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.LineBorder;

import br.com.gsv.zprincipal.listeners.TelaLoginListener;

public class TelaLogin extends JFrame {

	private JPanel PainelPrincipal, PainelLogo;
	private JTextField campoTexto;
	private JLabel labelGas, usuario, senha, botaoFechar;
	private JButton botaoEntrar;
	private JTextPane esqueciSenha;
	private JPasswordField campoSenha;
	private TelaLoginListener listener;

	
	
	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin frame = new TelaLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	

	public TelaLogin() {
		CriaTela();
		CriaComponentes();
		listener = new TelaLoginListener(this);
	}

	private void CriaTela() {
		setBackground(Color.WHITE);
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 300);
		this.setLocationRelativeTo(null);
		PainelPrincipal = new JPanel();
		PainelPrincipal.setBackground(Color.WHITE);
		PainelPrincipal.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(PainelPrincipal);
		PainelPrincipal.setLayout(null);
	}

	private void CriaComponentes() {
		PainelLogo = new JPanel();
		PainelLogo.setBackground(SystemColor.textHighlight);
		PainelLogo.setBounds(0, 0, 233, 324);
		PainelPrincipal.add(PainelLogo);
		PainelLogo.setLayout(null);

		labelGas = new JLabel("Projeto GAS");
		labelGas.setFont(new Font("Century", Font.BOLD | Font.ITALIC, 20));
		labelGas.setBounds(51, 239, 142, 35);
		PainelLogo.add(labelGas);

		botaoEntrar = new JButton("Entrar");
		botaoEntrar.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		botaoEntrar.setForeground(Color.WHITE);
		botaoEntrar.setBackground(Color.DARK_GRAY);
		botaoEntrar.setBounds(239, 219, 215, 22);
		PainelPrincipal.add(botaoEntrar);

		campoTexto = new JTextField();
		campoTexto.setBounds(243, 69, 211, 20);
		PainelPrincipal.add(campoTexto);
		campoTexto.setColumns(10);

		campoSenha = new JPasswordField();
		campoSenha.setBounds(243, 137, 209, 20);
		PainelPrincipal.add(campoSenha);
		campoSenha.setColumns(10);

		usuario = new JLabel("USU\u00C1RIO");
		usuario.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		usuario.setBounds(243, 44, 88, 14);
		PainelPrincipal.add(usuario);

		senha = new JLabel("SENHA");
		senha.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		senha.setBounds(243, 112, 58, 14);
		PainelPrincipal.add(senha);

		esqueciSenha = new JTextPane();
		esqueciSenha.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		esqueciSenha.setText("Esqueci a Senha");
		esqueciSenha.setBounds(363, 247, 107, 20);
		PainelPrincipal.add(esqueciSenha);

		botaoFechar = new JLabel();
		botaoFechar.setIcon(new ImageIcon(TelaLogin.class
				.getResource("/imagens/close.png")));
		botaoFechar.setBounds(445, 0, 25, 31);
		PainelPrincipal.add(botaoFechar);

	}

	public JTextField getCampoTexto() {
		return campoTexto;
	}

	public void setCampoTexto(JTextField campoTexto) {
		this.campoTexto = campoTexto;
	}

	public JLabel getUsuario() {
		return usuario;
	}

	public void setUsuario(JLabel usuario) {
		this.usuario = usuario;
	}

	public JLabel getSenha() {
		return senha;
	}

	public void setSenha(JLabel senha) {
		this.senha = senha;
	}

	public JLabel getBotaoFechar() {
		return botaoFechar;
	}

	public void setBotaoFechar(JLabel botaoFechar) {
		this.botaoFechar = botaoFechar;
	}

	public JButton getBotaoEntrar() {
		return botaoEntrar;
	}

	public void setBotaoEntrar(JButton botaoEntrar) {
		this.botaoEntrar = botaoEntrar;
	}

	public JTextPane getEsqueciSenha() {
		return esqueciSenha;
	}

	public void setEsqueciSenha(JTextPane esqueciSenha) {
		this.esqueciSenha = esqueciSenha;
	}

	public JPasswordField getCampoSenha() {
		return campoSenha;
	}

	public void setCampoSenha(JPasswordField campoSenha) {
		this.campoSenha = campoSenha;
	}

}
