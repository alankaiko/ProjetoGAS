package br.com.gsv.formularios;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;

import br.com.gsv.domain.Fabricante;
import br.com.gsv.graficoClassic.ExcluirFabricanteClassic;
import br.com.gsv.listeners.ExcluirFabricanteListener;

public class ExcluirFabricanteDialog extends JDialog {
	private JPanel panel = new JPanel();
	private Container tela = getContentPane();
	private JButton ok, cancelar;
	private JLabel excluir;
	private JSeparator separa;
	private Fabricante fabricante;
	private ExcluirFabricanteListener listener;
	private ExcluirFabricanteClassic listenerClassic;
	//private ExcluirFabricanteGrafic listenerGrafic;
	
	
	
	public ExcluirFabricanteDialog(Fabricante fabricante) {
		CriaVariaveis();
		this.fabricante = fabricante;
		AdicionaComponentes();
		
		listenerClassic = new ExcluirFabricanteClassic(this);
		//listenerGrafic = new ExcluirFabricanteGrafic(this);
		this.listener = new ExcluirFabricanteListener(this);
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
	
	public Fabricante getFabricante() {
		return fabricante;
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

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}

	public JPanel getPanel() {
		return panel;
	}


	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}

	public JSeparator getSepara() {
		return separa;
	}
	
	public void setSepara(JSeparator separa) {
		this.separa = separa;
	}
	
}