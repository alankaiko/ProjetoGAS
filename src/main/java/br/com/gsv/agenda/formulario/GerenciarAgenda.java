package br.com.gsv.agenda.formulario;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

import br.com.gsv.agenda.listeners.GerenciarAgendaListener;

public class GerenciarAgenda extends JDialog {

	private JPanel panel = new JPanel();
	private Container tela = getContentPane();
	private JScrollPane scrollPane;
	private JTable table;
	private GerenciarAgendaListener listener;
	
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
		listener = new GerenciarAgendaListener(this);
		setBounds(100, 100, 594, 423);
		tela.setLayout(new BorderLayout());
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		tela.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 558, 363);
		panel.add(scrollPane);
		table = new JTable();
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
