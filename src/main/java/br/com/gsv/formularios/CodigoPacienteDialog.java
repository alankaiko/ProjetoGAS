package br.com.gsv.formularios;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTextField;

import br.com.gsv.grafico.CodigoPacienteClassic;
import br.com.gsv.listeners.CodigoPacienteListener;

public class CodigoPacienteDialog extends JDialog {
	private JPanel panel = new JPanel();
	private JButton ok, cancelar;
	private Container tela = getContentPane();
	private JTextField TBuscar;
	private CodigoPacienteListener listener;
	private Long codigo;
	private CodigoPacienteClassic listenerClassic;
	//private CodigoPacienteGrafic listenerGrafic;

	public CodigoPacienteDialog() {
		IniciaComponentes();
		AdicionaNaTela();
		listener = new CodigoPacienteListener(this);
		listenerClassic = new CodigoPacienteClassic(this);
		//listenerGrafic = new CodigoPacienteGrafic(this);
	}

	private void IniciaComponentes(){
		ok = new JButton();
		cancelar = new JButton();
		TBuscar = new JTextField();
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

}
