package br.com.gsv.agenda.formulario;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import br.com.gsv.agenda.listeners.GerenciarAgendaListener;

import com.toedter.calendar.JCalendar;

public class GerenciarAgenda extends JDialog {	
	private JPanel panel = new JPanel();
	private Container tela = getContentPane();
	private JScrollPane scrollPane;
	private JTable table;
	private GerenciarAgendaListener listener;
	private JTextField TNome;
	private JCalendar calendar;
	private JButton BAgendar, BVoltar, BRemover;
	private JLabel LNome, LStatus, LData, LHora;
	private JTextField TStatus,TData,THora;
	


	public GerenciarAgenda() {
		setBounds(100, 100, 730, 450);
		tela.setLayout(new BorderLayout());
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		tela.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);		
		this.setModal(true);
		this.setResizable(false);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 459, 390);
		panel.add(scrollPane);
		
		calendar = new JCalendar();
		calendar.setBorder(new LineBorder(new Color(0, 0, 0)));
		calendar.setBounds(479, 11, 225, 153);
		panel.add(calendar);
		
		BAgendar = new JButton("Agendar");
		BAgendar.setBounds(479, 310, 225, 23);
		panel.add(BAgendar);
		
		BVoltar = new JButton("Voltar");
		BVoltar.setBounds(479, 378, 225, 23);
		panel.add(BVoltar);
		
		TNome = new JTextField();
		TNome.setBounds(479, 188, 225, 20);
		panel.add(TNome);
		TNome.setColumns(10);
		
		LNome = new JLabel("Paciente");
		LNome.setBounds(479, 175, 61, 14);
		panel.add(LNome);
		
		TStatus = new JTextField();
		TStatus.setColumns(10);
		TStatus.setBounds(479, 226, 225, 20);
		panel.add(TStatus);
		
		LStatus = new JLabel("Status");
		LStatus.setBounds(479, 213, 46, 14);
		panel.add(LStatus);
		
		LData = new JLabel("Data");
		LData.setBounds(479, 257, 46, 14);
		panel.add(LData);
		
		TData = new JTextField();
		TData.setColumns(10);
		TData.setBounds(479, 270, 100, 20);
		panel.add(TData);
		
		THora = new JTextField();
		THora.setColumns(10);
		THora.setBounds(604, 270, 100, 20);
		panel.add(THora);
		
		LHora = new JLabel("Hora");
		LHora.setBounds(604, 257, 35, 14);
		panel.add(LHora);
		
		BRemover = new JButton("Excluir");
		BRemover.setBounds(479, 344, 225, 23);
		panel.add(BRemover);
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

	public JTextField getTNome() {
		return TNome;
	}

	public void setTNome(JTextField tNome) {
		TNome = tNome;
	}

	public JCalendar getCalendar() {
		return calendar;
	}

	public void setCalendar(JCalendar calendar) {
		this.calendar = calendar;
	}

	public JButton getBAgendar() {
		return BAgendar;
	}

	public void setBAgendar(JButton bAgendar) {
		BAgendar = bAgendar;
	}

	public JButton getBVoltar() {
		return BVoltar;
	}

	public void setBVoltar(JButton bVoltar) {
		BVoltar = bVoltar;
	}

	public JTextField getTStatus() {
		return TStatus;
	}
	
	public void setTStatus(JTextField tStatus) {
		TStatus = tStatus;
	}

	public JButton getBRemover() {
		return BRemover;
	}

	public void setBRemover(JButton bRemover) {
		BRemover = bRemover;
	}

	public JTextField getTData() {
		return TData;
	}

	public void setTData(JTextField tData) {
		TData = tData;
	}

	public JTextField getTHora() {
		return THora;
	}

	public void setTHora(JTextField tHora) {
		THora = tHora;
	}
}
