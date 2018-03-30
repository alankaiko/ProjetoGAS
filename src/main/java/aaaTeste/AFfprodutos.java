package aaaTeste;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class AFfprodutos extends JDialog {

	private static final long serialVersionUID = 1L;
	
	
	
	public AFfprodutos() {
		CriarTelaGeral();
		CriaComponentes();
		InicializaComponentes();
		
	}
	
	
	//cria e tela geral onde todos os componentes serao inseridos, é a tela geral do sistema
	private void CriarTelaGeral(){
		this.setTitle("Inserir Dados de Produtos");
		this.setModal(true);
		this.setResizable(false);
		this.setBounds(100, 100, 489, 356);
		
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
		LQuantidade.setBounds(38, 145, 94, 14);
			TQuantidade = new JTextField();
			TQuantidade.setBounds(116, 142, 124, 20);
			TQuantidade.setColumns(10);
		
		
		LFabricante = new JLabel("Fabricante");
		LFabricante.setBounds(38, 196, 113, 14);
			comboFabricante = new JComboBox();
			comboFabricante.setBounds(106, 193, 241, 20);

			LAdicionaFabricante = new JLabel("Adicionar?");
			LAdicionaFabricante.setForeground(Color.BLUE);
			LAdicionaFabricante.setFont(new Font("Palatino Linotype", Font.PLAIN, 10));
			LAdicionaFabricante.setBounds(357, 202, 123, 14);
		
		BTNovo = new JButton("Novo");
		BTNovo.setFont(new Font("Calibri", Font.PLAIN, 12));
		BTNovo.setBounds(43, 276, 89, 23);
		
		BTGravar = new JButton("Gravar");
		BTGravar.setFont(new Font("Calibri", Font.PLAIN, 12));
		BTGravar.setBounds(142, 276, 89, 23);
		
		BTCancelar = new JButton("Cancelar");
		BTCancelar.setFont(new Font("Calibri", Font.PLAIN, 12));
		BTCancelar.setBounds(347, 276, 89, 23);
	}
	
	private void InicializaComponentes(){
		tela.add(LDados);
		tela.add(LCodigo);
		tela.add(TCodigo);
		tela.add(LDescricao);
		tela.add(TDescricao);
		tela.add(LQuantidade);
		tela.add(LFabricante);
		tela.add(comboFabricante);
		tela.add(BTCancelar);
		tela.add(BTGravar);
		tela.add(BTNovo);
		tela.add(TQuantidade);
		tela.add(LAdicionaFabricante);
		
	}
	
	
	private final JPanel contentPanel = new JPanel();
	private Container tela = getContentPane();
	private JButton BTNovo, BTGravar, BTCancelar;
	private JTextField TCodigo, TDescricao, TQuantidade;
	private JLabel LDados, LCodigo, LDescricao, LQuantidade, LFabricante, LAdicionaFabricante;
	private JComboBox comboFabricante;

	

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
	
	public void setLAdicionaFabricante(JLabel lAdicionaFabricante) {
		LAdicionaFabricante = lAdicionaFabricante;
	}
	
	public JLabel getLAdicionaFabricante() {
		return LAdicionaFabricante;
	}


	public Container getTela() {
		return tela;
	}


	public void setTela(Container tela) {
		this.tela = tela;
	}
	

}
