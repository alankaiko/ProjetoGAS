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

public class FuncionarioGrafico extends JDialog {
	private JTextField TId;
	private JTextField TNome;
	private JTextField TRg;
	private JTextField TCpf;
	private JTextField TLogradouro;
	private JTextField TNumero;
	private JTextField TComplemento;
	private JTextField TBairro;
	private JTextField TCidade;
	private JTextField TCep;
	private JTextField TEmail;
	private JTextField TTelefone;
	private JTextField TCelular;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			FuncionarioGrafico dialog = new FuncionarioGrafico();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public FuncionarioGrafico() {
		setBounds(100, 100, 681, 482);
		setUndecorated(true);
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(71,120,197),1,true));
		panel.setBackground(Color.WHITE);
		
		
		
		
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 680, Short.MAX_VALUE)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		JPanel painelTitulo = new JPanel();
		painelTitulo.setBackground(new Color(71,120,197));
		
		JLabel LIndentif = new JLabel("DADOS PESSOAIS");
		LIndentif.setForeground(new Color(71,120,197));
		LIndentif.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		
		JLabel LId = new JLabel("Código");
		LId.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		
		TId = new JTextField();
		TId.setBorder(new LineBorder(new Color(71,120,197)));
		TId.setColumns(10);
		
		JLabel LNome = new JLabel("Nome");
		LNome.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		
		TNome = new JTextField();
		TNome.setBorder(new LineBorder(new Color(71,120,197)));
		TNome.setColumns(10);
		
		JLabel LRg = new JLabel("RG");
		LRg.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		
		JLabel LCpf = new JLabel("CPF");
		LCpf.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		
		TRg = new JTextField();
		TRg.setBorder(new LineBorder(new Color(71,120,197)));
		TRg.setColumns(10);
		
		TCpf = new JTextField();
		TCpf.setBorder(new LineBorder(new Color(71,120,197)));
		TCpf.setColumns(10);
		
		JSeparator separaDad = new JSeparator();
		separaDad.setForeground(new Color(71,120,197));
		
		JLabel LEndereco = new JLabel("ENDEREÇO");
		LEndereco.setForeground(new Color(71, 120, 197));
		LEndereco.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		
		JLabel LLogradouro = new JLabel("Logradouro");
		LLogradouro.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		
		TLogradouro = new JTextField();
		TLogradouro.setBorder(new LineBorder(new Color(71,120,197)));
		TLogradouro.setColumns(10);
		
		JLabel LNumero = new JLabel("Número");
		LNumero.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		
		TNumero = new JTextField();
		TNumero.setBorder(new LineBorder(new Color(71,120,197)));
		TNumero.setColumns(10);
		
		JLabel LComplemento = new JLabel("Complemento");
		LComplemento.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		
		TComplemento = new JTextField();
		TComplemento.setBorder(new LineBorder(new Color(71,120,197)));
		TComplemento.setColumns(10);
		
		JLabel LBairro = new JLabel("Bairro");
		LBairro.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		
		TBairro = new JTextField();
		TBairro.setBorder(new LineBorder(new Color(71,120,197)));
		TBairro.setColumns(10);
		
		JLabel LCidade = new JLabel("Cidade");
		LCidade.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		
		TCidade = new JTextField();
		TCidade.setBorder(new LineBorder(new Color(71,120,197)));
		TCidade.setColumns(10);
		
		JLabel LEstado = new JLabel("Estado");
		LEstado.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		
		JComboBox comboEstado = new JComboBox();
		comboEstado.setBackground(Color.WHITE);
		
		JLabel LCep = new JLabel("CEP");
		LCep.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		
		TCep = new JTextField();
		TCep.setBorder(new LineBorder(new Color(71,120,197)));
		TCep.setColumns(10);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(new Color(71, 120, 197));
		
		JLabel LContato = new JLabel("CONTATO");
		LContato.setForeground(new Color(71, 120, 197));
		LContato.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		
		JLabel LEmail = new JLabel("E-mail");
		LEmail.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		
		TEmail = new JTextField();
		TEmail.setBorder(new LineBorder(new Color(71,120,197)));
		TEmail.setColumns(10);
		
		JLabel LTelefone = new JLabel("Telefone");
		LTelefone.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		
		TTelefone = new JTextField();
		TTelefone.setBorder(new LineBorder(new Color(71,120,197)));
		TTelefone.setColumns(10);
		
		JLabel LCelular = new JLabel("Celular");
		LCelular.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		
		TCelular = new JTextField();
		TCelular.setBorder(new LineBorder(new Color(71,120,197)));
		TCelular.setColumns(10);
		
		JButton BTGravar = new JButton("Gravar");
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
				.addComponent(painelTitulo, GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addComponent(LId, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
								.addComponent(LRg, Alignment.LEADING)
								.addComponent(TRg, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
								.addComponent(LIndentif, Alignment.LEADING))
							.addGap(49))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(TId, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(TCpf, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
						.addComponent(LCpf)
						.addComponent(LNome)
						.addComponent(TNome, GroupLayout.PREFERRED_SIZE, 494, GroupLayout.PREFERRED_SIZE))
					.addGap(20))
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(separaDad, GroupLayout.DEFAULT_SIZE, 658, Short.MAX_VALUE)
					.addGap(20))
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(LEndereco, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(563, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(LLogradouro)
							.addPreferredGap(ComponentPlacement.RELATED, 597, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(TLogradouro, GroupLayout.PREFERRED_SIZE, 506, GroupLayout.PREFERRED_SIZE)
							.addGap(37)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(LNumero)
								.addComponent(TNumero, GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))))
					.addGap(20))
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(457)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(LBairro)
								.addComponent(TBairro, GroupLayout.PREFERRED_SIZE, 201, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(LComplemento)
							.addPreferredGap(ComponentPlacement.RELATED, 586, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(TComplemento, GroupLayout.PREFERRED_SIZE, 350, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 308, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(LCidade)
								.addComponent(TCidade, GroupLayout.PREFERRED_SIZE, 226, GroupLayout.PREFERRED_SIZE))
							.addGap(51)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(LEstado)
								.addComponent(comboEstado, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(LCep)
								.addComponent(TCep, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED, 1, GroupLayout.PREFERRED_SIZE)))
					.addGap(20))
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, 658, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(20, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(LContato, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 543, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(LEmail)
								.addComponent(TEmail, GroupLayout.PREFERRED_SIZE, 348, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(LTelefone)
								.addComponent(TTelefone, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(LCelular)
								.addComponent(TCelular, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(20, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(189)
					.addComponent(BTGravar, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
					.addGap(27)
					.addComponent(BTCancelar, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(242, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(painelTitulo, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(LIndentif)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(LId)
						.addComponent(LNome))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(TId, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(TNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(LRg)
						.addComponent(LCpf))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(TRg, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(TCpf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(separaDad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(LEndereco, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(LLogradouro)
						.addComponent(LNumero))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(TLogradouro, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(TNumero, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(LComplemento)
						.addComponent(LBairro))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(TComplemento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(TBairro, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(LCidade)
						.addComponent(LEstado)
						.addComponent(LCep))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(TCidade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboEstado, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(TCep, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(LContato, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(LEmail)
						.addComponent(LTelefone)
						.addComponent(LCelular))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(TEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(TTelefone, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(TCelular, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(BTGravar)
						.addComponent(BTCancelar))
					.addContainerGap(69, Short.MAX_VALUE))
		);
		
		JLabel lblIncluirDadosPaciente = new JLabel("Incluir Dados Funcionário");
		lblIncluirDadosPaciente.setForeground(Color.WHITE);
		lblIncluirDadosPaciente.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		GroupLayout gl_painelTitulo = new GroupLayout(painelTitulo);
		gl_painelTitulo.setHorizontalGroup(
			gl_painelTitulo.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_painelTitulo.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblIncluirDadosPaciente)
					.addContainerGap(531, Short.MAX_VALUE))
		);
		gl_painelTitulo.setVerticalGroup(
			gl_painelTitulo.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_painelTitulo.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(lblIncluirDadosPaciente))
		);
		painelTitulo.setLayout(gl_painelTitulo);
		panel.setLayout(gl_panel);
		getContentPane().setLayout(groupLayout);
		
	}
}
