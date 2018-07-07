package br.com.gsv.formularios;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTextField;

import br.com.gsv.graficoClassic.CodigoProdutoClassic;
import br.com.gsv.listeners.CodigoProdutoListener;

public class CodigoProdutoDialog extends JDialog {
	private static final long serialVersionUID = 1L;
	private CodigoProdutoListener listener;
	private JPanel panel = new JPanel();
	private JButton ok, cancelar;
	private Container tela = getContentPane();
	private JTextField TBuscar;
	private String codigo;
	private CodigoProdutoClassic listenerClassic;
	private JPanel painelDrag;
	private int xx,xy;


	public CodigoProdutoDialog() {
		CriaVariaveis();
		AdicionaNaTela();
		listener = new CodigoProdutoListener(this);
		listenerClassic = new CodigoProdutoClassic(this);
	}
	
	public void CriaVariaveis() {
		TBuscar = new JTextField();
		ok = new JButton();
		cancelar = new JButton();
		painelDrag = new JPanel();
	}

	public void AdicionaNaTela() {
		tela.add(this.TBuscar);
		tela.add(this.ok);
		tela.add(this.cancelar);
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

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getCodigo() {
		return codigo;
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
