package br.com.gsv.evolucao.formulario;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import br.com.gsv.evolucao.listeners.EvolucaoListener;
import br.com.gsv.util.ConverteDadosUtil;

import javax.swing.JButton;

public class EvolucaoFormulario extends JDialog {
	private JPanel panel = new JPanel();
	private Container tela = getContentPane();
	private JButton BGravar,BVoltar;
	private JComboBox ComboEstGeral,ComboNivConsciencia,ComboNivOrientacao,ComboTemperatura,ComboPressao,ComboPulso;
	private JTextField TQueixaPaciente, TTemperatura, TPressao, TPulso, TData;
	private JFormattedTextField JData;
	private JLabel LNivelConsciencia,LEstGeral,LNivelOrientacao,LQueixaPaciente, LPressao, LData;
	private JLabel LSinaisVitais,LRespiracao,LPulsacao,LTemperatura,LGraus,LBpm,LMmhg, LEvolucao;
	private JRadioButton RadioEspontaneo, RadioOxigenio, RadioTraquostomia, RadioEntubado;
	private ButtonGroup grupo = new ButtonGroup();
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
		setBounds(100, 100, 582, 454);
		getContentPane().setLayout(new BorderLayout());
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		CriaComponentes();
		listener = new EvolucaoListener(this);
	}
	
	private void CriaComponentes(){
		LEvolucao = new JLabel("Evolução");
		LEvolucao.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
		LEvolucao.setBounds(10, 11, 77, 14);
		panel.add(LEvolucao);
		
		LEstGeral = new JLabel("Estado Geral");
		LEstGeral.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		LEstGeral.setBounds(10, 44, 120, 14);
		panel.add(LEstGeral);
		
		ComboEstGeral = new JComboBox();
		ComboEstGeral.setBounds(140, 42, 180, 20);
		panel.add(ComboEstGeral);
		
		LNivelConsciencia = new JLabel("Nível de Consciência");
		LNivelConsciencia.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		LNivelConsciencia.setBounds(10, 71, 120, 14);
		panel.add(LNivelConsciencia);
		
		ComboNivConsciencia = new JComboBox();
		ComboNivConsciencia.setBounds(140, 69, 180, 20);
		panel.add(ComboNivConsciencia);
		
		LNivelOrientacao = new JLabel("Nível de Orientação");
		LNivelOrientacao.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		LNivelOrientacao.setBounds(10, 98, 120, 14);
		panel.add(LNivelOrientacao);
		
		ComboNivOrientacao = new JComboBox();
		ComboNivOrientacao.setBounds(140, 96, 180, 20);
		panel.add(ComboNivOrientacao);
		
		LQueixaPaciente = new JLabel("Queixa do Paciente");
		LQueixaPaciente.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		LQueixaPaciente.setBounds(10, 125, 120, 14);
		panel.add(LQueixaPaciente);
		
		TQueixaPaciente = new JTextField();
		TQueixaPaciente.setBounds(140, 123, 377, 20);
		panel.add(TQueixaPaciente);
		TQueixaPaciente.setColumns(10);
		
		LSinaisVitais = new JLabel("Sinais Vitais");
		LSinaisVitais.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		LSinaisVitais.setBounds(10, 170, 100, 14);
		panel.add(LSinaisVitais);
		
		LRespiracao = new JLabel("Respiração");
		LRespiracao.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		LRespiracao.setBounds(10, 194, 120, 14);
		panel.add(LRespiracao);
		
		LPulsacao = new JLabel("Pulsasão - bpm");
		LPulsacao.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		LPulsacao.setBounds(10, 271, 120, 14);
		panel.add(LPulsacao);
		
		LPressao = new JLabel("Pressão Arterial - PA");
		LPressao.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		LPressao.setBounds(10, 300, 120, 14);
		panel.add(LPressao);
		
		LTemperatura = new JLabel("Temperatura - °C");
		LTemperatura.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		LTemperatura.setBounds(10, 336, 120, 14);
		panel.add(LTemperatura);
		
		ComboTemperatura = new JComboBox();
		ComboTemperatura.setBounds(140, 334, 180, 20);
		panel.add(ComboTemperatura);
		
		TTemperatura = new JTextField();
		TTemperatura.setBounds(330, 334, 92, 20);
		panel.add(TTemperatura);
		TTemperatura.setColumns(10);
		
		LGraus = new JLabel("°C");
		LGraus.setBounds(430, 337, 46, 14);
		panel.add(LGraus);
		
		ComboPressao = new JComboBox();
		ComboPressao.setBounds(140, 298, 180, 20);
		panel.add(ComboPressao);
		
		TPressao = new JTextField();
		TPressao.setColumns(10);
		TPressao.setBounds(330, 298, 92, 20);
		panel.add(TPressao);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 157, 546, 2);
		panel.add(separator);
		
		ComboPulso = new JComboBox();
		ComboPulso.setBounds(140, 269, 180, 20);
		panel.add(ComboPulso);
		
		RadioEspontaneo = new JRadioButton("Espontâneo");
		RadioEspontaneo.setBounds(10, 215, 100, 23);
		panel.add(RadioEspontaneo);
		grupo.add(RadioEspontaneo);
		
		RadioOxigenio = new JRadioButton("Auxílio de Oxigênio");
		RadioOxigenio.setBounds(130, 215, 140, 23);
		panel.add(RadioOxigenio);
		grupo.add(RadioOxigenio);
		
		RadioTraquostomia = new JRadioButton("Traquostomia");
		RadioTraquostomia.setBounds(283, 215, 110, 23);
		panel.add(RadioTraquostomia);
		grupo.add(RadioTraquostomia);
		
		RadioEntubado = new JRadioButton("Entubado");
		RadioEntubado.setBounds(417, 215, 87, 23);
		panel.add(RadioEntubado);
		grupo.add(RadioEntubado);
		
		TPulso = new JTextField();
		TPulso.setColumns(10);
		TPulso.setBounds(330, 269, 92, 20);
		panel.add(TPulso);
		
		LBpm = new JLabel("bpm");
		LBpm.setBounds(430, 272, 46, 14);
		panel.add(LBpm);
		
		LMmhg = new JLabel("MMHG");
		LMmhg.setBounds(430, 301, 46, 14);
		panel.add(LMmhg);
		
		LData = new JLabel("Data Inclusão");
		LData.setBounds(345, 13, 77, 14);
		panel.add(LData);
		
		TData = new JTextField();
		TData.setBounds(417, 10, 100, 20);
		panel.add(TData);
		TData.setColumns(10);
		
		JData= new JFormattedTextField(ConverteDadosUtil.FormataData());
		panel.add(this.JData);
		
		BGravar = new JButton("Gravar");
		BGravar.setBounds(186, 382, 89, 23);
		panel.add(BGravar);
		
		BVoltar = new JButton("Voltar");
		BVoltar.setBounds(283, 382, 89, 23);
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


	public JTextField getTQueixaPaciente() {
		return TQueixaPaciente;
	}


	public void setTQueixaPaciente(JTextField tQueixaPaciente) {
		TQueixaPaciente = tQueixaPaciente;
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


	public JTextField getTData() {
		return TData;
	}


	public void setTData(JTextField tData) {
		TData = tData;
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
	
	
	
}
