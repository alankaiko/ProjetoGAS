package br.com.gsv.formularios;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTextField;

import br.com.gsv.graficoClassic.CodigoUsuarioClassic;
import br.com.gsv.listeners.CodigoUsuarioListener;

public class CodigoUsuarioDialog extends JDialog {
	private JPanel panel = new JPanel();
	private JButton ok, cancelar;
	private Container tela = getContentPane();
	private JTextField TBuscar;
	private CodigoUsuarioListener listener;
	private CodigoUsuarioClassic listenerClassic;
	private String login;
	private JPanel painelDrag;
	private int xx,xy;
	

	public CodigoUsuarioDialog() {
		CriaVariaveis();
		AdicionaComponentes();
		listener = new CodigoUsuarioListener(this);
		listenerClassic = new CodigoUsuarioClassic(this);
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

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
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
