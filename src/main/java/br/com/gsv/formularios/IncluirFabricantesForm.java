package br.com.gsv.formularios;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import br.com.gsv.graficoAzul.IncluirFabricanteGrafic;
import br.com.gsv.graficoClassic.IncluirFabricanteClassic;
import br.com.gsv.listeners.IncluirFabricantesListener;

public class IncluirFabricantesForm extends JDialog {
	private IncluirFabricantesListener listener;
	private IncluirFabricanteClassic listenerClassic;
	private IncluirFabricanteGrafic listenerGrafic;
	private JPanel panel = new JPanel();
	private Container tela = getContentPane();
	private JLabel LId, LFabricante;
	private JTextField TId, TFabricante;
	private JButton BTGravar, BTCancelar;
	private int xx,xy;
	
	public IncluirFabricantesForm() {
		InicializaObjetos();
		AdicionaCompomentes();
		listener = new IncluirFabricantesListener(this);
		listenerGrafic = new IncluirFabricanteGrafic(this);
	}
	
	
	public void InicializaObjetos(){
		LId = new JLabel();
		LFabricante = new JLabel(); 
		TId = new JTextField();
		TFabricante = new JTextField();
		BTGravar = new JButton();
		BTCancelar = new JButton();
	}
	
	
	public void AdicionaCompomentes() {
		tela.add(this.TId);
		tela.add(this.LFabricante);
		tela.add(this.TFabricante);
		tela.add(this.LId);
		tela.add(this.BTGravar);
		tela.add(this.BTCancelar);
	}

	

	public JButton getBTGravar() {
		return BTGravar;
	}

	public void setBTGravar(JButton bTGravar) {
		BTGravar = bTGravar;
	}

	public JButton getBTCancelar() {
		return BTCancelar;
	}

	public void setBTCancelar(JButton bTCancelar) {
		BTCancelar = bTCancelar;
	}

	public Container getTela() {
		return tela;
	}

	public void setTela(Container tela) {
		this.tela = tela;
	}

	public JTextField getTId() {
		return TId;
	}

	public void setTId(JTextField tId) {
		TId = tId;
	}

	public JTextField getTFabricante() {
		return TFabricante;
	}

	public void setTFabricante(JTextField tFabricante) {
		TFabricante = tFabricante;
	}
	
	public void setListener(IncluirFabricantesListener listener) {
		this.listener = listener;
	}
	
	public IncluirFabricantesListener getListener() {
		return listener;
	}


	public JPanel getPanel() {
		return panel;
	}


	public void setPanel(JPanel panel) {
		this.panel = panel;
	}

	public JLabel getLId() {
		return LId;
	}


	public void setLId(JLabel lId) {
		LId = lId;
	}

	public JLabel getLFabricante() {
		return LFabricante;
	}


	public void setLFabricante(JLabel lFabricante) {
		LFabricante = lFabricante;
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
