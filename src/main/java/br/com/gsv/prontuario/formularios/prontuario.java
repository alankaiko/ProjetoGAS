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
import javax.swing.JLayeredPane;
import javax.swing.JTextPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class prontuario extends JDialog {

	private JPanel panel = new JPanel();
	private JTextField TPaciente, TCodigo, TRg, TCpf, TDataNasc, TDataCad;
	private JLabel LProntuario, LPaciente, LPesquisar, LCodigo, LRg, LCpf,  LDataNasc, LDataCad;
	private JButton BTGravar, BTCancelar;
	private JTabbedPane tabGeral;
	private JLayeredPane dadosCliente, layeredPane;
	private JLayeredPane dadosPrescricao;
	private JLayeredPane layeredPane_1;

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
		TPaciente.setBounds(60, 52, 378, 20);
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
		LDataNasc.setBounds(10, 126, 74, 14);
		dadosCliente.add(LDataNasc);
		
		TDataNasc = new JTextField();
		TDataNasc.setBorder(new LineBorder(Color.BLACK));
		TDataNasc.setBounds(70, 123, 101, 20);
		TDataNasc.setEditable(false);
		dadosCliente.add(TDataNasc);
		TDataNasc.setColumns(10);
		
		LDataCad = new JLabel("Data Cadastro ");
		LDataCad.setBounds(254, 21, 80, 14);
		dadosCliente.add(LDataCad);
		
		TDataCad = new JTextField();
		TDataCad.setBorder(new LineBorder(Color.BLACK));
		TDataCad.setColumns(10);
		TDataCad.setEditable(false);
		TDataCad.setBounds(352, 18, 86, 20);
		dadosCliente.add(TDataCad);		
		
		dadosPrescricao = new JLayeredPane();
		tabGeral.addTab("Prescrição Médica", null, dadosPrescricao, null);
		
		layeredPane_1 = new JLayeredPane();
		tabGeral.addTab("Histórico de Admissao", null, layeredPane_1, null);
	}
	
}
