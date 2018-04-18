package br.com.gsv.formularios;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;

import br.com.gsv.domain.Funcionario;
import br.com.gsv.graficoClassic.ExcluirFuncionarioClassic;
import br.com.gsv.listeners.ExcluirFuncionarioListener;

public class ExcluirFuncionarioDialog extends JDialog {
	private JPanel panel = new JPanel();
	private Container tela = getContentPane();
	private JButton ok, cancelar;
	private JLabel excluir;
	private JSeparator separa;
	private Funcionario funcionario;
	private ExcluirFuncionarioListener listener;
	private ExcluirFuncionarioClassic listenerClassic;
	//private ExcluirFuncionarioGrafic listenerGrafic;
	
	
	public ExcluirFuncionarioDialog(Funcionario funcionario) {
		this.funcionario = funcionario;
		
		CriaVariaveis();
		AdicionaComponentes();
		listener = new ExcluirFuncionarioListener(this);
		listenerClassic = new ExcluirFuncionarioClassic(this);
		//listenerGrafic = new ExcluirFuncionarioGrafic(this);
	}
	
	
	private void CriaVariaveis(){
		excluir = new JLabel();
		ok = new JButton();
		separa = new JSeparator();
		cancelar = new JButton();
	}
	
	public void AdicionaComponentes(){
		tela.add(this.ok);
		tela.add(this.separa);
		tela.add(this.cancelar);
		tela.add(this.excluir);
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
	
	public Funcionario getFuncionario() {
		return funcionario;
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


	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	
	public void setSepara(JSeparator separa) {
		this.separa = separa;
	}
	
	public JSeparator getSepara() {
		return separa;
	}
	
}
