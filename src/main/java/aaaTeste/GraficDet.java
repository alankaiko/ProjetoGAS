package aaaTeste;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JSeparator;
import java.awt.Font;
import javax.swing.border.LineBorder;

public class GraficDet extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			GraficDet dialog = new GraficDet();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public GraficDet() {
		setBounds(100, 100, 633, 465);
		setUndecorated(true);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(71,120,197)));
		panel.setBackground(Color.WHITE);
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 632, Short.MAX_VALUE)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 464, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		
		JLabel LIndentif = new JLabel("DADOS PESSOAIS");
		LIndentif.setForeground(new Color(71,120,197));
		LIndentif.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 16));
		
		JPanel painelTitulo = new JPanel();
		painelTitulo.setBackground(new Color(0,83,158));
		
		JLabel LId = new JLabel("Código");
		LId.setFont(new Font("Segoe UI Symbol", Font.BOLD, 16));
		
		JLabel TId = new JLabel("codego");
		TId.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		
		JLabel LCpf = new JLabel("CPF");
		LCpf.setFont(new Font("Segoe UI Symbol", Font.BOLD, 16));
		
		JLabel TCpf = new JLabel("cepef");
		TCpf.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		
		JLabel LRg = new JLabel("RG");
		LRg.setFont(new Font("Segoe UI Symbol", Font.BOLD, 16));
		
		JLabel TRg = new JLabel("REge");
		TRg.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		
		JLabel LNome = new JLabel("Nome");
		LNome.setFont(new Font("Segoe UI Symbol", Font.BOLD, 16));
		
		JLabel TNome = new JLabel("nome completo");
		TNome.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		
		JSeparator separaDad = new JSeparator();
		separaDad.setForeground(new Color(71,120,197));
		
		JLabel LEndereco = new JLabel("ENDEREÇO");
		LEndereco.setForeground(new Color(71,120,197));
		LEndereco.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 16));
		
		JLabel LLogradouro = new JLabel("Logradouro");
		LLogradouro.setFont(new Font("Segoe UI Symbol", Font.BOLD, 16));
		
		JLabel TLogradouro = new JLabel("lograd");
		TLogradouro.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		
		JLabel LComplemento = new JLabel("Complemento");
		LComplemento.setFont(new Font("Segoe UI Symbol", Font.BOLD, 14));
		
		JLabel TComplemento = new JLabel("compl");
		TComplemento.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		
		JLabel LNumero = new JLabel("Número");
		LNumero.setFont(new Font("Segoe UI Symbol", Font.BOLD, 16));
		
		JLabel TNumero = new JLabel("0");
		TNumero.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		
		JLabel LBairro = new JLabel("Bairro");
		LBairro.setFont(new Font("Segoe UI Symbol", Font.BOLD, 16));
		
		JLabel TBairro = new JLabel("New label");
		TBairro.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		
		JLabel LCidade = new JLabel("Cidade");
		LCidade.setFont(new Font("Segoe UI Symbol", Font.BOLD, 16));
		
		JLabel TCidade = new JLabel("goiani");
		TCidade.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		
		JLabel LEstado = new JLabel("Estado");
		LEstado.setFont(new Font("Segoe UI Symbol", Font.BOLD, 16));
		
		JLabel TEstado = new JLabel("esta");
		TEstado.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		
		JLabel LCep = new JLabel("CEP");
		LCep.setFont(new Font("Segoe UI Symbol", Font.BOLD, 16));
		
		JLabel TCep = new JLabel("74000");
		TCep.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		
		JSeparator separaEnd = new JSeparator();
		separaEnd.setForeground(new Color(71,120,197));
		
		JLabel LContato = new JLabel("CONTATO");
		LContato.setForeground(new Color(71,120,197));
		LContato.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 16));
		
		JLabel LEmail = new JLabel("E-mail");
		LEmail.setFont(new Font("Segoe UI Symbol", Font.BOLD, 16));
		
		JLabel TEmail = new JLabel("emeil@mgmail");
		TEmail.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		
		JLabel LCelular = new JLabel("Celular");
		LCelular.setFont(new Font("Segoe UI Symbol", Font.BOLD, 16));
		
		JLabel TCelular = new JLabel("cel");
		TCelular.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		
		JLabel LTelefone = new JLabel("Telefone");
		LTelefone.setFont(new Font("Segoe UI Symbol", Font.BOLD, 16));
		
		JLabel TTelefone = new JLabel("telte");
		TTelefone.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		
		JButton cancelar = new JButton();
		cancelar.setText("Voltar");
		cancelar.setBounds(215, 381, 84, 23);
		cancelar.setBackground(new Color(71, 120, 197));
		cancelar.setFont(new Font("Segoe UI", 0, 14));
		cancelar.setForeground(new Color(255, 255, 255));
		
		
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(20)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(LEmail)
							.addGap(18)
							.addComponent(TEmail, GroupLayout.PREFERRED_SIZE, 330, GroupLayout.PREFERRED_SIZE))
						.addComponent(LContato, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
						.addComponent(separaEnd, GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE))
					.addContainerGap())
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(painelTitulo, GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(281)
					.addComponent(cancelar)
					.addContainerGap(310, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(20)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(LId)
							.addGap(18)
							.addComponent(TId)
							.addContainerGap())
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(separaDad, GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
							.addContainerGap())
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(LEndereco)
								.addComponent(LIndentif)
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(LCpf)
										.addComponent(LNome))
									.addGap(27)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(TCpf, GroupLayout.PREFERRED_SIZE, 183, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED, 163, Short.MAX_VALUE)
											.addComponent(LRg)
											.addGap(18)
											.addComponent(TRg, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE))
										.addComponent(TNome, GroupLayout.PREFERRED_SIZE, 458, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED))
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(LNumero)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(TNumero, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_panel.createSequentialGroup()
											.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
												.addComponent(LCidade)
												.addComponent(LCep))
											.addGap(18)
											.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
												.addComponent(TCep)
												.addComponent(TCidade, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE))))
									.addGap(22)
									.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(LEstado)
											.addGap(18)
											.addComponent(TEstado, GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
											.addPreferredGap(ComponentPlacement.RELATED))
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(LBairro)
											.addPreferredGap(ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
											.addComponent(TBairro, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE))))
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
										.addComponent(LLogradouro, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(LComplemento, GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
										.addComponent(TLogradouro, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(TComplemento, GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE))))
							.addGap(25))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(LCelular)
							.addGap(18)
							.addComponent(TCelular, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
							.addGap(66)
							.addComponent(LTelefone)
							.addGap(18)
							.addComponent(TTelefone, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
							.addGap(168))))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(painelTitulo, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(LIndentif)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(LId)
						.addComponent(TId))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(LCpf)
						.addComponent(TCpf)
						.addComponent(TRg)
						.addComponent(LRg))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(LNome)
						.addComponent(TNome))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(separaDad, GroupLayout.PREFERRED_SIZE, 7, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(LEndereco)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(LLogradouro)
						.addComponent(TLogradouro))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(LComplemento)
						.addComponent(TComplemento))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(LNumero)
						.addComponent(TNumero)
						.addComponent(TBairro)
						.addComponent(LBairro))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(LCidade)
						.addComponent(TCidade)
						.addComponent(TEstado)
						.addComponent(LEstado))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(LCep)
						.addComponent(TCep))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(separaEnd, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(LContato)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(LEmail)
						.addComponent(TEmail))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(LCelular)
						.addComponent(TCelular)
						.addComponent(LTelefone)
						.addComponent(TTelefone))
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(cancelar)
					.addContainerGap())
		);
		
		JLabel lblDetalhesFuncionrio = new JLabel("Detalhes Funcionário");
		lblDetalhesFuncionrio.setForeground(Color.WHITE);
		lblDetalhesFuncionrio.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		GroupLayout gl_painelTitulo = new GroupLayout(painelTitulo);
		gl_painelTitulo.setHorizontalGroup(
			gl_painelTitulo.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_painelTitulo.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblDetalhesFuncionrio)
					.addContainerGap(494, Short.MAX_VALUE))
		);
		gl_painelTitulo.setVerticalGroup(
			gl_painelTitulo.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_painelTitulo.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblDetalhesFuncionrio)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		painelTitulo.setLayout(gl_painelTitulo);
		panel.setLayout(gl_panel);
		getContentPane().setLayout(groupLayout);
		
	}
}
