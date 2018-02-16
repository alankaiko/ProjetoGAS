package br.com.gsv.cliente.formularios;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import br.com.gsv.cliente.listeners.CodigoClienteListener;

public class CodidoClienteDialog extends JDialog {
	private final JPanel contentPanel = new JPanel();
	private JButton ok, cancelar;
	private Container tela= getContentPane();
	private JTextField TBuscar;
	private CodigoClienteListener listener;
	private Long codigo;
	
	
	
	public CodidoClienteDialog() {
		CriaTelaGeral();
		CriarTela();
		AdicionaNaTela();
		listener = new CodigoClienteListener(this);
	}
	
	
	
	private void CriaTelaGeral(){
		this.setTitle("Código");
		this.setModal(true);
		this.setBounds(100, 100, 200, 120);
		this.setResizable(false);
		this.tela.setLayout(null);
		this.tela.add(contentPanel, BorderLayout.CENTER);
		
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPanel.setLayout(null);
		
	}
	
	
	
	public void CriarTela(){
		TBuscar  = new JTextField();
		TBuscar.setBounds(50,13,100,23);
		TBuscar .setFont(new Font("Arial",Font.BOLD,10));
		
		ok = new JButton("Buscar");
		ok.setBounds(7, 60, 85, 18);
		
		cancelar = new JButton("Cancelar");
		cancelar.setBounds(102, 60, 85, 18);
		
	}
	
	
	public void AdicionaNaTela(){
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



	
	
	
	

}
