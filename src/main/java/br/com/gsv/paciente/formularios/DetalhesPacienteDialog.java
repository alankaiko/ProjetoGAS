package br.com.gsv.paciente.formularios;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.com.gsv.paciente.listeners.DetalhesPacienteListener;
import br.com.projeto.gsv.util.ConverteDadosUtil;

public class DetalhesPacienteDialog extends JDialog {
	private DetalhesPacienteListener listener;	
	
	public DetalhesPacienteDialog() {
		CriarTelaGeral();
		Dados();
		InicializaCompomentes();
		listener = new DetalhesPacienteListener(this);
	}

	
		
	//cria e tela geral onde todos os componentes serao inseridos, é a tela geral do sistema
	private void CriarTelaGeral(){
		this.setTitle("Inserir Dados de Paciente");
		this.setModal(true);
		this.setResizable(false);
		this.setBounds(100, 100, 650, 460);
		
		this.tela.setLayout(null);		
		this.tela.add(contentPanel, BorderLayout.CENTER);
		
		contentPanel.setLayout(null);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		
	}
	
		
		
	//cria os componentes jbutton jlabel jtexfield etc etc etc e organiza dentro do layout geral
	public void Dados(){
		LIndentif = new JLabel("DADOS PESSOAIS");
		LIndentif.setBounds(15,10,300,20);
		LIndentif.setFont(new Font("Calibri", Font.BOLD, 13));
		LIndentif.setForeground(Color.black);
									
					
			LId = new JLabel ("Código:");
			LId.setBounds(65,30,50,20);
			LId.setFont(new Font("Arial",Font.BOLD,11));
				TId = new JLabel();
				TId.setBounds(111,31,84,20);
				TId.setFont(new Font("Arial",Font.BOLD,10));
				TId.setForeground(Color.black);
					
						 
				LCpf = new JLabel("CPF:");
				LCpf.setBounds(75,60,35,20);
				LCpf.setFont(new Font("Arial" , Font.BOLD,11));
				JCpf= new JFormattedTextField(ConverteDadosUtil.FormataCPF());
				TCpf = new JLabel();
				TCpf.setBounds(111,62,173,16);
				
			
						
			LDataNasc = new JLabel("Data Nasc.:");
			LDataNasc.setBounds(50,121,60,20);
			LDataNasc.setFont(new Font("Arial" , Font.BOLD,11));;
				JDataNasc= new JFormattedTextField(ConverteDadosUtil.FormataData());
				TDataNasc= new JLabel();
				TDataNasc.setBounds(111,121,120,19);
				TDataNasc.setFont(new Font("Arial",Font.BOLD,12));										
					
												
			LRg = new JLabel("RG:");
			LRg.setBounds(456,60,29,20);
			LRg.setFont(new Font("Arial" , Font.BOLD,11));;
				TRg = new JLabel();
				TRg .setBounds(489,61,120,19);
				TRg .setFont(new Font("Arial",Font.BOLD,10));
						
						
					
			LNome = new JLabel("Nome:");
			LNome.setBounds(65,90,50,20);
			LNome.setFont(new Font("Arial" , Font.BOLD,11));;
				TNome = new JLabel();
				TNome.setBounds(111,91,500,19);
				TNome.setFont(new Font("Arial",Font.BOLD,10));					
			
			LDataCad = new JLabel("Data Cadastro:");
			LDataCad.setBounds(439,30,84,20);
			LDataCad.setFont(new Font("Arial" , Font.BOLD,11));;
				JDataCadastro= new JFormattedTextField(ConverteDadosUtil.FormataData());
				TDataCadastro = new JLabel();
				TDataCadastro.setBounds(525,30,84,19);

				
			LObservacao = new JLabel("Observação:");
			LObservacao.setBounds(31,361,72,20);
			LObservacao.setFont(new Font("Arial" , Font.BOLD,11));;
				TObservacao = new JLabel();
				TObservacao.setBounds(111,362,506,19);
				TObservacao.setFont(new Font("Arial",Font.BOLD,10));
				
				
		LEndereco = new JLabel("ENDEREÇO");
		LEndereco.setFont(new Font("Calibri", Font.BOLD, 13));
		LEndereco.setBounds(10, 142, 64, 14);
		
				
			LLogradouro = new JLabel("Logradouro: ");
			LLogradouro.setFont(new Font("Arial", Font.BOLD, 11));
			LLogradouro.setBounds(31, 167, 84, 14);
				TLogradouro = new JLabel();
				TLogradouro.setBounds(111, 164, 506, 20);
				
					
			LComplemento = new JLabel("Complemento: ");
			LComplemento.setFont(new Font("Arial", Font.BOLD, 11));
			LComplemento.setBounds(15, 195, 100, 14);
				TComplemento = new JLabel();
				TComplemento.setBounds(111, 192, 506, 20);
					
			LNumero = new JLabel("Numero:");
			LNumero.setFont(new Font("Arial", Font.BOLD, 11));
			LNumero.setBounds(57, 228, 58, 14);
				TNumero = new JLabel();
				TNumero.setBounds(111, 225, 106, 20);
				
					
			LBairro = new JLabel("Bairro: ");
			LBairro.setFont(new Font("Arial", Font.BOLD, 11));
			LBairro.setBounds(363, 228, 46, 14);
				TBairro = new JLabel();
				TBairro.setBounds(419, 225, 192, 20);
				
						
			LCidade = new JLabel("Cidade: ");
			LCidade.setFont(new Font("Arial", Font.BOLD, 11));
			LCidade.setBounds(65, 253, 46, 14);
				TCidade = new JLabel();
				TCidade.setBounds(111, 250, 208, 20);
				
			LEstado = new JLabel("UF: ");
			LEstado.setBounds(429, 253, 46, 14);
				TComboEstado = new JLabel();
				TComboEstado.setBounds(456, 250, 86, 20);
				
						
			LCep = new JLabel("CEP:");
			LCep.setFont(new Font("Arial", Font.BOLD, 11));
			LCep.setBounds(75, 284, 35, 14);
				JCep = new JFormattedTextField(ConverteDadosUtil.FormataCep());
				TCep = new JLabel();
				TCep.setBounds(111, 281, 86, 20);
					
				
		LContato = new JLabel("CONTATO");
		LContato.setFont(new Font("Calibri", Font.BOLD, 13));
		LContato.setBounds(15, 308, 72, 14);
		
			LEmail = new JLabel("Email:");
			LEmail.setFont(new Font("Arial", Font.BOLD, 11));
			LEmail.setBounds(50, 325, 46, 14);
				TEmail = new JLabel();
				TEmail.setBounds(109, 322, 263, 20);
				
			
			LCelular = new JLabel("Celular:");
			LCelular.setFont(new Font("Arial", Font.BOLD, 11));
			LCelular.setBounds(404, 284, 46, 14);
				TCelular = new JLabel();
				TCelular.setBounds(456, 284, 155, 20);
				
			
			LTelefone = new JLabel("Telefone:");
			LTelefone.setFont(new Font("Arial", Font.BOLD, 11));
			LTelefone.setBounds(394, 325, 72, 14);
				TTelefone = new JLabel();
				TTelefone.setBounds(456, 322, 155, 20);
		
		cancelar = new JButton("Cancelar");
		cancelar.setFont(new Font("Calibri", Font.PLAIN, 12));
		cancelar.setBounds(522, 398, 89, 23);
	}
		
		
		//classe que adiciona os componentes criados no metodo anterior à tela geral
		public void InicializaCompomentes(){
			tela.add(this.TId);
			tela.add(this.TNome );
			tela.add(this.TRg);
			tela.add(this.TObservacao);
			tela.add(this.LId);
			tela.add(this.LNome);
			tela.add(this.LCpf);
			tela.add(this.LRg);
			tela.add(this.LDataNasc);
			tela.add(this.LDataCad);
			tela.add(this.LObservacao);
			tela.add(this.LIndentif);
			tela.add(this.TDataCadastro);		
			tela.add(this.JCpf);
			tela.add(this.TCpf);
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
			tela.add(this.TCep);
			tela.add(this.LContato);
			tela.add(this.LEmail);
			tela.add(this.LCelular);
			tela.add(this.LTelefone);
			tela.add(this.TEmail);
			tela.add(this.TTelefone);
			tela.add(this.TCelular);
			tela.add(this.cancelar);
			tela.add(this.TComboEstado);
			tela.add(this.LEstado);
			tela.add(this.TDataNasc);
			
		}

		
		private final JPanel contentPanel = new JPanel();
		private Container tela = getContentPane();
		private JLabel LId, LNome, LCpf, LRg, LDataNasc, LDataCad, LObservacao;
		private JLabel LIndentif, LEndereco, LLogradouro, LComplemento;
		private JLabel LNumero, LBairro, LCidade, LCep, LContato, LEmail, LCelular, LTelefone, LEstado;
		private JLabel TId, TNome, TCpf, TDataCadastro,TRg, TDataNasc, TObservacao, TLogradouro, TComplemento, TNumero;
		private JLabel TBairro, TCidade, TComboEstado, TCep, TEmail, TTelefone, TCelular;
		private JFormattedTextField JCpf,JDataNasc, JDataCadastro,JCep;
		private JButton cancelar;

		


		public JButton getCancelar() {
			return cancelar;
		}



		public void setCancelar(JButton cancelar) {
			this.cancelar = cancelar;
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


		public JLabel getTComboEstado() {
			return TComboEstado;
		}



		public void setTComboEstado(JLabel tComboEstado) {
			TComboEstado = tComboEstado;
		}



		public JLabel getTId() {
			return TId;
		}



		public void setTId(JLabel tId) {
			TId = tId;
		}



		public JLabel getTNome() {
			return TNome;
		}



		public void setTNome(JLabel tNome) {
			TNome = tNome;
		}



		public JLabel getTCpf() {
			return TCpf;
		}



		public void setTCpf(JLabel tCpf) {
			TCpf = tCpf;
		}



		public JLabel getTDataCadastro() {
			return TDataCadastro;
		}



		public void setTDataCadastro(JLabel tDataCadastro) {
			TDataCadastro = tDataCadastro;
		}



		public JLabel getTRg() {
			return TRg;
		}



		public void setTRg(JLabel tRg) {
			TRg = tRg;
		}



		public JLabel getTDataNasc() {
			return TDataNasc;
		}



		public void setTDataNasc(JLabel tDataNasc) {
			TDataNasc = tDataNasc;
		}



		public JLabel getTObservacao() {
			return TObservacao;
		}



		public void setTObservacao(JLabel tObservacao) {
			TObservacao = tObservacao;
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



		public JLabel getTBairro() {
			return TBairro;
		}



		public void setTBairro(JLabel tBairro) {
			TBairro = tBairro;
		}



		public JLabel getTCidade() {
			return TCidade;
		}



		public void setTCidade(JLabel tCidade) {
			TCidade = tCidade;
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



		public JLabel getTTelefone() {
			return TTelefone;
		}



		public void setTTelefone(JLabel tTelefone) {
			TTelefone = tTelefone;
		}



		public JLabel getTCelular() {
			return TCelular;
		}



		public void setTCelular(JLabel tCelular) {
			TCelular = tCelular;
		}



		public JFormattedTextField getJCep() {
			return JCep;
		}



		public void setJCep(JFormattedTextField jCep) {
			JCep = jCep;
		}



		public DetalhesPacienteListener getListener() {
			return listener;
		}



		public void setListener(DetalhesPacienteListener listener) {
			this.listener = listener;
		}

		
		
		
}
