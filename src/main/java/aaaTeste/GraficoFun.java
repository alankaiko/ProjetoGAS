package aaaTeste;

import java.awt.Color;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.LineBorder;

public class GraficoFun extends JDialog {
	private JTextField TCpf;
	private JTextField TCodigo;
	private JTextField TRg;
	private JTextField TNome;
	private JTextField TLogradouro;
	private JTextField TComplemento;
	private JTextField TNumero;
	private JTextField TBairro;
	private JTextField TCidade;
	private JTextField TCep;
	private JTextField TEmail;
	private JTextField TCelular;
	private JTextField TTelefone;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			GraficoFun dialog = new GraficoFun();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public GraficoFun() {
		setBounds(100, 100, 680, 590);
		//setUndecorated(true);
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(71,120,197)));
		panel.setBackground(Color.WHITE);
		
		
		
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
		);
		
		JPanel panelLabel = new JPanel();
		panelLabel.setBackground(new Color(0,83,158));
		
		JLabel LDados = new JLabel("DADOS PESSOAIS");
		LDados.setForeground(new Color(71,120,197));
		LDados.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		
		JLabel LCpf = new JLabel("CPF");
		LCpf.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		
		TCpf = new JTextField();
		TCpf.setBorder(new LineBorder(new Color(71,120,197)));
		TCpf.setColumns(10);
		
		JSeparator separaFun = new JSeparator();
		separaFun.setForeground(new Color(71,120,197));
		
		JLabel LCodigo = new JLabel("Código");
		LCodigo.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		
		TCodigo = new JTextField();
		TCodigo.setColumns(10);
		TCodigo.setBorder(new LineBorder(new Color(71,120,197)));
		
		JLabel LRg = new JLabel("RG");
		LRg.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		
		TRg = new JTextField();
		TRg.setColumns(10);
		TRg.setBorder(new LineBorder(new Color(71,120,197)));
		
		JLabel LNome = new JLabel("Nome");
		LNome.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		
		TNome = new JTextField();
		TNome.setBorder(new LineBorder(new Color(71,120,197)));
		TNome.setColumns(10);
		
		JLabel LEndereco = new JLabel("ENDEREÇO");
		LEndereco.setForeground(new Color(71, 120, 197));
		LEndereco.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		
		JLabel LLogradouro = new JLabel("Logradouro");
		LLogradouro.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		
		TLogradouro = new JTextField();
		TLogradouro.setColumns(10);
		TLogradouro.setBorder(new LineBorder(new Color(71,120,197)));
		
		TComplemento = new JTextField();
		TComplemento.setColumns(10);
		TComplemento.setBorder(new LineBorder(new Color(71,120,197)));
		
		JLabel LComplemento = new JLabel("Complemento");
		LComplemento.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		
		TNumero = new JTextField();
		TNumero.setColumns(10);
		TNumero.setBorder(new LineBorder(new Color(71,120,197)));
		
		JLabel LNumero = new JLabel("Número");
		LNumero.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		
		JLabel LBairro = new JLabel("Bairro");
		LBairro.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		
		TBairro = new JTextField();
		TBairro.setColumns(10);
		TBairro.setBorder(new LineBorder(new Color(71,120,197)));
		
		TCidade = new JTextField();
		TCidade.setColumns(10);
		TCidade.setBorder(new LineBorder(new Color(71,120,197)));
		
		JLabel LCidade = new JLabel("Cidade");
		LCidade.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		
		JComboBox comboEstado = new JComboBox();
		
		JLabel LEstado = new JLabel("Estado");
		LEstado.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		
		TCep = new JTextField();
		TCep.setColumns(10);
		TCep.setBorder(new LineBorder(new Color(71,120,197)));
		
		JLabel LCep = new JLabel("CEP");
		LCep.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		
		JSeparator separaEnd = new JSeparator();
		separaEnd.setForeground(new Color(71, 120, 197));
		
		JLabel Lcontato = new JLabel("CONTATO");
		Lcontato.setForeground(new Color(71, 120, 197));
		Lcontato.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		
		TEmail = new JTextField();
		TEmail.setColumns(10);
		TEmail.setBorder(new LineBorder(new Color(71,120,197)));
		
		JLabel LEmail = new JLabel("E-mail");
		LEmail.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		
		TCelular = new JTextField();
		TCelular.setColumns(10);
		TCelular.setBorder(new LineBorder(new Color(71,120,197)));
		
		JLabel LCelular = new JLabel("Celular");
		LCelular.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		
		TTelefone = new JTextField();
		TTelefone.setColumns(10);
		TTelefone.setBorder(new LineBorder(new Color(71,120,197)));
		
		JLabel LTelefone = new JLabel("Telefone");
		LTelefone.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		
		JButton BTGravar = new JButton("Cadastrar");
		BTGravar.setBounds(215, 381, 84, 23);
		BTGravar.setBackground(new Color(71, 120, 197));
		BTGravar.setFont(new Font("Segoe UI", 0, 14));
		BTGravar.setForeground(new Color(255, 255, 255));
		
		
		JButton BTCancelar = new JButton("Cancelar");
		BTCancelar.setBounds(215, 381, 84, 23);
		BTCancelar.setBackground(new Color(71, 120, 197));
		BTCancelar.setFont(new Font("Segoe UI", 0, 14));
		BTCancelar.setForeground(new Color(255, 255, 255));
		
		
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(panelLabel, GroupLayout.DEFAULT_SIZE, 678, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(19)
					.addComponent(separaFun, GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
					.addGap(19))
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(LEndereco, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(553, Short.MAX_VALUE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(10)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
										.addComponent(LLogradouro, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
										.addComponent(LComplemento, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
										.addComponent(LNumero, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
										.addComponent(LCidade, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
										.addComponent(LCep, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE))
									.addGap(18)
									.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
										.addComponent(TComplemento, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
										.addComponent(TLogradouro, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
										.addGroup(gl_panel.createSequentialGroup()
											.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
												.addComponent(TNumero, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(TCidade, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
												.addComponent(TCep, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE))
											.addPreferredGap(ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
											.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
												.addGroup(gl_panel.createSequentialGroup()
													.addComponent(LEstado, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(ComponentPlacement.UNRELATED)
													.addComponent(comboEstado, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
												.addGroup(gl_panel.createSequentialGroup()
													.addComponent(LBairro, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(ComponentPlacement.RELATED)
													.addComponent(TBairro, GroupLayout.PREFERRED_SIZE, 226, GroupLayout.PREFERRED_SIZE)))))
									.addGap(60))
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(separaEnd, GroupLayout.PREFERRED_SIZE, 640, GroupLayout.PREFERRED_SIZE)
									.addContainerGap())))))
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(10)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(LCodigo, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(LCpf, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(LNome, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
							.addGap(53)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(TCodigo, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(TNome, GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(TCpf, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
											.addComponent(LRg, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
											.addGap(18)
											.addComponent(TRg, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)))
									.addGap(58))))
						.addComponent(LDados))
					.addContainerGap())
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(LEmail, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
						.addComponent(LCelular, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(TCelular, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(LTelefone, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(TTelefone, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE))
						.addComponent(TEmail, GroupLayout.PREFERRED_SIZE, 507, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(61, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(430, Short.MAX_VALUE)
					.addComponent(BTGravar)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(BTCancelar)
					.addGap(62))
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(Lcontato, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(576, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(panelLabel, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(LDados)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(TCodigo, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(LCodigo))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
							.addComponent(TCpf, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
							.addComponent(LCpf, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
							.addComponent(LRg, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
							.addComponent(TRg, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)))
					.addGap(16)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(TNome, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(LNome, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(separaFun, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(LEndereco, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(TLogradouro, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(LLogradouro, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(TComplemento, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(LComplemento, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
							.addComponent(TNumero, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
							.addComponent(LNumero, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
							.addComponent(TBairro, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
							.addComponent(LBairro, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(TCidade, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(LCidade, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboEstado, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(LEstado, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(TCep, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(LCep, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(separaEnd, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(Lcontato, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(LEmail, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
						.addComponent(TEmail, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(TCelular, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(LCelular, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
						.addComponent(TTelefone, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(LTelefone, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(BTCancelar)
						.addComponent(BTGravar))
					.addContainerGap())
		);
		
		JLabel LInserirDados = new JLabel("Incluir Dados de Funcionários");
		LInserirDados.setForeground(Color.WHITE);
		LInserirDados.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		GroupLayout gl_panelLabel = new GroupLayout(panelLabel);
		gl_panelLabel.setHorizontalGroup(
			gl_panelLabel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelLabel.createSequentialGroup()
					.addContainerGap()
					.addComponent(LInserirDados)
					.addContainerGap(467, Short.MAX_VALUE))
		);
		gl_panelLabel.setVerticalGroup(
			gl_panelLabel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panelLabel.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(LInserirDados))
		);
		panelLabel.setLayout(gl_panelLabel);
		panel.setLayout(gl_panel);
		getContentPane().setLayout(groupLayout);
		
	}
}
