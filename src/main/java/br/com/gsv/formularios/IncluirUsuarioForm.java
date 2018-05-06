package br.com.gsv.formularios;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import br.com.gsv.graficoAzul.IncluirUsuarioGrafic;
import br.com.gsv.graficoClassic.IncluirUsuarioClassic;
import br.com.gsv.listeners.IncluirUsuarioListener;
import br.com.gsv.util.ConverteDadosUtil;

public class IncluirUsuarioForm extends JDialog {
	private JPanel panel = new JPanel();
	private Container tela = getContentPane();
	private Long codigo;
	private JTextField TFuncionario, TCpf, TRg, TLogin;
	private JLabel LFuncionario, LCpf, LRg, LAdicionar, LLogin, LSenha;
	private JPasswordField TSenha;
	private JButton BGravar, BCancelar, BPesquisar;
	private JFormattedTextField JCpf;
	private IncluirUsuarioListener listener;
	private IncluirUsuarioClassic listenerClassic;
	private IncluirUsuarioGrafic listenerGrafic;

	

	public IncluirUsuarioForm() {
		CriaTelaGeral();
		AdicionaNaTela();
		listener = new IncluirUsuarioListener(this);
	}
	
	public void IniciaGrafic(){
		listenerGrafic = new IncluirUsuarioGrafic(this);
	}
	
	public void IniciaClassic(){
		listenerClassic = new IncluirUsuarioClassic(this);
	}

	private void CriaTelaGeral() {
		TFuncionario = new JTextField();
		LFuncionario = new JLabel();
		LCpf = new JLabel();
		TCpf = new JTextField();
		LRg = new JLabel();
		TRg = new JTextField();
		LAdicionar = new JLabel();
		LLogin = new JLabel();
		LSenha = new JLabel();
		TLogin = new JTextField();
		TSenha = new JPasswordField();
		BGravar = new JButton();
		BCancelar = new JButton();
		BPesquisar = new JButton();
		JCpf = new JFormattedTextField(ConverteDadosUtil.FormataCPF());
	}
	
	
	
	public void AdicionaNaTela() {
		tela.add(TFuncionario);
		tela.add(LFuncionario);
		tela.add(LCpf);
		tela.add(TCpf);
		tela.add(LRg);
		tela.add(TRg);
		tela.add(LAdicionar);
		tela.add(LLogin);
		tela.add(LSenha);
		tela.add(TLogin);
		tela.add(TSenha);
		tela.add(BGravar);
		tela.add(BCancelar);
		tela.add(BPesquisar);
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
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

	public JTextField getTFuncionario() {
		return TFuncionario;
	}

	public void setTFuncionario(JTextField tFuncionario) {
		TFuncionario = tFuncionario;
	}

	public JTextField getTCpf() {
		return TCpf;
	}

	public void setTCpf(JTextField tCpf) {
		TCpf = tCpf;
	}

	public JTextField getTRg() {
		return TRg;
	}

	public void setTRg(JTextField tRg) {
		TRg = tRg;
	}

	public JTextField getTLogin() {
		return TLogin;
	}

	public void setTLogin(JTextField tLogin) {
		TLogin = tLogin;
	}

	public JLabel getLFuncionario() {
		return LFuncionario;
	}

	public void setLFuncionario(JLabel lFuncionario) {
		LFuncionario = lFuncionario;
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

	public JLabel getLLogin() {
		return LLogin;
	}

	public void setLLogin(JLabel lLogin) {
		LLogin = lLogin;
	}

	public JLabel getLSenha() {
		return LSenha;
	}

	public void setLSenha(JLabel lSenha) {
		LSenha = lSenha;
	}

	public JPasswordField getTSenha() {
		return TSenha;
	}

	public void setTSenha(JPasswordField tSenha) {
		TSenha = tSenha;
	}

	public JButton getBGravar() {
		return BGravar;
	}

	public void setBGravar(JButton bGravar) {
		BGravar = bGravar;
	}

	public JButton getBCancelar() {
		return BCancelar;
	}

	public void setBCancelar(JButton bCancelar) {
		BCancelar = bCancelar;
	}

	public JButton getBPesquisar() {
		return BPesquisar;
	}

	public void setBPesquisar(JButton bPesquisar) {
		BPesquisar = bPesquisar;
	}

	public JFormattedTextField getJCpf() {
		return JCpf;
	}

	public void setJCpf(JFormattedTextField jCpf) {
		JCpf = jCpf;
	}

	public IncluirUsuarioListener getListener() {
		return listener;
	}

	public void setListener(IncluirUsuarioListener listener) {
		this.listener = listener;
	}

	public JLabel getLAdicionar() {
		return LAdicionar;
	}

	public void setLAdicionar(JLabel lAdicionar) {
		LAdicionar = lAdicionar;
	}
	
	
	
	
}
