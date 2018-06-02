package br.com.gsv.agenda.formulario;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.util.Calendar;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SpinnerDateModel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import br.com.gsv.agenda.listeners.AgendaListener;
import br.com.gsv.domain.sub.EnumTipoAgendamento;

import com.toedter.calendar.JDateChooser;


public class AgendaFormulario extends JDialog {

	private JPanel panel = new JPanel();
	private Container tela = getContentPane();
	private JTextField TPaciente, TFixo, TCelular, TConvenio, TFuncionario, TRegistro;
	private JLabel LAgendar, LAgendamento, LPaciente, LCelular, LFixo, LConvenio, LData, LHora, LObservacao, LRegistro, LFuncionario;
	private JComboBox ComboAgendamento;
	private JButton BPesqPacient, BPesqFunc, BSalvar, BVoltar;
	private JDateChooser TData;
	private JSpinner THoraSpinner;
	private JTextPane TObservacao;
	private AgendaListener listener;
	
	
	
	public static void main(String[] args) {
		try {
			AgendaFormulario dialog = new AgendaFormulario();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	public AgendaFormulario() {
		CriaTela();
		CriaComponentes();	
		AdicionaComponentes();
		listener = new AgendaListener(this);
	}
	
	private void CriaTela(){
		setBounds(100, 100, 540, 480);
		tela.setLayout(new BorderLayout());
		panel.setBackground(Color.WHITE);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		tela.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
	}
	
	private void CriaComponentes(){
		LAgendar = new JLabel("AGENDAR");
		LAgendar.setFont(new Font("Segoe UI Light", Font.PLAIN, 16));
		LAgendar.setBounds(10, 5, 125, 22);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 32, 504, 2);
		panel.add(separator);
		
		LAgendamento = new JLabel("TIPO DE AGENDAMENTO");
		LAgendamento.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		LAgendamento.setBounds(10, 145, 155, 18);
		
		ComboAgendamento = new JComboBox(EnumTipoAgendamento.values());
		ComboAgendamento.setBounds(10, 165, 213, 20);
		
		LPaciente = new JLabel("PACIENTE");
		LPaciente.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		LPaciente.setBounds(10, 40, 155, 18);
		
		TPaciente = new JTextField();
		TPaciente.setBorder(new LineBorder(Color.BLACK));
		TPaciente.setBounds(10, 60, 399, 20);
		TPaciente.setEditable(false);
		TPaciente.setColumns(10);
		
		BPesqPacient = new JButton("Pesquisar");
		BPesqPacient.setIcon(new ImageIcon(AgendaFormulario.class.getResource("/imagens/icons8-pesquisar-15.png")));
		BPesqPacient.setFont(new Font("Segoe UI Light", Font.PLAIN, 10));
		BPesqPacient.setBorder(null);
		BPesqPacient.setBackground(Color.WHITE);
		BPesqPacient.setBounds(419, 58, 95, 23);
		
		LCelular = new JLabel("TEL. CELULAR");
		LCelular.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		LCelular.setBounds(10, 88, 125, 18);
		
		LFixo = new JLabel("TEL. FIXO");
		LFixo.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		LFixo.setBounds(154, 88, 69, 18);
		
		TFixo = new JTextField();
		TFixo.setBorder(new LineBorder(Color.BLACK));
		TFixo.setColumns(10);
		TFixo.setBounds(154, 108, 120, 20);
		
		TCelular = new JTextField();
		TCelular.setBorder(new LineBorder(Color.BLACK));
		TCelular.setColumns(10);
		TCelular.setBounds(10, 108, 120, 20);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(10, 137, 504, 2);
		panel.add(separator_2);
		
		LConvenio = new JLabel("CONVÊNIO");
		LConvenio.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		LConvenio.setBounds(310, 88, 81, 18);
		
		TConvenio = new JTextField();
		TConvenio.setBorder(new LineBorder(Color.BLACK));
		TConvenio.setEditable(false);
		TConvenio.setColumns(10);
		TConvenio.setBounds(310, 108, 204, 20);
		
		TData = new JDateChooser();
		TData.setBorder(new LineBorder(new Color(0, 0, 0)));
		TData.setBounds(245, 165, 138, 20);
		
		LData = new JLabel("DATA");
		LData.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		LData.setBounds(245, 145, 43, 18);
		
		
		LHora = new JLabel("HORA");
		LHora.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		LHora.setBounds(405, 145, 43, 18);
		
		Date date = new Date();
		SpinnerDateModel sm = new SpinnerDateModel(date, null, null, Calendar.HOUR);
		THoraSpinner = new JSpinner(sm);
		THoraSpinner.setBorder(new LineBorder(new Color(0, 0, 0)));
		JSpinner.DateEditor de_THoraSpinner = new JSpinner.DateEditor(THoraSpinner, "HH:mm");
		THoraSpinner.setEditor(de_THoraSpinner);
		THoraSpinner.setBounds(405, 165, 109, 20);
		
		TObservacao = new JTextPane();
		TObservacao.setBorder(new LineBorder(new Color(0, 0, 0)));
		TObservacao.setBounds(10, 325, 504, 60);
		
		LObservacao = new JLabel("OBSERVAÇÃO");
		LObservacao.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		LObservacao.setBounds(10, 307, 95, 18);
		
		LFuncionario = new JLabel("FUNCIONÁRIO");
		LFuncionario.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		LFuncionario.setBounds(10, 209, 109, 18);
		
		TFuncionario = new JTextField();
		TFuncionario.setBorder(new LineBorder(Color.BLACK));
		TFuncionario.setEditable(false);
		TFuncionario.setColumns(10);
		TFuncionario.setBounds(10, 227, 399, 20);
		
		BPesqFunc = new JButton("Pesquisar");
		BPesqFunc.setIcon(new ImageIcon(AgendaFormulario.class.getResource("/imagens/icons8-pesquisar-15.png")));
		BPesqFunc.setFont(new Font("Segoe UI Light", Font.PLAIN, 10));
		BPesqFunc.setBorder(null);
		BPesqFunc.setBackground(Color.WHITE);
		BPesqFunc.setBounds(416, 226, 98, 23);
		
		LRegistro = new JLabel("REGISTRO");
		LRegistro.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		LRegistro.setBounds(10, 250, 75, 18);
		
		TRegistro = new JTextField();
		TRegistro.setBorder(new LineBorder(Color.BLACK));
		TRegistro.setColumns(10);
		TRegistro.setBounds(10, 268, 155, 20);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 196, 504, 2);
		panel.add(separator_1);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(10, 299, 504, 2);
		panel.add(separator_3);
		
		BSalvar = new JButton("Salvar");
		BSalvar.setBounds(159, 408, 89, 23);
		
		BVoltar = new JButton("Voltar");
		BVoltar.setBounds(258, 408, 89, 23);
		
	}
	
	private void AdicionaComponentes(){
		panel.add(LAgendar);
		panel.add(LAgendamento);
		panel.add(ComboAgendamento);
		panel.add(LPaciente);
		panel.add(TPaciente);
		panel.add(BPesqPacient);
		panel.add(LCelular);
		panel.add(LFixo);
		panel.add(TFixo);
		panel.add(TCelular);
		panel.add(LConvenio);
		panel.add(TConvenio);
		panel.add(TData);
		panel.add(LData);
		panel.add(LHora);
		panel.add(THoraSpinner);
		panel.add(TObservacao);
		panel.add(LObservacao);
		panel.add(LFuncionario);
		panel.add(TFuncionario);
		panel.add(BPesqFunc);
		panel.add(LRegistro);
		panel.add(TRegistro);
		panel.add(BSalvar);
		panel.add(BVoltar);
	}


	public JPanel getPanel() {
		return panel;
	}


	public void setPanel(JPanel panel) {
		this.panel = panel;
	}


	public JTextField getTPaciente() {
		return TPaciente;
	}


	public void setTPaciente(JTextField tPaciente) {
		TPaciente = tPaciente;
	}


	public JTextField getTFixo() {
		return TFixo;
	}


	public void setTFixo(JTextField tFixo) {
		TFixo = tFixo;
	}


	public JTextField getTCelular() {
		return TCelular;
	}


	public void setTCelular(JTextField tCelular) {
		TCelular = tCelular;
	}


	public JTextField getTConvenio() {
		return TConvenio;
	}


	public void setTConvenio(JTextField tConvenio) {
		TConvenio = tConvenio;
	}


	public JTextField getTFuncionario() {
		return TFuncionario;
	}


	public void setTFuncionario(JTextField tFuncionario) {
		TFuncionario = tFuncionario;
	}


	public JTextField getTRegistro() {
		return TRegistro;
	}


	public void setTRegistro(JTextField tRegistro) {
		TRegistro = tRegistro;
	}


	public JLabel getLAgendar() {
		return LAgendar;
	}


	public void setLAgendar(JLabel lAgendar) {
		LAgendar = lAgendar;
	}


	public JLabel getLAgendamento() {
		return LAgendamento;
	}


	public void setLAgendamento(JLabel lAgendamento) {
		LAgendamento = lAgendamento;
	}


	public JLabel getLPaciente() {
		return LPaciente;
	}


	public void setLPaciente(JLabel lPaciente) {
		LPaciente = lPaciente;
	}


	public JLabel getLCelular() {
		return LCelular;
	}


	public void setLCelular(JLabel lCelular) {
		LCelular = lCelular;
	}


	public JLabel getLFixo() {
		return LFixo;
	}


	public void setLFixo(JLabel lFixo) {
		LFixo = lFixo;
	}


	public JLabel getLConvenio() {
		return LConvenio;
	}


	public void setLConvenio(JLabel lConvenio) {
		LConvenio = lConvenio;
	}


	public JLabel getLData() {
		return LData;
	}


	public void setLData(JLabel lData) {
		LData = lData;
	}


	public JLabel getLHora() {
		return LHora;
	}


	public void setLHora(JLabel lHora) {
		LHora = lHora;
	}


	public JLabel getLObservacao() {
		return LObservacao;
	}


	public void setLObservacao(JLabel lObservacao) {
		LObservacao = lObservacao;
	}


	public JLabel getLRegistro() {
		return LRegistro;
	}


	public void setLRegistro(JLabel lRegistro) {
		LRegistro = lRegistro;
	}


	public JLabel getLFuncionario() {
		return LFuncionario;
	}


	public void setLFuncionario(JLabel lFuncionario) {
		LFuncionario = lFuncionario;
	}


	public JComboBox getComboAgendamento() {
		return ComboAgendamento;
	}


	public void setComboAgendamento(JComboBox comboAgendamento) {
		ComboAgendamento = comboAgendamento;
	}


	public JButton getBPesqPacient() {
		return BPesqPacient;
	}


	public void setBPesqPacient(JButton bPesqPacient) {
		BPesqPacient = bPesqPacient;
	}


	public JButton getBPesqFunc() {
		return BPesqFunc;
	}


	public void setBPesqFunc(JButton bPesqFunc) {
		BPesqFunc = bPesqFunc;
	}


	public JButton getBSalvar() {
		return BSalvar;
	}


	public void setBSalvar(JButton bSalvar) {
		BSalvar = bSalvar;
	}


	public JButton getBVoltar() {
		return BVoltar;
	}


	public void setBVoltar(JButton bVoltar) {
		BVoltar = bVoltar;
	}


	public JDateChooser getTData() {
		return TData;
	}


	public void setTData(JDateChooser tData) {
		TData = tData;
	}


	public JSpinner getTHoraSpinner() {
		return THoraSpinner;
	}


	public void setTHoraSpinner(JSpinner tHoraSpinner) {
		THoraSpinner = tHoraSpinner;
	}


	public JTextPane getTObservacao() {
		return TObservacao;
	}


	public void setTObservacao(JTextPane tObservacao) {
		TObservacao = tObservacao;
	}
	
	
	public void setTela(Container tela) {
		this.tela = tela;
	}
	public Container getTela() {
		return tela;
	}
	
	public AgendaListener getListener() {
		return listener;
	}
	
	public void setListener(AgendaListener listener) {
		this.listener = listener;
	}
	
}
