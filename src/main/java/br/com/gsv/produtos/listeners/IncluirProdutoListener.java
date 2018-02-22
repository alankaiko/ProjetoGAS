package br.com.gsv.produtos.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JRootPane;
import javax.swing.KeyStroke;

import br.com.gsv.produtos.domain.Fabricante;
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
		AdicionaListener();
		UsandoTAB();
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
	
	private void Editar(){
		EditaProduto();
		con.setProduto(this.produto);
	}
	
	
	
	
	
	
	
	
	
	
	
	private void FormToProduto(){
		produto = new Produto();
		fabricante = new Fabricante();
		this.produto.setCodigo(this.formulario.getTCodigo().getText());
		this.produto.setDescricao(this.formulario.getTDescricao().getText());
		this.produto.setQuantidade(ConverteDadosUtil.RetornaInt(this.formulario.getTQuantidade().getText()));
		this.produto.setLote(ConverteDadosUtil.RetornaInt(this.formulario.getTLote().getText()));
		this.produto.setMedida(this.formulario.getTMedida().getText());
		this.produto.setClasseTerapeutica(this.formulario.getTClasse().getText());
		this.fabricante.setDescricao(this.formulario.getTFabricante().getText());
		this.produto.setFabricante(this.fabricante);
	}
	
	
	private void EditaProduto(){
		this.produto.setCodigo(this.formulario.getTCodigo().getText());
		this.produto.setDescricao(this.formulario.getTDescricao().getText());
		this.produto.setQuantidade(ConverteDadosUtil.RetornaInt(this.formulario.getTQuantidade().getText()));
		this.produto.setLote(ConverteDadosUtil.RetornaInt(this.formulario.getTLote().getText()));
		this.produto.setMedida(this.formulario.getTMedida().getText());
		this.produto.setClasseTerapeutica(this.formulario.getTClasse().getText());
		this.produto.getFabricante().setDescricao(this.formulario.getTFabricante().getText());
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
		this.formulario.getTFabricante().setText(this.produto.getFabricante().getDescricao());
	}

	
	/*-----------------------------------------------------------------------------------------------------------------*/
	/*---------------------------------------CLASSES PARA DETALHAR OBJETOS-------------------------------------------*/
	public void DetalhandoProdutos(){
		this.formulario.getTCodigo().setEditable(false);
		this.formulario.getTDescricao().setEditable(false);
		this.formulario.getTQuantidade().setEditable(false);
		this.formulario.getTLote().setEditable(false);
		this.formulario.getTMedida().setEditable(false);
		this.formulario.getTClasse().setEditable(false);
		this.formulario.getTFabricante().setEditable(false);
				
	}
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent event) {
		if(event.getSource().equals(this.formulario.getBTGravar())){
			Salvar();
			System.out.println("botao gravar");
		}
		
		if(event.getSource().equals(this.formulario.getBTNovo())){
			//this.formulario = new IncluirProdutosForm();
			System.out.println("botao novo");
		}
		
		if(event.getSource().equals(this.formulario.getBTCancelar())){
			System.out.println("botao cancelar");
			this.formulario.dispose();
			
		}
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
