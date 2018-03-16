package br.com.gsv.convenio.formularios;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTextField;

import br.com.gsv.convenio.grafico.CodigoConvenioClassic;
import br.com.gsv.convenio.listeners.CodigoConvenioListener;

public class CodigoConvenioDialog extends JDialog {
	private JPanel panel = new JPanel();
	private Container tela= getContentPane();
	private JButton ok, cancelar;
	private JTextField TBuscar;
	private CodigoConvenioListener listener;
	private Long codigo;
	private CodigoConvenioClassic listenerClassic;
	
	
	
	public CodigoConvenioDialog() {
		CriaVariaveis();
		AdicionaComponentes();
		listener = new CodigoConvenioListener(this);
		listenerClassic = new CodigoConvenioClassic(this);
	}	
	
	
	public void CriaVariaveis() {
		ok = new JButton();
		cancelar = new JButton();
		TBuscar = new JTextField();
	}
	
	private void AdicionaComponentes() {
		tela.add(this.ok);
		tela.add(this.cancelar);
		tela.add(this.TBuscar);
		
	}



	public JPanel getPanel() {
		return panel;
	}



	public void setPanel(JPanel panel) {
		this.panel = panel;
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



	public Container getTela() {
		return tela;
	}



	public void setTela(Container tela) {
		this.tela = tela;
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





}
