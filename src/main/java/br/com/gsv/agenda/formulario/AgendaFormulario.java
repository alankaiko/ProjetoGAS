package br.com.gsv.agenda.formulario;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import br.com.gsv.agenda.listeners.AgendaListener;
import br.com.gsv.domain.sub.EnumStatusAgendamento;
import br.com.gsv.domain.sub.EnumTipoAgendamento;

import com.toedter.calendar.JDateChooser;


public class AgendaFormulario extends JDialog {
	private JPanel panel = new JPanel();
	private Container tela = getContentPane();
	private JTextField TPaciente, TFixo, TCelular, TConvenio, TFuncionario, TRegistro, TEmail;
	private JLabel LAgendar, LAgendamento, LPaciente, LCelular, LFixo, LConvenio, LData, LHora;
	private JLabel LEmail, LObservacao, LRegistro, LFuncionario, LTituloProntuario;
	private JComboBox ComboAgendamento, ComboStatus;
	private JButton BPesqPacient, BPesqFunc, BSalvar, BVoltar;
	private JDateChooser TData;
	private JSpinner THoraSpinner;
	private JTextPane TObservacao;
	private AgendaListener listener;
	private JLabel Lstatus;
	private JPanel painelProntuario, painelTitProntuario;
	private JScrollPane scrollPane;
	private JTable table;

	
	

	
	public AgendaFormulario() {
		CriaTela();
		CriaComponentes();	
		AdicionaComponentes();
		listener = new AgendaListener(this);
	}
	
	private void CriaTela(){
		setBounds(100, 100, 730, 465);
		tela.setLayout(new BorderLayout());
		panel.setBackground(Color.WHITE);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		tela.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		this.setModal(true);
		this.setResizable(false);
		
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
		LAgendamento.setBounds(310, 162, 155, 18);
		
		ComboAgendamento = new JComboBox(EnumTipoAgendamento.values());
		ComboAgendamento.setBackground(Color.WHITE);
		ComboAgendamento.setBounds(310, 180, 204, 20);
		
		LPaciente = new JLabel("PACIENTE");
		LPaciente.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		LPaciente.setBounds(10, 35, 155, 18);
		
		TPaciente = new JTextField();
		TPaciente.setBorder(new LineBorder(Color.BLACK));
		TPaciente.setBounds(10, 55, 399, 20);
		TPaciente.setEditable(false);
		TPaciente.setColumns(10);
		
		BPesqPacient = new JButton("Pesquisar");
		BPesqPacient.setIcon(new ImageIcon(AgendaFormulario.class.getResource("/imagens/icons8-pesquisar-15.png")));
		BPesqPacient.setFont(new Font("Segoe UI Light", Font.PLAIN, 10));
		BPesqPacient.setBorder(null);
		BPesqPacient.setBackground(Color.WHITE);
		BPesqPacient.setBounds(419, 53, 95, 23);
		
		LCelular = new JLabel("TEL. CELULAR");
		LCelular.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		LCelular.setBounds(10, 82, 131, 18);
		
		LFixo = new JLabel("TEL. FIXO");
		LFixo.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		LFixo.setBounds(164, 82, 69, 18);
		
		TFixo = new JTextField();
		TFixo.setBorder(new LineBorder(Color.BLACK));
		TFixo.setEditable(false);
		TFixo.setColumns(10);
		TFixo.setBounds(164, 100, 125, 20);
		
		TCelular = new JTextField();
		TCelular.setBorder(new LineBorder(Color.BLACK));
		TCelular.setEditable(false);
		TCelular.setColumns(10);
		TCelular.setBounds(10, 100, 131, 20);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(10, 160, 504, 2);
		panel.add(separator_2);
		
		LConvenio = new JLabel("CONVÊNIO");
		LConvenio.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		LConvenio.setBounds(310, 82, 81, 18);
		
		TConvenio = new JTextField();
		TConvenio.setBorder(new LineBorder(Color.BLACK));
		TConvenio.setEditable(false);
		TConvenio.setColumns(10);
		TConvenio.setBounds(310, 100, 204, 20);
		
		TData = new JDateChooser();
		TData.setBorder(new LineBorder(new Color(0, 0, 0)));
		TData.setBounds(10, 180, 131, 20);
		
		LData = new JLabel("Agendar Data");
		LData.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		LData.setBounds(10, 162, 125, 18);
		
		TEmail = new JTextField();
		TEmail.setBorder(new LineBorder(Color.BLACK));
		TEmail.setEditable(false);
		TEmail.setColumns(10);
		TEmail.setBounds(10, 137, 399, 20);
		
		
		LHora = new JLabel("Agendar Hora");
		LHora.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		LHora.setBounds(164, 162, 125, 18);
		
		THoraSpinner = new JSpinner();
		THoraSpinner.setBorder(new LineBorder(new Color(0, 0, 0)));
		THoraSpinner.setBounds(164, 180, 125, 20);
		
		TObservacao = new JTextPane();
		TObservacao.setBorder(new LineBorder(new Color(0, 0, 0)));
		TObservacao.setBounds(10, 325, 504, 60);
		
		LObservacao = new JLabel("OBSERVAÇÃO");
		LObservacao.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		LObservacao.setBounds(10, 305, 95, 18);
		
		LFuncionario = new JLabel("Atendido Por");
		LFuncionario.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		LFuncionario.setBounds(10, 210, 109, 18);
		
		TFuncionario = new JTextField();
		TFuncionario.setBorder(new LineBorder(Color.BLACK));
		TFuncionario.setEditable(false);
		TFuncionario.setColumns(10);
		TFuncionario.setBounds(10, 230, 399, 20);
		
		BPesqFunc = new JButton("Pesquisar");
		BPesqFunc.setIcon(new ImageIcon(AgendaFormulario.class.getResource("/imagens/icons8-pesquisar-15.png")));
		BPesqFunc.setFont(new Font("Segoe UI Light", Font.PLAIN, 10));
		BPesqFunc.setBorder(null);
		BPesqFunc.setBackground(Color.WHITE);
		BPesqFunc.setBounds(416, 228, 98, 23);
		
		LRegistro = new JLabel("REGISTRO");
		LRegistro.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		LRegistro.setBounds(10, 255, 75, 18);
		
		TRegistro = new JTextField();
		TRegistro.setBorder(new LineBorder(Color.BLACK));
		TRegistro.setColumns(10);
		TRegistro.setEditable(false);
		TRegistro.setBounds(10, 275, 155, 20);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 205, 504, 2);
		panel.add(separator_1);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(10, 300, 504, 2);
		panel.add(separator_3);
		
		Lstatus = new JLabel("Status");
		Lstatus.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		Lstatus.setBounds(298, 12, 44, 18);
		
		ComboStatus = new JComboBox(EnumStatusAgendamento.values());
		ComboStatus.setBackground(Color.WHITE);
		ComboStatus.setBounds(338, 9, 176, 20);
		
		LEmail = new JLabel("Email");
		LEmail.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		LEmail.setBounds(10, 120, 69, 18);
		
		BSalvar = new JButton("Salvar");
		BSalvar.setBounds(164, 403, 89, 23);
		
		BVoltar = new JButton("Voltar");
		BVoltar.setBounds(263, 403, 89, 23);
		
		
		painelProntuario = new JPanel();
		painelProntuario.setBorder(new LineBorder(new Color(0, 0, 0)));
		painelProntuario.setBackground(new Color(248, 248, 248));
		painelProntuario.setBounds(519, 0, 203, 435);
		painelProntuario.setLayout(null);
		
		painelTitProntuario = new JPanel();
		painelTitProntuario.setBackground(Color.WHITE);
		painelTitProntuario.setBounds(0, 0, 202, 28);
		painelTitProntuario.setLayout(null);
		
		LTituloProntuario = new JLabel("HISTÓRICO DE PRONTUARIOS");
		LTituloProntuario.setFont(new Font("Segoe UI", Font.BOLD, 12));
		LTituloProntuario.setBounds(10, 5, 193, 25);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 28, 202, 405);
		scrollPane.getViewport().setBackground(Color.WHITE);
		table = new JTable();
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
		panel.add(TEmail);
		panel.add(LEmail);
		panel.add(Lstatus);
		panel.add(ComboStatus);
		panel.add(painelProntuario);
		painelProntuario.add(painelTitProntuario);
		painelTitProntuario.add(LTituloProntuario);
		painelProntuario.add(scrollPane);
		
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

	public JTextField getTEmail() {
		return TEmail;
	}

	public void setTEmail(JTextField tEmail) {
		TEmail = tEmail;
	}

	public JComboBox getComboStatus() {
		return ComboStatus;
	}

	public void setComboStatus(JComboBox comboStatus) {
		ComboStatus = comboStatus;
	}

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}

	public JScrollPane getScrollPane() {
		return scrollPane;
	}

	public void setScrollPane(JScrollPane scrollPane) {
		this.scrollPane = scrollPane;
	}

	
}