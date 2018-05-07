package br.com.gsv.formularios;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;

import br.com.gsv.graficoAzul.DetalhesUsuarioGrafic;
import br.com.gsv.graficoClassic.DetalhesUsuarioClassic;
import br.com.gsv.listeners.DetalhesUsuarioListener;

public class DetalhesUsuarioDialog extends JDialog {
	private DetalhesUsuarioListener listener;
	private JPanel panel = new JPanel();
	private Container tela = getContentPane();
	private Long codigo;
	private JButton BCancelar;
	private JLabel TFuncionario, TCpf, TRg, TLogin;
	private JLabel LFuncionario, LCpf, LRg, LAdicionar, LLogin;
	private JFormattedTextField JCpf;
	private JPanel painelDrag;
	private int xx,xy;
	private DetalhesUsuarioClassic listenerClassic;
	private DetalhesUsuarioGrafic listenerGrafic;

	public DetalhesUsuarioDialog() {
		Dados();
		InicializaCompomentes();
		listener = new DetalhesUsuarioListener(this);
		listenerGrafic = new DetalhesUsuarioGrafic(this);
	}
	
		
	public void Dados() {
		TFuncionario = new JLabel();
		TCpf = new JLabel();
		TRg = new JLabel();
		TLogin = new JLabel();
		LFuncionario = new JLabel();
		LCpf = new JLabel();
		LRg = new JLabel();
		LAdicionar = new JLabel();
		LLogin = new JLabel();
		BCancelar = new JButton();
		painelDrag = new JPanel();
	}

	public void InicializaCompomentes() {

		tela.add(this.TFuncionario);
		tela.add(this.TCpf);
		tela.add(this.TRg);
		tela.add(this.TLogin);
		tela.add(this.LFuncionario);
		tela.add(this.LCpf);
		tela.add(this.LRg);
		tela.add(this.LAdicionar);
		tela.add(this.LLogin);
		tela.add(this.BCancelar);
		
		
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

	public JLabel getTCpf() {
		return TCpf;
	}

	public void setTCpf(JLabel tCpf) {
		TCpf = tCpf;
	}

	public JLabel getTRg() {
		return TRg;
	}

	public void setTRg(JLabel tRg) {
		TRg = tRg;
	}

	public JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}

	public JLabel getTFuncionario() {
		return TFuncionario;
	}

	public void setTFuncionario(JLabel tFuncionario) {
		TFuncionario = tFuncionario;
	}

	public JLabel getTLogin() {
		return TLogin;
	}

	public void setTLogin(JLabel tLogin) {
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

	public JLabel getLAdicionar() {
		return LAdicionar;
	}

	public void setLAdicionar(JLabel lAdicionar) {
		LAdicionar = lAdicionar;
	}

	public JLabel getLLogin() {
		return LLogin;
	}

	public void setLLogin(JLabel lLogin) {
		LLogin = lLogin;
	}

	public JButton getBCancelar() {
		return BCancelar;
	}

	public void setBCancelar(JButton bCancelar) {
		BCancelar = bCancelar;
	}

	public DetalhesUsuarioListener getListener() {
		return listener;
	}

	public void setListener(DetalhesUsuarioListener listener) {
		this.listener = listener;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
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
