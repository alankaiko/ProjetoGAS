package br.com.gsv.prontuario.formularios;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTabbedPane;

import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.JLayeredPane;
import javax.swing.JTextPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextArea;

public class prontuario extends JDialog {

	private JPanel panel = new JPanel();
	private JTextField TPaciente, TCodigo, TRg, TCpf, TDataNasc, TDataCad;
	private JLabel LProntuario, LPaciente, LPesquisar, LCodigo, LRg, LCpf,  LDataNasc, LDataCad;
	private JButton BTGravar, BTCancelar;
	private JTabbedPane tabGeral;
	private JLayeredPane dadosCliente, layeredPane;
	private JLayeredPane dadosPrescricao;
	private JLayeredPane layeredPane_1;
	private JRadioButton radioAlerta, radioLetargico, radioObnubilado, radioComatoso, radioAgitado;
	private JRadioButton radioTorporoso, radioCalmo,radioApatico, radioAlegre, radioTriste;
	private ButtonGroup grupoBotao1 = new ButtonGroup();
	private ButtonGroup grupoBotao2 = new ButtonGroup();
	private JSeparator separator;

	public static void main(String[] args) {
		try {
			prontuario dialog = new prontuario();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public prontuario() {
		setBounds(100, 100, 650, 460);
		getContentPane().setLayout(new BorderLayout());
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		BTGravar = new JButton("Gravar");
		BTGravar.setBounds(211, 387, 89, 23);
		panel.add(BTGravar);
		
		BTCancelar = new JButton("Cancelar");
		BTCancelar.setBounds(310, 387, 89, 23);
		panel.add(BTCancelar);
		
		tabGeral = new JTabbedPane(JTabbedPane.TOP);
		tabGeral.setBounds(15, 34, 609, 342);
		panel.add(tabGeral);
		
		
		TabCliente();
		dadosAnotacao();
	}
	
	private void TabCliente(){
		LProntuario = new JLabel("Prontuário");
		LProntuario.setBounds(5, 5, 75, 18);
		LProntuario.setFont(new Font("Arial", Font.BOLD, 15));
		panel.add(LProntuario);
		
		dadosCliente = new JLayeredPane();
		tabGeral.addTab("Dados Cliente", null, dadosCliente, null);
		dadosCliente.setLayout(null);
		
		LPaciente = new JLabel("Paciente");
		LPaciente.setBounds(10, 55, 55, 14);
		dadosCliente.add(LPaciente);
		
		LPesquisar = new JLabel("Pesquisar");
		LPesquisar.setIcon(new ImageIcon(prontuario.class.getResource("/imagens/icons8-pesquisar-15.png")));
		LPesquisar.setBounds(460, 55, 101, 14);
		dadosCliente.add(LPesquisar);
		
		TPaciente = new JTextField();
		TPaciente.setBorder(new LineBorder(Color.BLACK));
		TPaciente.setBounds(62, 52, 376, 20);
		TPaciente.setEditable(false);
		dadosCliente.add(TPaciente);
		TPaciente.setColumns(10);
		
		LCodigo = new JLabel("Código");
		LCodigo.setBounds(10, 21, 46, 14);
		dadosCliente.add(LCodigo);
		
		TCodigo = new JTextField();
		TCodigo.setBorder(new LineBorder(Color.BLACK));
		TCodigo.setBounds(60, 18, 110, 20);
		TCodigo.setEditable(false);
		dadosCliente.add(TCodigo);
		TCodigo.setColumns(10);
		
		LRg = new JLabel("RG");
		LRg.setBounds(10, 87, 46, 14);
		dadosCliente.add(LRg);
		
		TRg = new JTextField();
		TRg.setBorder(new LineBorder(Color.BLACK));
		TRg.setBounds(60, 84, 110, 20);
		TRg.setEditable(false);
		dadosCliente.add(TRg);
		TRg.setColumns(10);
		
		LCpf = new JLabel("CPF");
		LCpf.setBounds(227, 87, 46, 14);
		dadosCliente.add(LCpf);
		
		TCpf = new JTextField();
		TCpf.setBorder(new LineBorder(Color.BLACK));
		TCpf.setBounds(283, 84, 155, 20);
		TCpf.setEditable(false);
		dadosCliente.add(TCpf);
		TCpf.setColumns(10);
		
		LDataNasc = new JLabel("Data Nasc.");
		LDataNasc.setBounds(10, 126, 67, 14);
		dadosCliente.add(LDataNasc);
		
		TDataNasc = new JTextField();
		TDataNasc.setBorder(new LineBorder(Color.BLACK));
		TDataNasc.setBounds(87, 123, 101, 20);
		TDataNasc.setEditable(false);
		dadosCliente.add(TDataNasc);
		TDataNasc.setColumns(10);
		
		LDataCad = new JLabel("Data Cadastro ");
		LDataCad.setBounds(238, 21, 89, 14);
		dadosCliente.add(LDataCad);
		
		TDataCad = new JTextField();
		TDataCad.setBorder(new LineBorder(Color.BLACK));
		TDataCad.setColumns(10);
		TDataCad.setEditable(false);
		TDataCad.setBounds(337, 18, 101, 20);
		dadosCliente.add(TDataCad);		
		dadosPrescricao = new JLayeredPane();
		tabGeral.addTab("Anotação", null, dadosPrescricao, null);
		
		radioAlerta = new JRadioButton("Alerta");
		radioAlerta.setFont(new Font("Arial", Font.PLAIN, 13));
		radioAlerta.setBackground(Color.WHITE);
		radioAlerta.setBounds(17, 39, 70, 23);
		dadosPrescricao.add(radioAlerta);
		
		radioLetargico = new JRadioButton("Letárgico");
		radioLetargico.setFont(new Font("Arial", Font.PLAIN, 13));
		radioLetargico.setBackground(Color.WHITE);
		radioLetargico.setBounds(100, 39, 81, 23);
		dadosPrescricao.add(radioLetargico);
		
		radioObnubilado = new JRadioButton("Obnubilado");
		radioObnubilado.setFont(new Font("Arial", Font.PLAIN, 13));
		radioObnubilado.setBackground(Color.WHITE);
		radioObnubilado.setBounds(183, 39, 98, 23);
		dadosPrescricao.add(radioObnubilado);
		
		radioTorporoso = new JRadioButton("Torporoso");
		radioTorporoso.setFont(new Font("Arial", Font.PLAIN, 13));
		radioTorporoso.setBackground(Color.WHITE);
		radioTorporoso.setBounds(283, 39, 85, 23);
		dadosPrescricao.add(radioTorporoso);
		
		radioComatoso = new JRadioButton("Comatoso");
		radioComatoso.setFont(new Font("Arial", Font.PLAIN, 13));
		radioComatoso.setBackground(Color.WHITE);
		radioComatoso.setBounds(370, 39, 109, 23);
		dadosPrescricao.add(radioComatoso);
		
		grupoBotao1.add(radioAlerta);
		grupoBotao1.add(radioLetargico);
		grupoBotao1.add(radioObnubilado);
		grupoBotao1.add(radioTorporoso);
		grupoBotao1.add(radioComatoso);
		
		separator = new JSeparator();
		separator.setBounds(17, 106, 577, 2);
		dadosPrescricao.add(separator);
		
		
	}
	
	private void dadosAnotacao(){
		radioCalmo = new JRadioButton("Calmo");
		radioCalmo.setFont(new Font("Arial", Font.PLAIN, 13));
		radioCalmo.setBackground(Color.WHITE);
		radioCalmo.setBounds(17, 115, 70, 23);
		dadosPrescricao.add(radioCalmo);
		
		radioApatico = new JRadioButton("Apático");
		radioApatico.setFont(new Font("Arial", Font.PLAIN, 13));
		radioApatico.setBackground(Color.WHITE);
		radioApatico.setBounds(100, 115, 81, 23);
		dadosPrescricao.add(radioApatico);
		
		radioAlegre = new JRadioButton("Alegre");
		radioAlegre.setFont(new Font("Arial", Font.PLAIN, 13));
		radioAlegre.setBackground(Color.WHITE);
		radioAlegre.setBounds(183, 115, 98, 23);
		dadosPrescricao.add(radioAlegre);
		
		radioTriste = new JRadioButton("Triste");
		radioTriste.setFont(new Font("Arial", Font.PLAIN, 13));
		radioTriste.setBackground(Color.WHITE);
		radioTriste.setBounds(283, 115, 85, 23);
		dadosPrescricao.add(radioTriste);
		
		radioAgitado = new JRadioButton("Agitado");
		radioAgitado.setFont(new Font("Arial", Font.PLAIN, 13));
		radioAgitado.setBackground(Color.WHITE);
		radioAgitado.setBounds(370, 115, 109, 23);
		dadosPrescricao.add(radioAgitado);
		
		JLabel LObservacao = new JLabel("Observação");
		LObservacao.setFont(new Font("Arial", Font.PLAIN, 13));
		LObservacao.setBounds(17, 168, 83, 14);
		dadosPrescricao.add(LObservacao);
		
		JTextArea textArea = new JTextArea();
		textArea.setBorder(new LineBorder(Color.BLACK));
		textArea.setRows(7);
		textArea.setBounds(17, 193, 431, 110);
		dadosPrescricao.add(textArea);
		
		grupoBotao2.add(radioCalmo);
		grupoBotao2.add(radioApatico);
		grupoBotao2.add(radioAlegre);
		grupoBotao2.add(radioTriste);
		grupoBotao2.add(radioAgitado);
		
	}
}
