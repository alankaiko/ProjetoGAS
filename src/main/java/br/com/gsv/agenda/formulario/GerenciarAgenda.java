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
	private JTextField TNome, TCpf, TRg;
	private JCalendar calendar;
	private JButton BBuscar, BVoltar;
	private JLabel LNome,LCpf;
	
	
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
		
		BBuscar = new JButton("Buscar");
		BBuscar.setBounds(479, 351, 100, 23);
		panel.add(BBuscar);
		
		BVoltar = new JButton("Voltar");
		BVoltar.setBounds(584, 351, 100, 23);
		panel.add(BVoltar);
		
		TNome = new JTextField();
		TNome.setBounds(479, 198, 205, 20);
		panel.add(TNome);
		TNome.setColumns(10);
		
		LNome = new JLabel("Nome");
		LNome.setBounds(479, 185, 46, 14);
		panel.add(LNome);
		
		LCpf = new JLabel("CPF");
		LCpf.setBounds(479, 229, 46, 14);
		panel.add(LCpf);
		
		TCpf = new JTextField();
		TCpf.setColumns(10);
		TCpf.setBounds(479, 242, 205, 20);
		panel.add(TCpf);
		
		JLabel LRg = new JLabel("RG");
		LRg.setBounds(479, 273, 46, 14);
		panel.add(LRg);
		
		TRg = new JTextField();
		TRg.setBounds(479, 286, 205, 20);
		panel.add(TRg);
		TRg.setColumns(10);
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

	public JTextField getTCpf() {
		return TCpf;
	}

	public void setTCpf(JTextField tCpf) {
		TCpf = tCpf;
	}

	public JTextField getTRg() {
		return TRg;
	}

	public void setTRg(JTextField tRg) {
		TRg = tRg;
	}

	public JCalendar getCalendar() {
		return calendar;
	}

	public void setCalendar(JCalendar calendar) {
		this.calendar = calendar;
	}

	public JButton getBBuscar() {
		return BBuscar;
	}

	public void setBBuscar(JButton bBuscar) {
		BBuscar = bBuscar;
	}

	public JButton getBVoltar() {
		return BVoltar;
	}

	public void setBVoltar(JButton bVoltar) {
		BVoltar = bVoltar;
	}
	
	
}
