package br.com.gsv.prontuario.formularios;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import br.com.gsv.prontuario.listeners.ProntuarioListener;
import br.com.gsv.util.ConverteDadosUtil;
import java.awt.SystemColor;

public class ProntuarioForm extends JDialog {

	private JPanel panel = new JPanel();
	private JButton BTGravar, BTCancelar, BTPesquisar, BTPesquiFuncionario, BTGerar;
	private JPanel painelIntegridade,painelCondicao, painelDadosCliente, painelAnotacao, painelSintomas;
	private JPanel painelEquipamentos, painelAvaliacao;
	private JTextField TPaciente, TCodigo, TRg, TCpf, TDataNasc, TDataCad, THemorragia, TDispneia, TEdema;
	private JTextField TDEscamacao, THematoma, TCicatriz, TOutrosInt, THora;
	private JTextField TAtendCodigo,TAtendFuncionario,TAtendRegistro, TConvenio;
	private JLabel LProntuario, LPaciente, LCodigo, LRg, LCpf,LDataNasc, LDataCad, LAvaliacaoCefalo, LIntercorrencias;
	private JLabel LInfoEquip, LSonoCond, LEquipamentocli, LHora, LDadosCliente, LDadosFun, LAtendFun, LAtendRegistro;
	private JLabel LMembros, LTipoSintomas, LSintomas,LEspecifIntegridade, LDeambulacao, LAtendiCodigo, LConvenio;
	private JLabel LObservacaoCond, LRepouso, LObservacaoSono, LNivelConsc, LEstadoMental, LObservacaoAnot;
	private JRadioButton radioAlerta, radioLetargico, radioObnubilado,radioComatoso, radioVerbaliza;
	private JRadioButton radioAgitado, radioRelativo, radioAbsoluto, radioNivNormal, radioMenOutros;
	private JRadioButton radioTorporoso, radioCalmo, radioApatico, radioAlegre, radioEstNormal, radioCardiologico;
	private JRadioButton radioNeurologico, radioRespiratorio, radioTegumentar, radioGastrintestinal, radioGenito;
	private JRadioButton radioTriste, radioDeambulante, radioUtilizaCadeira, radioConscOutros;
	private JCheckBox checkHemorragia, checkDispneia, checkEdema,checkDescamacao,checkHematoma,checkCicatriz;
	private JCheckBox checkOutroInt, checkNauseas,checkMalEstar, checkInsonia,checkPrurido, checkColoracao;
	private JCheckBox checkPerfusao,checkPulso, checkCateter,checkSonda,checkUripen;
	private JCheckBox checkDreno,checkCurativos,checkVenoclise,checkOutros;
	private ButtonGroup grupoBotao1 = new ButtonGroup();
	private ButtonGroup grupoBotao2 = new ButtonGroup();
	private ButtonGroup grupoBotao3 = new ButtonGroup();
	private ButtonGroup grupoBotao4 = new ButtonGroup();
	private ButtonGroup grupoBotao5 = new ButtonGroup();
	private JTextArea textoSintomas, textoAreaAnotacao, textoEquipamento;
	private JTextArea textoMembros, textoAreaDeam, textoAreaSono;
	private JTextArea textoAreaAvaliacaoCef, textoAreaChegada, textoAreaAvaliacaoInt;
	private JSeparator separator_2, separaAvaliacao, separaRepouso;
	private ProntuarioListener listener;
	private JFormattedTextField JCpf, JDatanascimento;
	private JTabbedPane tabGeral;
	private JLayeredPane dadosCliente,  dadosAnotacao, dadosCondicao,dadosIntegridade, dadosSintomas,dadosEquipamentoCli, dadosAvaliacao;
		



	public ProntuarioForm() {
		setBounds(100, 100, 775, 482);
		getContentPane().setLayout(new BorderLayout());
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(panel, BorderLayout.CENTER);
		setModal(true);
		setResizable(false);
		panel.setLayout(null);
		
		tabGeral = new JTabbedPane(JTabbedPane.RIGHT);
		tabGeral.setBackground(Color.WHITE);
		tabGeral.setBounds(15, 34, 744, 375);
		panel.add(tabGeral);

		TelaGeral();
		TabDadosCliente();
		TabAnotacao();
		TabCondicao();
		TabIntegridade();
		TabSintomas();
		TabAvaliacao();
		TabEquipamentos();
				
		
		listener = new ProntuarioListener(this);		
	}
	
	private void TelaGeral(){
		LProntuario = new JLabel("Prontuário");
		LProntuario.setBounds(5, 5, 75, 18);
		LProntuario.setFont(new Font("Arial", Font.BOLD, 15));
		panel.add(LProntuario);
		
		BTGravar = new JButton("Gravar");
		BTGravar.setBounds(276, 420, 89, 25);
		panel.add(BTGravar);

		BTCancelar = new JButton("Cancelar");
		BTCancelar.setBounds(375, 420, 89, 25);
		panel.add(BTCancelar);
		
		BTGerar = new JButton("Gerar PDF");
		BTGerar.setIcon(new ImageIcon(ProntuarioForm.class.getResource("/imagens/icons8-pdf-15.png")));
		BTGerar.setBounds(628, 420, 115, 25);
		panel.add(BTGerar);
	}
	
	private void TabDadosCliente(){
		dadosCliente = new JLayeredPane();
		dadosCliente.setBackground(Color.WHITE);
		tabGeral.addTab("Dados Cliente", null, dadosCliente, null);
		dadosCliente.setLayout(null);
		
		painelDadosCliente = new JPanel();
		painelDadosCliente.setBackground(Color.WHITE);
		painelDadosCliente.setBounds(0, 0, 620, 370);
		painelDadosCliente.setLayout(null);
		dadosCliente.add(painelDadosCliente);
		
		LDadosCliente = new JLabel("Nível de Consciência");
		LDadosCliente.setFont(new Font("Arial", Font.PLAIN, 14));
		LDadosCliente.setBounds(5, 11, 160, 14);
		painelDadosCliente.add(LDadosCliente);
		
		LCodigo = new JLabel("Código");
		LCodigo.setBounds(5, 78, 46, 14);
		painelDadosCliente.add(LCodigo);
						
		TCodigo = new JTextField();
		TCodigo.setBounds(55, 75, 128, 20);
		TCodigo.setBorder(new LineBorder(Color.BLACK));
		TCodigo.setEditable(false);
		TCodigo.setColumns(10);
		painelDadosCliente.add(TCodigo);
		
		LDataCad = new JLabel("Data Cadastro ");
		LDataCad.setBounds(233, 78, 89, 14);
		painelDadosCliente.add(LDataCad);
		
		TDataCad = new JTextField();
		TDataCad.setBounds(332, 75, 101, 20);
		TDataCad.setBorder(new LineBorder(Color.BLACK));
		TDataCad.setColumns(10);
		TDataCad.setEditable(false);
		painelDadosCliente.add(TDataCad);
		
		LPaciente = new JLabel("Paciente");
		LPaciente.setBounds(5, 112, 55, 14);
		painelDadosCliente.add(LPaciente);
		
		TPaciente = new JTextField();
		TPaciente.setBounds(57, 109, 376, 20);
		TPaciente.setBorder(new LineBorder(Color.BLACK));
		TPaciente.setEditable(false);
		TPaciente.setColumns(10);
		painelDadosCliente.add(TPaciente);
		
		BTPesquisar = new JButton("Pesquisar");
		BTPesquisar.setBorder(null);
		BTPesquisar.setBackground(Color.WHITE);
		BTPesquisar.setFont(new Font("Segoe UI Light", Font.PLAIN, 10));
		BTPesquisar.setIcon(new ImageIcon(ProntuarioForm.class.getResource("/imagens/icons8-pesquisar-15.png")));
		BTPesquisar.setBounds(443, 111, 116, 23);
		painelDadosCliente.add(BTPesquisar);
		
		LRg = new JLabel("RG");
		LRg.setBounds(5, 144, 46, 14);
		painelDadosCliente.add(LRg);
		
		TRg = new JTextField();
		TRg.setBounds(55, 141, 128, 20);
		TRg.setBorder(new LineBorder(Color.BLACK));
		TRg.setEditable(false);
		TRg.setColumns(10);
		painelDadosCliente.add(TRg);
		
		LCpf = new JLabel("CPF");
		LCpf.setBounds(222, 144, 46, 14);
		painelDadosCliente.add(LCpf);
													
		TCpf = new JTextField();
		TCpf.setBounds(278, 141, 155, 20);
		TCpf.setBorder(new LineBorder(Color.BLACK));
		TCpf.setEditable(false);
		TCpf.setColumns(10);
		painelDadosCliente.add(TCpf);
		JCpf = new JFormattedTextField(ConverteDadosUtil.FormataCPF());
		
		LDataNasc = new JLabel("Data Nasc.");
		LDataNasc.setBounds(5, 183, 67, 14);
		painelDadosCliente.add(LDataNasc);
		
		TDataNasc = new JTextField();
		TDataNasc.setBounds(82, 180, 101, 20);
		TDataNasc.setBorder(new LineBorder(Color.BLACK));
		TDataNasc.setEditable(false);
		TDataNasc.setColumns(10);
		painelDadosCliente.add(TDataNasc);
		JDatanascimento = new JFormattedTextField(ConverteDadosUtil.FormataData());
		
		LConvenio = new JLabel("Convênio");
		LConvenio.setBounds(222, 183, 55, 14);
		painelDadosCliente.add(LConvenio);
		
		TConvenio = new JTextField();
		TConvenio.setEditable(false);
		TConvenio.setColumns(10);
		TConvenio.setBorder(new LineBorder(Color.BLACK));
		TConvenio.setBounds(278, 180, 155, 20);
		painelDadosCliente.add(TConvenio);
		
		LHora = new JLabel("Hora Registro");
		LHora.setBounds(354, 12, 79, 14);
		painelDadosCliente.add(LHora);
		
		THora = new JTextField();
		THora.setEditable(false);
		THora.setColumns(10);
		THora.setBorder(new LineBorder(Color.BLACK));
		THora.setBounds(443, 9, 116, 20);
		painelDadosCliente.add(THora);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 214, 564, 2);
		painelDadosCliente.add(separator);
		
		LDadosFun = new JLabel("Atendido Por");
		LDadosFun.setFont(new Font("Arial", Font.PLAIN, 14));
		LDadosFun.setBounds(5, 267, 160, 14);
		painelDadosCliente.add(LDadosFun);
		
		LAtendiCodigo = new JLabel("Código");
		LAtendiCodigo.setBounds(10, 292, 46, 14);
		painelDadosCliente.add(LAtendiCodigo);
		
		TAtendCodigo = new JTextField();
		TAtendCodigo.setBorder(new LineBorder(Color.BLACK));
		TAtendCodigo.setBounds(10, 317, 46, 20);
		TAtendCodigo.setEditable(false);
		TAtendCodigo.setColumns(10);
		painelDadosCliente.add(TAtendCodigo);
		
		LAtendFun = new JLabel("Funcionário");
		LAtendFun.setBounds(82, 292, 89, 14);
		painelDadosCliente.add(LAtendFun);
		
		TAtendFuncionario = new JTextField();
		TAtendFuncionario.setBorder(new LineBorder(Color.BLACK));
		TAtendFuncionario.setBounds(82, 317, 251, 20);
		TAtendFuncionario.setEditable(false);
		TAtendFuncionario.setColumns(10);
		painelDadosCliente.add(TAtendFuncionario);
		
		LAtendRegistro = new JLabel("Registro");
		LAtendRegistro.setBounds(357, 292, 55, 14);
		painelDadosCliente.add(LAtendRegistro);
		
		TAtendRegistro = new JTextField();
		TAtendRegistro.setBorder(new LineBorder(Color.BLACK));
		TAtendRegistro.setBounds(357, 317, 202, 20);
		TAtendRegistro.setEditable(false);
		TAtendRegistro.setColumns(10);
		painelDadosCliente.add(TAtendRegistro);
		
		BTPesquiFuncionario = new JButton("Pesquisar");
		BTPesquiFuncionario.setIcon(new ImageIcon(ProntuarioForm.class.getResource("/imagens/icons8-pesquisar-15.png")));
		BTPesquiFuncionario.setFont(new Font("Segoe UI Light", Font.PLAIN, 10));
		BTPesquiFuncionario.setBorder(null);
		BTPesquiFuncionario.setBackground(Color.WHITE);
		BTPesquiFuncionario.setBounds(443, 264, 116, 23);
		painelDadosCliente.add(BTPesquiFuncionario);
	}

	private void TabAnotacao(){
		dadosAnotacao = new JLayeredPane();
		dadosAnotacao.setBackground(Color.WHITE);
		tabGeral.addTab("Anotação", null, dadosAnotacao, null);
		
		painelAnotacao = new JPanel();
		painelAnotacao.setBackground(Color.WHITE);
		painelAnotacao.setBounds(0, 0, 620, 370);
		painelAnotacao.setLayout(null);
		dadosAnotacao.add(painelAnotacao);
		
		LNivelConsc = new JLabel("Nível de Consciência");
		LNivelConsc.setBounds(11, 16, 160, 14);
		LNivelConsc.setFont(new Font("Arial", Font.PLAIN, 14));	
		painelAnotacao.add(LNivelConsc);
		
		radioNivNormal = new JRadioButton("Normal");
		radioNivNormal.setFont(new Font("Arial", Font.PLAIN, 13));
		radioNivNormal.setBackground(Color.WHITE);
		radioNivNormal.setActionCommand("Letárgico");
		radioNivNormal.setBounds(10, 37, 70, 23);
		grupoBotao1.add(radioNivNormal);
		painelAnotacao.add(radioNivNormal);
		
		radioAlerta = new JRadioButton("Alerta");
		radioAlerta.setBounds(82, 37, 70, 23);
		radioAlerta.setFont(new Font("Arial", Font.PLAIN, 13));
		radioAlerta.setBackground(Color.WHITE);			
		grupoBotao1.add(radioAlerta);
		painelAnotacao.add(radioAlerta);
		
		radioLetargico = new JRadioButton("Letárgico");
		radioLetargico.setBounds(147, 37, 81, 23);
		radioLetargico.setFont(new Font("Arial", Font.PLAIN, 13));
		radioLetargico.setBackground(Color.WHITE);
		grupoBotao1.add(radioLetargico);
		painelAnotacao.add(radioLetargico);
		
		radioObnubilado = new JRadioButton("Obnubilado");
		radioObnubilado.setBounds(230, 37, 98, 23);
		radioObnubilado.setFont(new Font("Arial", Font.PLAIN, 13));
		radioObnubilado.setBackground(Color.WHITE);
		grupoBotao1.add(radioObnubilado);
		painelAnotacao.add(radioObnubilado);
		
		radioTorporoso = new JRadioButton("Torporoso");
		radioTorporoso.setBounds(324, 37, 85, 23);
		radioTorporoso.setFont(new Font("Arial", Font.PLAIN, 13));
		radioTorporoso.setBackground(Color.WHITE);
		grupoBotao1.add(radioTorporoso);
		painelAnotacao.add(radioTorporoso);
		
		radioComatoso = new JRadioButton("Comatoso");
		radioComatoso.setBounds(411, 37, 85, 23);
		radioComatoso.setFont(new Font("Arial", Font.PLAIN, 13));
		radioComatoso.setBackground(Color.WHITE);
		grupoBotao1.add(radioComatoso);
		painelAnotacao.add(radioComatoso);
		
		radioConscOutros = new JRadioButton("Outros");
		radioConscOutros.setBounds(498, 38, 85, 23);
		radioConscOutros.setFont(new Font("Arial", Font.PLAIN, 13));
		radioConscOutros.setBackground(Color.WHITE);
		grupoBotao1.add(radioConscOutros);
		painelAnotacao.add(radioConscOutros);
		
		JSeparator separa1 = new JSeparator();
		separa1.setBounds(39, 79, 526, 2);
		painelAnotacao.add(separa1);

		LEstadoMental = new JLabel("Estado Mental");
		LEstadoMental.setBounds(10, 92, 109, 14);
		LEstadoMental.setFont(new Font("Arial", Font.PLAIN, 14));
		painelAnotacao.add(LEstadoMental);
		
		radioEstNormal = new JRadioButton("Normal");
		radioEstNormal.setFont(new Font("Arial", Font.PLAIN, 13));
		radioEstNormal.setBackground(Color.WHITE);
		radioEstNormal.setActionCommand("Calmo");
		radioEstNormal.setBounds(10, 115, 70, 23);
		grupoBotao2.add(radioEstNormal);
		painelAnotacao.add(radioEstNormal);
		
		radioCalmo = new JRadioButton("Calmo");
		radioCalmo.setBounds(93, 115, 70, 23);
		radioCalmo.setFont(new Font("Arial", Font.PLAIN, 13));
		radioCalmo.setBackground(Color.WHITE);																	
		grupoBotao2.add(radioCalmo);
		painelAnotacao.add(radioCalmo);
		
		radioApatico = new JRadioButton("Apático");
		radioApatico.setBounds(165, 115, 81, 23);
		radioApatico.setFont(new Font("Arial", Font.PLAIN, 13));
		radioApatico.setBackground(Color.WHITE);
		grupoBotao2.add(radioApatico);
		painelAnotacao.add(radioApatico);
		
		radioAlegre = new JRadioButton("Alegre");
		radioAlegre.setBounds(258, 115, 70, 23);
		radioAlegre.setFont(new Font("Arial", Font.PLAIN, 13));
		radioAlegre.setBackground(Color.WHITE);
		grupoBotao2.add(radioAlegre);
		painelAnotacao.add(radioAlegre);
												
		radioTriste = new JRadioButton("Triste");
		radioTriste.setBounds(339, 115, 70, 23);
		radioTriste.setFont(new Font("Arial", Font.PLAIN, 13));
		radioTriste.setBackground(Color.WHITE);
		grupoBotao2.add(radioTriste);	
		painelAnotacao.add(radioTriste);
		
		radioAgitado = new JRadioButton("Agitado");
		radioAgitado.setBounds(415, 115, 81, 23);
		radioAgitado.setFont(new Font("Arial", Font.PLAIN, 13));
		radioAgitado.setBackground(Color.WHITE);
		grupoBotao2.add(radioAgitado);
		painelAnotacao.add(radioAgitado);
		
		radioMenOutros = new JRadioButton("Outros");
		radioMenOutros.setFont(new Font("Arial", Font.PLAIN, 13));
		radioMenOutros.setBackground(Color.WHITE);
		radioMenOutros.setBounds(498, 116, 85, 23);
		grupoBotao2.add(radioMenOutros);
		painelAnotacao.add(radioMenOutros);		
		
		JSeparator separa2 = new JSeparator();
		separa2.setBounds(39, 153, 526, 2);
		painelAnotacao.add(separa2);
		
		LObservacaoAnot = new JLabel("Observação");
		LObservacaoAnot.setBounds(10, 168, 98, 14);
		LObservacaoAnot.setFont(new Font("Arial", Font.PLAIN, 14));
		painelAnotacao.add(LObservacaoAnot);

		textoAreaAnotacao = new JTextArea();
		textoAreaAnotacao.setBackground(Color.WHITE);
		textoAreaAnotacao.setRows(7);
		textoAreaAnotacao.setBorder(new LineBorder(Color.BLACK));
		textoAreaAnotacao.setBounds(10, 193, 431, 110);
		painelAnotacao.add(textoAreaAnotacao);
	}
	
	private void TabCondicao(){
		dadosCondicao = new JLayeredPane();
		dadosCondicao.setBackground(Color.WHITE);
		tabGeral.addTab("Condição", null, dadosCondicao, null);
		dadosCondicao.setLayout(null);
		
		painelCondicao = new JPanel();
		painelCondicao.setBackground(Color.WHITE);
		painelCondicao.setBounds(0, 0, 620, 370);
		dadosCondicao.add(painelCondicao);
		painelCondicao.setLayout(null);
		
		LDeambulacao = new JLabel("Avaliação do Paciente");
		LDeambulacao.setFont(new Font("Arial", Font.PLAIN, 14));
		LDeambulacao.setBounds(10, 11, 169, 14);
		painelCondicao.add(LDeambulacao);
		
		radioVerbaliza = new JRadioButton("Verbalizando");
		radioVerbaliza.setFont(new Font("Arial", Font.PLAIN, 13));
		radioVerbaliza.setBackground(Color.WHITE);
		radioVerbaliza.setActionCommand("Deâmbulante");
		radioVerbaliza.setBounds(10, 32, 109, 23);
		grupoBotao3.add(radioVerbaliza);
		painelCondicao.add(radioVerbaliza);

		radioDeambulante = new JRadioButton("Deâmbulante");
		radioDeambulante.setBackground(Color.WHITE);
		radioDeambulante.setFont(new Font("Arial", Font.PLAIN, 13));
		radioDeambulante.setBounds(121, 32, 109, 23);
		radioDeambulante.setActionCommand("Deâmbulante");
		grupoBotao3.add(radioDeambulante);
		painelCondicao.add(radioDeambulante);
		
		radioUtilizaCadeira = new JRadioButton("Utiliza cadeira de rodas");
		radioUtilizaCadeira.setBackground(Color.WHITE);
		radioUtilizaCadeira.setFont(new Font("Arial", Font.PLAIN, 13));
		radioUtilizaCadeira.setBounds(232, 32, 197, 23);
		radioDeambulante.setActionCommand("Utiliza cadeira de rodas?");
		grupoBotao3.add(radioUtilizaCadeira);
		painelCondicao.add(radioUtilizaCadeira);
		
		LObservacaoCond = new JLabel("Observação");
		LObservacaoCond.setFont(new Font("Arial", Font.PLAIN, 13));
		LObservacaoCond.setBounds(10, 70, 84, 14);
		painelCondicao.add(LObservacaoCond);
		
		textoAreaDeam = new JTextArea();
		textoAreaDeam.setRows(2);
		textoAreaDeam.setBorder(new LineBorder(Color.BLACK));
		textoAreaDeam.setBounds(132, 65, 433, 38);
		painelCondicao.add(textoAreaDeam);
		
		separaAvaliacao = new JSeparator();
		separaAvaliacao.setBounds(10, 107, 564, 2);
		painelCondicao.add(separaAvaliacao);
		
		LRepouso = new JLabel("Repouso no Leito");
		LRepouso.setFont(new Font("Arial", Font.PLAIN, 14));
		LRepouso.setBounds(10, 120, 127, 14);
		painelCondicao.add(LRepouso);

		radioRelativo = new JRadioButton("Relativo");
		radioRelativo.setBackground(Color.WHITE);
		radioRelativo.setFont(new Font("Arial", Font.PLAIN, 13));
		radioRelativo.setBounds(10, 144, 109, 23);
		radioRelativo.setActionCommand("Relativo");
		grupoBotao4.add(radioRelativo);
		painelCondicao.add(radioRelativo);

		radioAbsoluto = new JRadioButton("Absoluto");
		radioAbsoluto.setBackground(Color.WHITE);
		radioAbsoluto.setFont(new Font("Arial", Font.PLAIN, 13));
		radioAbsoluto.setBounds(136, 144, 109, 23);
		radioRelativo.setActionCommand("Absoluto");
		grupoBotao4.add(radioAbsoluto);
		painelCondicao.add(radioAbsoluto);
		
		separaRepouso = new JSeparator();
		separaRepouso.setBounds(10, 185, 564, 2);
		painelCondicao.add(separaRepouso);
		
		LSonoCond = new JLabel("Sono e Repouso");
		LSonoCond.setFont(new Font("Arial", Font.PLAIN, 14));
		LSonoCond.setBounds(10, 198, 127, 14);
		painelCondicao.add(LSonoCond);
		
		LObservacaoSono = new JLabel("Observação");
		LObservacaoSono.setFont(new Font("Arial", Font.PLAIN, 13));
		LObservacaoSono.setBounds(10, 226, 84, 14);
		painelCondicao.add(LObservacaoSono);
		
		textoAreaSono = new JTextArea();
		textoAreaSono.setRows(4);
		textoAreaSono.setBorder(new LineBorder(Color.BLACK));
		textoAreaSono.setBounds(132, 221, 433, 44);
		painelCondicao.add(textoAreaSono);
		
		JSeparator separaSono = new JSeparator();
		separaSono.setBounds(10, 276, 564, 2);
		painelCondicao.add(separaSono);
		
		JLabel LChegadaCond = new JLabel("Condição de Chegada");
		LChegadaCond.setFont(new Font("Arial", Font.PLAIN, 14));
		LChegadaCond.setBounds(10, 284, 169, 23);
		painelCondicao.add(LChegadaCond);
		
		textoAreaChegada = new JTextArea();
		textoAreaChegada.setRows(4);
		textoAreaChegada.setBorder(new LineBorder(Color.BLACK));
		textoAreaChegada.setBounds(132, 309, 433, 44);
		painelCondicao.add(textoAreaChegada);

	}
	
	private void TabIntegridade(){
		dadosIntegridade = new JLayeredPane();
		tabGeral.addTab("Integridade", null, dadosIntegridade, null);
		
		painelIntegridade = new JPanel();
		painelIntegridade.setBackground(Color.WHITE);
		painelIntegridade.setBounds(0, 0, 620, 370);
		dadosIntegridade.add(painelIntegridade);
		painelIntegridade.setLayout(null);
		
		LEspecifIntegridade = new JLabel("Especificar Integridade do Paciente");
		LEspecifIntegridade.setFont(new Font("Arial", Font.PLAIN, 14));
		LEspecifIntegridade.setBounds(10, 11, 285, 14);
		painelIntegridade.add(LEspecifIntegridade);
		
		checkHemorragia = new JCheckBox("Hemorragia");
		checkHemorragia.setBackground(Color.WHITE);
		checkHemorragia.setBounds(10, 32, 97, 23);
		painelIntegridade.add(checkHemorragia);
		
		THemorragia = new JTextField();
		THemorragia.setBorder(new LineBorder(Color.BLACK));
		THemorragia.setBounds(125, 33, 454, 20);
		painelIntegridade.add(THemorragia);
		THemorragia.setColumns(10);

		checkDispneia = new JCheckBox("Dispnéia");
		checkDispneia.setBackground(Color.WHITE);
		checkDispneia.setBounds(10, 65, 97, 23);
		painelIntegridade.add(checkDispneia);
		
		TDispneia = new JTextField();
		TDispneia.setColumns(10);
		TDispneia.setBorder(new LineBorder(Color.BLACK));
		TDispneia.setBounds(125, 66, 454, 20);
		painelIntegridade.add(TDispneia);
		
		checkEdema = new JCheckBox("Edema");
		checkEdema.setBackground(Color.WHITE);
		checkEdema.setBounds(10, 98, 97, 23);
		painelIntegridade.add(checkEdema);
		
		TEdema = new JTextField();
		TEdema.setColumns(10);
		TEdema.setBorder(new LineBorder(Color.BLACK));
		TEdema.setBounds(125, 99, 454, 20);
		painelIntegridade.add(TEdema);
		
		checkDescamacao = new JCheckBox("Descamação");
		checkDescamacao.setBackground(Color.WHITE);
		checkDescamacao.setBounds(10, 132, 109, 23);
		painelIntegridade.add(checkDescamacao);
		
		TDEscamacao = new JTextField();
		TDEscamacao.setColumns(10);
		TDEscamacao.setBorder(new LineBorder(Color.BLACK));
		TDEscamacao.setBounds(125, 133, 454, 20);
		painelIntegridade.add(TDEscamacao);
		
		checkHematoma = new JCheckBox("Hematoma");
		checkHematoma.setBackground(Color.WHITE);
		checkHematoma.setBounds(10, 168, 97, 23);
		painelIntegridade.add(checkHematoma);
		
		THematoma = new JTextField();
		THematoma.setColumns(10);
		THematoma.setBorder(new LineBorder(Color.BLACK));
		THematoma.setBounds(125, 169, 454, 20);
		painelIntegridade.add(THematoma);
		
		checkCicatriz = new JCheckBox("Cicatriz");
		checkCicatriz.setBackground(Color.WHITE);
		checkCicatriz.setBounds(10, 203, 97, 23);
		painelIntegridade.add(checkCicatriz);
		
		TCicatriz = new JTextField();
		TCicatriz.setColumns(10);
		TCicatriz.setBorder(new LineBorder(Color.BLACK));
		TCicatriz.setBounds(125, 204, 454, 20);
		painelIntegridade.add(TCicatriz);
		
		checkOutroInt = new JCheckBox("Outros");
		checkOutroInt.setBackground(Color.WHITE);
		checkOutroInt.setBounds(10, 239, 97, 23);
		painelIntegridade.add(checkOutroInt);

		TOutrosInt = new JTextField();
		TOutrosInt.setColumns(10);
		TOutrosInt.setBorder(new LineBorder(Color.BLACK));
		TOutrosInt.setBounds(125, 240, 454, 20);
		painelIntegridade.add(TOutrosInt);

	}
	
	private void TabSintomas(){
		dadosSintomas = new JLayeredPane();
		tabGeral.addTab("Sintomas", null, dadosSintomas, null);

		painelSintomas = new JPanel();
		painelSintomas.setBackground(Color.WHITE);
		painelSintomas.setBounds(0, 0, 620, 370);
		dadosSintomas.add(painelSintomas);
		painelSintomas.setLayout(null);
		
		LSintomas = new JLabel("Especificar Sintomas");
		LSintomas.setFont(new Font("Arial", Font.PLAIN, 14));
		LSintomas.setBounds(10, 11, 155, 14);
		painelSintomas.add(LSintomas);
		
		checkNauseas = new JCheckBox("Náuseas");
		checkNauseas.setBackground(Color.WHITE);
		checkNauseas.setBounds(10, 32, 97, 23);
		painelSintomas.add(checkNauseas);

		checkMalEstar = new JCheckBox("Mal estar");
		checkMalEstar.setBackground(Color.WHITE);
		checkMalEstar.setBounds(10, 67, 97, 23);
		painelSintomas.add(checkMalEstar);

		checkInsonia = new JCheckBox("Insônia");
		checkInsonia.setBackground(Color.WHITE);
		checkInsonia.setBounds(10, 104, 97, 23);
		painelSintomas.add(checkInsonia);

		checkPrurido = new JCheckBox("Prurido");
		checkPrurido.setBackground(Color.WHITE);
		checkPrurido.setBounds(10, 141, 97, 23);
		painelSintomas.add(checkPrurido);
		
		LTipoSintomas = new JLabel("Tipo, localização, intensidade e outras característica");
		LTipoSintomas.setFont(new Font("Arial", Font.PLAIN, 13));
		LTipoSintomas.setBounds(163, 36, 364, 14);
		painelSintomas.add(LTipoSintomas);
		
		textoSintomas = new JTextArea();
		textoSintomas.setRows(6);
		textoSintomas.setBorder(new LineBorder(Color.BLACK));
		textoSintomas.setBounds(163, 54, 390, 110);
		painelSintomas.add(textoSintomas);
		
		separator_2 = new JSeparator();
		separator_2.setBounds(10, 185, 564, 2);
		painelSintomas.add(separator_2);

		LMembros = new JLabel("Membros superiores e inferiores");
		LMembros.setFont(new Font("Arial", Font.PLAIN, 14));
		LMembros.setBounds(10, 198, 238, 14);
		painelSintomas.add(LMembros);
		
		checkColoracao = new JCheckBox("Coloração");
		checkColoracao.setBackground(Color.WHITE);
		checkColoracao.setBounds(10, 218, 97, 23);
		painelSintomas.add(checkColoracao);

		checkPerfusao = new JCheckBox("Perfusão");
		checkPerfusao.setBackground(Color.WHITE);
		checkPerfusao.setBounds(10, 244, 97, 23);
		painelSintomas.add(checkPerfusao);

		checkPulso = new JCheckBox("Pulso");
		checkPulso.setBackground(Color.WHITE);
		checkPulso.setBounds(10, 270, 97, 23);
		painelSintomas.add(checkPulso);
		
		textoMembros = new JTextArea();
		textoMembros.setRows(4);
		textoMembros.setBorder(new LineBorder(Color.BLACK));
		textoMembros.setBounds(163, 233, 390, 70);
		painelSintomas.add(textoMembros);
	}
	
	private void TabAvaliacao(){
		dadosAvaliacao = new JLayeredPane();
		tabGeral.addTab("Avaliação", null, dadosAvaliacao, null);
		
		painelAvaliacao = new JPanel();
		painelAvaliacao.setBackground(Color.WHITE);
		painelAvaliacao.setBounds(0, 0, 620, 370);
		dadosAvaliacao.add(painelAvaliacao);
		painelAvaliacao.setLayout(null);
		
		LAvaliacaoCefalo = new JLabel("Avaliação Céfalo Caudal");
		LAvaliacaoCefalo.setFont(new Font("Arial", Font.PLAIN, 14));
		LAvaliacaoCefalo.setBounds(10, 11, 169, 14);
		painelAvaliacao.add(LAvaliacaoCefalo);
		
		radioNeurologico = new JRadioButton("Neurológico");
		radioNeurologico.setFont(new Font("Arial", Font.PLAIN, 13));
		radioNeurologico.setBounds(10, 32, 129, 23);
		radioNeurologico.setBackground(Color.WHITE);
		grupoBotao5.add(radioNeurologico);
		painelAvaliacao.add(radioNeurologico);
		
		radioRespiratorio = new JRadioButton("Respiratório");
		radioRespiratorio.setFont(new Font("Arial", Font.PLAIN, 13));
		radioRespiratorio.setBounds(10, 60, 142, 23);
		radioRespiratorio.setBackground(Color.WHITE);
		grupoBotao5.add(radioRespiratorio);
		painelAvaliacao.add(radioRespiratorio);
		
		radioCardiologico = new JRadioButton("Cardiológico");
		radioCardiologico.setFont(new Font("Arial", Font.PLAIN, 13));
		radioCardiologico.setBounds(10, 86, 142, 23);
		radioCardiologico.setBackground(Color.WHITE);
		grupoBotao5.add(radioCardiologico);
		painelAvaliacao.add(radioCardiologico);
		
		radioTegumentar = new JRadioButton("Tegumentar");
		radioTegumentar.setFont(new Font("Arial", Font.PLAIN, 13));
		radioTegumentar.setBounds(10, 112, 142, 23);
		radioTegumentar.setBackground(Color.WHITE);
		grupoBotao5.add(radioTegumentar);
		painelAvaliacao.add(radioTegumentar);
		
		radioGastrintestinal = new JRadioButton("Gastrintestinal");
		radioGastrintestinal.setFont(new Font("Arial", Font.PLAIN, 13));
		radioGastrintestinal.setBounds(10, 138, 142, 23);
		radioGastrintestinal.setBackground(Color.WHITE);
		grupoBotao5.add(radioGastrintestinal);
		painelAvaliacao.add(radioGastrintestinal);
		
		radioGenito = new JRadioButton("Gênito Urinário");
		radioGenito.setFont(new Font("Arial", Font.PLAIN, 13));
		radioGenito.setBounds(10, 164, 142, 23);
		radioGenito.setBackground(Color.WHITE);
		grupoBotao5.add(radioGenito);
		painelAvaliacao.add(radioGenito);

		JSeparator separator = new JSeparator();
		separator.setBounds(10, 197, 564, 2);
		painelAvaliacao.add(separator);
		
		textoAreaAvaliacaoCef = new JTextArea();
		textoAreaAvaliacaoCef.setRows(10);
		textoAreaAvaliacaoCef.setBorder(new LineBorder(Color.BLACK));
		textoAreaAvaliacaoCef.setBounds(182, 79, 392, 100);
		painelAvaliacao.add(textoAreaAvaliacaoCef);
		
		LIntercorrencias = new JLabel("Intercorrências/Alergias");
		LIntercorrencias.setFont(new Font("Arial", Font.PLAIN, 14));
		LIntercorrencias.setBounds(10, 207, 191, 23);
		painelAvaliacao.add(LIntercorrencias);
		
		textoAreaAvaliacaoInt = new JTextArea();
		textoAreaAvaliacaoInt.setRows(10);
		textoAreaAvaliacaoInt.setBorder(new LineBorder(Color.BLACK));
		textoAreaAvaliacaoInt.setBounds(10, 231, 564, 112);
		painelAvaliacao.add(textoAreaAvaliacaoInt);
	}
	
	private void TabEquipamentos(){
		dadosEquipamentoCli = new JLayeredPane();
		tabGeral.addTab("Equipamentos Cliente", null, dadosEquipamentoCli, null);

		painelEquipamentos = new JPanel();
		painelEquipamentos.setBackground(Color.WHITE);
		painelEquipamentos.setBounds(0, 0, 620, 370);
		dadosEquipamentoCli.add(painelEquipamentos);
		painelEquipamentos.setLayout(null);
		
		LEquipamentocli = new JLabel("Equipamentos que o paciente utiliza");
		LEquipamentocli.setFont(new Font("Arial", Font.PLAIN, 14));
		LEquipamentocli.setBounds(10, 11, 400, 14);
		painelEquipamentos.add(LEquipamentocli);
		
		checkCateter = new JCheckBox("Catéter");
		checkCateter.setFont(new Font("Arial", Font.PLAIN, 13));
		checkCateter.setBackground(Color.WHITE);
		checkCateter.setBounds(20, 38, 97, 23);
		painelEquipamentos.add(checkCateter);
		
		checkSonda = new JCheckBox("Sonda");
		checkSonda.setFont(new Font("Arial", Font.PLAIN, 13));
		checkSonda.setBackground(Color.WHITE);
		checkSonda.setBounds(20, 69, 97, 23);
		painelEquipamentos.add(checkSonda);
		
		checkUripen = new JCheckBox("Uripen");
		checkUripen.setFont(new Font("Arial", Font.PLAIN, 13));
		checkUripen.setBackground(Color.WHITE);
		checkUripen.setBounds(20, 105, 97, 23);
		painelEquipamentos.add(checkUripen);
				
		checkDreno = new JCheckBox("Dreno");
		checkDreno.setFont(new Font("Arial", Font.PLAIN, 13));
		checkDreno.setBackground(Color.WHITE);
		checkDreno.setBounds(20, 142, 97, 23);
		painelEquipamentos.add(checkDreno);
		
		checkCurativos = new JCheckBox("Curativos");
		checkCurativos.setFont(new Font("Arial", Font.PLAIN, 13));
		checkCurativos.setBackground(Color.WHITE);
		checkCurativos.setBounds(20, 177, 97, 23);
		painelEquipamentos.add(checkCurativos);
		
		checkVenoclise = new JCheckBox("Venóclise");
		checkVenoclise.setFont(new Font("Arial", Font.PLAIN, 13));
		checkVenoclise.setBackground(Color.WHITE);
		checkVenoclise.setBounds(20, 214, 97, 23);
		painelEquipamentos.add(checkVenoclise);
		
		checkOutros = new JCheckBox("Outros");
		checkOutros.setFont(new Font("Arial", Font.PLAIN, 13));
		checkOutros.setBackground(Color.WHITE);
		checkOutros.setBounds(20, 253, 97, 23);
		painelEquipamentos.add(checkOutros);
		
		LInfoEquip = new JLabel("Informações sobre aparelhos que o paciente utiliza");
		LInfoEquip.setFont(new Font("Arial", Font.BOLD, 13));
		LInfoEquip.setBounds(163, 69, 357, 14);
		painelEquipamentos.add(LInfoEquip);
		
		textoEquipamento = new JTextArea();
		textoEquipamento.setRows(10);
		textoEquipamento.setBorder(new LineBorder(Color.BLACK));
		textoEquipamento.setBounds(163, 96, 392, 180);
		painelEquipamentos.add(textoEquipamento);
	}
	
	

	public JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
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

	public JPanel getPainelIntegridade() {
		return painelIntegridade;
	}

	public void setPainelIntegridade(JPanel painelIntegridade) {
		this.painelIntegridade = painelIntegridade;
	}

	public JPanel getPainelCondicao() {
		return painelCondicao;
	}

	public void setPainelCondicao(JPanel painelCondicao) {
		this.painelCondicao = painelCondicao;
	}

	public JPanel getPainelDadosCliente() {
		return painelDadosCliente;
	}

	public void setPainelDadosCliente(JPanel painelDadosCliente) {
		this.painelDadosCliente = painelDadosCliente;
	}

	public JPanel getPainelAnotacao() {
		return painelAnotacao;
	}

	public void setPainelAnotacao(JPanel painelAnotacao) {
		this.painelAnotacao = painelAnotacao;
	}

	public JPanel getPainelSintomas() {
		return painelSintomas;
	}

	public void setPainelSintomas(JPanel painelSintomas) {
		this.painelSintomas = painelSintomas;
	}

	public JTextField getTPaciente() {
		return TPaciente;
	}

	public void setTPaciente(JTextField tPaciente) {
		TPaciente = tPaciente;
	}

	public JTextField getTCodigo() {
		return TCodigo;
	}

	public void setTCodigo(JTextField tCodigo) {
		TCodigo = tCodigo;
	}

	public JTextField getTRg() {
		return TRg;
	}

	public void setTRg(JTextField tRg) {
		TRg = tRg;
	}

	public JTextField getTCpf() {
		return TCpf;
	}

	public void setTCpf(JTextField tCpf) {
		TCpf = tCpf;
	}

	public JTextField getTDataNasc() {
		return TDataNasc;
	}

	public void setTDataNasc(JTextField tDataNasc) {
		TDataNasc = tDataNasc;
	}

	public JTextField getTDataCad() {
		return TDataCad;
	}

	public void setTDataCad(JTextField tDataCad) {
		TDataCad = tDataCad;
	}

	public JTextField getTHemorragia() {
		return THemorragia;
	}

	public void setTHemorragia(JTextField tHemorragia) {
		THemorragia = tHemorragia;
	}

	public JTextField getTDispneia() {
		return TDispneia;
	}

	public void setTDispneia(JTextField tDispneia) {
		TDispneia = tDispneia;
	}

	public JTextField getTEdema() {
		return TEdema;
	}

	public void setTEdema(JTextField tEdema) {
		TEdema = tEdema;
	}

	public JTextField getTDEscamacao() {
		return TDEscamacao;
	}

	public void setTDEscamacao(JTextField tDEscamacao) {
		TDEscamacao = tDEscamacao;
	}

	public JTextField getTHematoma() {
		return THematoma;
	}

	public void setTHematoma(JTextField tHematoma) {
		THematoma = tHematoma;
	}

	public JTextField getTCicatriz() {
		return TCicatriz;
	}

	public void setTCicatriz(JTextField tCicatriz) {
		TCicatriz = tCicatriz;
	}

	public JTextField getTOutrosInt() {
		return TOutrosInt;
	}

	public void setTOutrosInt(JTextField tOutrosInt) {
		TOutrosInt = tOutrosInt;
	}

	public JLabel getLProntuario() {
		return LProntuario;
	}

	public void setLProntuario(JLabel lProntuario) {
		LProntuario = lProntuario;
	}

	public JLabel getLPaciente() {
		return LPaciente;
	}

	public void setLPaciente(JLabel lPaciente) {
		LPaciente = lPaciente;
	}

	public void setBTPesquisar(JButton bTPesquisar) {
		BTPesquisar = bTPesquisar;
	}
	
	public JButton getBTPesquisar() {
		return BTPesquisar;
	}
	
	public JLabel getLCodigo() {
		return LCodigo;
	}

	public void setLCodigo(JLabel lCodigo) {
		LCodigo = lCodigo;
	}

	public JLabel getLRg() {
		return LRg;
	}

	public void setLRg(JLabel lRg) {
		LRg = lRg;
	}

	public JLabel getLCpf() {
		return LCpf;
	}

	public void setLCpf(JLabel lCpf) {
		LCpf = lCpf;
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

	public JLabel getLInfoEquip() {
		return LInfoEquip;
	}

	public void setLInfoEquip(JLabel lInfoEquip) {
		LInfoEquip = lInfoEquip;
	}

	public JLabel getLSonoCond() {
		return LSonoCond;
	}

	public void setLSonoCond(JLabel lSonoCond) {
		LSonoCond = lSonoCond;
	}

	public JLabel getLMembros() {
		return LMembros;
	}

	public void setLMembros(JLabel lMembros) {
		LMembros = lMembros;
	}

	public JLabel getLTipoSintomas() {
		return LTipoSintomas;
	}

	public void setLTipoSintomas(JLabel lTipoSintomas) {
		LTipoSintomas = lTipoSintomas;
	}

	public JLabel getLSintomas() {
		return LSintomas;
	}

	public void setLSintomas(JLabel lSintomas) {
		LSintomas = lSintomas;
	}

	public JLabel getLEspecifIntegridade() {
		return LEspecifIntegridade;
	}

	public void setLEspecifIntegridade(JLabel lEspecifIntegridade) {
		LEspecifIntegridade = lEspecifIntegridade;
	}

	public JLabel getLDeambulacao() {
		return LDeambulacao;
	}

	public void setLDeambulacao(JLabel lDeambulacao) {
		LDeambulacao = lDeambulacao;
	}

	public JLabel getLObservacaoCond() {
		return LObservacaoCond;
	}

	public void setLObservacaoCond(JLabel lObservacaoCond) {
		LObservacaoCond = lObservacaoCond;
	}

	public JLabel getLRepouso() {
		return LRepouso;
	}

	public void setLRepouso(JLabel lRepouso) {
		LRepouso = lRepouso;
	}

	public JLabel getLObservacaoSono() {
		return LObservacaoSono;
	}

	public void setLObservacaoSono(JLabel lObservacaoSono) {
		LObservacaoSono = lObservacaoSono;
	}

	public JLayeredPane getDadosCliente() {
		return dadosCliente;
	}

	public void setDadosCliente(JLayeredPane dadosCliente) {
		this.dadosCliente = dadosCliente;
	}

	public JLayeredPane getDadosAnotacao() {
		return dadosAnotacao;
	}

	public void setDadosAnotacao(JLayeredPane dadosAnotacao) {
		this.dadosAnotacao = dadosAnotacao;
	}

	public JLayeredPane getDadosCondicao() {
		return dadosCondicao;
	}

	public void setDadosCondicao(JLayeredPane dadosCondicao) {
		this.dadosCondicao = dadosCondicao;
	}

	public JLayeredPane getDadosIntegridade() {
		return dadosIntegridade;
	}

	public void setDadosIntegridade(JLayeredPane dadosIntegridade) {
		this.dadosIntegridade = dadosIntegridade;
	}

	public JLayeredPane getDadosSintomas() {
		return dadosSintomas;
	}

	public void setDadosSintomas(JLayeredPane dadosSintomas) {
		this.dadosSintomas = dadosSintomas;
	}

	public JLayeredPane getDadosEquipamentoCli() {
		return dadosEquipamentoCli;
	}

	public void setDadosEquipamentoCli(JLayeredPane dadosEquipamentoCli) {
		this.dadosEquipamentoCli = dadosEquipamentoCli;
	}

	public JRadioButton getRadioAlerta() {
		return radioAlerta;
	}

	public void setRadioAlerta(JRadioButton radioAlerta) {
		this.radioAlerta = radioAlerta;
	}

	public JRadioButton getRadioLetargico() {
		return radioLetargico;
	}

	public void setRadioLetargico(JRadioButton radioLetargico) {
		this.radioLetargico = radioLetargico;
	}

	public JRadioButton getRadioObnubilado() {
		return radioObnubilado;
	}

	public void setRadioObnubilado(JRadioButton radioObnubilado) {
		this.radioObnubilado = radioObnubilado;
	}

	public JRadioButton getRadioComatoso() {
		return radioComatoso;
	}

	public void setRadioComatoso(JRadioButton radioComatoso) {
		this.radioComatoso = radioComatoso;
	}

	public JRadioButton getRadioAgitado() {
		return radioAgitado;
	}

	public void setRadioAgitado(JRadioButton radioAgitado) {
		this.radioAgitado = radioAgitado;
	}

	public JRadioButton getRadioRelativo() {
		return radioRelativo;
	}

	public void setRadioRelativo(JRadioButton radioRelativo) {
		this.radioRelativo = radioRelativo;
	}

	public JRadioButton getRadioAbsoluto() {
		return radioAbsoluto;
	}

	public void setRadioAbsoluto(JRadioButton radioAbsoluto) {
		this.radioAbsoluto = radioAbsoluto;
	}

	public JRadioButton getRadioTorporoso() {
		return radioTorporoso;
	}

	public void setRadioTorporoso(JRadioButton radioTorporoso) {
		this.radioTorporoso = radioTorporoso;
	}

	public JRadioButton getRadioCalmo() {
		return radioCalmo;
	}

	public void setRadioCalmo(JRadioButton radioCalmo) {
		this.radioCalmo = radioCalmo;
	}

	public JRadioButton getRadioApatico() {
		return radioApatico;
	}

	public void setRadioApatico(JRadioButton radioApatico) {
		this.radioApatico = radioApatico;
	}

	public JRadioButton getRadioAlegre() {
		return radioAlegre;
	}

	public void setRadioAlegre(JRadioButton radioAlegre) {
		this.radioAlegre = radioAlegre;
	}

	public JRadioButton getRadioTriste() {
		return radioTriste;
	}

	public void setRadioTriste(JRadioButton radioTriste) {
		this.radioTriste = radioTriste;
	}

	public JRadioButton getRadioDeambulante() {
		return radioDeambulante;
	}

	public void setRadioDeambulante(JRadioButton radioDeambulante) {
		this.radioDeambulante = radioDeambulante;
	}

	public JRadioButton getRadioUtilizaCadeira() {
		return radioUtilizaCadeira;
	}

	public void setRadioUtilizaCadeira(JRadioButton radioUtilizaCadeira) {
		this.radioUtilizaCadeira = radioUtilizaCadeira;
	}

	public JCheckBox getCheckHemorragia() {
		return checkHemorragia;
	}

	public void setCheckHemorragia(JCheckBox checkHemorragia) {
		this.checkHemorragia = checkHemorragia;
	}

	public JCheckBox getCheckDispneia() {
		return checkDispneia;
	}

	public void setCheckDispneia(JCheckBox checkDispneia) {
		this.checkDispneia = checkDispneia;
	}

	public JCheckBox getCheckEdema() {
		return checkEdema;
	}

	public void setCheckEdema(JCheckBox checkEdema) {
		this.checkEdema = checkEdema;
	}

	public JCheckBox getCheckDescamacao() {
		return checkDescamacao;
	}

	public void setCheckDescamacao(JCheckBox checkDescamacao) {
		this.checkDescamacao = checkDescamacao;
	}

	public JCheckBox getCheckHematoma() {
		return checkHematoma;
	}

	public void setCheckHematoma(JCheckBox checkHematoma) {
		this.checkHematoma = checkHematoma;
	}

	public JCheckBox getCheckCicatriz() {
		return checkCicatriz;
	}

	public void setCheckCicatriz(JCheckBox checkCicatriz) {
		this.checkCicatriz = checkCicatriz;
	}

	public JCheckBox getCheckOutroInt() {
		return checkOutroInt;
	}

	public void setCheckOutroInt(JCheckBox checkOutroInt) {
		this.checkOutroInt = checkOutroInt;
	}

	public JCheckBox getCheckNauseas() {
		return checkNauseas;
	}

	public void setCheckNauseas(JCheckBox checkNauseas) {
		this.checkNauseas = checkNauseas;
	}

	public JCheckBox getCheckMalEstar() {
		return checkMalEstar;
	}

	public void setCheckMalEstar(JCheckBox checkMalEstar) {
		this.checkMalEstar = checkMalEstar;
	}

	public JCheckBox getCheckInsonia() {
		return checkInsonia;
	}

	public void setCheckInsonia(JCheckBox checkInsonia) {
		this.checkInsonia = checkInsonia;
	}

	public JCheckBox getCheckPrurido() {
		return checkPrurido;
	}

	public void setCheckPrurido(JCheckBox checkPrurido) {
		this.checkPrurido = checkPrurido;
	}

	public JCheckBox getCheckColoracao() {
		return checkColoracao;
	}

	public void setCheckColoracao(JCheckBox checkColoracao) {
		this.checkColoracao = checkColoracao;
	}

	public JCheckBox getCheckPerfusao() {
		return checkPerfusao;
	}

	public void setCheckPerfusao(JCheckBox checkPerfusao) {
		this.checkPerfusao = checkPerfusao;
	}


	public JCheckBox getCheckPulso() {
		return checkPulso;
	}

	public void setCheckPulso(JCheckBox checkPulso) {
		this.checkPulso = checkPulso;
	}


	public JTabbedPane getTabGeral() {
		return tabGeral;
	}

	public void setTabGeral(JTabbedPane tabGeral) {
		this.tabGeral = tabGeral;
	}

	public ButtonGroup getGrupoBotao1() {
		return grupoBotao1;
	}

	public void setGrupoBotao1(ButtonGroup grupoBotao1) {
		this.grupoBotao1 = grupoBotao1;
	}

	public ButtonGroup getGrupoBotao2() {
		return grupoBotao2;
	}

	public void setGrupoBotao2(ButtonGroup grupoBotao2) {
		this.grupoBotao2 = grupoBotao2;
	}

	public ButtonGroup getGrupoBotao3() {
		return grupoBotao3;
	}

	public void setGrupoBotao3(ButtonGroup grupoBotao3) {
		this.grupoBotao3 = grupoBotao3;
	}

	public ButtonGroup getGrupoBotao4() {
		return grupoBotao4;
	}

	public void setGrupoBotao4(ButtonGroup grupoBotao4) {
		this.grupoBotao4 = grupoBotao4;
	}

	public JTextArea getTextoSintomas() {
		return textoSintomas;
	}

	public void setTextoSintomas(JTextArea textoSintomas) {
		this.textoSintomas = textoSintomas;
	}

	public JTextArea getTextoAreaAnotacao() {
		return textoAreaAnotacao;
	}

	public void setTextoAreaAnotacao(JTextArea textoAreaAnotacao) {
		this.textoAreaAnotacao = textoAreaAnotacao;
	}

	public JTextArea getTextoMembros() {
		return textoMembros;
	}

	public void setTextoMembros(JTextArea textoMembros) {
		this.textoMembros = textoMembros;
	}

	public JTextArea getTextoAreaDeam() {
		return textoAreaDeam;
	}

	public void setTextoAreaDeam(JTextArea textoAreaDeam) {
		this.textoAreaDeam = textoAreaDeam;
	}

	public JTextArea getTextoAreaSono() {
		return textoAreaSono;
	}

	public void setTextoAreaSono(JTextArea textoAreaSono) {
		this.textoAreaSono = textoAreaSono;
	}

	public JPanel getPainelEquipamentos() {
		return painelEquipamentos;
	}

	public void setPainelEquipamentos(JPanel painelEquipamentos) {
		this.painelEquipamentos = painelEquipamentos;
	}

	public JLabel getLEquipamentocli() {
		return LEquipamentocli;
	}

	public void setLEquipamentocli(JLabel lEquipamentocli) {
		LEquipamentocli = lEquipamentocli;
	}

	public JLabel getLNivelConsc() {
		return LNivelConsc;
	}

	public void setLNivelConsc(JLabel lNivelConsc) {
		LNivelConsc = lNivelConsc;
	}

	public JLabel getLEstadoMental() {
		return LEstadoMental;
	}

	public void setLEstadoMental(JLabel lEstadoMental) {
		LEstadoMental = lEstadoMental;
	}

	public JLabel getLObservacaoAnot() {
		return LObservacaoAnot;
	}

	public void setLObservacaoAnot(JLabel lObservacaoAnot) {
		LObservacaoAnot = lObservacaoAnot;
	}

	public JCheckBox getCheckCateter() {
		return checkCateter;
	}

	public void setCheckCateter(JCheckBox checkCateter) {
		this.checkCateter = checkCateter;
	}

	public JCheckBox getCheckSonda() {
		return checkSonda;
	}

	public void setCheckSonda(JCheckBox checkSonda) {
		this.checkSonda = checkSonda;
	}

	public JCheckBox getCheckUripen() {
		return checkUripen;
	}

	public void setCheckUripen(JCheckBox checkUripen) {
		this.checkUripen = checkUripen;
	}

	public JCheckBox getCheckDreno() {
		return checkDreno;
	}

	public void setCheckDreno(JCheckBox checkDreno) {
		this.checkDreno = checkDreno;
	}

	public JCheckBox getCheckCurativos() {
		return checkCurativos;
	}

	public void setCheckCurativos(JCheckBox checkCurativos) {
		this.checkCurativos = checkCurativos;
	}

	public JCheckBox getCheckVenoclise() {
		return checkVenoclise;
	}

	public void setCheckVenoclise(JCheckBox checkVenoclise) {
		this.checkVenoclise = checkVenoclise;
	}

	public JCheckBox getCheckOutros() {
		return checkOutros;
	}

	public void setCheckOutros(JCheckBox checkOutros) {
		this.checkOutros = checkOutros;
	}

	public JTextArea getTextoEquipamento() {
		return textoEquipamento;
	}

	public void setTextoEquipamento(JTextArea textoEquipamento) {
		this.textoEquipamento = textoEquipamento;
	}
	
	public void setJCpf(JFormattedTextField jCpf) {
		JCpf = jCpf;
	}
	
	public JFormattedTextField getJCpf() {
		return JCpf;
	}
	
	public void setJDatanascimento(JFormattedTextField jDatanascimento) {
		JDatanascimento = jDatanascimento;
	}
	
	public JFormattedTextField getJDatanascimento() {
		return JDatanascimento;
	}
	
	public JTextField getTHora() {
		return THora;
	}
	
	public void setTHora(JTextField tHora) {
		THora = tHora;
	}

	public JLabel getLHora() {
		return LHora;
	}

	public void setLHora(JLabel lHora) {
		LHora = lHora;
	}

	public JRadioButton getRadioNivNormal() {
		return radioNivNormal;
	}

	public void setRadioNivNormal(JRadioButton radioNivNormal) {
		this.radioNivNormal = radioNivNormal;
	}

	public JRadioButton getRadioEstNormal() {
		return radioEstNormal;
	}

	public void setRadioEstNormal(JRadioButton radioEstNormal) {
		this.radioEstNormal = radioEstNormal;
	}
	
	public ProntuarioListener getListener() {
		return listener;
	}
	public void setListener(ProntuarioListener listener) {
		this.listener = listener;
	}

	public JRadioButton getRadioMenOutros() {
		return radioMenOutros;
	}

	public void setRadioMenOutros(JRadioButton radioMenOutros) {
		this.radioMenOutros = radioMenOutros;
	}

	public JRadioButton getRadioConscOutros() {
		return radioConscOutros;
	}

	public void setRadioConscOutros(JRadioButton radioConscOutros) {
		this.radioConscOutros = radioConscOutros;
	}

	public JRadioButton getRadioVerbaliza() {
		return radioVerbaliza;
	}

	public void setRadioVerbaliza(JRadioButton radioVerbaliza) {
		this.radioVerbaliza = radioVerbaliza;
	}

	public JTextArea getTextoAreaChegada() {
		return textoAreaChegada;
	}

	public void setTextoAreaChegada(JTextArea textoAreaChegada) {
		this.textoAreaChegada = textoAreaChegada;
	}

	public ButtonGroup getGrupoBotao5() {
		return grupoBotao5;
	}

	public void setGrupoBotao5(ButtonGroup grupoBotao5) {
		this.grupoBotao5 = grupoBotao5;
	}

	public JSeparator getSeparator_2() {
		return separator_2;
	}

	public void setSeparator_2(JSeparator separator_2) {
		this.separator_2 = separator_2;
	}

	public JSeparator getSeparaAvaliacao() {
		return separaAvaliacao;
	}

	public void setSeparaAvaliacao(JSeparator separaAvaliacao) {
		this.separaAvaliacao = separaAvaliacao;
	}

	public JSeparator getSeparaRepouso() {
		return separaRepouso;
	}

	public void setSeparaRepouso(JSeparator separaRepouso) {
		this.separaRepouso = separaRepouso;
	}

	public JLabel getLAvaliacaoCefalo() {
		return LAvaliacaoCefalo;
	}

	public void setLAvaliacaoCefalo(JLabel lAvaliacaoCefalo) {
		LAvaliacaoCefalo = lAvaliacaoCefalo;
	}

	public JLabel getLIntercorrencias() {
		return LIntercorrencias;
	}

	public void setLIntercorrencias(JLabel lIntercorrencias) {
		LIntercorrencias = lIntercorrencias;
	}

	public JTextArea getTextoAreaAvaliacaoCef() {
		return textoAreaAvaliacaoCef;
	}

	public void setTextoAreaAvaliacaoCef(JTextArea textoAreaAvaliacaoCef) {
		this.textoAreaAvaliacaoCef = textoAreaAvaliacaoCef;
	}

	public JTextArea getTextoAreaAvaliacaoInt() {
		return textoAreaAvaliacaoInt;
	}

	public void setTextoAreaAvaliacaoInt(JTextArea textoAreaAvaliacaoInt) {
		this.textoAreaAvaliacaoInt = textoAreaAvaliacaoInt;
	}

	public JRadioButton getRadioCardiologico() {
		return radioCardiologico;
	}

	public void setRadioCardiologico(JRadioButton radioCardiologico) {
		this.radioCardiologico = radioCardiologico;
	}

	public JRadioButton getRadioNeurologico() {
		return radioNeurologico;
	}

	public void setRadioNeurologico(JRadioButton radioNeurologico) {
		this.radioNeurologico = radioNeurologico;
	}

	public JRadioButton getRadioRespiratorio() {
		return radioRespiratorio;
	}

	public void setRadioRespiratorio(JRadioButton radioRespiratorio) {
		this.radioRespiratorio = radioRespiratorio;
	}

	public JRadioButton getRadioTegumentar() {
		return radioTegumentar;
	}

	public void setRadioTegumentar(JRadioButton radioTegumentar) {
		this.radioTegumentar = radioTegumentar;
	}

	public JRadioButton getRadioGastrintestinal() {
		return radioGastrintestinal;
	}

	public void setRadioGastrintestinal(JRadioButton radioGastrintestinal) {
		this.radioGastrintestinal = radioGastrintestinal;
	}

	public JRadioButton getRadioGenito() {
		return radioGenito;
	}

	public void setRadioGenito(JRadioButton radioGenito) {
		this.radioGenito = radioGenito;
	}

	public JTextField getTAtendCodigo() {
		return TAtendCodigo;
	}

	public void setTAtendCodigo(JTextField tAtendCodigo) {
		TAtendCodigo = tAtendCodigo;
	}

	public JTextField getTAtendFuncionario() {
		return TAtendFuncionario;
	}

	public void setTAtendFuncionario(JTextField tAtendFuncionario) {
		TAtendFuncionario = tAtendFuncionario;
	}

	public JTextField getTAtendRegistro() {
		return TAtendRegistro;
	}

	public void setTAtendRegistro(JTextField tAtendRegistro) {
		TAtendRegistro = tAtendRegistro;
	}

	public JLabel getLDadosCliente() {
		return LDadosCliente;
	}

	public void setLDadosCliente(JLabel lDadosCliente) {
		LDadosCliente = lDadosCliente;
	}

	public JLabel getLDadosFun() {
		return LDadosFun;
	}

	public void setLDadosFun(JLabel lDadosFun) {
		LDadosFun = lDadosFun;
	}

	public JLabel getLAtendFun() {
		return LAtendFun;
	}

	public void setLAtendFun(JLabel lAtendFun) {
		LAtendFun = lAtendFun;
	}

	public JLabel getLAtendRegistro() {
		return LAtendRegistro;
	}

	public void setLAtendRegistro(JLabel lAtendRegistro) {
		LAtendRegistro = lAtendRegistro;
	}

	public JLabel getLAtendiCodigo() {
		return LAtendiCodigo;
	}

	public void setLAtendiCodigo(JLabel lAtendiCodigo) {
		LAtendiCodigo = lAtendiCodigo;
	}

	public JButton getBTPesquiFuncionario() {
		return BTPesquiFuncionario;
	}

	public void setBTPesquiFuncionario(JButton bTPesquiFuncionario) {
		BTPesquiFuncionario = bTPesquiFuncionario;
	}

	public JTextField getTConvenio() {
		return TConvenio;
	}

	public void setTConvenio(JTextField tConvenio) {
		TConvenio = tConvenio;
	}
	
	public JButton getBTGerar() {
		return BTGerar;
	}
	
	public void setBTGerar(JButton bTGerar) {
		BTGerar = bTGerar;
	}
}
