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
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;

import br.com.gsv.util.FieldListener;

public class incluirusergrafico extends JDialog {
	private JPanel panel = new JPanel();
	private Container tela = getContentPane();
	private JTextField TFuncionario;
	private FieldListener field = new FieldListener();
	private JTextField TCpf;
	private JTextField TRG;
	private JTextField TLogin;
	private JPasswordField TSenha;

	
	public static void main(String[] args) {
		try {
			incluirusergrafico dialog = new incluirusergrafico();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	public incluirusergrafico() {
		this.setBounds(100, 100, 516, 330);
		tela.setLayout(null);
		this.setUndecorated(true);
		panel.setBorder(new LineBorder(new Color(71,120,197)));
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 516, 330);
		tela.add(panel);
		
		JPanel painelTitulo = new JPanel();
		painelTitulo.setBackground(new Color(20, 34, 56));
		
		JLabel LFechar = new JLabel();
		LFechar.setIcon(new ImageIcon(incluirusergrafico.class.getResource("/imagens/icons8-não-22.png")));
		
		JLabel lblIncluirUsurio = new JLabel("Incluir Usuário");
		lblIncluirUsurio.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		lblIncluirUsurio.setForeground(Color.WHITE);
		GroupLayout gl_painelTitulo = new GroupLayout(painelTitulo);
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
		painelTitulo.setLayout(gl_painelTitulo);;
		
		JButton votlar = new JButton("Voltar");
		votlar.setForeground(Color.WHITE);
		votlar.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		votlar.setBackground(new Color(71, 120, 197));
		
		JButton Buscar = new JButton("Gravar");
		Buscar.setForeground(Color.WHITE);
		Buscar.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		Buscar.setBackground(new Color(71, 120, 197));
		
		JLabel LFuncionario = new JLabel("Funcionário");
		LFuncionario.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		
		TFuncionario = new JTextField();
		TFuncionario.setBorder(new LineBorder(new Color(71,120,197)));
		TFuncionario.setEditable(false);
		TFuncionario.addFocusListener(field);
		TFuncionario.setColumns(10);
		
		JLabel LCpf = new JLabel("CPF");
		LCpf.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		
		TCpf = new JTextField();
		TCpf.setEditable(false);
		TCpf.setColumns(10);
		TCpf.setBorder(new LineBorder(new Color(71,120,197)));
		
		JLabel LRG = new JLabel("RG");
		LRG.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		
		TRG = new JTextField();
		TRG.setEditable(false);
		TRG.setColumns(10);
		TRG.setBorder(new LineBorder(new Color(71,120,197)));
		
		JSeparator separator = new JSeparator();
		
		JLabel LAdicionar = new JLabel("Adicionar Login de Usuário");
		LAdicionar.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 13));
		
		JLabel LLogin = new JLabel("Login");
		LLogin.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		
		TLogin = new JTextField();
		TLogin.setColumns(10);
		TLogin.setBorder(new LineBorder(new Color(71,120,197)));
		
		JLabel LSenha = new JLabel("Senha");
		LSenha.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		
		TSenha = new JPasswordField();
		TSenha.setColumns(10);
		TSenha.setBorder(new LineBorder(new Color(71,120,197)));
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.setBorder(null);
		btnPesquisar.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		btnPesquisar.setBackground(Color.WHITE);
		btnPesquisar.setIcon(new ImageIcon(incluirusergrafico.class.getResource("/imagens/icons8-pesquisar-15.png")));
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(painelTitulo, GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(LFuncionario, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
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
									.addComponent(Buscar, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED))
								.addGroup(gl_panel.createSequentialGroup()
									.addContainerGap()
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(LLogin, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
										.addComponent(TLogin, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE))
									.addGap(48)))
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(votlar, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
									.addGap(142))
								.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
									.addComponent(LSenha, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
									.addComponent(TSenha, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(TFuncionario, GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
									.addGap(18)
									.addComponent(btnPesquisar, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED))
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(LCpf, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
										.addComponent(TCpf, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(LRG, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
										.addComponent(TRG, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE)))
								.addComponent(separator, GroupLayout.PREFERRED_SIZE, 481, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(15, GroupLayout.PREFERRED_SIZE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(painelTitulo, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
					.addGap(32)
					.addComponent(LFuncionario)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(TFuncionario, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnPesquisar))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(LRG, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(TRG, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(LCpf, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(TCpf, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(LAdicionar, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(LLogin, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(TLogin, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(LSenha, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(TSenha, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)))
					.addGap(33)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(Buscar, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(votlar, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		panel.setLayout(gl_panel);
		
	}
}
