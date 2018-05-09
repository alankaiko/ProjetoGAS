package br.com.gsv.formularios;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;

import br.com.gsv.graficoAzul.DetalheConvenioGrafic;
import br.com.gsv.graficoClassic.DetalheConvenioClassic;
import br.com.gsv.listeners.DetalhesConvenioListener;

public class DetalhesConvenioDialog extends JDialog {
	private JPanel panel = new JPanel();
	private Container tela = getContentPane();
	private JLabel LId, LConvenio;
	private JLabel TId, TConvenio;
	private JButton cancelar;
	private JSeparator separa;
	private DetalhesConvenioListener listener;
	private DetalheConvenioClassic listenerClassic;
	private DetalheConvenioGrafic listenerGrafic;
	private JPanel painelDrag;
	private int xx,xy;
	

	public DetalhesConvenioDialog() {
		CriaVariaveis();
		AdicionaComponentes();
		listener = new DetalhesConvenioListener(this);
		listenerGrafic = new DetalheConvenioGrafic(this);
	}
	
		
	public void CriaVariaveis() {
		LId = new JLabel();
		LConvenio = new JLabel();
		TId = new JLabel();
		TConvenio = new JLabel();
		cancelar = new JButton();
		separa = new JSeparator();
		painelDrag = new JPanel();
	}

	
	public void AdicionaComponentes(){
		tela.add(this.TId);
		tela.add(this.LConvenio );
		tela.add(this.TConvenio);
		tela.add(this.LId);
		tela.add(this.separa);
		tela.add(this.cancelar);	
		tela.add(this.painelDrag);
	}
		

	public JButton getCancelar() {
		return cancelar;
	}



	public void setCancelar(JButton cancelar) {
		this.cancelar = cancelar;
	}



	public Container getTela() {
		return tela;
	}


	public void setTela(Container tela) {
		this.tela = tela;
	}

	

	public JLabel getTId() {
		return TId;
	}



	public void setTId(JLabel tId) {
		TId = tId;
	}


	public JLabel getLConvenio() {
		return LConvenio;
	}


	public void setLConvenio(JLabel lConvenio) {
		LConvenio = lConvenio;
	}


	public JLabel getTConvenio() {
		return TConvenio;
	}


	public void setTConvenio(JLabel tConvenio) {
		TConvenio = tConvenio;
	}


	public DetalhesConvenioListener getListener() {
		return listener;
	}
	
	public void setListener(DetalhesConvenioListener listener) {
		this.listener = listener;
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


	public void setPanel(JPanel panel) {
		this.panel = panel;
	}


	
		
}
