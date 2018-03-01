package br.com.gsv.produtos.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Vector;

import javax.swing.AbstractAction;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComponent;
import javax.swing.JRootPane;
import javax.swing.KeyStroke;

import br.com.gsv.fabricantes.domain.Fabricante;
import br.com.gsv.produtos.domain.Produto;
import br.com.gsv.produtos.formularios.IncluirProdutosForm;
import br.com.projeto.gsv.controller.ProdutoController;
import br.com.projeto.gsv.util.ConverteDadosUtil;

public class IncluirProdutoListener implements ActionListener {
	private IncluirProdutosForm formulario;
	private ProdutoController con;
	private Produto produto;
	private Fabricante fabricante;
	
	
	
	public IncluirProdutoListener(IncluirProdutosForm formulario) {
		this.formulario = formulario;
		con = new ProdutoController();
		ListaFabricantes();
		AdicionaListener();
		UsandoTAB();
		TeclaEsc();
	}
	
	
	private void AdicionaListener(){
		this.formulario.getBTCancelar().addActionListener(this);
		this.formulario.getBTGravar().addActionListener(this);
		this.formulario.getBTNovo().addActionListener(this);
	}
	
	
	private void Salvar(){
		FormToProduto();
		con.setProduto(this.produto);
		con.SalvarProduto();
	}
	
		
	
	public void InicializaObjetos(){
		this.produto = new Produto();
		this.fabricante = new Fabricante();
	}
	
	
	
	
	private void FormToProduto(){
		this.produto.setCodigo(this.formulario.getTCodigo().getText());
		this.produto.setDescricao(this.formulario.getTDescricao().getText());
		this.produto.setQuantidade(ConverteDadosUtil.RetornaInt(this.formulario.getTQuantidade().getText()));
		this.produto.setLote(ConverteDadosUtil.RetornaInt(this.formulario.getTLote().getText()));
		this.produto.setMedida(this.formulario.getTMedida().getText());
		this.produto.setClasseTerapeutica(this.formulario.getTClasse().getText());
		this.produto.setFabricante((Fabricante) this.formulario.getComboFabricante().getSelectedItem());
	}
	
	
	
	/*-----------------------------------------------------------------------------------------------------------------*/
	/*---------------------------------------CLASSES PARA EDICAO DOS OBJETOS-------------------------------------------*/
	public void AlterandoProdutos(){
		this.formulario.getTCodigo().setText(this.produto.getCodigo());
		this.formulario.getTDescricao().setText(this.produto.getDescricao());
		this.formulario.getTQuantidade().setText(String.valueOf(this.produto.getQuantidade()));
		this.formulario.getTLote().setText(String.valueOf(this.produto.getLote()));
		this.formulario.getTMedida().setText(this.produto.getMedida());
		this.formulario.getTClasse().setText(this.produto.getClasseTerapeutica());
		this.formulario.getComboFabricante().setSelectedItem(this.produto.getFabricante());
		
	}

	
	
	
	
	@Override
	public void actionPerformed(ActionEvent event) {
		if(event.getSource().equals(this.formulario.getBTGravar())){
			Salvar();
		}
		
		if(event.getSource().equals(this.formulario.getBTNovo())){
			//this.formulario = new IncluirProdutosForm();
		}
		
		if(event.getSource().equals(this.formulario.getBTCancelar())){
			this.formulario.dispose();
			
		}
	}
	
	
	
	
	
	
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void ListaFabricantes(){
		this.formulario.getComboFabricante().setModel(new DefaultComboBoxModel(new Vector(con.RetornaFabricante())));
	}
	
	
	private void UsandoTAB(){
		this.formulario.getRootPane().setDefaultButton(this.formulario.getBTGravar());
		this.formulario.getBTGravar().addKeyListener(new KeyAdapter() {  
            public void keyPressed(KeyEvent e) {  
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {  
                	formulario.getBTGravar().doClick();
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
	
	
	public void TeclaEsc(){
        JRootPane meurootpane = this.formulario.getRootPane();  
        meurootpane.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), "ESCAPE");  
        meurootpane.getRootPane().getActionMap().put("ESCAPE", new AbstractAction("ESCAPE") {  
  
            public void actionPerformed(ActionEvent e) {  
            	formulario.dispose();  
            }  
        });  
    }  

	
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	public Produto getProduto() {
		return produto;
	}

}
