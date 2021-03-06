package br.com.gsv.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;

import javax.swing.AbstractAction;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComponent;
import javax.swing.JRootPane;
import javax.swing.KeyStroke;

import br.com.gsv.domain.Fabricante;
import br.com.gsv.domain.Produto;
import br.com.gsv.formularios.IncluirFabricantesForm;
import br.com.gsv.formularios.IncluirProdutosForm;
import br.com.gsv.util.ConverteDadosUtil;
import br.com.gsv.util.MensagemPainelUtil;
import br.com.gsv.util.ValidaCampos;
import br.com.projeto.gsv.controller.ProdutoController;

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
		HiperlinkAdicionarFab();
		TeclaEsc();
	}
	
	
	private void AdicionaListener(){
		this.formulario.getBTCancelar().addActionListener(this);
		this.formulario.getBTGravar().addActionListener(this);
		
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
		FormaFab();
	}
	
	private void FormaFab(){
		if(this.formulario.getComboFabricante().getSelectedIndex() != -1){
			this.produto.setFabricante((Fabricante) this.formulario.getComboFabricante().getSelectedItem()); 
		}else{
			this.produto.setFabricante(fabricante);
		}
	}
	
	/*-----------------------------------------------------------------------------------------------------------------*/
	/*---------------------------------------CLASSES PARA EDICAO DOS OBJETOS-------------------------------------------*/
	public void AlterandoProdutos(){
		this.formulario.getTCodigo().setText(this.produto.getCodigo());
		this.formulario.getTDescricao().setText(this.produto.getDescricao());
		this.formulario.getTQuantidade().setText(String.valueOf(this.produto.getQuantidade()));
		this.formulario.getComboFabricante().setSelectedItem(this.produto.getFabricante());
		
	}

	
	
	
	
	@Override
	public void actionPerformed(ActionEvent event) {
		if(event.getSource().equals(this.formulario.getBTGravar()) && Validando()){
			Salvar();
			this.formulario.dispose();
			
		}else if(event.getSource().equals(this.formulario.getBTCancelar())){
			this.formulario.dispose();
			
		}else{
			MensagemPainelUtil.ErroDuplicacao("Campo Código/ Descrição deverá ser preenchido");
		}
	}
	
	
	private boolean Validando(){
		return ValidaCampos.Validar(this.formulario.getTCodigo().getText())
				&& ValidaCampos.Validar(this.formulario.getTDescricao().getText());
	}
	
	
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void ListaFabricantes(){
		this.formulario.getComboFabricante().setModel(new DefaultComboBoxModel(new Vector(con.RetornaFabricante())));
		this.formulario.getComboFabricante().setSelectedIndex(-1);
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
	
	private void HiperlinkAdicionarFab(){
		this.formulario.getLAdicionaFabricante().addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseClicked(MouseEvent e) {
		         IncluirFabricantesForm formu = new IncluirFabricantesForm();
		         formu.setLocationRelativeTo(formulario.getTela());
		         formu.setVisible(true);
		         ListaFabricantes();
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
