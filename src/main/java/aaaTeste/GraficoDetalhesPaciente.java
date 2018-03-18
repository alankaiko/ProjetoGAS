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

public class GraficoDetalhesPaciente extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			GraficoDetalhesPaciente dialog = new GraficoDetalhesPaciente();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public GraficoDetalhesPaciente() {
		setBounds(100, 100, 680, 505);
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
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		JPanel painelTitulo = new JPanel();
		painelTitulo.setBackground(new Color(71,120,197));
		
		JLabel LIndentif = new JLabel("DADOS PESSOAIS");
		LIndentif.setForeground(new Color(71,120,197));
		LIndentif.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		
		JLabel LId = new JLabel("Código");
		LId.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		
		JLabel LNome = new JLabel("Nome");
		LNome.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		
		JLabel LDataCad = new JLabel("Data Cadastro");
		LDataCad.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		
		JLabel LRg = new JLabel("RG");
		LRg.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		
		JLabel LCpf = new JLabel("CPF");
		LCpf.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		
		JLabel LDataNasc = new JLabel("Data Nasc.");
		LDataNasc.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		
		JLabel LConvenio = new JLabel("Convênio / Plano");
		LConvenio.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		
		JSeparator separaDad = new JSeparator();
		separaDad.setForeground(new Color(71,120,197));
		
		JLabel LEndereco = new JLabel("ENDEREÇO");
		LEndereco.setForeground(new Color(71, 120, 197));
		LEndereco.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		
		JLabel LLogradouro = new JLabel("Logradouro");
		LLogradouro.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		
		JLabel LNumero = new JLabel("Número");
		LNumero.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		
		JLabel LComplemento = new JLabel("Complemento");
		LComplemento.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		
		JLabel LBairro = new JLabel("Bairro");
		LBairro.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		
		JLabel LCidade = new JLabel("Cidade");
		LCidade.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		
		JLabel LEstado = new JLabel("Estado");
		LEstado.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		
		JLabel LCep = new JLabel("CEP");
		LCep.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(new Color(71, 120, 197));
		
		JLabel LContato = new JLabel("CONTATO");
		LContato.setForeground(new Color(71, 120, 197));
		LContato.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		
		JLabel LObservacao = new JLabel("Observação");
		LObservacao.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		
		JLabel LEmail = new JLabel("E-mail");
		LEmail.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		
		JLabel LTelefone = new JLabel("Telefone");
		LTelefone.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		
		JLabel LCelular = new JLabel("Celular");
		LCelular.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		
		JButton BTCancelar = new JButton("Cancelar");
		BTCancelar.setBounds(215, 381, 84, 23);
		BTCancelar.setBackground(new Color(71, 120, 197));
		BTCancelar.setFont(new Font("Segoe UI", 0, 14));
		BTCancelar.setForeground(new Color(255, 255, 255));
		
		JLabel TCopnvenio = new JLabel("ComboConvenio");
		TCopnvenio.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		
		JLabel TId = new JLabel("Codego");
		TId.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		
		JLabel TNome = new JLabel("nome completo");
		TNome.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		
		JLabel TDataCad = new JLabel("data de cad");
		TDataCad.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		
		JLabel Trg = new JLabel("errege");
		Trg.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		
		JLabel tcpf = new JLabel("cepe efe");
		tcpf.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		
		JLabel Tdatanasc = new JLabel("data de nasci");
		Tdatanasc.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		
		JLabel TObserva = new JLabel("Obe servacao");
		TObserva.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		
		JLabel TLogradou = new JLabel("logra douro");
		TLogradou.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		
		JLabel TNumero = new JLabel("namber");
		TNumero.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		
		JLabel TComplemento = new JLabel("com plem ento");
		TComplemento.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		
		JLabel TCidade = new JLabel("goia nia");
		TCidade.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		
		JLabel TEstado = new JLabel("es tago goias");
		TEstado.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		
		JLabel TCep = new JLabel("74000000");
		TCep.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		
		JLabel TEmail = new JLabel("e maiol");
		TEmail.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		
		JLabel TTlefone = new JLabel("9999999");
		TTlefone.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		
		JLabel TCelular = new JLabel("555555");
		TCelular.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		
		JLabel TBAirro = new JLabel("vila santa centro");
		TBAirro.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(painelTitulo, GroupLayout.DEFAULT_SIZE, 678, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(LConvenio)
					.addContainerGap(577, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(LEndereco, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(553, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(LLogradouro)
					.addContainerGap(606, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(separaDad, GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(LId, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
								.addComponent(LRg)
								.addComponent(LIndentif)
								.addComponent(TId)
								.addComponent(Trg, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(LCpf)
								.addComponent(LNome)
								.addComponent(TNome, GroupLayout.PREFERRED_SIZE, 327, GroupLayout.PREFERRED_SIZE)
								.addComponent(tcpf, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE))
							.addGap(52)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(Tdatanasc, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
									.addComponent(LDataNasc)
									.addComponent(LDataCad, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(TDataCad, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(TLogradou, GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
							.addGap(64)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(LNumero)
								.addComponent(TNumero, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(TCopnvenio, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)
							.addGap(105)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(LObservacao)
									.addPreferredGap(ComponentPlacement.RELATED, 300, Short.MAX_VALUE))
								.addComponent(TObserva, GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(TComplemento, GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
							.addGap(71)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(LBairro)
								.addComponent(TBAirro, GroupLayout.PREFERRED_SIZE, 189, GroupLayout.PREFERRED_SIZE))))
					.addGap(20))
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(LComplemento)
					.addContainerGap(592, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(LCidade)
						.addComponent(TCidade, GroupLayout.PREFERRED_SIZE, 201, GroupLayout.PREFERRED_SIZE))
					.addGap(67)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(LEstado)
						.addComponent(TEstado, GroupLayout.PREFERRED_SIZE, 184, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(LCep)
						.addComponent(TCep, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(14, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, 658, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(LContato, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(553, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(LEmail)
						.addComponent(TEmail, GroupLayout.PREFERRED_SIZE, 315, GroupLayout.PREFERRED_SIZE))
					.addGap(36)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(LTelefone)
							.addGap(109))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(TTlefone, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
							.addGap(27)))
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(LCelular)
							.addGap(113))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(TCelular, GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
							.addContainerGap())))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(274)
					.addComponent(BTCancelar, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(294, Short.MAX_VALUE))
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
						.addComponent(LDataCad)
						.addComponent(LNome))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(TId)
						.addComponent(TNome)
						.addComponent(TDataCad))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(LDataNasc)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
							.addComponent(LRg)
							.addComponent(LCpf)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(Trg)
								.addComponent(tcpf))
							.addGap(13)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(LConvenio)
								.addComponent(LObservacao)))
						.addComponent(Tdatanasc))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(TCopnvenio)
						.addComponent(TObserva))
					.addGap(8)
					.addComponent(separaDad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(LEndereco, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(LLogradouro)
						.addComponent(LNumero))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(TLogradou)
						.addComponent(TNumero))
					.addGap(8)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(LComplemento)
						.addComponent(LBairro))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(TComplemento)
						.addComponent(TBAirro))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(LCidade)
						.addComponent(LEstado)
						.addComponent(LCep))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(TCidade)
						.addComponent(TEstado)
						.addComponent(TCep))
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
						.addComponent(TEmail)
						.addComponent(TTlefone)
						.addComponent(TCelular))
					.addPreferredGap(ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
					.addComponent(BTCancelar)
					.addContainerGap())
		);
		
		JLabel lblIncluirDadosPaciente = new JLabel("Incluir Dados Paciente");
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
