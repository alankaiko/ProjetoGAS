package br.com.projeto.gsv.tela;

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

public class TelaGerenCliente extends JDialog {
	private final JPanel contentPanel = new JPanel();
	private JButton detalhes, codigo, buscar, modificar, incluir, excluir, fim;
	private Container tela= getContentPane();
	private JScrollPane scrollPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			TelaGerenCliente dialog = new TelaGerenCliente();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public TelaGerenCliente() {
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
		
		detalhes= new JButton("Detalhes");
		detalhes.setBounds(450,12,125,20);
		getContentPane().add(detalhes);
		
		codigo= new JButton("Código");
		codigo.setBounds(450,35,125,20);
		getContentPane().add(codigo);
		
		buscar= new JButton("Buscar");
		buscar.setBounds(450,58,125,20);
		getContentPane().add(buscar);
		
		modificar= new JButton("Modificar");
		modificar.setBounds(450,81,125,20);
		getContentPane().add(modificar);
		
		incluir= new JButton("Incluir");
		incluir.setBounds(450,104,125,20);
		getContentPane().add(incluir);
		
		excluir= new JButton("Excluir");
		excluir.setBounds(450,127,125,20);
		getContentPane().add(excluir);
		
		fim= new JButton("Fim");
		fim.setBounds(450,150,125,20);
		getContentPane().add(fim);
		
	}

}
