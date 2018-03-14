package br.com.gsv.zprincipal.listeners;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.Calendar;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

import br.com.gsv.zprincipal.form.TelaPrincipalClassic;
import br.com.projeto.gsv.util.ListasUtil;

public class BarraStatusListener {
	private TelaPrincipalClassic tela;
	
	
	public BarraStatusListener(TelaPrincipalClassic tela) {
		this.tela = tela;
		BarraDeStatus();
	}
	
	
	
	private void BarraDeStatus(){
		BorderLayout layout = new BorderLayout();
		this.tela.getPainelPrincipal().setLayout(layout);
	    Border border = BorderFactory.createLoweredBevelBorder();
	    
	    this.tela.getHoras().setText("HORAS");
	    this.tela.getHoras().setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
	    this.tela.getHoras().setForeground(Color.WHITE);
	    this.tela.getHoras().setPreferredSize(new Dimension(75, 20));
	    this.tela.getHoras().setBorder(border);
	    
	    this.tela.getData().setText("DATA");
	    this.tela.getData().setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
	    this.tela.getData().setForeground(Color.WHITE);
	    this.tela.getData().setPreferredSize(new Dimension(260, 20));
	    this.tela.getData().setBorder(border);
	    
	    this.tela.getUsuarioLogado().setText("Usu�rio: ");
	    this.tela.getUsuarioLogado().setForeground(Color.WHITE);
	    this.tela.getUsuarioLogado().setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
	    this.tela.getUsuarioLogado().setPreferredSize(new Dimension(400, 20));
	    this.tela.getUsuarioLogado().setBorder(border);
	    
	   
	    
		
	    this.tela.getInferior().setForeground(Color.WHITE);
	    this.tela.getInferior().setBackground(new Color(119,119,119));
	    this.tela.getInferior().setLayout(new FlowLayout(FlowLayout.LEFT, 1, 0));
	    this.tela.getInferior().add(this.tela.getHoras());
	    this.tela.getInferior().add(this.tela.getData());
	    this.tela.getInferior().add(this.tela.getUsuarioLogado());
	    
	    this.tela.getPainelPrincipal().add(this.tela.getInferior(), BorderLayout.SOUTH);
	    
	    
	    ActionListener tarefa = new ActionListener(){
	      public void actionPerformed(ActionEvent e){
	        horasData();
	      }
	    };

	    javax.swing.Timer timer = new javax.swing.Timer(1000, tarefa);
	    timer.start();
	    
	}
	
	private void horasData(){
		Calendar agora = Calendar.getInstance();
		int ho = agora.get(Calendar.HOUR_OF_DAY);
		int mi = agora.get(Calendar.MINUTE);
		int se = agora.get(Calendar.SECOND);
		
		int ds = agora.get(Calendar.DAY_OF_WEEK);
		int dia = agora.get(Calendar.DAY_OF_MONTH);
		int mes = agora.get(Calendar.MONTH);
		int ano = agora.get(Calendar.YEAR);
		
		this.tela.getHoras().setText(formatar(ho % 24) + ":" + formatar(mi) + ":" + formatar(se) + "");
		
		this.tela.getData().setText(ListasUtil.DiasSemana().get(ds -1) + ", " + formatar(dia) + " de " + ListasUtil.Meses().get(mes) + " de " + ano + "");
	}
	  
	private String formatar(int num){
		DecimalFormat df = new DecimalFormat("00");
		    
		return df.format(num);
	}
		  
	
}
