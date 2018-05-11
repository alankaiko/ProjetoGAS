package br.com.gsv.formularios;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTextField;

import br.com.gsv.graficoAzul.CodigoFabricanteGrafic;
import br.com.gsv.graficoClassic.CodigoFabricanteClassic;
import br.com.gsv.listeners.CodigoFabricanteListener;

public class CodigoFabricanteDialog extends JDialog {
	private JPanel panel = new JPanel();
	private JButton ok, cancelar;
	private Container tela= getContentPane();
	private JTextField TBuscar;
	private CodigoFabricanteListener listener;
	private Long codigo;
	private CodigoFabricanteClassic listenerClassic;
	private CodigoFabricanteGrafic listenerGrafic;
	private JPanel painelDrag;
	private int xx,xy;
	
	
	
	public CodigoFabricanteDialog() {
		CriaVariaveis();
		AdicionaComponentes();
		listener = new CodigoFabricanteListener(this);	
	}
	
	public void IniciaClassic(){
		listenerClassic = new CodigoFabricanteClassic(this);
	}
	
	public void IniciaGrafic(){
		listenerGrafic = new CodigoFabricanteGrafic(this);
	}
	
	
	public void CriaVariaveis() {
		ok = new JButton();
		cancelar = new JButton();
		TBuscar = new JTextField();
		painelDrag = new JPanel();
	}
	
	private void AdicionaComponentes() {
		tela.add(this.ok);
		tela.add(this.cancelar);
		tela.add(this.TBuscar);
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



	public JTextField getTBuscar() {
		return TBuscar;
	}



	public void setTBuscar(JTextField tBuscar) {
		TBuscar = tBuscar;
	}



	public Long getCodigo() {
		return codigo;
	}



	public void setCodigo(Long codigo) {
		this.codigo = codigo;
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
