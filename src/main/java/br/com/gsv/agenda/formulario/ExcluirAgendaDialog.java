package br.com.gsv.agenda.formulario;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.border.EmptyBorder;

import br.com.gsv.agenda.listeners.ExcluirAgendaListener;
import br.com.gsv.domain.Agenda;

public class ExcluirAgendaDialog extends JDialog {
	private JPanel panel = new JPanel();
	private Container tela = getContentPane();
	private JButton ok, cancelar;
	private JLabel excluir;
	private JSeparator separa;
	private Agenda agenda;
	private ExcluirAgendaListener listener;
	
	
	
	public ExcluirAgendaDialog(Agenda agenda) {
		setBounds(100, 100,320, 100);
		setLayout(new BorderLayout());
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		tela.add(panel, BorderLayout.CENTER);
		
		setTitle("Deseja excluir o Agendamento Atual?");
		setModal(true);
		setResizable(false);
		tela.setLayout(null);		
		
		panel.setLayout(null);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		this.agenda = agenda;
		CriaVariaveis();
		AdicionaComponentes();
		
		this.listener = new ExcluirAgendaListener(this);
	}

	private void CriaVariaveis(){
		excluir = new JLabel();
		excluir.setText("Excluir: "+ agenda.getPaciente().getNome() + "?");
		excluir.setForeground(Color.black);
		excluir.setBounds(10, 10, 300, 18);
		
		ok = new JButton();
		ok.setText("OK");
		ok.setBounds(45, 50, 90, 18);
		
		separa = new JSeparator();
		
		cancelar = new JButton();
		cancelar.setText("Cancelar");
		cancelar.setBounds(140, 50, 90, 18);
	}
	
	public void AdicionaComponentes(){
		tela.add(this.ok);
		tela.add(this.separa);
		tela.add(this.cancelar);
		tela.add(this.excluir);
	}
	

	public JButton getOk() {
		return ok;
	}


	public void setOk(JButton ok) {
		this.ok = ok;
	}


	public JButton getCancelar() {
		return cancelar;
	}


	public void setCancelar(JButton cancelar) {
		this.cancelar = cancelar;
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


	public JLabel getExcluir() {
		return excluir;
	}


	public void setExcluir(JLabel excluir) {
		this.excluir = excluir;
	}


	public JSeparator getSepara() {
		return separa;
	}

	public void setSepara(JSeparator separa) {
		this.separa = separa;
	}

	public void setAgenda(Agenda agenda) {
		this.agenda = agenda;
	}
	
	public Agenda getAgenda() {
		return agenda;
	}
}
