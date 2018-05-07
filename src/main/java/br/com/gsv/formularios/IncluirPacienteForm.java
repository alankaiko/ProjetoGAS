package br.com.gsv.formularios;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import br.com.gsv.graficoAzul.IncluirPacienteGrafic;
import br.com.gsv.graficoClassic.IncluirPacienteClassic;
import br.com.gsv.listeners.IncluirPacienteListener;
import br.com.gsv.util.ConverteDadosUtil;

public class IncluirPacienteForm extends JDialog {
	private IncluirPacienteListener listener;
	private JPanel panel = new JPanel();
	private Container tela = getContentPane();
	private JLabel LId, LNome, LDocumento, LRg, LDataNasc, LDataCad,LObservacao, LConvenio;
	private JLabel LIndentif, LEndereco, LLogradouro, LComplemento,LAdicionaConvenio;
	private JLabel LNumero, LBairro, LCidade, LCep, LContato, LEmail, LCelular,LTelefone, LEstado;
	private JTextField TId, TNome, TRg, TObservacao, TLogradouro, TComplemento,TNumero;
	private JTextField TBairro, TCidade, TEmail, TTelefone, TCelular;
	private JFormattedTextField JCpf, JDataNasc, JDataCadastro, JCep;
	private JButton BTGravar, BTCancelar;
	private JComboBox ComboEstado, ComboConvenio;
	private IncluirPacienteClassic listenerClassic;
	private IncluirPacienteGrafic listenerGrafic;

	
	public IncluirPacienteForm() {
		CriaVariaveis();
		InicializaCompomentes();
		listener = new IncluirPacienteListener(this);
	}
	
		
	private void CriaVariaveis(){
		TId = new JTextField();
		TNome = new JTextField();
		TRg = new JTextField();
		TObservacao = new JTextField();
		LId = new JLabel();
		LNome = new JLabel();
		LDocumento = new JLabel();
		LRg = new JLabel();
		LDataNasc = new JLabel();
		LDataCad = new JLabel();
		LObservacao = new JLabel();
		LIndentif = new JLabel();
		JDataCadastro= new JFormattedTextField(ConverteDadosUtil.FormataData());
		JCpf= new JFormattedTextField(ConverteDadosUtil.FormataCPF());
		JCep = new JFormattedTextField(ConverteDadosUtil.FormataCep());
		JDataNasc= new JFormattedTextField(ConverteDadosUtil.FormataData());
		LEndereco = new JLabel();
		LLogradouro = new JLabel();
		TLogradouro = new JTextField();
		LComplemento = new JLabel();
		TComplemento = new JTextField();
		LNumero = new JLabel();
		LBairro = new JLabel();
		LCidade = new JLabel();
		LCep = new JLabel();
		TNumero = new JTextField();
		TBairro = new JTextField();
		TCidade = new JTextField();
		LContato = new JLabel();
		LEmail = new JLabel();
		LCelular = new JLabel();
		LTelefone = new JLabel();
		TEmail = new JTextField();
		TTelefone = new JTextField();
		LAdicionaConvenio = new JLabel();
		TCelular = new JTextField();
		BTGravar = new JButton();
		BTCancelar = new JButton();
		ComboEstado = new JComboBox();
		ComboConvenio = new JComboBox();
		LConvenio = new JLabel();
		LEstado = new JLabel();
	}

	public void InicializaCompomentes() {
		tela.add(this.TId);
		tela.add(this.TNome);
		tela.add(this.TRg);
		tela.add(this.TObservacao);
		tela.add(this.LId);
		tela.add(this.LNome);
		tela.add(this.LDocumento);
		tela.add(this.LRg);
		tela.add(this.LDataNasc);
		tela.add(this.LDataCad);
		tela.add(this.LObservacao);
		tela.add(this.LIndentif);
		tela.add(this.JDataCadastro);
		tela.add(this.JCpf);
		tela.add(this.JCep);
		tela.add(this.JDataNasc);
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
		tela.add(this.LAdicionaConvenio);
		tela.add(this.TCelular);
		tela.add(this.BTGravar);
		tela.add(this.BTCancelar);
		tela.add(this.ComboEstado);
		tela.add(this.ComboConvenio);
		tela.add(this.LConvenio);
		tela.add(this.LEstado);
	}

	public IncluirPacienteListener getListener() {
		return listener;
	}

	public void setListener(IncluirPacienteListener listener) {
		this.listener = listener;
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

	public JLabel getLDocumento() {
		return LDocumento;
	}

	public void setLDocumento(JLabel lDocumento) {
		LDocumento = lDocumento;
	}

	public JLabel getLRg() {
		return LRg;
	}

	public void setLRg(JLabel lRg) {
		LRg = lRg;
	}

	public JLabel getLDataNasc() {
		return LDataNasc;
	}

	public void setLDataNasc(JLabel lDataNasc) {
		LDataNasc = lDataNasc;
	}

	public JLabel getLDataCad() {
		return LDataCad;
	}

	public void setLDataCad(JLabel lDataCad) {
		LDataCad = lDataCad;
	}

	public JLabel getLObservacao() {
		return LObservacao;
	}

	public void setLObservacao(JLabel lObservacao) {
		LObservacao = lObservacao;
	}

	public JLabel getLConvenio() {
		return LConvenio;
	}

	public void setLConvenio(JLabel lConvenio) {
		LConvenio = lConvenio;
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

	public JLabel getLAdicionaConvenio() {
		return LAdicionaConvenio;
	}

	public void setLAdicionaConvenio(JLabel lAdicionaConvenio) {
		LAdicionaConvenio = lAdicionaConvenio;
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

	public JTextField getTObservacao() {
		return TObservacao;
	}

	public void setTObservacao(JTextField tObservacao) {
		TObservacao = tObservacao;
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

	public JFormattedTextField getJDataNasc() {
		return JDataNasc;
	}

	public void setJDataNasc(JFormattedTextField jDataNasc) {
		JDataNasc = jDataNasc;
	}

	public JFormattedTextField getJDataCadastro() {
		return JDataCadastro;
	}

	public void setJDataCadastro(JFormattedTextField jDataCadastro) {
		JDataCadastro = jDataCadastro;
	}

	public JFormattedTextField getJCep() {
		return JCep;
	}

	public void setJCep(JFormattedTextField jCep) {
		JCep = jCep;
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

	public JComboBox getComboConvenio() {
		return ComboConvenio;
	}

	public void setComboConvenio(JComboBox comboConvenio) {
		ComboConvenio = comboConvenio;
	}

}
