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
		LDados.setBounds(38, 29, 94, 14);
		
		LCodigo = new JLabel("Código");
		LCodigo.setBounds(38, 62, 46, 14);
			TCodigo = new JLabel();
			TCodigo.setBounds(86, 59, 86, 20);
		
		LDescricao = new JLabel("Descrição");
		LDescricao.setBounds(38, 104, 46, 14);
			TDescricao = new JLabel();
			TDescricao.setBounds(86, 101, 328, 20);
		
		LQuantidade = new JLabel("Quantidade");
		LQuantidade.setBounds(38, 171, 86, 14);
			TQuantidade = new JLabel();
			TQuantidade.setBounds(99, 168, 124, 20);
		
		LLote = new JLabel("Lote");
		LLote.setBounds(296, 171, 46, 14);
			TLote = new JLabel();
			TLote.setBounds(327, 168, 153, 20);
		
		LMedida = new JLabel("Unidade Medida");
		LMedida.setBounds(38, 221, 109, 14);
			TMedida = new JLabel();
			TMedida.setBounds(121, 218, 102, 20);
		
		LClasse = new JLabel("Classe Terapeutica");
		LClasse.setBounds(296, 221, 102, 14);
			TClasse = new JLabel();
			TClasse.setBounds(395, 218, 165, 20);
		
		LFabricante = new JLabel("Fabricante");
		LFabricante.setBounds(38, 304, 86, 14);
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
		tela.add(LLote);
		tela.add(TLote);
		tela.add(LMedida);
		tela.add(TMedida);
		tela.add(LClasse);
		tela.add(TClasse);
		tela.add(LFabricante);
		tela.add(TFabricante);
		tela.add(BTCancelar);
		tela.add(TQuantidade);
	}

	private final JPanel contentPanel = new JPanel();
	private Container tela = getContentPane();
	private JButton BTCancelar;
	private JLabel TCodigo, TDescricao, TLote, TMedida, TClasse,TFabricante, TQuantidade;
	private JLabel LDados, LCodigo, LDescricao, LQuantidade, LLote, LMedida, LClasse, LFabricante;
	
	
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


	public JLabel getTLote() {
		return TLote;
	}


	public void setTLote(JLabel tLote) {
		TLote = tLote;
	}


	public JLabel getTMedida() {
		return TMedida;
	}


	public void setTMedida(JLabel tMedida) {
		TMedida = tMedida;
	}


	public JLabel getTClasse() {
		return TClasse;
	}


	public void setTClasse(JLabel tClasse) {
		TClasse = tClasse;
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


	public JLabel getLDados() {
		return LDados;
	}


	public void setLDados(JLabel lDados) {
		LDados = lDados;
	}


	public JLabel getLCodigo() {
		return LCodigo;
	}


	public void setLCodigo(JLabel lCodigo) {
		LCodigo = lCodigo;
	}


	public JLabel getLDescricao() {
		return LDescricao;
	}


	public void setLDescricao(JLabel lDescricao) {
		LDescricao = lDescricao;
	}


	public JLabel getLQuantidade() {
		return LQuantidade;
	}


	public void setLQuantidade(JLabel lQuantidade) {
		LQuantidade = lQuantidade;
	}


	public JLabel getLLote() {
		return LLote;
	}


	public void setLLote(JLabel lLote) {
		LLote = lLote;
	}


	public JLabel getLMedida() {
		return LMedida;
	}


	public void setLMedida(JLabel lMedida) {
		LMedida = lMedida;
	}


	public JLabel getLClasse() {
		return LClasse;
	}


	public void setLClasse(JLabel lClasse) {
		LClasse = lClasse;
	}


	public JLabel getLFabricante() {
		return LFabricante;
	}


	public void setLFabricante(JLabel lFabricante) {
		LFabricante = lFabricante;
	}

	

	
		
}
