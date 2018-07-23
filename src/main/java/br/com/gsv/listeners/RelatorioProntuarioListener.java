package br.com.gsv.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;

import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JRootPane;
import javax.swing.KeyStroke;

import br.com.gsv.formularios.RelatorioProntuarioClassic;
import br.com.gsv.relatorios.RelatorioProntuario;
import br.com.gsv.relatorios.RelatorioProntuarioData;

import com.itextpdf.text.DocumentException;

public class RelatorioProntuarioListener implements ActionListener{
	private RelatorioProntuarioClassic formulario;
	
	public RelatorioProntuarioListener(RelatorioProntuarioClassic formulario) {
		this.formulario = formulario;
		AdicionaComponentes();
		UsandoTAB();
		TeclaEsc();
	}
	
	
	
	private void AdicionaComponentes(){
		formulario.getBTGerar().addActionListener(this);
		formulario.getBTCancelar().addActionListener(this);
	}


	
	private void UsandoTAB(){
		this.formulario.getRootPane().setDefaultButton(this.formulario.getBTGerar());
		this.formulario.getBTGerar().addKeyListener(new KeyAdapter() {  
            public void keyPressed(KeyEvent e) {  
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {  
                	formulario.getBTGerar().doClick();  
                }  
            }  
        });
		
		this.formulario.getBTCancelar().addKeyListener(new KeyAdapter() {  
            public void keyPressed(KeyEvent e) {  
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {  
                	formulario.getBTCancelar().doClick();  
                }  
            }  
        });

	}
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent event) {
		if(event.getSource().equals(this.formulario.getBTGerar())){
			if(this.formulario.getRadioFuncionario().isSelected())
				RelatorioProntu();
			
			if(this.formulario.getRadioRegCoren().isSelected())
				RelatorioProntuData();
			
			this.formulario.dispose();
		}
		
		if(event.getSource().equals(this.formulario.getBTCancelar())){
			this.formulario.dispose();
		}
	}
	
	
	private void RelatorioProntu(){
		try {
			RelatorioProntuario relFun = new RelatorioProntuario();
			relFun.Iniciar();
		} catch (IOException | DocumentException e) {
			e.printStackTrace();
		}
	}
	
	private void RelatorioProntuData(){
		try {
			RelatorioProntuarioData relFun = new RelatorioProntuarioData();
			relFun.Iniciar();
		} catch (IOException | DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	public void TeclaEsc(){
        JRootPane meurootpane = this.formulario.getRootPane();  
        meurootpane.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), "ESCAPE");  
        meurootpane.getRootPane().getActionMap().put("ESCAPE", new AbstractAction("ESCAPE") {  
  
            public void actionPerformed(ActionEvent e) {  
            	formulario.dispose();  
            }  
        });  
    } 
}
