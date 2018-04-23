package br.com.gsv.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JRootPane;
import javax.swing.KeyStroke;

import br.com.gsv.domain.Produto;
import br.com.gsv.formularios.DetalhesProdutoDialog;

public class DetalhesProdutoListener implements ActionListener{
	private Produto produto;
	private DetalhesProdutoDialog formulario;

	
	public DetalhesProdutoListener(DetalhesProdutoDialog formulario) {
		this.formulario = formulario;
		AdicionarListener();
		UsandoTAB();
		TeclaEsc();
	}

	
	public void AdicionarListener(){
		this.formulario.getBTCancelar().addActionListener(this);
	}
	
	
	
	public void Detalhar(){
		this.formulario.getTCodigo().setText(this.produto.getCodigo());
		this.formulario.getTDescricao().setText(this.produto.getDescricao());
		this.formulario.getTQuantidade().setText(String.valueOf(this.produto.getQuantidade()));
		this.formulario.getTFabricante().setText(this.produto.getFabricante().getDescricao());
	}
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent event) {
		if(event.getSource().equals(this.formulario.getBTCancelar())){
			this.formulario.dispose();
		}
	}
	
	
	private void UsandoTAB(){
		this.formulario.getRootPane().setDefaultButton(this.formulario.getBTCancelar());
		this.formulario.getBTCancelar().addKeyListener(new KeyAdapter() {  
            public void keyPressed(KeyEvent e) {  
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {  
                	formulario.getBTCancelar().doClick();  
                }  
            }  
        });
	}
	
	
	
	public void TeclaEsc(){
        JRootPane meurootpane = this.formulario.getRootPane();  
        meurootpane.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), "ESCAPE");  
        meurootpane.getRootPane().getActionMap().put("ESCAPE", new AbstractAction("ESCAPE") {  
  
            /**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			public void actionPerformed(ActionEvent e) {  
            	formulario.dispose();  
            }  
        });  
    } 

	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
}
