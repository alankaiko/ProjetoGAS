package br.com.gsv.formularios;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTextField;

import br.com.gsv.graficoAzul.CodigoFuncionarioGrafic;
import br.com.gsv.graficoClassic.CodigoFuncionarioClassic;
import br.com.gsv.listeners.CodigoFuncionarioListener;

public class CodigoFuncionarioDialog extends JDialog {
	private JPanel panel = new JPanel();
	private JButton ok, cancelar;
	private Container tela = getContentPane();
	private JTextField TBuscar;
	private CodigoFuncionarioListener listener;
	private Long codigo;
	private CodigoFuncionarioClassic listenerClassic;
	private CodigoFuncionarioGrafic listenerGrafic;
	
	public CodigoFuncionarioDialog() {
		CriaVariaveis();
		AdicionaNaTela();
		listener = new CodigoFuncionarioListener(this);
		listenerGrafic = new CodigoFuncionarioGrafic(this);
	}

	
	private void CriaVariaveis(){
		ok = new JButton();
		cancelar = new JButton();
		TBuscar = new JTextField();
	}

	private void AdicionaNaTela() {
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

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public Container getTela() {
		return tela;
	}

	public void setTela(Container tela) {
		this.tela = tela;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}

	public JPanel getPanel() {
		return panel;
	}

}
