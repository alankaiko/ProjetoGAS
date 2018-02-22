package br.com.gsv.produtos.formularios;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import br.com.gsv.produtos.listeners.CodigoProdutoListener;

public class CodigoProdutoDialog extends JDialog {
	private static final long serialVersionUID = 1L;
	private CodigoProdutoListener listener;
	
	public CodigoProdutoDialog() {
		CriaTelaGeral();
		CriarTela();
		AdicionaNaTela();
		listener = new CodigoProdutoListener(this);
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


	
	private final JPanel contentPanel = new JPanel();
	private JButton ok, cancelar;
	private Container tela= getContentPane();
	private JTextField TBuscar;
	private Long codigo;
	
	
	

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
