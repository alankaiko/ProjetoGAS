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
import javax.swing.JSeparator;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.LineBorder;

public class detalheFuncionarioGrafico extends JDialog {
	private JPanel panel = new JPanel();
	private Container tela = getContentPane();

	
	public static void main(String[] args) {
		try {
			detalheFuncionarioGrafico dialog = new detalheFuncionarioGrafico();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	public detalheFuncionarioGrafico() {
		this.setBounds(100, 100, 650, 460);
		tela.setLayout(null);
		this.setUndecorated(true);
		panel.setBorder(new LineBorder(new Color(71,120,197)));
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 650, 460);
		tela.add(panel);
		
		JPanel painelTitulo = new JPanel();
		painelTitulo.setBounds(1, 1, 650, 24);
		painelTitulo.setBackground(new Color(20, 34, 56));
		
		JLabel LFechar = new JLabel();
		LFechar.setIcon(new ImageIcon(detalheFuncionarioGrafico.class.getResource("/imagens/icons8-não-22.png")));
		
		JLabel Titulo = new JLabel("Dados do Paciente");
		Titulo.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		Titulo.setForeground(Color.WHITE);
		GroupLayout gl_painelTitulo = new GroupLayout(painelTitulo);
		gl_painelTitulo.setHorizontalGroup(
			gl_painelTitulo.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_painelTitulo.createSequentialGroup()
					.addContainerGap()
					.addComponent(Titulo, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 485, Short.MAX_VALUE)
					.addComponent(LFechar, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
		);
		gl_painelTitulo.setVerticalGroup(
			gl_painelTitulo.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_painelTitulo.createSequentialGroup()
					.addComponent(Titulo, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
					.addGap(11))
				.addGroup(Alignment.LEADING, gl_painelTitulo.createSequentialGroup()
					.addComponent(LFechar, GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
					.addContainerGap())
		);
		painelTitulo.setLayout(gl_painelTitulo);
		
		JLabel LDados = new JLabel("DADOS PESSOAIS");
		LDados.setBounds(11, 31, 140, 18);
		LDados.setForeground(new Color(71, 120, 197));
		LDados.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		
		JLabel LCodigo = new JLabel("Código");
		LCodigo.setBounds(11, 55, 44, 20);
		LCodigo.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));;
		
		JLabel LNome = new JLabel("Nome");
		LNome.setBounds(118, 55, 89, 20);
		LNome.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		
		JButton BCancelar = new JButton("Cancelar");
		BCancelar.setBounds(272, 430, 97, 22);
		BCancelar.setForeground(Color.WHITE);
		BCancelar.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		BCancelar.setBackground(new Color(71, 120, 197));
		
		JLabel TCodigo = new JLabel("tcodigo");
		TCodigo.setBounds(11, 81, 72, 20);
		TCodigo.setBorder(null);
		TCodigo.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		
		JLabel TNome = new JLabel("New label");
		TNome.setBounds(118, 81, 380, 20);
		TNome.setBorder(null);
		TNome.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		
		JLabel LCpf = new JLabel("CPF");
		LCpf.setBounds(118, 107, 45, 20);
		LCpf.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		
		JLabel TCPf = new JLabel("New label");
		TCPf.setBounds(118, 133, 193, 20);
		TCPf.setBorder(null);
		TCPf.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		
		JLabel LRg = new JLabel("RG");
		LRg.setBounds(11, 107, 35, 20);
		LRg.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		
		JLabel TRg = new JLabel("New label");
		TRg.setBounds(11, 133, 79, 20);
		TRg.setBorder(new LineBorder(Color.BLUE));
		TRg.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		
		JSeparator separa = new JSeparator();
		separa.setBounds(11, 190, 630, 2);
		separa.setBackground(new Color(71, 120, 197));
		
		JLabel LDatacad = new JLabel("Data Cadastro");
		LDatacad.setBounds(428, 29, 89, 20);
		LDatacad.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		
		JLabel LEndereco = new JLabel("ENDEREÇO");
		LEndereco.setBounds(11, 195, 140, 18);
		LEndereco.setForeground(new Color(71, 120, 197));
		LEndereco.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		
		JLabel LLogradouro = new JLabel("Logradouro");
		LLogradouro.setBounds(11, 212, 93, 20);
		LLogradouro.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		
		JLabel LComplemento = new JLabel("Complemento");
		LComplemento.setBounds(11, 259, 103, 20);
		LComplemento.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		
		JLabel TLogradouro = new JLabel("eitah");
		TLogradouro.setBounds(11, 230, 358, 18);
		TLogradouro.setBorder(null);
		TLogradouro.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		
		JLabel TComplemento = new JLabel("Nvixi");
		TComplemento.setBounds(11, 277, 358, 18);
		TComplemento.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		
		JLabel Lnumero = new JLabel("Número");
		Lnumero.setBounds(580, 212, 61, 20);
		Lnumero.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		
		JLabel LCidade = new JLabel("Cidade");
		LCidade.setBounds(407, 259, 64, 20);
		LCidade.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		
		JLabel TNumero = new JLabel("New la");
		TNumero.setBounds(580, 230, 61, 18);
		TNumero.setBorder(null);
		TNumero.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		
		JLabel TCidade = new JLabel("New label");
		TCidade.setBounds(407, 277, 234, 18);
		TCidade.setBorder(null);
		TCidade.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		
		JLabel Lbairro = new JLabel("Bairro");
		Lbairro.setBounds(407, 212, 50, 20);
		Lbairro.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		
		JLabel TBairro = new JLabel("TBairro");
		TBairro.setBounds(407, 230, 155, 18);
		TBairro.setBorder(null);
		TBairro.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		
		JSeparator separator = new JSeparator();
		separator.setBounds(11, 342, 630, 2);
		separator.setBackground(new Color(71, 120, 197));
		
		JLabel LContato = new JLabel("CONTATO");
		LContato.setBounds(11, 350, 96, 18);
		LContato.setForeground(new Color(71, 120, 197));
		LContato.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		
		JLabel LEmail = new JLabel("E-mail");
		LEmail.setBounds(11, 368, 69, 20);
		LEmail.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		
		JLabel Tdatacad = new JLabel("New label");
		Tdatacad.setBounds(527, 30, 114, 20);
		Tdatacad.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		Tdatacad.setBorder(null);
		
		JLabel LDatanasc = new JLabel("Data nasc");
		LDatanasc.setBounds(552, 55, 89, 20);
		LDatanasc.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		
		JLabel TDAtanasc = new JLabel("New label");
		TDAtanasc.setBounds(552, 81, 89, 20);
		TDAtanasc.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		TDAtanasc.setBorder(null);
		
		JLabel LConvenio = new JLabel("Convênio");
		LConvenio.setBounds(344, 164, 72, 20);
		LConvenio.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		
		JLabel Tconvenio = new JLabel("New label");
		Tconvenio.setBounds(407, 165, 234, 20);
		Tconvenio.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		Tconvenio.setBorder(null);
		
		JLabel LObservacao = new JLabel("Observação");
		LObservacao.setBounds(344, 112, 87, 20);
		LObservacao.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		
		JLabel TObservao = new JLabel("New label");
		TObservao.setBounds(344, 133, 297, 20);
		TObservao.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		TObservao.setBorder(null);
		
		JLabel TEmail = new JLabel("eitah");
		TEmail.setBounds(11, 387, 265, 18);
		TEmail.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		TEmail.setBorder(null);
		
		JLabel LTelefone = new JLabel("Telefone");
		LTelefone.setBounds(286, 368, 69, 20);
		LTelefone.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		
		JLabel TTelefone = new JLabel("New label");
		TTelefone.setBounds(286, 386, 97, 20);
		TTelefone.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		TTelefone.setBorder(null);
		
		JLabel LCelular = new JLabel("Celular");
		LCelular.setBounds(402, 368, 69, 20);
		LCelular.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		
		JLabel TCelular = new JLabel("New label");
		TCelular.setBounds(402, 386, 97, 20);
		TCelular.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		TCelular.setBorder(null);
		
		panel.setLayout(null);
		panel.add(LDados);
		panel.add(painelTitulo);
		panel.add(TCodigo);
		panel.add(TRg);
		panel.add(LCodigo);
		panel.add(LNome);
		panel.add(TNome);
		panel.add(LCpf);
		panel.add(TCPf);
		panel.add(LRg);
		panel.add(LDatacad);
		panel.add(Tdatacad);
		panel.add(LDatanasc);
		panel.add(Tconvenio);
		panel.add(LConvenio);
		panel.add(LObservacao);
		panel.add(TDAtanasc);
		panel.add(TObservao);
		panel.add(LEndereco);
		panel.add(separa);
		panel.add(TLogradouro);
		panel.add(LComplemento);
		panel.add(TComplemento);
		panel.add(LLogradouro);
		panel.add(Lbairro);
		panel.add(Lnumero);
		panel.add(TBairro);
		panel.add(TNumero);
		panel.add(LCidade);
		panel.add(TCidade);
		panel.add(TEmail);
		panel.add(LEmail);
		panel.add(TTelefone);
		panel.add(LTelefone);
		panel.add(TCelular);
		panel.add(LCelular);
		panel.add(LContato);
		panel.add(BCancelar);
		panel.add(separator);
		
		JLabel LCep = new JLabel("CEP");
		LCep.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		LCep.setBounds(11, 299, 50, 20);
		panel.add(LCep);
		
		JLabel TCep = new JLabel("New label");
		TCep.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		TCep.setBorder(null);
		TCep.setBounds(11, 319, 89, 18);
		panel.add(TCep);
		
		JLabel LUF = new JLabel("UF");
		LUF.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		LUF.setBounds(218, 304, 50, 20);
		panel.add(LUF);
		
		JLabel TUf = new JLabel("New label");
		TUf.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		TUf.setBorder(null);
		TUf.setBounds(218, 322, 151, 18);
		panel.add(TUf);
		
	}
}
