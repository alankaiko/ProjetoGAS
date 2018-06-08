package br.com.gsv.agenda.formulario;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

import br.com.gsv.agenda.listeners.GerenciarAgendaListener;
import com.toedter.calendar.JCalendar;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class GerenciarAgenda extends JDialog {

	private JPanel panel = new JPanel();
	private Container tela = getContentPane();
	private JScrollPane scrollPane;
	private JTable table;
	private GerenciarAgendaListener listener;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	
	public static void main(String[] args) {
		try {
			GerenciarAgenda dialog = new GerenciarAgenda();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public GerenciarAgenda() {
		setBounds(100, 100, 621, 423);
		tela.setLayout(new BorderLayout());
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		tela.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 373, 363);
		panel.add(scrollPane);
		
		JCalendar calendar = new JCalendar();
		calendar.setBounds(393, 11, 205, 153);
		panel.add(calendar);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(393, 351, 100, 23);
		panel.add(btnBuscar);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(498, 351, 100, 23);
		panel.add(btnVoltar);
		
		textField = new JTextField();
		textField.setBounds(393, 198, 205, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(393, 185, 46, 14);
		panel.add(lblNome);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setBounds(393, 229, 46, 14);
		panel.add(lblCpf);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(393, 242, 205, 20);
		panel.add(textField_1);
		
		JLabel lblRg = new JLabel("RG");
		lblRg.setBounds(393, 273, 46, 14);
		panel.add(lblRg);
		
		textField_2 = new JTextField();
		textField_2.setBounds(393, 286, 205, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		table = new JTable();
		
		listener = new GerenciarAgendaListener(this);
	}

	public JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}

	public Container getTela() {
		return tela;
	}

	public void setTela(Container tela) {
		this.tela = tela;
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

	public GerenciarAgendaListener getListener() {
		return listener;
	}

	public void setListener(GerenciarAgendaListener listener) {
		this.listener = listener;
	}
}
