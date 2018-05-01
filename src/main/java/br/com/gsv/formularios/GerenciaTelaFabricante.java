package br.com.gsv.formularios;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import br.com.gsv.graficoAzul.GerenciaFabricanteGrafic;
import br.com.gsv.graficoClassic.GerenciaFabricanteClassic;
import br.com.gsv.listeners.GerenciaFabricanteListener;

public class GerenciaTelaFabricante extends JDialog {
	private JPanel panel = new JPanel();
	private JTable table;
	private JButton detalhes, codigo, buscar, modificar, incluir, excluir, fim;
	private Container tela= getContentPane();
	private JScrollPane scrollPane;
	private GerenciaFabricanteListener listener;
	private GerenciaFabricanteClassic listenerClassic;
	private GerenciaFabricanteGrafic listenerGrafic;
	private JPanel painelDrag;
	private int xx,xy;
	
	
	public GerenciaTelaFabricante() {
		CriaTelaGeral();
		InicializaComponentes();
		listener = new GerenciaFabricanteListener(this);
	}
	
	public void IniciaGrafic(){
		this.listenerGrafic = new GerenciaFabricanteGrafic(this);
	}
	
	public void IniciaClassic(){
		listenerClassic = new GerenciaFabricanteClassic(this);
	}
	
	
	private void CriaTelaGeral(){
		detalhes = new JButton();
		codigo = new JButton();
		buscar = new JButton();
		modificar = new JButton();
		incluir = new JButton();
		excluir = new JButton();
		fim = new JButton();
		scrollPane = new JScrollPane();
		table = new JTable();
		painelDrag = new JPanel();
	}
	
	
	private void InicializaComponentes(){
		tela.add(detalhes);
		tela.add(codigo);
		tela.add(buscar);
		tela.add(modificar);
		tela.add(incluir);
		tela.add(excluir);
		tela.add(fim);
	}
	
	
	
	
	


	public JButton getCodigo() {
		return codigo;
	}


	public void setCodigo(JButton codigo) {
		this.codigo = codigo;
	}


	public JButton getBuscar() {
		return buscar;
	}


	public void setBuscar(JButton buscar) {
		this.buscar = buscar;
	}


	public JButton getModificar() {
		return modificar;
	}


	public void setModificar(JButton modificar) {
		this.modificar = modificar;
	}


	public JButton getIncluir() {
		return incluir;
	}


	public void setIncluir(JButton incluir) {
		this.incluir = incluir;
	}


	public JButton getExcluir() {
		return excluir;
	}


	public void setExcluir(JButton excluir) {
		this.excluir = excluir;
	}


	public JButton getFim() {
		return fim;
	}


	public void setFim(JButton fim) {
		this.fim = fim;
	}


	public JButton getDetalhes() {
		return detalhes;
	}


	public void setDetalhes(JButton detalhes) {
		this.detalhes = detalhes;
	}


	public Container getTela() {
		return tela;
	}


	public void setTela(Container tela) {
		this.tela = tela;
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


	public JPanel getPanel() {
		return panel;
	}


	public void setPanel(JPanel panel) {
		this.panel = panel;
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
