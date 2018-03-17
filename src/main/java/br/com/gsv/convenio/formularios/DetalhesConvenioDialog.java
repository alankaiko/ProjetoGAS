package br.com.gsv.convenio.formularios;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;

import br.com.gsv.convenio.grafico.DetalheConvenioClassic;
import br.com.gsv.convenio.grafico.DetalheConvenioGrafic;
import br.com.gsv.convenio.listeners.DetalhesConvenioListener;

public class DetalhesConvenioDialog extends JDialog {
	private final JPanel panel = new JPanel();
	private Container tela = getContentPane();
	private JLabel LId, LConvenio;
	private JLabel TId, TConvenio;
	private JButton cancelar;
	private JSeparator separa;
	private DetalhesConvenioListener listener;
	private DetalheConvenioClassic listenerClassic;
	private DetalheConvenioGrafic listenerGrafic;
	

	public DetalhesConvenioDialog() {
		CriaVariaveis();
		AdicionaComponentes();
		
		//listenerClassic = new DetalheConvenioClassic(this);
		listenerGrafic = new DetalheConvenioGrafic(this);
		listener = new DetalhesConvenioListener(this);
	}

	
	public void CriaVariaveis() {
		LId = new JLabel();
		LConvenio = new JLabel();
		TId = new JLabel();
		TConvenio = new JLabel();
		cancelar = new JButton();
		separa = new JSeparator();
	}

	
	public void AdicionaComponentes(){
		tela.add(this.TId);
		tela.add(this.LConvenio );
		tela.add(this.TConvenio);
		tela.add(this.LId);
		tela.add(this.separa);
		tela.add(this.cancelar);			
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


	
		
}
