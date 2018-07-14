package br.com.gsv.evolucao.formulario;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JScrollPane;

public class GerenciarEvolucoes extends JDialog {
		private JPanel panel = new JPanel();
		private Container tela = getContentPane();
		private JTextField TPaciente,TConvenio,TTelefone,TCelular,TEmail;
		private JLabel LHistorico,LPaciente,LConvenio,LTelefone,LCelular,LEmail;
		private JButton BTPesquisar, BTCancelar;
		private JScrollPane scrollPane;
		private JTable table;

	
	public static void main(String[] args) {
		try {
			GerenciarEvolucoes dialog = new GerenciarEvolucoes();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	public GerenciarEvolucoes() {
		setBounds(100, 100, 680, 460);
		tela.setLayout(new BorderLayout());
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		tela.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		this.setModal(true);
		this.setResizable(false);
		
		CriaComponentes();				
	}
	
	private void CriaComponentes(){
		LHistorico = new JLabel("Evolução Listas");
		LHistorico.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		LHistorico.setBounds(10, 11, 212, 25);
		panel.add(LHistorico);
		
		LPaciente = new JLabel("Paciente");
		LPaciente.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		LPaciente.setBounds(10, 59, 52, 14);
		panel.add(LPaciente);
		
		TPaciente = new JTextField();
		TPaciente.setBounds(10, 75, 400, 20);
		TPaciente.setEditable(false);
		panel.add(TPaciente);
		TPaciente.setColumns(10);
		
		LConvenio = new JLabel("Convênio");
		LConvenio.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		LConvenio.setBounds(435, 60, 59, 14);
		panel.add(LConvenio);
		
		TConvenio = new JTextField();
		TConvenio.setBounds(435, 75, 219, 20);
		TConvenio.setEditable(false);
		panel.add(TConvenio);
		TConvenio.setColumns(10);
		
		LTelefone = new JLabel("Telefone");
		LTelefone.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		LTelefone.setBounds(10, 101, 59, 14);
		panel.add(LTelefone);
		
		TTelefone = new JTextField();
		TTelefone.setColumns(10);
		TTelefone.setEditable(false);
		TTelefone.setBounds(10, 116, 150, 20);
		panel.add(TTelefone);
		
		LCelular = new JLabel("Celular");
		LCelular.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		LCelular.setBounds(170, 101, 52, 14);
		panel.add(LCelular);
		
		TCelular = new JTextField();
		TCelular.setColumns(10);
		TCelular.setEditable(false);
		TCelular.setBounds(170, 116, 150, 20);
		panel.add(TCelular);
		
		TEmail = new JTextField();
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
		
		BTPesquisar = new JButton("Pesquisar");
		BTPesquisar.setBounds(230, 388, 89, 23);
		panel.add(BTPesquisar);
		
		BTCancelar = new JButton("Voltar");
		BTCancelar.setBounds(330, 388, 89, 23);
		panel.add(BTCancelar);
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


	public JButton getBTPesquisar() {
		return BTPesquisar;
	}


	public void setBTPesquisar(JButton bTPesquisar) {
		BTPesquisar = bTPesquisar;
	}


	public JButton getBTCancelar() {
		return BTCancelar;
	}


	public void setBTCancelar(JButton bTCancelar) {
		BTCancelar = bTCancelar;
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
	
	
	
	
	
}
