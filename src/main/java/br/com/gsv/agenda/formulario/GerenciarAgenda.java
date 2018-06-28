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
import javax.swing.border.LineBorder;
import java.awt.Color;

public class GerenciarAgenda extends JDialog {

	private JPanel panel = new JPanel();
	private Container tela = getContentPane();
	private JScrollPane scrollPane;
	private JTable table;
	private GerenciarAgendaListener listener;
	private JTextField TNome;
	private JCalendar calendar;
	private JButton BAgendar, BVoltar;
	private JLabel LNome, LTipo, LConvenio, LData, LHora;
	private JTextField TTipo,TConvenio,TData,THora;
	
	
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
		setBounds(100, 100, 710, 450);
		tela.setLayout(new BorderLayout());
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		tela.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 459, 390);
		panel.add(scrollPane);
		
		calendar = new JCalendar();
		calendar.setBorder(new LineBorder(new Color(0, 0, 0)));
		calendar.setBounds(479, 11, 205, 153);
		panel.add(calendar);
		
		BAgendar = new JButton("Agendar");
		BAgendar.setBounds(479, 378, 100, 23);
		panel.add(BAgendar);
		
		BVoltar = new JButton("Voltar");
		BVoltar.setBounds(584, 378, 100, 23);
		panel.add(BVoltar);
		
		TNome = new JTextField();
		TNome.setBounds(479, 188, 205, 20);
		panel.add(TNome);
		TNome.setColumns(10);
		
		LNome = new JLabel("Nome");
		LNome.setBounds(479, 175, 46, 14);
		panel.add(LNome);
		
		TTipo = new JTextField();
		TTipo.setColumns(10);
		TTipo.setBounds(479, 226, 205, 20);
		panel.add(TTipo);
		
		LTipo = new JLabel("Tipo");
		LTipo.setBounds(479, 213, 46, 14);
		panel.add(LTipo);
		
		LConvenio = new JLabel("Convênio");
		LConvenio.setBounds(479, 250, 63, 14);
		panel.add(LConvenio);
		
		TConvenio = new JTextField();
		TConvenio.setColumns(10);
		TConvenio.setBounds(479, 263, 205, 20);
		panel.add(TConvenio);
		
		LData = new JLabel("Data");
		LData.setBounds(479, 290, 46, 14);
		panel.add(LData);
		
		TData = new JTextField();
		TData.setColumns(10);
		TData.setBounds(479, 303, 100, 20);
		panel.add(TData);
		
		THora = new JTextField();
		THora.setColumns(10);
		THora.setBounds(584, 303, 100, 20);
		panel.add(THora);
		
		LHora = new JLabel("Hora");
		LHora.setBounds(584, 290, 35, 14);
		panel.add(LHora);
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

	public JButton getBBuscar() {
		return BAgendar;
	}

	public void setBBuscar(JButton bBuscar) {
		BAgendar = bBuscar;
	}

	public JButton getBVoltar() {
		return BVoltar;
	}

	public void setBVoltar(JButton bVoltar) {
		BVoltar = bVoltar;
	}

	public JButton getBEditar() {
		return BAgendar;
	}

	public void setBEditar(JButton bEditar) {
		BAgendar = bEditar;
	}

	public JTextField getTTipo() {
		return TTipo;
	}

	public void setTTipo(JTextField tTipo) {
		TTipo = tTipo;
	}

	public JTextField getTConvenio() {
		return TConvenio;
	}

	public void setTConvenio(JTextField tConvenio) {
		TConvenio = tConvenio;
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
