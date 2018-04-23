package br.com.gsv.prontuario.formularios;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;

import br.com.gsv.domain.Prontuario;
import br.com.gsv.prontuario.grafic.ExcluirProntuarioClassic;
import br.com.gsv.prontuario.listeners.ExcluirProntuarioListener;

public class ExcluirProntuarioDialog extends JDialog {
	private static final long serialVersionUID = 1L;
	
	private JPanel panel = new JPanel();
	private Container tela = getContentPane();
	private JButton ok, cancelar;
	private JLabel excluir;
	private JSeparator separa;
	private Prontuario prontuario;
	private ExcluirProntuarioListener listener;
	private ExcluirProntuarioClassic listenerClassic;
	//private ExcluirConvenioGrafic listenerGrafic;
	
	
	public ExcluirProntuarioDialog(Prontuario prontuario) {
		CriaVariaveis();
		this.prontuario = prontuario;
		AdicionaComponentes();
		
		listenerClassic = new ExcluirProntuarioClassic(this);
		//listenerGrafic = new ExcluirConvenioGrafic(this);
		this.listener = new ExcluirProntuarioListener(this);
	}
	
	private void CriaVariaveis(){
		excluir = new JLabel();
		ok = new JButton();
		separa = new JSeparator();
		cancelar = new JButton();
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

	public Prontuario getProntuario() {
		return prontuario;
	}

	public void setProntuario(Prontuario prontuario) {
		this.prontuario = prontuario;
	}
	
	
}
