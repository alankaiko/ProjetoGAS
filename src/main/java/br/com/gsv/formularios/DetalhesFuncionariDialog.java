package br.com.gsv.formularios;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;

import br.com.gsv.graficoClassic.DetalhesFuncionarioClassic;
import br.com.gsv.listeners.DetalhesFuncionariListener;
import br.com.gsv.util.ConverteDadosUtil;

public class DetalhesFuncionariDialog extends JDialog {
	private JPanel panel = new JPanel();
	private Container tela = getContentPane();
	private JLabel TCodigo,TCpf,TNome,TRg,TLogradouro,TComplemento,TNumero,TCidade,TBairro,TEstado;
	private JLabel TCep,TEmail,TCelular,TTelefone, LRegistro, TRegistro;
	private JLabel LCodigo, LCpf, LDados,LNome, LRg, LEndereco, LLogradouro, LComplemento;
	private JLabel LNumero, LCidade, LBairro, LUf, LCep,LContato,LEmail,LCelular,LTelefone;
	private JButton BTCancelar;
	private JFormattedTextField JCpf,JDataNasc, JDataCadastro,JCep;
	private DetalhesFuncionariListener listener;
	private DetalhesFuncionarioClassic listenerClassic;
	private JPanel painelDrag;
	private int xx,xy;
	
	public DetalhesFuncionariDialog() {
		InicializaComponentes();
		AdicionaNaTela();
		listener = new DetalhesFuncionariListener(this);
		listenerClassic = new DetalhesFuncionarioClassic(this);		
	}
	
	
	
	private void InicializaComponentes(){
		LCodigo = new JLabel();
		LDados = new JLabel();
		TCodigo = new JLabel();
		LCpf = new JLabel();
		TCpf = new JLabel();
		LNome = new JLabel();
		TNome = new JLabel();
		LRg = new JLabel();
		TRg = new JLabel();
		LEndereco = new JLabel();
		LLogradouro = new JLabel();
		TLogradouro = new JLabel();
		LComplemento = new JLabel();
		TComplemento = new JLabel();
		LNumero = new JLabel();
		TNumero = new JLabel();
		LCidade = new JLabel();
		TCidade = new JLabel();
		LBairro = new JLabel();
		TBairro = new JLabel();
		LUf = new JLabel();
		TEstado = new JLabel();
		LCep = new JLabel();
		TCep = new JLabel();
		LContato = new JLabel();
		LEmail = new JLabel();
		TEmail = new JLabel();
		LCelular = new JLabel();
		TCelular = new JLabel();
		TTelefone = new JLabel();
		LTelefone = new JLabel();
		BTCancelar = new JButton();
		painelDrag = new JPanel();
		LRegistro = new JLabel();
		TRegistro = new JLabel();
		JCpf = new JFormattedTextField(ConverteDadosUtil.FormataCPF());
		JCep = new JFormattedTextField(ConverteDadosUtil.FormataCep());
		
	}

	private void AdicionaNaTela() {
		panel.add(LDados);
		panel.add(LCodigo);
		panel.add(TCodigo);
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
		panel.add(LUf);
		panel.add(TEstado);
		panel.add(LCep);
		panel.add(TCep);
		panel.add(LContato);
		panel.add(LEmail);
		panel.add(TEmail);
		panel.add(LCelular);
		panel.add(TCelular);
		panel.add(TTelefone);
		panel.add(LTelefone);
		panel.add(BTCancelar);
		panel.add(painelDrag);
		panel.add(LRegistro);
		panel.add(TRegistro);
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


	public JLabel getTCodigo() {
		return TCodigo;
	}


	public void setTCodigo(JLabel tCodigo) {
		TCodigo = tCodigo;
	}


	public JLabel getTCpf() {
		return TCpf;
	}


	public void setTCpf(JLabel tCpf) {
		TCpf = tCpf;
	}


	public JLabel getTNome() {
		return TNome;
	}


	public void setTNome(JLabel tNome) {
		TNome = tNome;
	}


	public JLabel getTRg() {
		return TRg;
	}


	public void setTRg(JLabel tRg) {
		TRg = tRg;
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


	public JLabel getTCidade() {
		return TCidade;
	}


	public void setTCidade(JLabel tCidade) {
		TCidade = tCidade;
	}


	public JLabel getTBairro() {
		return TBairro;
	}


	public void setTBairro(JLabel tBairro) {
		TBairro = tBairro;
	}


	public JLabel getTEstado() {
		return TEstado;
	}


	public void setTEstado(JLabel tEstado) {
		TEstado = tEstado;
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


	public JLabel getTCelular() {
		return TCelular;
	}


	public void setTCelular(JLabel tCelular) {
		TCelular = tCelular;
	}


	public JLabel getTTelefone() {
		return TTelefone;
	}


	public void setTTelefone(JLabel tTelefone) {
		TTelefone = tTelefone;
	}


	public JLabel getLCodigo() {
		return LCodigo;
	}


	public void setLCodigo(JLabel lCodigo) {
		LCodigo = lCodigo;
	}


	public JLabel getLCpf() {
		return LCpf;
	}


	public void setLCpf(JLabel lCpf) {
		LCpf = lCpf;
	}


	public JLabel getLDados() {
		return LDados;
	}


	public void setLDados(JLabel lDados) {
		LDados = lDados;
	}


	public JLabel getLNome() {
		return LNome;
	}


	public void setLNome(JLabel lNome) {
		LNome = lNome;
	}


	public JLabel getLRg() {
		return LRg;
	}


	public void setLRg(JLabel lRg) {
		LRg = lRg;
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


	public JLabel getLCidade() {
		return LCidade;
	}


	public void setLCidade(JLabel lCidade) {
		LCidade = lCidade;
	}


	public JLabel getLBairro() {
		return LBairro;
	}


	public void setLBairro(JLabel lBairro) {
		LBairro = lBairro;
	}


	public JLabel getLUf() {
		return LUf;
	}


	public void setLUf(JLabel lUf) {
		LUf = lUf;
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


	public JButton getBTCancelar() {
		return BTCancelar;
	}


	public void setBTCancelar(JButton bTCancelar) {
		BTCancelar = bTCancelar;
	}

	public DetalhesFuncionariListener getListener() {
		return listener;
	}

	public void setListener(DetalhesFuncionariListener listener) {
		this.listener = listener;
	}


	public JPanel getPainelDrag() {
		return painelDrag;
	}


	public void setPainelDrag(JPanel painelDrag) {
		this.painelDrag = painelDrag;
	}


	public JLabel getLRegistro() {
		return LRegistro;
	}


	public void setLRegistro(JLabel lRegistro) {
		LRegistro = lRegistro;
	}


	public JLabel getTRegistro() {
		return TRegistro;
	}


	public void setTRegistro(JLabel tRegistro) {
		TRegistro = tRegistro;
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



}
