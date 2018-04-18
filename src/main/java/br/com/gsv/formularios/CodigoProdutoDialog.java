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
	//private CodigoProdutoGrafic listenerGrafic;

	public CodigoProdutoDialog() {
		CriaVariaveis();
		AdicionaNaTela();
		//listenerGrafic = new CodigoProdutoGrafic(this);
		listenerClassic = new CodigoProdutoClassic(this);
		listener = new CodigoProdutoListener(this);
	}
	
	public void CriaVariaveis() {
		TBuscar = new JTextField();
		ok = new JButton();
		cancelar = new JButton();
	}

	public void AdicionaNaTela() {
		tela.add(this.TBuscar);
		tela.add(this.ok);
		tela.add(this.cancelar);
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

}
