package br.com.gsv.produtos.formularios;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.util.Vector;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import br.com.gsv.produtos.listeners.IncluirProdutoListener;
import br.com.projeto.gsv.util.ListasUtil;

public class IncluirProdutosForm extends JDialog {
	private static final long serialVersionUID = 1L;
	private IncluirProdutoListener listener;
	
	public IncluirProdutosForm() {
		CriarTelaGeral();
		CriaComponentes();
		InicializaComponentes();
		listener = new IncluirProdutoListener(this);
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
		LDados.setBounds(38, 29, 130, 14);
		
		LCodigo = new JLabel("Código");
		LCodigo.setBounds(38, 62, 70, 14);
			TCodigo = new JTextField();
			TCodigo.setBounds(100, 59, 86, 20);
			TCodigo.setColumns(10);
		
		LDescricao = new JLabel("Descrição");
		LDescricao.setBounds(38, 104, 70, 14);
			TDescricao = new JTextField();
			TDescricao.setBounds(106, 101, 328, 20);
			TDescricao.setColumns(10);
		
		LQuantidade = new JLabel("Quantidade");
		LQuantidade.setBounds(38, 171, 94, 14);
			TQuantidade = new JTextField();
			TQuantidade.setBounds(121, 168, 124, 20);
			TQuantidade.setColumns(10);
		
		LLote = new JLabel("Lote");
		LLote.setBounds(296, 171, 70, 14);
			TLote = new JTextField();
			TLote.setBounds(356, 168, 153, 20);
			TLote.setColumns(10);
		
		LMedida = new JLabel("Unidade Medida");
		LMedida.setBounds(38, 221, 134, 14);
			TMedida = new JTextField();
			TMedida.setBounds(143, 218, 102, 20);
			TMedida.setColumns(10);
		
		LClasse = new JLabel("Classe Terapeutica");
		LClasse.setBounds(296, 221, 118, 14);
			TClasse = new JTextField();
			TClasse.setBounds(425, 218, 165, 20);
			TClasse.setColumns(10);
		
		LFabricante = new JLabel("Fabricante");
		LFabricante.setBounds(38, 304, 113, 14);
			comboFabricante = new JComboBox();
			comboFabricante.setBounds(125, 301, 241, 20);

		
		BTNovo = new JButton("Novo");
		BTNovo.setFont(new Font("Calibri", Font.PLAIN, 12));
		BTNovo.setBounds(111, 398, 89, 23);
		
		BTGravar = new JButton("Gravar");
		BTGravar.setFont(new Font("Calibri", Font.PLAIN, 12));
		BTGravar.setBounds(210, 398, 89, 23);
		
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
		tela.add(comboFabricante);
		tela.add(BTCancelar);
		tela.add(BTGravar);
		tela.add(BTNovo);
		tela.add(TQuantidade);
	}
	
	
	private final JPanel contentPanel = new JPanel();
	private Container tela = getContentPane();
	private JButton BTNovo, BTGravar, BTCancelar;
	private JTextField TCodigo, TDescricao, TLote, TMedida, TClasse, TQuantidade;
	private JLabel LDados, LCodigo, LDescricao, LQuantidade, LLote, LMedida, LClasse, LFabricante;
	private JComboBox comboFabricante;

	
	public IncluirProdutoListener getListener() {
		return listener;
	}
	public void setListener(IncluirProdutoListener listener) {
		this.listener = listener;
	}


	public JButton getBTNovo() {
		return BTNovo;
	}


	public void setBTNovo(JButton bTNovo) {
		BTNovo = bTNovo;
	}


	public JButton getBTGravar() {
		return BTGravar;
	}


	public void setBTGravar(JButton bTGravar) {
		BTGravar = bTGravar;
	}


	public JButton getBTCancelar() {
		return BTCancelar;
	}


	public void setBTCancelar(JButton bTCancelar) {
		BTCancelar = bTCancelar;
	}


	public JTextField getTCodigo() {
		return TCodigo;
	}


	public void setTCodigo(JTextField tCodigo) {
		TCodigo = tCodigo;
	}


	public JTextField getTDescricao() {
		return TDescricao;
	}


	public void setTDescricao(JTextField tDescricao) {
		TDescricao = tDescricao;
	}


	public JTextField getTLote() {
		return TLote;
	}


	public void setTLote(JTextField tLote) {
		TLote = tLote;
	}


	public JTextField getTMedida() {
		return TMedida;
	}


	public void setTMedida(JTextField tMedida) {
		TMedida = tMedida;
	}


	public JTextField getTClasse() {
		return TClasse;
	}


	public void setTClasse(JTextField tClasse) {
		TClasse = tClasse;
	}

	public void setComboFabricante(JComboBox comboFabricante) {
		this.comboFabricante = comboFabricante;
	}
	
	public JComboBox getComboFabricante() {
		return comboFabricante;
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


	public JTextField getTQuantidade() {
		return TQuantidade;
	}


	public void setTQuantidade(JTextField tQuantidade) {
		TQuantidade = tQuantidade;
	}
		
		
		
}
