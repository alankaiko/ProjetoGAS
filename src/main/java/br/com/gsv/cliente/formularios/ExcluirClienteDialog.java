package br.com.gsv.cliente.formularios;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.com.gsv.cliente.domain.Cliente;
import br.com.gsv.cliente.listeners.ExcluirClienteListener;

public class ExcluirClienteDialog extends JDialog {
	private final JPanel contentPanel = new JPanel();
	private Container tela = getContentPane();
	private JButton ok, cancelar;
	private JLabel excluir;
	private Cliente cliente;
	private ExcluirClienteListener listener;
	
	
	public ExcluirClienteDialog(Cliente cliente) {
		this.cliente = cliente;
		
		CriaTela();
		CriaCompomentes();
		this.listener = new ExcluirClienteListener(this);
	}
	
	
	public void CriaTela(){
		this.setBounds(100, 100,320, 100);
		tela.setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		tela.add(contentPanel, BorderLayout.CENTER);
		
		this.setTitle("Excluir Paciente");
		this.setModal(true);
		this.setResizable(false);
		this.tela.setLayout(null);		
		this.tela.add(contentPanel, BorderLayout.CENTER);
		
		contentPanel.setLayout(null);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
	}
	
	public void CriaCompomentes(){
		excluir= new JLabel("Excluir: "+ this.cliente.getNome() +" ?");
		excluir.setForeground(Color.black);
		excluir.setBounds(10, 10, 300, 18);
		tela.add(excluir);
			getRootPane().setDefaultButton(ok); 
			ok= new JButton("OK");
			ok.setBounds(45, 50, 90, 18);
			this.tela.add(ok);
			
			cancelar= new JButton("cancelar");
			cancelar.setBounds(140, 50, 90, 18);
			this.tela.add(cancelar);
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
	
	public Cliente getCliente() {
		return cliente;
	}
	
	
	
}
