package br.com.gsv.formularios;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;

import br.com.gsv.domain.Convenio;
import br.com.gsv.graficoAzul.ExcluirConvenioGrafic;
import br.com.gsv.graficoClassic.ExcluirConvenioClassic;
import br.com.gsv.listeners.ExcluirConvenioListener;

public class ExcluirConvenioDialog extends JDialog {
	private JPanel panel = new JPanel();
	private Container tela = getContentPane();
	private JButton ok, cancelar;
	private JLabel excluir;
	private JSeparator separa;
	private Convenio convenio;
	private ExcluirConvenioListener listener;
	private ExcluirConvenioClassic listenerClassic;
	private ExcluirConvenioGrafic listenerGrafic;
	private JPanel painelDrag;
	private int xx,xy;
	
	
	public ExcluirConvenioDialog(Convenio convenio) {
		CriaVariaveis();
		this.convenio = convenio;
		AdicionaComponentes();
		listener = new ExcluirConvenioListener(this);
		listenerGrafic = new ExcluirConvenioGrafic(this);
	}
	
		
	private void CriaVariaveis(){
		excluir = new JLabel();
		ok = new JButton();
		separa = new JSeparator();
		cancelar = new JButton();
		painelDrag = new JPanel();
	}
	
	public void AdicionaComponentes(){
		tela.add(this.ok);
		tela.add(this.separa);
		tela.add(this.cancelar);
		tela.add(this.excluir);
		tela.add(this.painelDrag);
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


	public JPanel getPainelDrag() {
		return painelDrag;
	}


	public void setPainelDrag(JPanel painelDrag) {
		this.painelDrag = painelDrag;
	}


	public int getXx() {
		return xx;
	}


	public void setXx(int xx) {
		this.xx = xx;
	}


	public int getXy() {
		return xy;
	}


	public void setXy(int xy) {
		this.xy = xy;
	}

	
}
