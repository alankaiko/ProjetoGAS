package br.com.gsv.formularios;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import br.com.gsv.graficoClassic.IncluirConvenioClassic;
import br.com.gsv.listeners.IncluirConvenioListener;

public class IncluirConvenioForm extends JDialog{
	private JPanel panel = new JPanel();
	private Container tela = getContentPane();
	private JLabel LId, LConvenio;
	private JTextField TId, TConvenio;
	private JButton BTGravar, BTCancelar;
	private IncluirConvenioListener listener;
	private IncluirConvenioClassic listenerClassic;
	private int xx,xy;

	
	public IncluirConvenioForm() {
		CriaVariaveis();
		AdicionaComponentes();
		listener = new IncluirConvenioListener(this);
		listenerClassic = new IncluirConvenioClassic(this);
	}
	
	
	
	public void CriaVariaveis() {
		LId = new JLabel();
		TId = new JTextField();
		LConvenio = new JLabel();
		TConvenio = new JTextField();
		BTGravar = new JButton();
		BTCancelar = new JButton();
	}

	
	private void AdicionaComponentes() {
		tela.add(this.TId);
		tela.add(this.LConvenio);
		tela.add(this.TConvenio);
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

	public JLabel getLConvenio() {
		return LConvenio;
	}

	public void setLConvenio(JLabel lConvenio) {
		LConvenio = lConvenio;
	}

	public JTextField getTConvenio() {
		return TConvenio;
	}

	public void setTConvenio(JTextField tConvenio) {
		TConvenio = tConvenio;
	}
	
	public void setListener(IncluirConvenioListener listener) {
		this.listener = listener;
	}
	public IncluirConvenioListener getListener() {
		return listener;
	}

	public JLabel getLId() {
		return LId;
	}

	public void setLId(JLabel lId) {
		LId = lId;
	}


	

	public JPanel getPanel() {
		return panel;
	}



	public void setPanel(JPanel panel) {
		this.panel = panel;
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
