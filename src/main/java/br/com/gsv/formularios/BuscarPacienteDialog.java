package br.com.gsv.formularios;

import java.awt.Container;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import br.com.gsv.graficoAzul.BuscarPacienteGrafic;
import br.com.gsv.graficoClassic.BuscarPacienteClassic;
import br.com.gsv.listeners.BuscarPacienteListener;
import br.com.gsv.listeners.RadioListenerPaciente;

public class BuscarPacienteDialog extends JDialog {
	private JPanel panel = new JPanel();
	private Container tela = getContentPane();
	private JTextField textoBuscar;
	private JButton ok,cancelar, buscar;
	private JRadioButton buscaCpf, buscaRg, buscaNome, buscaCodigo;
	private JLabel buscarUsuario;
	private ButtonGroup botaoGrupo= new ButtonGroup();
	private JScrollPane scrollPane;
	private JTable table;
	private BuscarPacienteListener listener;
	private RadioListenerPaciente radioListener;
	private BuscarPacienteClassic listenerClassic;
	private BuscarPacienteGrafic listenerGrafic;
	private JPanel painelDrag;
	private int xx,xy;
	
	
	public BuscarPacienteDialog() {
		CriaComponentes();
		AdicionaNaTela();
		listener = new BuscarPacienteListener(this);
		radioListener = new RadioListenerPaciente(this);		
	}
	
	
	
	private void CriaComponentes(){
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


	public BuscarPacienteListener getListener() {
		return listener;
	}
	public void setListener(BuscarPacienteListener listener) {
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


	public RadioListenerPaciente getRadioListener() {
		return radioListener;
	}


	public void setRadioListener(RadioListenerPaciente radioListener) {
		this.radioListener = radioListener;
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
