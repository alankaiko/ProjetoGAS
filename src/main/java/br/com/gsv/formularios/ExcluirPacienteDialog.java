package br.com.gsv.formularios;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;

import br.com.gsv.domain.Paciente;
import br.com.gsv.graficoClassic.ExcluirPacienteClassic;
import br.com.gsv.listeners.ExcluirPacienteListener;

public class ExcluirPacienteDialog extends JDialog {
	private JPanel panel = new JPanel();
	private Container tela = getContentPane();
	private JButton ok, cancelar;
	private JLabel excluir;
	private JSeparator separa;
	private Paciente cliente;
	private ExcluirPacienteListener listener;
	private ExcluirPacienteClassic listenerClassic;
	private JPanel painelDrag;
	private int xx,xy;
	
	
	public ExcluirPacienteDialog(Paciente cliente) {
		this.cliente = cliente;
		
		IniciaVariaveis();
		AdicionaComponentes();
		listener = new ExcluirPacienteListener(this);
		listenerClassic = new ExcluirPacienteClassic(this);
	}
	


	private void IniciaVariaveis(){
		ok = new JButton();
		cancelar = new JButton();
		excluir = new JLabel();
		separa = new JSeparator();
		painelDrag = new JPanel();
	}
	
	private void AdicionaComponentes(){
		tela.add(this.ok);
		tela.add(this.cancelar);
		tela.add(this.excluir);
		tela.add(this.separa);
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
	
	public Paciente getCliente() {
		return cliente;
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


	public JLabel getExcluir() {
		return excluir;
	}


	public void setExcluir(JLabel excluir) {
		this.excluir = excluir;
	}

	public void setCliente(Paciente cliente) {
		this.cliente = cliente;
	}
	
	public void setSepara(JSeparator separa) {
		this.separa = separa;
	}
	
	public JSeparator getSepara() {
		return separa;
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
