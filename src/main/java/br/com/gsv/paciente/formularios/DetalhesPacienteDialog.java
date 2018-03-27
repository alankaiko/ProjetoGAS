package br.com.gsv.paciente.formularios;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;

import br.com.gsv.paciente.grafico.DetalhesPacienteClassic;
import br.com.gsv.paciente.listeners.DetalhesPacienteListener;
import br.com.projeto.gsv.util.ConverteDadosUtil;

public class DetalhesPacienteDialog extends JDialog {
	private DetalhesPacienteListener listener;
	private JPanel panel = new JPanel();
	private Container tela = getContentPane();
	private JLabel LId, LNome, LCpf, LRg, LDataNasc, LDataCad, LObservacao;
	private JLabel LIndentif, LEndereco, LLogradouro, LComplemento;
	private JLabel LNumero, LBairro, LCidade, LCep, LContato, LEmail, LCelular,LTelefone, LEstado, LConvenio, TConvenio;
	private JLabel TId, TNome, TCpf, TDataCadastro, TRg, TDataNasc,TObservacao, TLogradouro, TComplemento, TNumero;
	private JLabel TBairro, TCidade, TComboEstado, TCep, TEmail, TTelefone,TCelular;
	private JFormattedTextField JCpf, JDataNasc, JDataCadastro, JCep;
	private JButton cancelar;
	private DetalhesPacienteClassic listenerClassic;
	//private DetalhesPacienteGrafic listenerGrafic;

	public DetalhesPacienteDialog() {
		IniciaVariaveis();
		InicializaCompomentes();
		listener = new DetalhesPacienteListener(this);
		listenerClassic = new DetalhesPacienteClassic(this);
		//listenerGrafic = new DetalhesPacienteGrafic(this);
	}
	
	public void IniciaVariaveis() {
		TId = new JLabel();
		TNome = new JLabel();
		TRg = new JLabel();
		TObservacao = new JLabel();
		LId = new JLabel();
		LNome = new JLabel();
		LCpf = new JLabel();
		LRg = new JLabel();
		LDataNasc = new JLabel();
		LDataCad = new JLabel();
		LObservacao = new JLabel();
		LIndentif = new JLabel();
		TDataCadastro = new JLabel();
		JCpf= new JFormattedTextField(ConverteDadosUtil.FormataCPF());
		JDataNasc= new JFormattedTextField(ConverteDadosUtil.FormataData());
		JDataCadastro= new JFormattedTextField(ConverteDadosUtil.FormataData());
		JCep = new JFormattedTextField(ConverteDadosUtil.FormataCep());
		TCpf = new JLabel();
		LConvenio = new JLabel();
		TConvenio = new JLabel();
		LEndereco = new JLabel();
		LLogradouro = new JLabel();
		TLogradouro = new JLabel();
		LComplemento = new JLabel();
		TComplemento = new JLabel();
		LNumero = new JLabel();
		LBairro = new JLabel();
		LCidade = new JLabel();
		LCep = new JLabel();
		TNumero = new JLabel();
		TBairro = new JLabel();
		TCidade = new JLabel();
		TCep = new JLabel();
		LContato = new JLabel();
		LEmail = new JLabel();
		LCelular = new JLabel();
		LTelefone = new JLabel();
		TEmail = new JLabel();
		TTelefone = new JLabel();
		TCelular = new JLabel();
		cancelar = new JButton();
		TComboEstado = new JLabel();
		LEstado = new JLabel();
		TDataNasc = new JLabel();
	}



	public void InicializaCompomentes() {
		tela.add(this.TId);
		tela.add(this.TNome);
		tela.add(this.TRg);
		tela.add(this.TObservacao);
		tela.add(this.LId);
		tela.add(this.LNome);
		tela.add(this.LCpf);
		tela.add(this.LRg);
		tela.add(this.LDataNasc);
		tela.add(this.LDataCad);
		tela.add(this.LObservacao);
		tela.add(this.LIndentif);
		tela.add(this.TDataCadastro);
		tela.add(this.JCpf);
		tela.add(this.TCpf);
		tela.add(this.LConvenio);
		tela.add(this.TConvenio);
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
		tela.add(this.TCep);
		tela.add(this.LContato);
		tela.add(this.LEmail);
		tela.add(this.LCelular);
		tela.add(this.LTelefone);
		tela.add(this.TEmail);
		tela.add(this.TTelefone);
		tela.add(this.TCelular);
		tela.add(this.cancelar);
		tela.add(this.TComboEstado);
		tela.add(this.LEstado);
		tela.add(this.TDataNasc);

	}

	public JButton getCancelar() {
		return cancelar;
	}

	public void setCancelar(JButton cancelar) {
		this.cancelar = cancelar;
	}

	public Container getTela() {
		return tela;
	}

	public void setTela(Container tela) {
		this.tela = tela;
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

	public JLabel getTComboEstado() {
		return TComboEstado;
	}

	public void setTComboEstado(JLabel tComboEstado) {
		TComboEstado = tComboEstado;
	}

	public JLabel getTId() {
		return TId;
	}

	public void setTId(JLabel tId) {
		TId = tId;
	}

	public JLabel getTNome() {
		return TNome;
	}

	public void setTNome(JLabel tNome) {
		TNome = tNome;
	}

	public JLabel getTCpf() {
		return TCpf;
	}

	public void setTCpf(JLabel tCpf) {
		TCpf = tCpf;
	}

	public JLabel getTDataCadastro() {
		return TDataCadastro;
	}

	public void setTDataCadastro(JLabel tDataCadastro) {
		TDataCadastro = tDataCadastro;
	}

	public JLabel getTRg() {
		return TRg;
	}

	public void setTRg(JLabel tRg) {
		TRg = tRg;
	}

	public JLabel getTDataNasc() {
		return TDataNasc;
	}

	public void setTDataNasc(JLabel tDataNasc) {
		TDataNasc = tDataNasc;
	}

	public JLabel getTObservacao() {
		return TObservacao;
	}

	public void setTObservacao(JLabel tObservacao) {
		TObservacao = tObservacao;
	}

	public JLabel getTLogradouro() {
		return TLogradouro;
	}

	public void setTLogradouro(JLabel tLogradouro) {
		TLogradouro = tLogradouro;
	}

	public JLabel getTComplemento() {
		return TComplemento;
	}

	public void setTComplemento(JLabel tComplemento) {
		TComplemento = tComplemento;
	}

	public JLabel getTNumero() {
		return TNumero;
	}

	public void setTNumero(JLabel tNumero) {
		TNumero = tNumero;
	}

	public JLabel getTBairro() {
		return TBairro;
	}

	public void setTBairro(JLabel tBairro) {
		TBairro = tBairro;
	}

	public JLabel getTCidade() {
		return TCidade;
	}

	public void setTCidade(JLabel tCidade) {
		TCidade = tCidade;
	}

	public JLabel getTCep() {
		return TCep;
	}

	public void setTCep(JLabel tCep) {
		TCep = tCep;
	}

	public JLabel getTEmail() {
		return TEmail;
	}

	public void setTEmail(JLabel tEmail) {
		TEmail = tEmail;
	}

	public JLabel getTTelefone() {
		return TTelefone;
	}

	public void setTTelefone(JLabel tTelefone) {
		TTelefone = tTelefone;
	}

	public JLabel getTCelular() {
		return TCelular;
	}

	public void setTCelular(JLabel tCelular) {
		TCelular = tCelular;
	}

	public JFormattedTextField getJCep() {
		return JCep;
	}

	public void setJCep(JFormattedTextField jCep) {
		JCep = jCep;
	}

	public DetalhesPacienteListener getListener() {
		return listener;
	}

	public void setListener(DetalhesPacienteListener listener) {
		this.listener = listener;
	}

	public JLabel getTConvenio() {
		return TConvenio;
	}

	public void setTConvenio(JLabel tConvenio) {
		TConvenio = tConvenio;
	}

	public JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
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

	public JLabel getLConvenio() {
		return LConvenio;
	}

	public void setLConvenio(JLabel lConvenio) {
		LConvenio = lConvenio;
	}

}
