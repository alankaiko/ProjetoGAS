package br.com.gsv.formularios;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;

import br.com.gsv.graficoClassic.DetalhesPacienteClassic;
import br.com.gsv.listeners.DetalhesPacienteListener;
import br.com.gsv.util.ConverteDadosUtil;

public class DetalhesPacienteDialog extends JDialog {
	private JPanel panel = new JPanel();
	private Container tela = getContentPane();
	private JLabel LId, LNome, LCpf, LRg, LDataNasc, LDataCad, LObservacao;
	private JLabel LIndentif, LEndereco, LLogradouro, LComplemento;
	private JLabel LNumero, LBairro, LCidade, LCep, LContato, LEmail, LCelular,LTelefone, LEstado, LConvenio, TConvenio;
	private JLabel TId, TNome, TCpf, TDataCadastro, TRg, TDataNasc,TObservacao, TLogradouro, TComplemento, TNumero;
	private JLabel TBairro, TCidade, TComboEstado, TCep, TEmail, TTelefone,TCelular;
	private JFormattedTextField JCpf, JDataNasc, JDataCadastro, JCep;
	private JButton cancelar;
	private JSeparator separa, separator;
	private DetalhesPacienteListener listener;
	private DetalhesPacienteClassic listenerClassic;
	private JPanel painelDrag;
	private int xx,xy;
	
	public DetalhesPacienteDialog() {
		InicializaComponentes();
		AdicionaNaTela();
		listener = new DetalhesPacienteListener(this);
		listenerClassic = new DetalhesPacienteClassic(this);
	}
	
	
	private void InicializaComponentes(){
		LId = new JLabel();
		LNome = new JLabel();
		LCpf = new JLabel();
		LRg = new JLabel();
		LDataNasc = new JLabel();
		LDataCad = new JLabel();
		LObservacao = new JLabel();
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
		LConvenio = new JLabel();
		TConvenio = new JLabel();
		TId = new JLabel();
		TNome = new JLabel();
		TCpf = new JLabel();
		TDataCadastro = new JLabel();
		TRg = new JLabel();
		TDataNasc = new JLabel();
		TObservacao = new JLabel();
		TLogradouro = new JLabel();
		TComplemento = new JLabel();
		TNumero = new JLabel();
		TBairro = new JLabel();
		TCidade = new JLabel();
		TComboEstado = new JLabel();
		TCep = new JLabel();
		TEmail = new JLabel();
		TTelefone = new JLabel();
		TCelular = new JLabel(); 
		JCpf= new JFormattedTextField(ConverteDadosUtil.FormataCPF());
		JDataNasc= new JFormattedTextField(ConverteDadosUtil.FormataData());
		JDataCadastro= new JFormattedTextField(ConverteDadosUtil.FormataData());
		JCep = new JFormattedTextField(ConverteDadosUtil.FormataCep());
		cancelar = new JButton();
		painelDrag = new JPanel();
		separa = new JSeparator();
		separator = new JSeparator();		
	}

	private void AdicionaNaTela() {
		panel.add(LIndentif);
		panel.add(LId);
		panel.add(TId);
		panel.add(LCpf);
		panel.add(TCpf);
		panel.add(LNome);
		panel.add(TNome);
		panel.add(LRg);
		panel.add(TRg);
		panel.add(LEndereco);
		panel.add(LLogradouro);
		panel.add(TLogradouro);
		panel.add(LComplemento);
		panel.add(TComplemento);
		panel.add(LNumero);
		panel.add(TNumero);
		panel.add(LCidade);
		panel.add(TCidade);
		panel.add(LBairro);
		panel.add(TBairro);
		panel.add(LEstado);
		panel.add(TComboEstado);
		panel.add(LCep);
		panel.add(TCep);
		panel.add(LContato);
		panel.add(LEmail);
		panel.add(TEmail);
		panel.add(LCelular);
		panel.add(TCelular);
		panel.add(TTelefone);
		panel.add(LTelefone);
		panel.add(cancelar);
		panel.add(TDataCadastro);
		panel.add(LDataCad);
		panel.add(LDataNasc);
		panel.add(TDataNasc);
		panel.add(TConvenio);
		panel.add(LConvenio);
		panel.add(painelDrag);		
		panel.add(separa);
		panel.add(separator);
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



	public JLabel getTConvenio() {
		return TConvenio;
	}



	public void setTConvenio(JLabel tConvenio) {
		TConvenio = tConvenio;
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



	public JLabel getTComboEstado() {
		return TComboEstado;
	}



	public void setTComboEstado(JLabel tComboEstado) {
		TComboEstado = tComboEstado;
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



	public JButton getCancelar() {
		return cancelar;
	}



	public void setCancelar(JButton cancelar) {
		this.cancelar = cancelar;
	}



	public JSeparator getSepara() {
		return separa;
	}



	public void setSepara(JSeparator separa) {
		this.separa = separa;
	}



	public JSeparator getSeparator() {
		return separator;
	}



	public void setSeparator(JSeparator separator) {
		this.separator = separator;
	}



	public DetalhesPacienteListener getListener() {
		return listener;
	}



	public void setListener(DetalhesPacienteListener listener) {
		this.listener = listener;
	}



	public JPanel getPainelDrag() {
		return painelDrag;
	}



	public void setPainelDrag(JPanel painelDrag) {
		this.painelDrag = painelDrag;
	}



	public int getXx() {
		return xx;
	}



	public void setXx(int xx) {
		this.xx = xx;
	}



	public int getXy() {
		return xy;
	}



	public void setXy(int xy) {
		this.xy = xy;
	}

	
	
}
