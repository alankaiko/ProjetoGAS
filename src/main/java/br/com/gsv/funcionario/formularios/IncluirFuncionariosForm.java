package br.com.gsv.funcionario.formularios;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import br.com.gsv.funcionario.grafico.IncluirFuncionarioClassic;
import br.com.gsv.funcionarios.listeners.IncluirFuncionarioListener;
import br.com.projeto.gsv.util.ConverteDadosUtil;

public class IncluirFuncionariosForm extends JDialog {
	private IncluirFuncionarioListener listener;
	private JPanel panel = new JPanel();
	private Container tela = getContentPane();
	private JLabel LId, LNome, LCpf, LRg;
	private JLabel LIndentif, LEndereco, LLogradouro, LComplemento;
	private JLabel LNumero, LBairro, LCidade, LCep, LContato, LEmail, LCelular, LTelefone, LEstado;
	private JTextField TId, TNome, TRg, TLogradouro, TComplemento, TNumero;
	private JTextField TBairro, TCidade, TEmail, TTelefone, TCelular;
	private JFormattedTextField JCpf, JCep;
	private JButton BTNovo, BTGravar, BTCancelar;
	private JComboBox ComboEstado;
	private IncluirFuncionarioClassic listenerClassic;
	
	
	//metodo construtor que inicia tudo
	public IncluirFuncionariosForm() {
		InicializaVariaveis();
		InicializaCompomentes();
		listener = new IncluirFuncionarioListener(this);
		listenerClassic = new IncluirFuncionarioClassic(this);
	}
	
	private void InicializaVariaveis(){
		LId = new JLabel();
		LNome = new JLabel();
		LCpf = new JLabel();
		LRg = new JLabel();
		LIndentif = new JLabel();
		LEndereco = new JLabel();
		LLogradouro = new JLabel();
		LComplemento = new JLabel();
		LNumero = new JLabel();
		LBairro = new JLabel();
		LCidade = new JLabel();
		LCep = new JLabel();
		LContato = new JLabel();
		LEmail = new JLabel();
		LCelular = new JLabel();
		LTelefone = new JLabel();
		LEstado = new JLabel();
		TId = new JTextField();
		TNome = new JTextField();
		TRg = new JTextField();
		TLogradouro = new JTextField();
		TComplemento = new JTextField();
		TNumero = new JTextField();
		TBairro = new JTextField();
		TCidade = new JTextField();
		TEmail = new JTextField();
		TTelefone = new JTextField();
		TCelular = new JTextField();
		JCpf = new JFormattedTextField(ConverteDadosUtil.FormataCPF());
		JCep = new JFormattedTextField(ConverteDadosUtil.FormataCep());
		BTNovo = new JButton();
		BTGravar = new JButton();
		BTCancelar = new JButton();
		ComboEstado = new JComboBox();
	}
	
	//classe que adiciona os componentes criados no metodo anterior à tela geral
	public void InicializaCompomentes(){
		tela.add(this.TId);
		tela.add(this.TNome );
		tela.add(this.TRg);
		tela.add(this.LId);
		tela.add(this.LNome);
		tela.add(this.LRg);
		tela.add(this.LIndentif);	
		tela.add(this.JCpf);
		tela.add(this.JCep);
		tela.add(this.LEndereco);
		tela.add(this.LLogradouro);
		tela.add(this.TLogradouro);
		tela.add(this.LComplemento);
		tela.add(this.TComplemento);
		tela.add(this.LNumero);
		tela.add(this.LBairro);
		tela.add(this.LCidade);
		tela.add(this.LCep);
		tela.add(this.TNumero);
		tela.add(this.TBairro);
		tela.add(this.TCidade);
		tela.add(this.LContato);
		tela.add(this.LEmail);
		tela.add(this.LCelular);
		tela.add(this.LTelefone);
		tela.add(this.TEmail);
		tela.add(this.TTelefone);
		tela.add(this.TCelular);
		tela.add(this.BTNovo);
		tela.add(this.BTGravar);
		tela.add(this.BTCancelar);
		tela.add(this.ComboEstado);
		tela.add(this.LEstado);
	}



	public JPanel getPanel() {
		return panel;
	}


	public void setPanel(JPanel panel) {
		this.panel = panel;
	}


	public Container getTela() {
		return tela;
	}


	public void setTela(Container tela) {
		this.tela = tela;
	}


	public JLabel getLId() {
		return LId;
	}

	public void setLId(JLabel lId) {
		LId = lId;
	}


	public JLabel getLNome() {
		return LNome;
	}


	public void setLNome(JLabel lNome) {
		LNome = lNome;
	}


	public JLabel getLCpf() {
		return LCpf;
	}



	public void setLCpf(JLabel lCpf) {
		LCpf = lCpf;
	}



	public JLabel getLRg() {
		return LRg;
	}

	public void setLRg(JLabel lRg) {
		LRg = lRg;
	}


	public JLabel getLIndentif() {
		return LIndentif;
	}


	public void setLIndentif(JLabel lIndentif) {
		LIndentif = lIndentif;
	}



	public JLabel getLEndereco() {
		return LEndereco;
	}


	public void setLEndereco(JLabel lEndereco) {
		LEndereco = lEndereco;
	}


	public JLabel getLLogradouro() {
		return LLogradouro;
	}


	public void setLLogradouro(JLabel lLogradouro) {
		LLogradouro = lLogradouro;
	}


	public JLabel getLComplemento() {
		return LComplemento;
	}


	public void setLComplemento(JLabel lComplemento) {
		LComplemento = lComplemento;
	}



	public JLabel getLNumero() {
		return LNumero;
	}


	public void setLNumero(JLabel lNumero) {
		LNumero = lNumero;
	}

	public JLabel getLBairro() {
		return LBairro;
	}


	public void setLBairro(JLabel lBairro) {
		LBairro = lBairro;
	}


	public JLabel getLCidade() {
		return LCidade;
	}


	public void setLCidade(JLabel lCidade) {
		LCidade = lCidade;
	}

	public JLabel getLCep() {
		return LCep;
	}

	
	public void setLCep(JLabel lCep) {
		LCep = lCep;
	}


	public JLabel getLContato() {
		return LContato;
	}


	public void setLContato(JLabel lContato) {
		LContato = lContato;
	}



	public JLabel getLEmail() {
		return LEmail;
	}


	public void setLEmail(JLabel lEmail) {
		LEmail = lEmail;
	}


	public JLabel getLCelular() {
		return LCelular;
	}


	public void setLCelular(JLabel lCelular) {
		LCelular = lCelular;
	}



	public JLabel getLTelefone() {
		return LTelefone;
	}



	public void setLTelefone(JLabel lTelefone) {
		LTelefone = lTelefone;
	}


	public JLabel getLEstado() {
		return LEstado;
	}


	public void setLEstado(JLabel lEstado) {
		LEstado = lEstado;
	}


	public JTextField getTId() {
		return TId;
	}


	public void setTId(JTextField tId) {
		TId = tId;
	}

	public JTextField getTNome() {
		return TNome;
	}


	public void setTNome(JTextField tNome) {
		TNome = tNome;
	}


	public JTextField getTRg() {
		return TRg;
	}

	public void setTRg(JTextField tRg) {
		TRg = tRg;
	}



	public JTextField getTLogradouro() {
		return TLogradouro;
	}


	public void setTLogradouro(JTextField tLogradouro) {
		TLogradouro = tLogradouro;
	}


	public JTextField getTComplemento() {
		return TComplemento;
	}

	public void setTComplemento(JTextField tComplemento) {
		TComplemento = tComplemento;
	}



	public JTextField getTNumero() {
		return TNumero;
	}


	public void setTNumero(JTextField tNumero) {
		TNumero = tNumero;
	}


	public JTextField getTBairro() {
		return TBairro;
	}


	public void setTBairro(JTextField tBairro) {
		TBairro = tBairro;
	}


	public JTextField getTCidade() {
		return TCidade;
	}

	public void setTCidade(JTextField tCidade) {
		TCidade = tCidade;
	}


	public JTextField getTEmail() {
		return TEmail;
	}


	public void setTEmail(JTextField tEmail) {
		TEmail = tEmail;
	}


	public JTextField getTTelefone() {
		return TTelefone;
	}


	public void setTTelefone(JTextField tTelefone) {
		TTelefone = tTelefone;
	}


	public JTextField getTCelular() {
		return TCelular;
	}


	public void setTCelular(JTextField tCelular) {
		TCelular = tCelular;
	}

	public JFormattedTextField getJCpf() {
		return JCpf;
	}

	public void setJCpf(JFormattedTextField jCpf) {
		JCpf = jCpf;
	}


	public JFormattedTextField getJCep() {
		return JCep;
	}

	public void setJCep(JFormattedTextField jCep) {
		JCep = jCep;
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

	public JComboBox getComboEstado() {
		return ComboEstado;
	}

	public void setComboEstado(JComboBox comboEstado) {
		ComboEstado = comboEstado;
	}

	public IncluirFuncionarioListener getListener() {
		return listener;
	}

	
}
