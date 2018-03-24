package br.com.gsv.prontuario.formularios;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
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

public class ProntuarioForm extends JDialog {

	private JPanel panel = new JPanel();
	private JButton BTGravar, BTCancelar;
	private JPanel painelIntegridade,painelCondicao, painelDadosCliente, painelAnotacao, painelSintomas;
	private JPanel painelEquipamentos;
	private JTextField TPaciente, TCodigo, TRg, TCpf, TDataNasc, TDataCad, THemorragia, TDispneia, TEdema;
	private JTextField TDEscamacao, THematoma, TCicatriz, TOutrosInt;
	private JLabel LProntuario, LPaciente, LPesquisar, LCodigo, LRg, LCpf,LDataNasc, LDataCad;
	private JLabel LInfoEquip, LSonoCond, LEquipamentocli;
	private JLabel LMembros, LTipoSintomas, LSintomas,LEspecifIntegridade, LDeambulacao;
	private JLabel LObservacaoCond, LRepouso, LObservacaoSono, LNivelConsc, LEstadoMental, LObservacaoAnot;
	private JLayeredPane dadosCliente,  dadosAnotacao, dadosCondicao,dadosIntegridade, dadosSintomas,dadosEquipamentoCli;
	private JRadioButton radioAlerta, radioLetargico, radioObnubilado,radioComatoso;
	private JRadioButton radioAgitado, radioRelativo, radioAbsoluto;
	private JRadioButton radioTorporoso, radioCalmo, radioApatico, radioAlegre;
	private JRadioButton radioTriste, radioDeambulante, radioUtilizaCadeira;
	private JCheckBox checkHemorragia, checkDispneia, checkEdema,checkDescamacao,checkHematoma,checkCicatriz;
	private JCheckBox checkOutroInt, checkNauseas,checkMalEstar, checkInsonia,checkPrurido, checkColoracao;
	private JCheckBox checkPerfusao,LPulso, checkCateter,checkSonda,checkUripen;
	private JCheckBox checkDreno,checkCurativos,checkVenoclise,checkOutros;
	private JTabbedPane tabGeral;
	private ButtonGroup grupoBotao1 = new ButtonGroup();
	private ButtonGroup grupoBotao2 = new ButtonGroup();
	private ButtonGroup grupoBotao3 = new ButtonGroup();
	private ButtonGroup grupoBotao4 = new ButtonGroup();
	private JTextArea textoSintomas, textoAreaAnotacao, textoEquipamento;
	private JTextArea textoMembros, textoAreaDeam, textoAreaSono;
	private JSeparator separator_2, separator, separator_1;
		



	public ProntuarioForm() {
		setBounds(100, 100, 650, 460);
		getContentPane().setLayout(new BorderLayout());
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		BTGravar = new JButton("Gravar");
		BTGravar.setBounds(211, 387, 89, 23);
		panel.add(BTGravar);

		BTCancelar = new JButton("Cancelar");
		BTCancelar.setBounds(310, 387, 89, 23);
		panel.add(BTCancelar);

		tabGeral = new JTabbedPane(JTabbedPane.TOP);
		tabGeral.setBackground(Color.WHITE);
		tabGeral.setBounds(15, 34, 609, 342);
		panel.add(tabGeral);

		TabCliente();
	
	}

	private void TabCliente() {
		LProntuario = new JLabel("Prontuário");
		LProntuario.setBounds(5, 5, 75, 18);
		LProntuario.setFont(new Font("Arial", Font.BOLD, 15));
		panel.add(LProntuario);

		dadosCliente = new JLayeredPane();
		dadosCliente.setBackground(Color.WHITE);
		tabGeral.addTab("Dados Cliente", null, dadosCliente, null);
		dadosCliente.setLayout(null);

		dadosAnotacao = new JLayeredPane();
		dadosAnotacao.setBackground(Color.WHITE);
		tabGeral.addTab("Anotação", null, dadosAnotacao, null);
		
		dadosCondicao = new JLayeredPane();
		dadosCondicao.setBackground(Color.WHITE);
		tabGeral.addTab("Condição", null, dadosCondicao, null);
		dadosCondicao.setLayout(null);
		
		dadosEquipamentoCli = new JLayeredPane();
		tabGeral.addTab("Equipamentos Cliente", null, dadosEquipamentoCli, null);
		
		dadosIntegridade = new JLayeredPane();
		tabGeral.addTab("Integridade", null, dadosIntegridade, null);
		
		dadosSintomas = new JLayeredPane();
		tabGeral.addTab("Sintomas", null, dadosSintomas, null);
		
		dadosCliente();
		dadosAnotacao();
		
		

		

		painelEquipamentos = new JPanel();
		painelEquipamentos.setBackground(Color.WHITE);
		painelEquipamentos.setBounds(0, 0, 604, 314);
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

		textoEquipamento = new JTextArea();
		textoEquipamento.setRows(10);
		textoEquipamento.setBorder(new LineBorder(Color.BLACK));
		textoEquipamento.setBounds(163, 96, 431, 180);
		painelEquipamentos.add(textoEquipamento);

		LInfoEquip = new JLabel("Informações sobre aparelhos que o paciente utiliza");
		LInfoEquip.setFont(new Font("Arial", Font.BOLD, 13));
		LInfoEquip.setBounds(163, 69, 357, 14);
		painelEquipamentos.add(LInfoEquip);

		
		
		
		
		

		painelIntegridade = new JPanel();
		painelIntegridade.setBackground(Color.WHITE);
		painelIntegridade.setBounds(0, 0, 604, 314);
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

		checkDispneia = new JCheckBox("Dispnéia");
		checkDispneia.setBackground(Color.WHITE);
		checkDispneia.setBounds(10, 65, 97, 23);
		painelIntegridade.add(checkDispneia);

		checkEdema = new JCheckBox("Edema");
		checkEdema.setBackground(Color.WHITE);
		checkEdema.setBounds(10, 98, 97, 23);
		painelIntegridade.add(checkEdema);

		checkDescamacao = new JCheckBox("Descamação");
		checkDescamacao.setBackground(Color.WHITE);
		checkDescamacao.setBounds(10, 132, 109, 23);
		painelIntegridade.add(checkDescamacao);

		checkHematoma = new JCheckBox("Hematoma");
		checkHematoma.setBackground(Color.WHITE);
		checkHematoma.setBounds(10, 168, 97, 23);
		painelIntegridade.add(checkHematoma);

		checkCicatriz = new JCheckBox("Cicatriz");
		checkCicatriz.setBackground(Color.WHITE);
		checkCicatriz.setBounds(10, 203, 97, 23);
		painelIntegridade.add(checkCicatriz);

		checkOutroInt = new JCheckBox("Outros");
		checkOutroInt.setBackground(Color.WHITE);
		checkOutroInt.setBounds(10, 239, 97, 23);
		painelIntegridade.add(checkOutroInt);

		THemorragia = new JTextField();
		THemorragia.setBorder(new LineBorder(Color.BLACK));
		THemorragia.setBounds(125, 33, 454, 20);
		painelIntegridade.add(THemorragia);
		THemorragia.setColumns(10);

		TDispneia = new JTextField();
		TDispneia.setColumns(10);
		TDispneia.setBorder(new LineBorder(Color.BLACK));
		TDispneia.setBounds(125, 66, 454, 20);
		painelIntegridade.add(TDispneia);

		TEdema = new JTextField();
		TEdema.setColumns(10);
		TEdema.setBorder(new LineBorder(Color.BLACK));
		TEdema.setBounds(125, 99, 454, 20);
		painelIntegridade.add(TEdema);

		TDEscamacao = new JTextField();
		TDEscamacao.setColumns(10);
		TDEscamacao.setBorder(new LineBorder(Color.BLACK));
		TDEscamacao.setBounds(125, 133, 454, 20);
		painelIntegridade.add(TDEscamacao);

		THematoma = new JTextField();
		THematoma.setColumns(10);
		THematoma.setBorder(new LineBorder(Color.BLACK));
		THematoma.setBounds(125, 169, 454, 20);
		painelIntegridade.add(THematoma);

		TCicatriz = new JTextField();
		TCicatriz.setColumns(10);
		TCicatriz.setBorder(new LineBorder(Color.BLACK));
		TCicatriz.setBounds(125, 204, 454, 20);
		painelIntegridade.add(TCicatriz);

		TOutrosInt = new JTextField();
		TOutrosInt.setColumns(10);
		TOutrosInt.setBorder(new LineBorder(Color.BLACK));
		TOutrosInt.setBounds(125, 240, 454, 20);
		painelIntegridade.add(TOutrosInt);

		
		
		
		
		
		

		painelSintomas = new JPanel();
		painelSintomas.setBackground(Color.WHITE);
		painelSintomas.setBounds(0, 0, 604, 314);
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

		textoSintomas = new JTextArea();
		textoSintomas.setRows(6);
		textoSintomas.setBorder(new LineBorder(Color.BLACK));
		textoSintomas.setBounds(163, 54, 431, 110);
		painelSintomas.add(textoSintomas);

		LTipoSintomas = new JLabel("Tipo, localização, intensidade e outras característica");
		LTipoSintomas.setFont(new Font("Arial", Font.PLAIN, 13));
		LTipoSintomas.setBounds(163, 36, 364, 14);
		painelSintomas.add(LTipoSintomas);

		separator_2 = new JSeparator();
		separator_2.setBounds(10, 185, 584, 2);
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

		LPulso = new JCheckBox("Pulso");
		LPulso.setBackground(Color.WHITE);
		LPulso.setBounds(10, 270, 97, 23);
		painelSintomas.add(LPulso);

		textoMembros = new JTextArea();
		textoMembros.setRows(4);
		textoMembros.setBorder(new LineBorder(Color.BLACK));
		textoMembros.setBounds(163, 233, 431, 70);
		painelSintomas.add(textoMembros);

		painelCondicao = new JPanel();
		painelCondicao.setBackground(Color.WHITE);
		painelCondicao.setBounds(0, 0, 604, 314);
		dadosCondicao.add(painelCondicao);
		painelCondicao.setLayout(null);

		LDeambulacao = new JLabel("Deâmbulação");
		LDeambulacao.setFont(new Font("Arial", Font.PLAIN, 14));
		LDeambulacao.setBounds(10, 11, 127, 14);
		painelCondicao.add(LDeambulacao);

		radioDeambulante = new JRadioButton("Deâmbulante?");
		radioDeambulante.setBackground(Color.WHITE);
		radioDeambulante.setFont(new Font("Arial", Font.PLAIN, 13));
		radioDeambulante.setBounds(10, 32, 109, 23);
		radioDeambulante.setActionCommand("Deâmbulante");
		painelCondicao.add(radioDeambulante);
		
		radioUtilizaCadeira = new JRadioButton("Utiliza cadeira de rodas?");
		radioUtilizaCadeira.setBackground(Color.WHITE);
		radioUtilizaCadeira.setFont(new Font("Arial", Font.PLAIN, 13));
		radioUtilizaCadeira.setBounds(136, 32, 197, 23);
		radioDeambulante.setActionCommand("Utiliza cadeira de rodas?");
		painelCondicao.add(radioUtilizaCadeira);

		LObservacaoCond = new JLabel("Observação");
		LObservacaoCond.setFont(new Font("Arial", Font.PLAIN, 13));
		LObservacaoCond.setBounds(10, 70, 84, 14);
		painelCondicao.add(LObservacaoCond);
		
		grupoBotao3.add(radioDeambulante);
		grupoBotao3.add(radioUtilizaCadeira);

		separator = new JSeparator();
		separator.setBounds(10, 107, 584, 2);
		painelCondicao.add(separator);
		
		LRepouso = new JLabel("Repouso no Leito");
		LRepouso.setFont(new Font("Arial", Font.PLAIN, 14));
		LRepouso.setBounds(10, 120, 127, 14);
		painelCondicao.add(LRepouso);

		radioRelativo = new JRadioButton("Relativo");
		radioRelativo.setBackground(Color.WHITE);
		radioRelativo.setFont(new Font("Arial", Font.PLAIN, 13));
		radioRelativo.setBounds(10, 144, 109, 23);
		radioRelativo.setActionCommand("Relativo");
		painelCondicao.add(radioRelativo);

		radioAbsoluto = new JRadioButton("Absoluto");
		radioAbsoluto.setBackground(Color.WHITE);
		radioAbsoluto.setFont(new Font("Arial", Font.PLAIN, 13));
		radioAbsoluto.setBounds(136, 144, 109, 23);
		radioRelativo.setActionCommand("Absoluto");
		painelCondicao.add(radioAbsoluto);
		
		grupoBotao4.add(radioRelativo);
		grupoBotao4.add(radioAbsoluto);

		separator_1 = new JSeparator();
		separator_1.setBounds(10, 185, 584, 2);
		painelCondicao.add(separator_1);
		
		LSonoCond = new JLabel("Sono e Repouso");
		LSonoCond.setFont(new Font("Arial", Font.PLAIN, 14));
		LSonoCond.setBounds(10, 198, 127, 14);
		painelCondicao.add(LSonoCond);
		
		LObservacaoSono = new JLabel("Observação");
		LObservacaoSono.setFont(new Font("Arial", Font.PLAIN, 13));
		LObservacaoSono.setBounds(10, 226, 84, 14);
		painelCondicao.add(LObservacaoSono);

		textoAreaDeam = new JTextArea();
		textoAreaDeam.setRows(2);
		textoAreaDeam.setBorder(new LineBorder(Color.BLACK));
		textoAreaDeam.setBounds(132, 65, 433, 38);
		painelCondicao.add(textoAreaDeam);
		
		textoAreaSono = new JTextArea();
		textoAreaSono.setRows(4);
		textoAreaSono.setBorder(new LineBorder(Color.BLACK));
		textoAreaSono.setBounds(132, 221, 433, 82);
		painelCondicao.add(textoAreaSono);
		
		
	

		

		painelAnotacao = new JPanel();
		painelAnotacao.setBackground(Color.WHITE);
		painelAnotacao.setBounds(0, 0, 604, 314);
		dadosAnotacao.add(painelAnotacao);
		painelAnotacao.setLayout(null);

		JSeparator separa1 = new JSeparator();
		separa1.setBounds(39, 79, 526, 2);
		painelAnotacao.add(separa1);

		JSeparator separa2 = new JSeparator();
		separa2.setBounds(39, 153, 526, 2);
		painelAnotacao.add(separa2);

		textoAreaAnotacao = new JTextArea();
		textoAreaAnotacao.setBackground(Color.WHITE);
		textoAreaAnotacao.setRows(7);
		textoAreaAnotacao.setBorder(new LineBorder(Color.BLACK));
		textoAreaAnotacao.setBounds(10, 193, 431, 110);
		painelAnotacao.add(textoAreaAnotacao);
	}
	
	private void dadosCliente(){
		LPaciente = new JLabel("Paciente");
		LPaciente.setBounds(10, 55, 55, 14);
		dadosCliente.add(LPaciente);

		LPesquisar = new JLabel("Pesquisar");
		LPesquisar.setIcon(new ImageIcon(ProntuarioForm.class.getResource("/imagens/icons8-pesquisar-15.png")));
		LPesquisar.setBounds(460, 55, 101, 14);
		dadosCliente.add(LPesquisar);

		TPaciente = new JTextField();
		TPaciente.setBorder(new LineBorder(Color.BLACK));
		TPaciente.setBounds(62, 52, 376, 20);
		TPaciente.setEditable(false);
		dadosCliente.add(TPaciente);
		TPaciente.setColumns(10);

		LCodigo = new JLabel("Código");
		LCodigo.setBounds(10, 21, 46, 14);
		dadosCliente.add(LCodigo);

		TCodigo = new JTextField();
		TCodigo.setBorder(new LineBorder(Color.BLACK));
		TCodigo.setBounds(60, 18, 128, 20);
		TCodigo.setEditable(false);
		dadosCliente.add(TCodigo);
		TCodigo.setColumns(10);

		LRg = new JLabel("RG");
		LRg.setBounds(10, 87, 46, 14);
		dadosCliente.add(LRg);

		TRg = new JTextField();
		TRg.setBorder(new LineBorder(Color.BLACK));
		TRg.setBounds(60, 84, 128, 20);
		TRg.setEditable(false);
		dadosCliente.add(TRg);
		TRg.setColumns(10);

		LCpf = new JLabel("CPF");
		LCpf.setBounds(227, 87, 46, 14);
		dadosCliente.add(LCpf);

		TCpf = new JTextField();
		TCpf.setBorder(new LineBorder(Color.BLACK));
		TCpf.setBounds(283, 84, 155, 20);
		TCpf.setEditable(false);
		dadosCliente.add(TCpf);
		TCpf.setColumns(10);

		LDataNasc = new JLabel("Data Nasc.");
		LDataNasc.setBounds(10, 126, 67, 14);
		dadosCliente.add(LDataNasc);

		TDataNasc = new JTextField();
		TDataNasc.setBorder(new LineBorder(Color.BLACK));
		TDataNasc.setBounds(87, 123, 101, 20);
		TDataNasc.setEditable(false);
		dadosCliente.add(TDataNasc);
		TDataNasc.setColumns(10);

		LDataCad = new JLabel("Data Cadastro ");
		LDataCad.setBounds(238, 21, 89, 14);
		dadosCliente.add(LDataCad);

		TDataCad = new JTextField();
		TDataCad.setBorder(new LineBorder(Color.BLACK));
		TDataCad.setColumns(10);
		TDataCad.setEditable(false);
		TDataCad.setBounds(337, 18, 101, 20);
		dadosCliente.add(TDataCad);

		painelDadosCliente = new JPanel();
		painelDadosCliente.setBackground(Color.WHITE);
		painelDadosCliente.setBounds(0, 0, 604, 314);
		dadosCliente.add(painelDadosCliente);
	}
	
	
	private void dadosAnotacao(){
		LNivelConsc = new JLabel("Nível de Consciência");
		LNivelConsc.setFont(new Font("Arial", Font.PLAIN, 14));
		LNivelConsc.setBounds(21, 18, 160, 14);
		dadosAnotacao.add(LNivelConsc);
		
		radioAlerta = new JRadioButton("Alerta");
		radioAlerta.setFont(new Font("Arial", Font.PLAIN, 13));
		radioAlerta.setBackground(Color.WHITE);
		radioAlerta.setBounds(17, 39, 70, 23);
		radioAlerta.setActionCommand("Alerta");
		dadosAnotacao.add(radioAlerta);

		radioLetargico = new JRadioButton("Letárgico");
		radioLetargico.setFont(new Font("Arial", Font.PLAIN, 13));
		radioLetargico.setBackground(Color.WHITE);
		radioLetargico.setBounds(100, 39, 81, 23);
		radioAlerta.setActionCommand("Letárgico");
		dadosAnotacao.add(radioLetargico);

		radioObnubilado = new JRadioButton("Obnubilado");
		radioObnubilado.setFont(new Font("Arial", Font.PLAIN, 13));
		radioObnubilado.setBackground(Color.WHITE);
		radioObnubilado.setBounds(183, 39, 98, 23);
		radioAlerta.setActionCommand("Obnubilado");
		dadosAnotacao.add(radioObnubilado);

		radioTorporoso = new JRadioButton("Torporoso");
		radioTorporoso.setFont(new Font("Arial", Font.PLAIN, 13));
		radioTorporoso.setBackground(Color.WHITE);
		radioTorporoso.setBounds(283, 39, 85, 23);
		radioAlerta.setActionCommand("Torporoso");
		dadosAnotacao.add(radioTorporoso);

		radioComatoso = new JRadioButton("Comatoso");
		radioComatoso.setFont(new Font("Arial", Font.PLAIN, 13));
		radioComatoso.setBackground(Color.WHITE);
		radioComatoso.setBounds(370, 39, 109, 23);
		radioAlerta.setActionCommand("Comatoso");
		dadosAnotacao.add(radioComatoso);

		grupoBotao1.add(radioAlerta);
		grupoBotao1.add(radioLetargico);
		grupoBotao1.add(radioObnubilado);
		grupoBotao1.add(radioTorporoso);
		grupoBotao1.add(radioComatoso);
		
		
		
		
		LEstadoMental = new JLabel("Estado Mental");
		LEstadoMental.setFont(new Font("Arial", Font.PLAIN, 14));
		LEstadoMental.setBounds(17, 94, 109, 14);
		dadosAnotacao.add(LEstadoMental);

		radioCalmo = new JRadioButton("Calmo");
		radioCalmo.setFont(new Font("Arial", Font.PLAIN, 13));
		radioCalmo.setBackground(Color.WHITE);
		radioCalmo.setBounds(17, 115, 70, 23);
		radioCalmo.setActionCommand("Calmo");
		dadosAnotacao.add(radioCalmo);

		radioApatico = new JRadioButton("Apático");
		radioApatico.setFont(new Font("Arial", Font.PLAIN, 13));
		radioApatico.setBackground(Color.WHITE);
		radioApatico.setBounds(100, 115, 81, 23);
		radioCalmo.setActionCommand("Apático");
		dadosAnotacao.add(radioApatico);

		radioAlegre = new JRadioButton("Alegre");
		radioAlegre.setFont(new Font("Arial", Font.PLAIN, 13));
		radioAlegre.setBackground(Color.WHITE);
		radioAlegre.setBounds(183, 115, 98, 23);
		radioCalmo.setActionCommand("Alegre");
		dadosAnotacao.add(radioAlegre);

		radioTriste = new JRadioButton("Triste");
		radioTriste.setFont(new Font("Arial", Font.PLAIN, 13));
		radioTriste.setBackground(Color.WHITE);
		radioTriste.setBounds(283, 115, 85, 23);
		radioCalmo.setActionCommand("Triste");
		dadosAnotacao.add(radioTriste);

		radioAgitado = new JRadioButton("Agitado");
		radioAgitado.setFont(new Font("Arial", Font.PLAIN, 13));
		radioAgitado.setBackground(Color.WHITE);
		radioAgitado.setBounds(370, 115, 109, 23);
		radioCalmo.setActionCommand("Agitado");
		dadosAnotacao.add(radioAgitado);

		LObservacaoAnot = new JLabel("Observação");
		LObservacaoAnot.setFont(new Font("Arial", Font.PLAIN, 14));
		LObservacaoAnot.setBounds(17, 168, 98, 14);
		radioCalmo.setActionCommand("Observação");
		dadosAnotacao.add(LObservacaoAnot);

		grupoBotao2.add(radioCalmo);
		grupoBotao2.add(radioApatico);
		grupoBotao2.add(radioAlegre);
		grupoBotao2.add(radioTriste);
		grupoBotao2.add(radioAgitado);

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

	public JLabel getLPesquisar() {
		return LPesquisar;
	}

	public void setLPesquisar(JLabel lPesquisar) {
		LPesquisar = lPesquisar;
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

	public JCheckBox getLPulso() {
		return LPulso;
	}

	public void setLPulso(JCheckBox lPulso) {
		LPulso = lPulso;
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
	
	

}
