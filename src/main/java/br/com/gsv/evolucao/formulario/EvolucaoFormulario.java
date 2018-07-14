package br.com.gsv.evolucao.formulario;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import br.com.gsv.domain.sub.EnumEvolucaoEstGeral;
import br.com.gsv.domain.sub.EnumEvolucaoNivOrientacao;
import br.com.gsv.domain.sub.EnumEvolucaoNivelConsciencia;
import br.com.gsv.domain.sub.EnumEvolucaoPressao;
import br.com.gsv.domain.sub.EnumEvolucaoPulso;
import br.com.gsv.domain.sub.EnumEvolucaoTemperatura;
import br.com.gsv.evolucao.listeners.EvolucaoListener;
import br.com.gsv.util.ConverteDadosUtil;

public class EvolucaoFormulario extends JDialog {
	private JPanel panel = new JPanel();
	private Container tela = getContentPane();
	private JPanel painelBranco,painelDadosGeral,painelEstadoGeral,painelOutras;
	private JButton BGravar,BVoltar;
	private JComboBox ComboEstGeral,ComboNivConsciencia,ComboNivOrientacao,ComboTemperatura,ComboPressao,ComboPulso;
	private JTextField TTemperatura, TPressao, TPulso, TQueixaPac, TCodigo, TNome, TTempo, TRegistro;
	private JFormattedTextField JData;
	private JLabel LNivelConsciencia,LEstGeral,LNivelOrientacao, LPressao, LData;
	private JLabel LSinaisVitais,LRespiracao,LPulsacao,LTemperatura,LGraus,LBpm,LMmhg, LEvolucao;
	private JLabel LTempo, lblRegistradoPor, LNome, LCodigo,LDiagnostico,LRegistro, LItensRelacionados;
	private JLabel LSondas, LQueixaPac, LCurativo;
	private JRadioButton RadioEspontaneo, RadioOxigenio, RadioTraquostomia, RadioEntubado;
	private ButtonGroup grupo = new ButtonGroup();
	private JTabbedPane tabbedPane;
	private JLayeredPane abaEstadoGeral, abaOutras, abaDadosGerais;
	private JScrollPane ScrollTextItensRelac, ScrollTextoDiagnostico,ScrollTextSondas,ScrollTextCurativo;
	private JTextArea TextoItensRelacionados, Tdiagnostico,TextoSondas,TextoCurativo;
	private EvolucaoListener listener;
	
	
	
	
	public static void main(String[] args) {
		try {
			EvolucaoFormulario dialog = new EvolucaoFormulario();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}



	public EvolucaoFormulario() {
		setBounds(100, 100, 680, 460);
		tela.setLayout(new BorderLayout());
		panel.setBackground(Color.WHITE);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		tela.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		this.setModal(true);
		this.setResizable(false);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBackground(Color.WHITE);
		tabbedPane.setBounds(10, 11, 569, 400);
		panel.add(tabbedPane);
		
		abaDadosGerais = new JLayeredPane();
		tabbedPane.addTab("Dados Gerais", null, abaDadosGerais, null);
		
		abaEstadoGeral = new JLayeredPane();
		tabbedPane.addTab("Estado Geral", null, abaEstadoGeral, null);
		
		abaOutras = new JLayeredPane();
		tabbedPane.addTab("Outras", null, abaOutras, null);
		
		CriaAbaDadosGerais();
		CriaAbaEstadoGeral();
		CriaAbaOutras();
		Botoes();
		
		listener = new EvolucaoListener(this);
	}
	
	
	private void CriaAbaDadosGerais(){
		LData = new JLabel("Data Inclusão");
		LData.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		LData.setBounds(367, 14, 77, 14);
		abaDadosGerais.add(LData);
		
		JData= new JFormattedTextField(ConverteDadosUtil.FormataData());
		JData.setBorder(new LineBorder(Color.BLACK));
		JData.setBackground(Color.WHITE);
		JData.setBounds(454, 11, 100, 20);
		JData.setEditable(false);
		JData.setText(ConverteDadosUtil.RetornaDataAtual());
		abaDadosGerais.add(JData);
		
		
		LTempo = new JLabel("Tempo de Internação");
		LTempo.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		LTempo.setBounds(184, 49, 120, 14);
		abaDadosGerais.add(LTempo);
		
		TTempo = new JTextField();
		TTempo.setBorder(new LineBorder(Color.BLACK));
		TTempo.setBounds(314, 46, 240, 20);
		abaDadosGerais.add(TTempo);
		TTempo.setColumns(10);
		
		LDiagnostico = new JLabel("Diagnóstico Geral");
		LDiagnostico.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		LDiagnostico.setBounds(10, 100, 141, 14);
		abaDadosGerais.add(LDiagnostico);
		
		ScrollTextoDiagnostico = new JScrollPane();
		ScrollTextoDiagnostico.setBounds(10, 117, 544, 130);
		abaDadosGerais.add(ScrollTextoDiagnostico);
		
		Tdiagnostico = new JTextArea();
		Tdiagnostico.setBorder(new LineBorder(new Color(0, 0, 0)));
		ScrollTextoDiagnostico.setViewportView(Tdiagnostico);
		
		lblRegistradoPor = new JLabel("Registrado Por:");
		lblRegistradoPor.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		lblRegistradoPor.setBounds(10, 276, 141, 14);
		abaDadosGerais.add(lblRegistradoPor);
		
		LNome = new JLabel("Nome");
		LNome.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		LNome.setBounds(10, 297, 60, 14);
		abaDadosGerais.add(LNome);
		
		TNome = new JTextField();
		TNome.setBorder(new LineBorder(Color.BLACK));
		TNome.setColumns(10);
		TNome.setEditable(false);
		TNome.setBounds(80, 295, 389, 20);
		abaDadosGerais.add(TNome);
		
		LCodigo = new JLabel("Código");
		LCodigo.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		LCodigo.setBounds(10, 329, 60, 14);
		abaDadosGerais.add(LCodigo);
		
		TCodigo = new JTextField();
		TCodigo.setBorder(new LineBorder(Color.BLACK));
		TCodigo.setEditable(false);
		TCodigo.setColumns(10);
		TCodigo.setBounds(80, 327, 150, 20);
		abaDadosGerais.add(TCodigo);
		
		LRegistro = new JLabel("Registro:");
		LRegistro.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		LRegistro.setBounds(240, 329, 60, 14);
		abaDadosGerais.add(LRegistro);
		
		TRegistro = new JTextField();
		TRegistro.setBorder(new LineBorder(Color.BLACK));
		TRegistro.setColumns(10);
		TRegistro.setEditable(false);
		TRegistro.setBounds(294, 327, 175, 20);
		abaDadosGerais.add(TRegistro);		
		
		painelDadosGeral = new JPanel();
		painelDadosGeral.setBackground(Color.WHITE);
		painelDadosGeral.setBounds(0, 0, 564, 372);
		abaDadosGerais.add(painelDadosGeral);
	
	}
	
	private void CriaAbaEstadoGeral(){
		LEvolucao = new JLabel("Evolução");
		LEvolucao.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
		LEvolucao.setBounds(10, 12, 77, 14);
		abaEstadoGeral.add(LEvolucao);
		
		
		LEstGeral = new JLabel("Estado Geral");
		LEstGeral.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		LEstGeral.setBounds(10, 44, 120, 14);
		abaEstadoGeral.add(LEstGeral);
		
		ComboEstGeral = new JComboBox(EnumEvolucaoEstGeral.values());
		ComboEstGeral.setBackground(Color.WHITE);
		ComboEstGeral.setBounds(140, 42, 180, 20);
		abaEstadoGeral.add(ComboEstGeral);
		
		LNivelConsciencia = new JLabel("Nível de Consciência");
		LNivelConsciencia.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		LNivelConsciencia.setBounds(10, 71, 120, 14);
		abaEstadoGeral.add(LNivelConsciencia);
		
		ComboNivConsciencia = new JComboBox(EnumEvolucaoNivelConsciencia.values());
		ComboNivConsciencia.setBackground(Color.WHITE);
		ComboNivConsciencia.setBounds(140, 69, 180, 20);
		abaEstadoGeral.add(ComboNivConsciencia);
		
		LNivelOrientacao = new JLabel("Nível de Orientação");
		LNivelOrientacao.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		LNivelOrientacao.setBounds(10, 98, 120, 14);
		abaEstadoGeral.add(LNivelOrientacao);
		
		ComboNivOrientacao = new JComboBox(EnumEvolucaoNivOrientacao.values());
		ComboNivOrientacao.setBackground(Color.WHITE);
		ComboNivOrientacao.setBounds(140, 96, 180, 20);
		abaEstadoGeral.add(ComboNivOrientacao);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 151, 546, 2);
		abaEstadoGeral.add(separator);
		
		LSinaisVitais = new JLabel("Sinais Vitais");
		LSinaisVitais.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		LSinaisVitais.setBounds(10, 164, 100, 14);
		abaEstadoGeral.add(LSinaisVitais);
		
		LRespiracao = new JLabel("Respiração");
		LRespiracao.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		LRespiracao.setBounds(10, 188, 120, 14);
		abaEstadoGeral.add(LRespiracao);
		
		RadioEspontaneo = new JRadioButton("Espontâneo");
		RadioEspontaneo.setBackground(Color.WHITE);
		RadioEspontaneo.setBounds(10, 209, 100, 23);
		abaEstadoGeral.add(RadioEspontaneo);
		grupo.add(RadioEspontaneo);
		
		RadioOxigenio = new JRadioButton("Auxílio de Oxigênio");
		RadioOxigenio.setBackground(Color.WHITE);
		RadioOxigenio.setBounds(130, 209, 140, 23);
		abaEstadoGeral.add(RadioOxigenio);
		grupo.add(RadioOxigenio);
		
		RadioTraquostomia = new JRadioButton("Traquostomia");
		RadioTraquostomia.setBackground(Color.WHITE);
		RadioTraquostomia.setBounds(283, 209, 110, 23);
		abaEstadoGeral.add(RadioTraquostomia);
		grupo.add(RadioTraquostomia);
		
		RadioEntubado = new JRadioButton("Entubado");
		RadioEntubado.setBackground(Color.WHITE);
		RadioEntubado.setBounds(417, 209, 87, 23);
		abaEstadoGeral.add(RadioEntubado);
		grupo.add(RadioEntubado);
		
		LPulsacao = new JLabel("Pulsasão - bpm");
		LPulsacao.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		LPulsacao.setBounds(10, 265, 120, 14);
		abaEstadoGeral.add(LPulsacao);
		
		ComboPulso = new JComboBox(EnumEvolucaoPulso.values());
		ComboPulso.setBackground(Color.WHITE);
		ComboPulso.setBounds(140, 263, 180, 20);
		abaEstadoGeral.add(ComboPulso);
		
		TPulso = new JTextField();
		TPulso.setColumns(10);
		TPulso.setBounds(330, 263, 92, 20);
		abaEstadoGeral.add(TPulso);
		
		LBpm = new JLabel("bpm");
		LBpm.setBounds(430, 266, 46, 14);
		abaEstadoGeral.add(LBpm);
		
		LPressao = new JLabel("Pressão Arterial - PA");
		LPressao.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		LPressao.setBounds(10, 294, 120, 14);
		abaEstadoGeral.add(LPressao);
		
		ComboPressao = new JComboBox(EnumEvolucaoPressao.values());
		ComboPressao.setBackground(Color.WHITE);
		ComboPressao.setBounds(140, 292, 180, 20);
		abaEstadoGeral.add(ComboPressao);
		
		TPressao = new JTextField();
		TPressao.setColumns(10);
		TPressao.setBounds(330, 292, 92, 20);
		abaEstadoGeral.add(TPressao);
		
		LMmhg = new JLabel("MMHG");
		LMmhg.setBounds(430, 295, 46, 14);
		abaEstadoGeral.add(LMmhg);
		
		LTemperatura = new JLabel("Temperatura - °C");
		LTemperatura.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		LTemperatura.setBounds(10, 330, 120, 14);
		abaEstadoGeral.add(LTemperatura);
		
		ComboTemperatura = new JComboBox(EnumEvolucaoTemperatura.values());
		ComboTemperatura.setBackground(Color.WHITE);
		ComboTemperatura.setBounds(140, 328, 180, 20);
		abaEstadoGeral.add(ComboTemperatura);
		
		TTemperatura = new JTextField();
		TTemperatura.setColumns(10);
		TTemperatura.setBounds(330, 328, 92, 20);
		abaEstadoGeral.add(TTemperatura);
		
		LGraus = new JLabel("°C");
		LGraus.setBounds(430, 331, 46, 14);
		abaEstadoGeral.add(LGraus);
		
		painelBranco = new JPanel();
		painelBranco.setBackground(Color.WHITE);
		painelBranco.setBounds(0, 0, 564, 372);
		abaEstadoGeral.add(painelBranco);
		painelBranco.setLayout(null);
		
		LQueixaPac = new JLabel("Nível de Orientação");
		LQueixaPac.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		LQueixaPac.setBounds(10, 128, 120, 14);
		painelBranco.add(LQueixaPac);
		
		TQueixaPac = new JTextField();
		TQueixaPac.setColumns(10);
		TQueixaPac.setBounds(140, 126, 349, 20);
		painelBranco.add(TQueixaPac);
		
		painelEstadoGeral = new JPanel();
		painelEstadoGeral.setBackground(Color.WHITE);
		painelEstadoGeral.setBounds(0, 0, 564, 372);
		painelBranco.add(painelEstadoGeral);
		
		
	}
	
	private void CriaAbaOutras(){
		LItensRelacionados = new JLabel("Itens Relacionados a PM");
		LItensRelacionados.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		LItensRelacionados.setBounds(10, 7, 140, 14);
		abaOutras.add(LItensRelacionados);
		
		ScrollTextItensRelac = new JScrollPane();
		ScrollTextItensRelac.setBounds(10, 25, 544, 85);
		abaOutras.add(ScrollTextItensRelac);
		
		TextoItensRelacionados = new JTextArea();
		TextoItensRelacionados.setBorder(new LineBorder(new Color(0, 0, 0)));
		ScrollTextItensRelac.setViewportView(TextoItensRelacionados);
		
		LSondas = new JLabel("Sondas");
		LSondas.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		LSondas.setBounds(10, 120, 140, 14);
		abaOutras.add(LSondas);
		
		ScrollTextSondas = new JScrollPane();
		ScrollTextSondas.setBounds(10, 138, 544, 85);
		abaOutras.add(ScrollTextSondas);
		
		TextoSondas = new JTextArea();
		TextoSondas.setBorder(new LineBorder(new Color(0, 0, 0)));
		ScrollTextSondas.setViewportView(TextoSondas);
		
		LCurativo = new JLabel("Curativo");
		LCurativo.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		LCurativo.setBounds(10, 240, 140, 14);
		abaOutras.add(LCurativo);
		
		ScrollTextCurativo = new JScrollPane();
		ScrollTextCurativo.setBounds(10, 260, 544, 85);
		abaOutras.add(ScrollTextCurativo);
		
		TextoCurativo = new JTextArea();
		TextoCurativo.setBorder(new LineBorder(new Color(0, 0, 0)));
		ScrollTextCurativo.setViewportView(TextoCurativo);
		
		painelOutras = new JPanel();
		painelOutras.setBackground(Color.WHITE);
		painelOutras.setBounds(0, 0, 564, 372);
		abaOutras.add(painelOutras);
	}
	
	
	private void Botoes(){
		BGravar = new JButton("Gravar");
		BGravar.setBounds(581, 347, 80, 23);
		panel.add(BGravar);
		
		BVoltar = new JButton("Voltar");
		BVoltar.setBounds(581, 375, 80, 23);
		panel.add(BVoltar);
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


	public JComboBox getComboEstGeral() {
		return ComboEstGeral;
	}


	public void setComboEstGeral(JComboBox comboEstGeral) {
		ComboEstGeral = comboEstGeral;
	}


	public JComboBox getComboNivConsciencia() {
		return ComboNivConsciencia;
	}


	public void setComboNivConsciencia(JComboBox comboNivConsciencia) {
		ComboNivConsciencia = comboNivConsciencia;
	}


	public JComboBox getComboNivOrientacao() {
		return ComboNivOrientacao;
	}


	public void setComboNivOrientacao(JComboBox comboNivOrientacao) {
		ComboNivOrientacao = comboNivOrientacao;
	}


	public JComboBox getComboTemperatura() {
		return ComboTemperatura;
	}


	public void setComboTemperatura(JComboBox comboTemperatura) {
		ComboTemperatura = comboTemperatura;
	}


	public JComboBox getComboPressao() {
		return ComboPressao;
	}


	public void setComboPressao(JComboBox comboPressao) {
		ComboPressao = comboPressao;
	}


	public JComboBox getComboPulso() {
		return ComboPulso;
	}


	public void setComboPulso(JComboBox comboPulso) {
		ComboPulso = comboPulso;
	}



	public JTextField getTTemperatura() {
		return TTemperatura;
	}


	public void setTTemperatura(JTextField tTemperatura) {
		TTemperatura = tTemperatura;
	}


	public JTextField getTPressao() {
		return TPressao;
	}


	public void setTPressao(JTextField tPressao) {
		TPressao = tPressao;
	}


	public JTextField getTPulso() {
		return TPulso;
	}


	public void setTPulso(JTextField tPulso) {
		TPulso = tPulso;
	}


	public JRadioButton getRadioEspontaneo() {
		return RadioEspontaneo;
	}


	public void setRadioEspontaneo(JRadioButton radioEspontaneo) {
		RadioEspontaneo = radioEspontaneo;
	}


	public JRadioButton getRadioOxigenio() {
		return RadioOxigenio;
	}


	public void setRadioOxigenio(JRadioButton radioOxigenio) {
		RadioOxigenio = radioOxigenio;
	}


	public JRadioButton getRadioTraquostomia() {
		return RadioTraquostomia;
	}


	public void setRadioTraquostomia(JRadioButton radioTraquostomia) {
		RadioTraquostomia = radioTraquostomia;
	}


	public JRadioButton getRadioEntubado() {
		return RadioEntubado;
	}


	public void setRadioEntubado(JRadioButton radioEntubado) {
		RadioEntubado = radioEntubado;
	}


	public ButtonGroup getGrupo() {
		return grupo;
	}


	public void setGrupo(ButtonGroup grupo) {
		this.grupo = grupo;
	}


	public JButton getBGravar() {
		return BGravar;
	}


	public void setBGravar(JButton bGravar) {
		BGravar = bGravar;
	}


	public JButton getBVoltar() {
		return BVoltar;
	}


	public void setBVoltar(JButton bVoltar) {
		BVoltar = bVoltar;
	}


	public JFormattedTextField getJData() {
		return JData;
	}


	public void setJData(JFormattedTextField jData) {
		JData = jData;
	}



	public JTextField getTQueixaPac() {
		return TQueixaPac;
	}



	public void setTQueixaPac(JTextField tQueixaPac) {
		TQueixaPac = tQueixaPac;
	}



	public JTextField getTCodigo() {
		return TCodigo;
	}



	public void setTCodigo(JTextField tCodigo) {
		TCodigo = tCodigo;
	}



	public JTextField getTNome() {
		return TNome;
	}



	public void setTNome(JTextField tNome) {
		TNome = tNome;
	}



	public JTextField getTTempo() {
		return TTempo;
	}



	public void setTTempo(JTextField tTempo) {
		TTempo = tTempo;
	}



	public JTextField getTRegistro() {
		return TRegistro;
	}



	public void setTRegistro(JTextField tRegistro) {
		TRegistro = tRegistro;
	}



	public JTextArea getTextoItensRelacionados() {
		return TextoItensRelacionados;
	}



	public void setTextoItensRelacionados(JTextArea textoItensRelacionados) {
		TextoItensRelacionados = textoItensRelacionados;
	}



	public JTextArea getTdiagnostico() {
		return Tdiagnostico;
	}



	public void setTdiagnostico(JTextArea tdiagnostico) {
		Tdiagnostico = tdiagnostico;
	}



	public JTextArea getTextoSondas() {
		return TextoSondas;
	}



	public void setTextoSondas(JTextArea textoSondas) {
		TextoSondas = textoSondas;
	}



	public JTextArea getTextoCurativo() {
		return TextoCurativo;
	}



	public void setTextoCurativo(JTextArea textoCurativo) {
		TextoCurativo = textoCurativo;
	}
	
	
}
