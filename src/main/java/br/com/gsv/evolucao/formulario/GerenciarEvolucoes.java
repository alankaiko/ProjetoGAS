package br.com.gsv.evolucao.formulario;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import br.com.gsv.evolucao.listeners.GerenciarEvolucaoListener;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class GerenciarEvolucoes extends JDialog {
		private JPanel panel = new JPanel();
		private Container tela = getContentPane();
		private JTextField TPaciente,TConvenio,TTelefone,TCelular,TEmail;
		private JLabel LHistorico,LPaciente,LConvenio,LTelefone,LCelular,LEmail;
		private JButton BTCancelar, BTAdicionar, BTAlterar;
		private JScrollPane scrollPane;
		private JTable table;
		private GerenciarEvolucaoListener listener;
	

	
	public GerenciarEvolucoes() {
		setBounds(100, 100, 680, 460);
		tela.setLayout(new BorderLayout());
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		tela.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		this.setModal(true);
		this.setResizable(false);
		
		this.table = new JTable();
		this.scrollPane = new JScrollPane();
		
		CriaComponentes();		
		listener = new GerenciarEvolucaoListener(this);
	}
	
	private void CriaComponentes(){
		LHistorico = new JLabel("Evolução Listas Por Cliente");
		LHistorico.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		LHistorico.setBounds(10, 11, 274, 25);
		panel.add(LHistorico);
		
		LPaciente = new JLabel("Paciente");
		LPaciente.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		LPaciente.setBounds(10, 59, 52, 14);
		panel.add(LPaciente);
		
		TPaciente = new JTextField();
		TPaciente.setBackground(Color.WHITE);
		TPaciente.setBorder(new LineBorder(Color.BLACK));
		TPaciente.setBounds(10, 75, 400, 20);
		TPaciente.setEditable(false);
		panel.add(TPaciente);
		TPaciente.setColumns(10);
		
		LConvenio = new JLabel("Convênio");
		LConvenio.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		LConvenio.setBounds(435, 60, 59, 14);
		panel.add(LConvenio);
		
		TConvenio = new JTextField();
		TConvenio.setBackground(Color.WHITE);
		TConvenio.setBorder(new LineBorder(Color.BLACK));
		TConvenio.setBounds(435, 75, 219, 20);
		TConvenio.setEditable(false);
		panel.add(TConvenio);
		TConvenio.setColumns(10);
		
		LTelefone = new JLabel("Telefone");
		LTelefone.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		LTelefone.setBounds(10, 101, 59, 14);
		panel.add(LTelefone);
		
		TTelefone = new JTextField();
		TTelefone.setBackground(Color.WHITE);
		TTelefone.setBorder(new LineBorder(Color.BLACK));
		TTelefone.setColumns(10);
		TTelefone.setEditable(false);
		TTelefone.setBounds(10, 116, 150, 20);
		panel.add(TTelefone);
		
		LCelular = new JLabel("Celular");
		LCelular.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		LCelular.setBounds(170, 101, 52, 14);
		panel.add(LCelular);
		
		TCelular = new JTextField();
		TCelular.setBackground(Color.WHITE);
		TCelular.setBorder(new LineBorder(Color.BLACK));
		TCelular.setColumns(10);
		TCelular.setEditable(false);
		TCelular.setBounds(170, 116, 150, 20);
		panel.add(TCelular);
		
		TEmail = new JTextField();
		TEmail.setBackground(Color.WHITE);
		TEmail.setBorder(new LineBorder(Color.BLACK));
		TEmail.setColumns(10);
		TEmail.setEditable(false);
		TEmail.setBounds(330, 116, 324, 20);
		panel.add(TEmail);
		
		LEmail = new JLabel("Email");
		LEmail.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		LEmail.setBounds(330, 101, 39, 14);
		panel.add(LEmail);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 147, 644, 220);
		panel.add(scrollPane);
		
		BTCancelar = new JButton("Voltar");
		BTCancelar.setBounds(559, 388, 95, 23);
		panel.add(BTCancelar);
		
		BTAdicionar = new JButton("Adicionar");
		BTAdicionar.setBounds(349, 388, 95, 23);
		panel.add(BTAdicionar);
		
		BTAlterar = new JButton("Alterar");
		BTAlterar.setBounds(454, 388, 95, 23);
		panel.add(BTAlterar);
	}


	public Container getTela() {
		return tela;
	}


	public void setTela(Container tela) {
		this.tela = tela;
	}


	public JTextField getTPaciente() {
		return TPaciente;
	}


	public void setTPaciente(JTextField tPaciente) {
		TPaciente = tPaciente;
	}


	public JTextField getTConvenio() {
		return TConvenio;
	}


	public void setTConvenio(JTextField tConvenio) {
		TConvenio = tConvenio;
	}


	public JTextField getTTelefone() {
		return TTelefone;
	}


	public void setTTelefone(JTextField tTelefone) {
		TTelefone = tTelefone;
	}


	public JTextField getTCelular() {
		return TCelular;
	}


	public void setTCelular(JTextField tCelular) {
		TCelular = tCelular;
	}


	public JTextField getTEmail() {
		return TEmail;
	}


	public void setTEmail(JTextField tEmail) {
		TEmail = tEmail;
	}


	public JButton getBTCancelar() {
		return BTCancelar;
	}


	public void setBTCancelar(JButton bTCancelar) {
		BTCancelar = bTCancelar;
	}


	public JButton getBTAdicionar() {
		return BTAdicionar;
	}


	public void setBTAdicionar(JButton bTAdicionar) {
		BTAdicionar = bTAdicionar;
	}


	public JButton getBTAlterar() {
		return BTAlterar;
	}


	public void setBTAlterar(JButton bTAlterar) {
		BTAlterar = bTAlterar;
	}


	public JScrollPane getScrollPane() {
		return scrollPane;
	}


	public void setScrollPane(JScrollPane scrollPane) {
		this.scrollPane = scrollPane;
	}


	public JTable getTable() {
		return table;
	}


	public void setTable(JTable table) {
		this.table = table;
	}


	public GerenciarEvolucaoListener getListener() {
		return listener;
	}


	public void setListener(GerenciarEvolucaoListener listener) {
		this.listener = listener;
	}
	
	
	
	
	
}
