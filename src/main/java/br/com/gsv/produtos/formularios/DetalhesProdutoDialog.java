package br.com.gsv.produtos.formularios;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.com.gsv.produtos.listeners.DetalhesProdutoListener;

public class DetalhesProdutoDialog extends JDialog {
	private static final long serialVersionUID = 1L;
	private DetalhesProdutoListener listener;	
		
	
	public DetalhesProdutoDialog() {
		CriarTelaGeral();
		CriaComponentes();
		InicializaComponentes();
		listener = new DetalhesProdutoListener(this);
	}
	
	
	//cria e tela geral onde todos os componentes serao inseridos, é a tela geral do sistema
	private void CriarTelaGeral(){
		this.setTitle("Inserir Dados de Produtos");
		this.setModal(true);
		this.setResizable(false);
		this.setBounds(100, 100, 650, 460);
		
		this.tela.setLayout(null);		
		this.tela.add(contentPanel, BorderLayout.CENTER);
		
		contentPanel.setLayout(null);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		
	}
		
	
	private void CriaComponentes(){
		LDados = new JLabel("Dados do Produto");
		LDados.setBounds(38, 29, 134, 14);
		
		LCodigo = new JLabel("Código");
		LCodigo.setBounds(38, 62, 68, 14);
			TCodigo = new JLabel();
			TCodigo.setBounds(86, 59, 86, 20);
		
		LDescricao = new JLabel("Descrição");
		LDescricao.setBounds(38, 104, 68, 14);
			TDescricao = new JLabel();
			TDescricao.setBounds(106, 101, 328, 20);
		
		LQuantidade = new JLabel("Quantidade");
		LQuantidade.setBounds(38, 171, 102, 14);
			TQuantidade = new JLabel();
			TQuantidade.setBounds(115, 168, 124, 20);
	
		
		LFabricante = new JLabel("Fabricante");
		LFabricante.setBounds(38, 304, 102, 14);
			TFabricante = new JLabel();
			TFabricante.setBounds(101, 301, 241, 20);
				
		BTCancelar = new JButton("Cancelar");
		BTCancelar.setFont(new Font("Calibri", Font.PLAIN, 12));
		BTCancelar.setBounds(522, 398, 89, 23);
	}
	
	private void InicializaComponentes(){
		tela.add(LDados);
		tela.add(LCodigo);
		tela.add(TCodigo);
		tela.add(LDescricao);
		tela.add(TDescricao);
		tela.add(LQuantidade);
		tela.add(LFabricante);
		tela.add(TFabricante);
		tela.add(BTCancelar);
		tela.add(TQuantidade);
	}

	private final JPanel contentPanel = new JPanel();
	private Container tela = getContentPane();
	private JButton BTCancelar;
	private JLabel TCodigo, TDescricao, TFabricante, TQuantidade;
	private JLabel LDados, LCodigo, LDescricao, LQuantidade, LFabricante;
	
	
	public DetalhesProdutoListener getListener() {
		return listener;
	}
	
	public void setListener(DetalhesProdutoListener listener) {
		this.listener = listener;
	}


	public JButton getBTCancelar() {
		return BTCancelar;
	}


	public void setBTCancelar(JButton bTCancelar) {
		BTCancelar = bTCancelar;
	}


	public JLabel getTCodigo() {
		return TCodigo;
	}


	public void setTCodigo(JLabel tCodigo) {
		TCodigo = tCodigo;
	}


	public JLabel getTDescricao() {
		return TDescricao;
	}


	public void setTDescricao(JLabel tDescricao) {
		TDescricao = tDescricao;
	}



	public JLabel getTFabricante() {
		return TFabricante;
	}


	public void setTFabricante(JLabel tFabricante) {
		TFabricante = tFabricante;
	}


	public JLabel getTQuantidade() {
		return TQuantidade;
	}


	public void setTQuantidade(JLabel tQuantidade) {
		TQuantidade = tQuantidade;
	}



		
}
