package br.com.gsv.funcionario.grafico;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.util.Vector;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import br.com.gsv.funcionario.formularios.IncluirFuncionariosForm;
import br.com.projeto.gsv.util.ListasUtil;
import br.com.projeto.gsv.util.SomenteNumerosUtil;

public class IncluirFuncionarioClassic {
	private IncluirFuncionariosForm formulario;
	private SomenteNumerosUtil soNumeros;
	
	public IncluirFuncionarioClassic(IncluirFuncionariosForm formulario) {
		this.formulario = formulario;
		soNumeros = new SomenteNumerosUtil();	
		
		CriarTelaGeral();
		DadosFuncionario();
	}
	
	
	
	//cria e tela geral onde todos os componentes serao inseridos, é a tela geral do sistema
	private void CriarTelaGeral(){		
		this.formulario.setTitle("Inserir Dados de Funcionário");
		this.formulario.setModal(true);
		this.formulario.setResizable(false);
		this.formulario.setBounds(100, 100, 649, 465);
		
		this.formulario.getTela().setLayout(null);		
		this.formulario.getTela().add(this.formulario.getPanel(), BorderLayout.CENTER);
		
		this.formulario.getPanel().setLayout(null);
		this.formulario.getPanel().setBorder(new EmptyBorder(5, 5, 5, 5));
		
	}
		
		
	
	//cria os componentes jbutton jlabel jtexfield etc etc etc e organiza dentro do layout geral
	private void DadosFuncionario(){
		this.formulario.getLIndentif().setText("DADOS PESSOAIS");
		this.formulario.getLIndentif().setBounds(15,10,300,20);
		this.formulario.getLIndentif().setFont(new Font("Calibri", Font.BOLD, 13));
		this.formulario.getLIndentif().setForeground(Color.black);
		
									
					
			this.formulario.getLId().setText("Código:");
			this.formulario.getLId().setBounds(15,41,50,20);
			this.formulario.getLId().setFont(new Font("Arial",Font.BOLD,11));
				this.formulario.getTId().setBounds(61,42,50,20);
				this.formulario.getTId().setBackground(new Color(255,255,204));
				this.formulario.getTId().setFont(new Font("Arial",Font.BOLD,10));
				this.formulario.getTId().setForeground(Color.black);
				this.formulario.getTId().setEditable(false);
				
			this.formulario.getComboCoren().setBounds(370, 42, 74, 20);
			this.formulario.getComboCoren().setModel(new DefaultComboBoxModel(new Vector(ListasUtil.Coren())));
			
			this.formulario.getTCoren().setBounds(448, 42, 120, 22);
			this.formulario.getTCoren().setColumns(10);
			
			this.formulario.getComboCorenEst().setBounds(571, 42, 46, 20);
			this.formulario.getComboCorenEst().setModel(new DefaultComboBoxModel(new Vector(ListasUtil.EstadosAbrev())));		
						 
			this.formulario.getLCpf().setText("*CPF:");
			this.formulario.getLCpf().setBounds(15, 73, 50, 20);	
			this.formulario.getLCpf().setFont(new Font("Arial" , Font.BOLD,11));;
				this.formulario.getJCpf().setBounds(61,73,140,19);		
				
								
			this.formulario.getLRg().setText("*RG:");
			this.formulario.getLRg().setBounds(419,73,29,20);
			this.formulario.getLRg().setFont(new Font("Arial" , Font.BOLD,11));;
				this.formulario.getTRg().setBounds(448,74,169,19);
				this.formulario.getTRg().setFont(new Font("Arial",Font.BOLD,10));
				this.formulario.getTRg().addKeyListener(soNumeros);
	
					
			this.formulario.getLNome().setText("*Nome:");
			this.formulario.getLNome().setBounds(15,104,602,20);
			this.formulario.getLNome().setFont(new Font("Arial" , Font.BOLD,11));;
				this.formulario.getTNome().setBounds(61,105,556,19);
				this.formulario.getTNome().setFont(new Font("Arial",Font.BOLD,10));		
				
				
		this.formulario.getLEndereco().setText("ENDEREÇO");
		this.formulario.getLEndereco().setFont(new Font("Calibri", Font.BOLD, 13));
		this.formulario.getLEndereco().setBounds(15, 135, 64, 14);
		
				
			this.formulario.getLLogradouro().setText("Logradouro: ");
			this.formulario.getLLogradouro().setFont(new Font("Arial", Font.BOLD, 11));
			this.formulario.getLLogradouro().setBounds(15, 160, 84, 14);
				this.formulario.getTLogradouro().setBounds(111, 157, 506, 20);
				this.formulario.getTLogradouro().setColumns(10);
					
			this.formulario.getLComplemento().setText("Complemento: ");
			this.formulario.getLComplemento().setFont(new Font("Arial", Font.BOLD, 11));
			this.formulario.getLComplemento().setBounds(15, 191, 100, 14);
				this.formulario.getTComplemento().setColumns(10);
				this.formulario.getTComplemento().setBounds(111, 188, 506, 20);
					
			this.formulario.getLNumero().setText("Numero:");
			this.formulario.getLNumero().setFont(new Font("Arial", Font.BOLD, 11));
			this.formulario.getLNumero().setBounds(15, 222, 58, 14);
				this.formulario.getTNumero().setBounds(111, 219, 106, 20);
				this.formulario.getTNumero().setColumns(10);
				this.formulario.getTNumero().addKeyListener(soNumeros);
					
			this.formulario.getLBairro().setText("Bairro: ");
			this.formulario.getLBairro().setFont(new Font("Arial", Font.BOLD, 11));
			this.formulario.getLBairro().setBounds(363, 219, 46, 14);
				this.formulario.getTBairro().setBounds(419, 216, 198, 20);
				this.formulario.getTBairro().setColumns(10);
						
			this.formulario.getLCidade().setText("Cidade: ");
			this.formulario.getLCidade().setFont(new Font("Arial", Font.BOLD, 11));
			this.formulario.getLCidade().setBounds(15, 247, 46, 14);
				this.formulario.getTCidade().setBounds(111, 244, 208, 20);
				this.formulario.getTCidade().setColumns(10);
		
			this.formulario.getLEstado().setText("UF: ");
			this.formulario.getLEstado().setBounds(419, 250, 46, 14);
				this.formulario.getComboEstado().setBounds(475, 247, 142, 20);
				this.formulario.getComboEstado().setModel(new DefaultComboBoxModel(new Vector(ListasUtil.Estados())));
				
						
			this.formulario.getLCep().setText("CEP:");
			this.formulario.getLCep().setFont(new Font("Arial", Font.BOLD, 11));
			this.formulario.getLCep().setBounds(15, 278, 35, 14);
				this.formulario.getJCep().setBounds(111, 275, 86, 20);
					
				
		this.formulario.getLContato().setText("CONTATO");
		this.formulario.getLContato().setFont(new Font("Calibri", Font.BOLD, 13));
		this.formulario.getLContato().setBounds(15, 317, 72, 14);
		
			this.formulario.getLEmail().setText("Email:");
			this.formulario.getLEmail().setFont(new Font("Arial", Font.BOLD, 11));
			this.formulario.getLEmail().setBounds(50, 334, 46, 14);
				this.formulario.getTEmail().setBounds(109, 331, 252, 20);
				this.formulario.getTEmail().setColumns(10);
			
			this.formulario.getLCelular().setText("Celular:");
			this.formulario.getLCelular().setFont(new Font("Arial", Font.BOLD, 11));
			this.formulario.getLCelular().setBounds(404, 359, 46, 14);
				this.formulario.getTCelular().setBounds(456, 359, 161, 20);
				this.formulario.getTCelular().setColumns(10);
			
			this.formulario.getLTelefone().setText("Telefone:");
			this.formulario.getLTelefone().setFont(new Font("Arial", Font.BOLD, 11));
			this.formulario.getLTelefone().setBounds(394, 334, 72, 14);
				this.formulario.getTTelefone().setBounds(456, 331, 161, 20);
				this.formulario.getTTelefone().setColumns(10);	
	
		this.formulario.getBTGravar().setText("Gravar");
		this.formulario.getBTGravar().setFont(new Font("Calibri", Font.PLAIN, 12));
		this.formulario.getBTGravar().setBounds(222, 403, 89, 23);
		
		this.formulario.getBTCancelar().setText("Cancelar");
		this.formulario.getBTCancelar().setFont(new Font("Calibri", Font.PLAIN, 12));
		this.formulario.getBTCancelar().setBounds(321, 403, 89, 23);
	}
	
		
		
}
