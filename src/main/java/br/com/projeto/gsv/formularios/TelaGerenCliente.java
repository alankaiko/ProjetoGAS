package br.com.projeto.gsv.formularios;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

import br.com.projeto.gsv.Listeners.GerenClienteListener;

public class TelaGerenCliente extends JDialog {
	private GerenClienteListener listener;
	
	public static void main(String[] args) {
		try {
			TelaGerenCliente dialog = new TelaGerenCliente();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	public TelaGerenCliente() {
		CriaTelaGeral();
		Dados();
		InicializaComponentes();
		this.listener = new GerenClienteListener(this);
	}
	
	
	private void CriaTelaGeral(){
		this.setTitle("Cadastro de Pacientes");
		this.setModal(true);
		this.setBounds(100, 100, 620, 400);
		this.setResizable(false);
		
		this.tela.setLayout(null);
		this.tela.add(contentPanel, BorderLayout.CENTER);
		
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPanel.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(26,12,420,330);
		this.tela.add(this.scrollPane);
		table = new JTable();		
	}
	
	private void Dados(){
		detalhes= new JButton("Detalhes");
		detalhes.setBounds(450,12,125,20);
		
		codigo= new JButton("Código");
		codigo.setBounds(450,35,125,20);
		
		buscar= new JButton("Buscar");
		buscar.setBounds(450,58,125,20);
		
		modificar= new JButton("Modificar");
		modificar.setBounds(450,81,125,20);
		
		incluir= new JButton("Incluir");
		incluir.setBounds(450,104,125,20);
		
		excluir= new JButton("Excluir");
		excluir.setBounds(450,127,125,20);
		
		fim= new JButton("Fim");
		fim.setBounds(450,150,125,20);
		
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
	
	
	
	
	private final JPanel contentPanel = new JPanel();
	private JTable table;
	private JButton detalhes, codigo, buscar, modificar, incluir, excluir, fim;
	private Container tela= getContentPane();
	private JScrollPane scrollPane;


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
	
	
	
	
	

}
