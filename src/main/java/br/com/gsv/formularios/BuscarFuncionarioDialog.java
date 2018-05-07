package br.com.gsv.formularios;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import br.com.gsv.graficoAzul.BuscarFuncionarioGrafic;
import br.com.gsv.graficoClassic.BuscarFuncionarioClassic;
import br.com.gsv.listeners.BuscarFuncionarioListener;
import br.com.gsv.listeners.RadioListenerFuncionario;

public class BuscarFuncionarioDialog extends JDialog {
	private JPanel panel = new JPanel();
	private Container tela = getContentPane();
	private JTextField textoBuscar;
	private JButton ok,cancelar, buscar;
	private JRadioButton buscaCpf, buscaRg, buscaNome, buscaCodigo;
	private JLabel buscarUsuario;
	private ButtonGroup botaoGrupo= new ButtonGroup();
	private JScrollPane scrollPane;
	private JTable table;
	private BuscarFuncionarioListener listener;
	private BuscarFuncionarioGrafic listenerGrafic;
	private BuscarFuncionarioClassic listenerClassic;
	private RadioListenerFuncionario radioFuncionario;
	private JPanel painelDrag;
	private int xx,xy;
	
	
	public BuscarFuncionarioDialog() {
		CriarTelaGeral();
		AdicionaNaTela();
		listener = new BuscarFuncionarioListener(this);
		radioFuncionario = new RadioListenerFuncionario(this);
	}
	
	
	
	private void CriarTelaGeral(){
		buscarUsuario = new JLabel();
		buscaCpf = new JRadioButton();
		buscaRg = new JRadioButton();
		buscaNome = new JRadioButton();
		buscaCodigo = new JRadioButton();
		textoBuscar = new JTextField();
		buscar = new JButton();
		ok = new JButton();
		cancelar = new JButton();
		table = new JTable();
		scrollPane = new JScrollPane();
		painelDrag = new JPanel();
	}
	
	
	
	private void AdicionaNaTela(){
		tela.add(this.buscarUsuario);
		tela.add(this.buscaCpf);
		tela.add(this.buscaRg);
		tela.add(this.buscaNome);
		tela.add(this.buscaCodigo);
		tela.add(this.textoBuscar);
		tela.add(this.buscar);
		tela.add(this.ok);
		tela.add(this.cancelar);
		
		botaoGrupo.add(buscaCpf);
		botaoGrupo.add(buscaRg);
		botaoGrupo.add(buscaNome);
		botaoGrupo.add(buscaCodigo);
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


	public JButton getBuscar() {
		return buscar;
	}


	public void setBuscar(JButton buscar) {
		this.buscar = buscar;
	}


	public JTable getTable() {
		return table;
	}


	public void setTable(JTable table) {
		this.table = table;
	}


	public JScrollPane getScrollPane() {
		return scrollPane;
	}

	public void setScrollPane(JScrollPane scrollPane) {
		this.scrollPane = scrollPane;
	}


	public JRadioButton getBuscaCpf() {
		return buscaCpf;
	}


	public void setBuscaCpf(JRadioButton buscaCpf) {
		this.buscaCpf = buscaCpf;
	}


	public JRadioButton getBuscaRg() {
		return buscaRg;
	}


	public void setBuscaRg(JRadioButton buscaRg) {
		this.buscaRg = buscaRg;
	}


	public JRadioButton getBuscaNome() {
		return buscaNome;
	}


	public void setBuscaNome(JRadioButton buscaNome) {
		this.buscaNome = buscaNome;
	}


	public JRadioButton getBuscaCodigo() {
		return buscaCodigo;
	}


	public void setBuscaCodigo(JRadioButton buscaCodigo) {
		this.buscaCodigo = buscaCodigo;
	}


	public JTextField getTextoBuscar() {
		return textoBuscar;
	}


	public void setTextoBuscar(JTextField textoBuscar) {
		this.textoBuscar = textoBuscar;
	}

	public BuscarFuncionarioListener getListener() {
		return listener;
	}
	public void setListener(BuscarFuncionarioListener listener) {
		this.listener = listener;
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


	public JLabel getBuscarUsuario() {
		return buscarUsuario;
	}


	public void setBuscarUsuario(JLabel buscarUsuario) {
		this.buscarUsuario = buscarUsuario;
	}


	public ButtonGroup getBotaoGrupo() {
		return botaoGrupo;
	}


	public void setBotaoGrupo(ButtonGroup botaoGrupo) {
		this.botaoGrupo = botaoGrupo;
	}


	public RadioListenerFuncionario getRadioFuncionario() {
		return radioFuncionario;
	}


	public void setRadioFuncionario(RadioListenerFuncionario radioFuncionario) {
		this.radioFuncionario = radioFuncionario;
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
