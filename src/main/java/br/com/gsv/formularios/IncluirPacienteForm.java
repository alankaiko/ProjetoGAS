package br.com.gsv.formularios;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.util.Vector;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import br.com.gsv.listeners.IncluirPacienteListener;
import br.com.gsv.util.ConverteDadosUtil;
import br.com.gsv.util.ListasUtil;
import br.com.gsv.util.SomenteNumerosUtil;

public class IncluirPacienteForm extends JDialog {
	private IncluirPacienteListener listener;
	private JPanel panel = new JPanel();
	private Container tela = getContentPane();
	private JLabel LId, LNome, LDocumento, LRg, LDataNasc, LDataCad,LObservacao, LConvenio;
	private JLabel LIndentif, LEndereco, LLogradouro, LComplemento,LAdicionaConvenio;
	private JLabel LNumero, LBairro, LCidade, LCep, LContato, LEmail, LCelular,LTelefone, LEstado;
	private JTextField TId, TNome, TRg, TObservacao, TLogradouro, TComplemento,TNumero;
	private JTextField TBairro, TCidade, TEmail, TTelefone, TCelular;
	private JFormattedTextField JCpf, JDataNasc, JDataCadastro, JCep;
	private JButton BTGravar, BTCancelar;
	private JComboBox ComboEstado, ComboConvenio;
	private SomenteNumerosUtil soNumeros;
	
	
	public IncluirPacienteForm() {
		setTitle("Inserir Dados de Paciente");
		setModal(true);
		setResizable(false);
		setBounds(100, 100, 650, 460);
		
		tela.setLayout(null);		
		tela.add(panel, BorderLayout.CENTER);
		
		panel.setLayout(null);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		OrganizaDados();
		InicializaCompomentes();
		listener = new IncluirPacienteListener(this);
	}
	
	
	public void OrganizaDados(){
		LIndentif = new JLabel();
		LIndentif.setText("DADOS PESSOAIS");
		LIndentif.setBounds(15,10,300,20);
		LIndentif.setFont(new Font("Calibri", Font.BOLD, 13));
		LIndentif.setForeground(Color.black);
		
		
			LId = new JLabel();
			LId.setText("Código:");
			LId.setBounds(65,30,50,20);
			LId.setFont(new Font("Arial",Font.BOLD,11));
				TId = new JTextField();
				TId.setBounds(111,31,84,20);
				TId.setBackground(new Color(255,255,204));
				TId.setFont(new Font("Arial",Font.BOLD,10));
				TId.setForeground(Color.black);
				TId.setEditable(false);
					
			LDocumento = new JLabel();	 
			LDocumento.setText("*CPF:");
			LDocumento.setBounds(75,60,35,20);
			LDocumento.setFont(new Font("Arial" , Font.BOLD,11));
				JCpf= new JFormattedTextField(ConverteDadosUtil.FormataCPF());
				JCpf.setBounds(111,62,173,19);
			

			LDataNasc = new JLabel();
			LDataNasc.setText("Data Nasc.:");
			LDataNasc.setBounds(50,121,60,20);
			LDataNasc.setFont(new Font("Arial" , Font.BOLD,11));	
				JDataNasc= new JFormattedTextField(ConverteDadosUtil.FormataData());
				JDataNasc.setBounds(111,121,120,19);
					
			LRg = new JLabel();								
			LRg.setText("*RG:");
			LRg.setBounds(456,60,29,20);
			LRg.setFont(new Font("Arial" , Font.BOLD,11));
				TRg = new JTextField();
				TRg.setBounds(489,61,120,19);
				TRg.setFont(new Font("Arial",Font.BOLD,10));
				TRg.addKeyListener(soNumeros);
				
			LNome = new JLabel();
			LNome.setText("*Nome:");
			LNome.setBounds(65,90,50,20);
			LNome.setFont(new Font("Arial" , Font.BOLD,11));
				TNome = new JTextField();
				TNome.setBounds(111,91,500,19);
				TNome.setFont(new Font("Arial",Font.BOLD,10));
				
			LDataCad = new JLabel();
			LDataCad.setText("Data Cadastro:");
			LDataCad.setBounds(439,30,84,20);
			LDataCad.setFont(new Font("Arial" , Font.BOLD,11));
				JDataCadastro= new JFormattedTextField(ConverteDadosUtil.FormataData());
				JDataCadastro.setEditable(false);
				JDataCadastro.setText(ConverteDadosUtil.RetornaDataAtual());
				JDataCadastro.setBounds(525,30,84,19);
			
			LConvenio = new JLabel();
			LConvenio.setText("Convênio / Plano");
			LConvenio.setBounds(290, 124, 220, 14);
				ComboConvenio = new JComboBox();
				ComboConvenio.setBounds(409, 121, 133, 20);
				
		LAdicionaConvenio = new JLabel();
		LAdicionaConvenio.setText("Adicionar?");
		LAdicionaConvenio.setForeground(Color.BLUE);
		LAdicionaConvenio.setFont(new Font("Palatino Linotype", Font.PLAIN, 10));
		LAdicionaConvenio.setBounds(552, 130, 123, 14);

			LObservacao = new JLabel();
			LObservacao.setText("Observação:");
			LObservacao.setBounds(31,361,72,20);
			LObservacao.setFont(new Font("Arial" , Font.BOLD,11));;
				TObservacao = new JTextField();
				TObservacao.setBounds(111,362,506,19);
				TObservacao.setFont(new Font("Arial",Font.BOLD,10));
				
		LEndereco = new JLabel();
		LEndereco.setText("ENDEREÇO");
		LEndereco.setFont(new Font("Calibri", Font.BOLD, 13));
		LEndereco.setBounds(10, 142, 64, 14);
	
			
			LLogradouro = new JLabel();
			LLogradouro.setText("Logradouro: ");
			LLogradouro.setFont(new Font("Arial", Font.BOLD, 11));
			LLogradouro.setBounds(31, 167, 84, 14);
				TLogradouro = new JTextField();
				TLogradouro.setBounds(111, 164, 506, 20);
				TLogradouro.setColumns(10);
				
			LComplemento = new JLabel();
			LComplemento.setText("Complemento: ");
			LComplemento.setFont(new Font("Arial", Font.BOLD, 11));
			LComplemento.setBounds(15, 195, 100, 14);
				TComplemento = new JTextField();
				TComplemento.setColumns(10);
				TComplemento.setBounds(111, 192, 506, 20);
					
			LNumero = new JLabel();
			LNumero.setText("Numero:");
			LNumero.setFont(new Font("Arial", Font.BOLD, 11));
			LNumero.setBounds(57, 228, 58, 14);
				TNumero = new JTextField();
				TNumero.setBounds(111, 225, 106, 20);
				TNumero.setColumns(10);
				TNumero.addKeyListener(soNumeros);
				
			LBairro = new JLabel();
			LBairro.setText("Bairro: ");
			LBairro.setFont(new Font("Arial", Font.BOLD, 11));
			LBairro.setBounds(363, 228, 46, 14);
				TBairro = new JTextField();
				TBairro.setBounds(419, 225, 192, 20);
				TBairro.setColumns(10);
				
			LCidade = new JLabel();
			LCidade.setText("Cidade: ");
			LCidade.setFont(new Font("Arial", Font.BOLD, 11));
			LCidade.setBounds(65, 253, 46, 14);
				TCidade = new JTextField();
				TCidade.setBounds(111, 250, 208, 20);
				TCidade.setColumns(10);
		
			LEstado = new JLabel();	
			LEstado.setText("UF: ");
			LEstado.setBounds(429, 253, 46, 14);
				ComboEstado = new JComboBox();
				ComboEstado.setModel(new DefaultComboBoxModel(new Vector(ListasUtil.Estados())));
				ComboEstado.setBounds(456, 250, 86, 20);
				
				
			
			LCep = new JLabel();
			LCep.setText("CEP:");
			LCep.setFont(new Font("Arial", Font.BOLD, 11));
			LCep.setBounds(75, 284, 35, 14);
				JCep = new JFormattedTextField(ConverteDadosUtil.FormataCep());
				JCep.setBounds(111, 281, 86, 20);
				
				
	
		LContato = new JLabel();
		LContato.setText("CONTATO");
		LContato.setFont(new Font("Calibri", Font.BOLD, 13));
		LContato.setBounds(15, 308, 72, 14);
		
			LEmail = new JLabel();
			LEmail.setText("Email:");
			LEmail.setFont(new Font("Arial", Font.BOLD, 11));
			LEmail.setBounds(50, 325, 46, 14);
				TEmail = new JTextField();
				TEmail.setBounds(109, 322, 263, 20);
				TEmail.setColumns(10);
			
			LCelular = new JLabel();
			LCelular.setText("Celular:");
			LCelular.setFont(new Font("Arial", Font.BOLD, 11));
			LCelular.setBounds(404, 284, 46, 14);
				TCelular = new JTextField();
				TCelular.setBounds(456, 284, 155, 20);
				TCelular.setColumns(10);
				TCelular.addKeyListener(soNumeros);
			
				
			LTelefone = new JLabel();
			LTelefone.setText("Telefone:");
			LTelefone.setFont(new Font("Arial", Font.BOLD, 11));
			LTelefone.setBounds(394, 325, 72, 14);
				TTelefone = new JTextField();
				TTelefone.setBounds(456, 322, 155, 20);
				TTelefone.setColumns(10);	
				TTelefone.addKeyListener(soNumeros);
					
		BTGravar = new JButton();
		BTGravar.setText("Gravar");
		BTGravar.setFont(new Font("Calibri", Font.PLAIN, 12));
		BTGravar.setBounds(419, 398, 89, 23);
		
		BTCancelar = new JButton();
		BTCancelar.setText("Cancelar");
		BTCancelar.setFont(new Font("Calibri", Font.PLAIN, 12));
		BTCancelar.setBounds(524, 398, 89, 23);
		
	}

	

	public void InicializaCompomentes() {
		tela.add(this.TId);
		tela.add(this.TNome);
		tela.add(this.TRg);
		tela.add(this.TObservacao);
		tela.add(this.LId);
		tela.add(this.LNome);
		tela.add(this.LDocumento);
		tela.add(this.LRg);
		tela.add(this.LDataNasc);
		tela.add(this.LDataCad);
		tela.add(this.LObservacao);
		tela.add(this.LIndentif);
		tela.add(this.JDataCadastro);
		tela.add(this.JCpf);
		tela.add(this.JCep);
		tela.add(this.JDataNasc);
		tela.add(this.LEndereco);
		tela.add(this.LLogradouro);
		tela.add(this.TLogradouro);
		tela.add(this.LComplemento);
		tela.add(this.TComplemento);
		tela.add(this.LNumero);
		tela.add(this.LBairro);
		tela.add(this.LCidade);
		tela.add(this.LCep);
		tela.add(this.TNumero);
		tela.add(this.TBairro);
		tela.add(this.TCidade);
		tela.add(this.LContato);
		tela.add(this.LEmail);
		tela.add(this.LCelular);
		tela.add(this.LTelefone);
		tela.add(this.TEmail);
		tela.add(this.TTelefone);
		tela.add(this.LAdicionaConvenio);
		tela.add(this.TCelular);
		tela.add(this.BTGravar);
		tela.add(this.BTCancelar);
		tela.add(this.ComboEstado);
		tela.add(this.ComboConvenio);
		tela.add(this.LConvenio);
		tela.add(this.LEstado);
	}

	public IncluirPacienteListener getListener() {
		return listener;
	}

	public void setListener(IncluirPacienteListener listener) {
		this.listener = listener;
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

	public JLabel getLDocumento() {
		return LDocumento;
	}

	public void setLDocumento(JLabel lDocumento) {
		LDocumento = lDocumento;
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

	public JLabel getLConvenio() {
		return LConvenio;
	}

	public void setLConvenio(JLabel lConvenio) {
		LConvenio = lConvenio;
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

	public JLabel getLAdicionaConvenio() {
		return LAdicionaConvenio;
	}

	public void setLAdicionaConvenio(JLabel lAdicionaConvenio) {
		LAdicionaConvenio = lAdicionaConvenio;
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

	public JTextField getTId() {
		return TId;
	}

	public void setTId(JTextField tId) {
		TId = tId;
	}

	public JTextField getTNome() {
		return TNome;
	}

	public void setTNome(JTextField tNome) {
		TNome = tNome;
	}

	public JTextField getTRg() {
		return TRg;
	}

	public void setTRg(JTextField tRg) {
		TRg = tRg;
	}

	public JTextField getTObservacao() {
		return TObservacao;
	}

	public void setTObservacao(JTextField tObservacao) {
		TObservacao = tObservacao;
	}

	public JTextField getTLogradouro() {
		return TLogradouro;
	}

	public void setTLogradouro(JTextField tLogradouro) {
		TLogradouro = tLogradouro;
	}

	public JTextField getTComplemento() {
		return TComplemento;
	}

	public void setTComplemento(JTextField tComplemento) {
		TComplemento = tComplemento;
	}

	public JTextField getTNumero() {
		return TNumero;
	}

	public void setTNumero(JTextField tNumero) {
		TNumero = tNumero;
	}

	public JTextField getTBairro() {
		return TBairro;
	}

	public void setTBairro(JTextField tBairro) {
		TBairro = tBairro;
	}

	public JTextField getTCidade() {
		return TCidade;
	}

	public void setTCidade(JTextField tCidade) {
		TCidade = tCidade;
	}

	public JTextField getTEmail() {
		return TEmail;
	}

	public void setTEmail(JTextField tEmail) {
		TEmail = tEmail;
	}

	public JTextField getTTelefone() {
		return TTelefone;
	}

	public void setTTelefone(JTextField tTelefone) {
		TTelefone = tTelefone;
	}

	public JTextField getTCelular() {
		return TCelular;
	}

	public void setTCelular(JTextField tCelular) {
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

	public JComboBox getComboEstado() {
		return ComboEstado;
	}

	public void setComboEstado(JComboBox comboEstado) {
		ComboEstado = comboEstado;
	}

	public JComboBox getComboConvenio() {
		return ComboConvenio;
	}

	public void setComboConvenio(JComboBox comboConvenio) {
		ComboConvenio = comboConvenio;
	}


}
