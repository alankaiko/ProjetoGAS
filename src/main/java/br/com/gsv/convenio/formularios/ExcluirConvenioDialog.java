package br.com.gsv.convenio.formularios;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;

import br.com.gsv.convenio.domain.Convenio;
import br.com.gsv.convenio.grafico.ExcluirConvenioClassic;
import br.com.gsv.convenio.listeners.ExcluirConvenioListener;

public class ExcluirConvenioDialog extends JDialog {
	private JPanel panel = new JPanel();
	private Container tela = getContentPane();
	private JButton ok, cancelar;
	private JLabel excluir;
	private JSeparator separa;
	private Convenio convenio;
	private ExcluirConvenioListener listener;
	private ExcluirConvenioClassic listenerClassic;
	//private ExcluirConvenioGrafic listenerGrafic;
	
	
	public ExcluirConvenioDialog(Convenio convenio) {
		CriaVariaveis();
		this.convenio = convenio;
		AdicionaComponentes();
		
		listenerClassic = new ExcluirConvenioClassic(this);
		//listenerGrafic = new ExcluirConvenioGrafic(this);
		this.listener = new ExcluirConvenioListener(this);
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
	
	public Convenio getConvenio() {
		return convenio;
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


	public void setConvenio(Convenio convenio) {
		this.convenio = convenio;
	}

	public JSeparator getSepara() {
		return separa;
	}

	public void setSepara(JSeparator separa) {
		this.separa = separa;
	}

	
}
