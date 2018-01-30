package br.com.projeto.gsv.tela;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.ParseException;

import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

public class FrmIncluirClienteCPF extends JDialog {
	private final JPanel contentPanel = new JPanel();
	private Container tela = getContentPane();
	private String valor, codigo;
	private JLabel LId, LNome, LDocumento, LRg_insc, LDataNasc, LDataCad, LObservacao;
	private JLabel LIndentif, LEndereco, LLogradouro, LComplemento;
	private JLabel LNumero, LBairro, LCidade, LCep, LContato, LEmail, LCelular, LTelefone;
	private MaskFormatter  mascaraCep, mascaraFoneFixo, mascaraFoneCel, mascaraCpf,mascaraDataNasc, mascaraDataCadastro;
	private JTextField TId, TNome, TRg_insc, TObservacao, TLogradouro, TComplemento, TNumero;
	private JTextField TBairro, TCidade, TCep, TEmail, TTelefone, TCelular;
	private JComboBox  ComboSexo, ComboTipoPessoa;
	private JFormattedTextField JCpf,JDataNasc, JDataCadastro;
	
	public static void main(String[] args) {
		try {
			FrmIncluirClienteCPF dialog = new FrmIncluirClienteCPF("valor","codigo");
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	public FrmIncluirClienteCPF(String valor, String codigo) {
		this.setTitle("Inserir Dados de Cliente");
		this.setModal(true);
		this.setResizable(false);
		this.setBounds(100, 100, 650, 420);
		
		this.tela.setLayout(null);		
		this.tela.add(contentPanel, BorderLayout.CENTER);
		
		contentPanel.setLayout(null);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		this.valor = valor;
		this.codigo = codigo;
		
		DadosCPF();
		InicializaCompomentes();
	}
	
	
	
	
	
	//cria os componentes jbutton jlabel jtexfield etc etc etc e organiza dentro do layout
	public void DadosCPF(){
		LIndentif = new JLabel("DADOS PESSOAIS");
		LIndentif.setBounds(15,10,300,20);
		LIndentif.setFont(new Font("Calibri", Font.BOLD, 13));
		LIndentif.setForeground(Color.black);
									
					
			LId = new JLabel ("Código:");
			LId.setBounds(65,30,50,20);
			LId.setFont(new Font("Arial",Font.BOLD,11));
				TId = new JTextField(codigo+"5");
				TId.setBounds(111,31,84,20);
				TId.setBackground(new Color(255,255,204));
				TId.setFont(new Font("Arial",Font.BOLD,10));
				TId.setForeground(Color.black);
				TId.setEditable(false);
					
						 
			LDocumento = new JLabel("*CPF:");
			LDocumento.setBounds(75,60,35,20);
			LDocumento.setFont(new Font("Arial" , Font.BOLD,11));;
				try{
					mascaraCpf=new MaskFormatter("###.###.###-##");
					mascaraCpf.setPlaceholderCharacter('_');
				}
				catch(ParseException excp){}
							
				JCpf= new JFormattedTextField(mascaraCpf);
				JCpf.setBounds(111,62,173,19);		
				
			/*LTipoPessoa = new JLabel("Sexo:");
			LTipoPessoa.setBounds(287,70,100,20);
			LTipoPessoa.setFont(new Font("Arial" , Font.BOLD,11));;
				lista4 = new JComboBox(tipopessoa);
				lista4.setMaximumRowCount(4);
				lista4.setBounds(320,70,115,19);*/
						
			LDataNasc = new JLabel("Data Nasc.:");
			LDataNasc.setBounds(50,121,60,20);
			LDataNasc.setFont(new Font("Arial" , Font.BOLD,11));;
				try{
					mascaraDataNasc=new MaskFormatter("##/##/####");
					mascaraDataNasc.setPlaceholderCharacter('_');
				}
				catch(ParseException excp){}
					
				JDataNasc= new JFormattedTextField(mascaraDataNasc);
				JDataNasc.setBounds(111,121,120,19);
					
												
			LRg_insc = new JLabel("*RG:");
			LRg_insc.setBounds(456,60,29,20);
			LRg_insc.setFont(new Font("Arial" , Font.BOLD,11));;
				TRg_insc = new JTextField();
				TRg_insc .setBounds(489,61,120,19);
				TRg_insc .setFont(new Font("Arial",Font.BOLD,10));
						
						
			/*LSexo = new JLabel("Sexo:");
			LSexo.setBounds(287,70,100,20);
			LSexo.setFont(new Font("Arial" , Font.BOLD,11));;
				lista3 = new JComboBox(sexo);
				lista3.setMaximumRowCount(4);
				lista3.setBounds(320,70,115,19);*/
				
					
			LNome = new JLabel("*Nome:");
			LNome.setBounds(65,90,50,20);
			LNome.setFont(new Font("Arial" , Font.BOLD,11));;
				TNome = new JTextField();
				TNome.setBounds(111,91,500,19);
				TNome.setFont(new Font("Arial",Font.BOLD,10));
				TNome.addKeyListener(new KeyAdapter() {  
					public void keyReleased(KeyEvent ke) {  
						if (ke.getKeyCode() != KeyEvent.VK_HOME) {  
							String s = TNome.getText();  
							TNome.setText(s.toUpperCase());  
						}  
					}  
				}); 	
					
			
			LDataCad = new JLabel("Data Cadastro:");
			LDataCad.setBounds(439,30,84,20);
			LDataCad.setFont(new Font("Arial" , Font.BOLD,11));;
				try{
					mascaraDataCadastro=new MaskFormatter("##/##/####");
					mascaraDataCadastro.setPlaceholderCharacter('_');
				}
				catch(ParseException excp){}
					
				JDataCadastro= new JFormattedTextField(mascaraDataNasc);
				JDataCadastro.setBounds(525,30,84,19);
				
			LObservacao = new JLabel("Observação:");
			LObservacao.setBounds(31,361,72,20);
			LObservacao.setFont(new Font("Arial" , Font.BOLD,11));;
				TObservacao = new JTextField();
				TObservacao.setBounds(111,362,506,19);
				TObservacao.setFont(new Font("Arial",Font.BOLD,10));
				TObservacao.addKeyListener(new KeyAdapter() {  
					public void keyReleased(KeyEvent ke) {  
						if (ke.getKeyCode() != KeyEvent.VK_HOME) {  
							String s = TObservacao.getText();  
							TObservacao.setText(s.toUpperCase());  
						}  
					}  
				}); 
				
		LEndereco = new JLabel("ENDEREÇO");
		LEndereco.setFont(new Font("Calibri", Font.BOLD, 13));
		LEndereco.setBounds(10, 142, 64, 14);
		
				
			LLogradouro = new JLabel("Logradouro: ");
			LLogradouro.setFont(new Font("Arial", Font.BOLD, 11));
			LLogradouro.setBounds(31, 167, 84, 14);
				TLogradouro = new JTextField();
				TLogradouro.setBounds(111, 164, 506, 20);
				TLogradouro.setColumns(10);
					
			LComplemento = new JLabel("Complemento: ");
			LComplemento.setFont(new Font("Arial", Font.BOLD, 11));
			LComplemento.setBounds(15, 195, 100, 14);
				TComplemento = new JTextField();
				TComplemento.setColumns(10);
				TComplemento.setBounds(111, 192, 506, 20);
					
			LNumero = new JLabel("Numero:");
			LNumero.setFont(new Font("Arial", Font.BOLD, 11));
			LNumero.setBounds(57, 228, 58, 14);
				TNumero = new JTextField();
				TNumero.setBounds(111, 225, 106, 20);
				TNumero.setColumns(10);
					
			LBairro = new JLabel("Bairro: ");
			LBairro.setFont(new Font("Arial", Font.BOLD, 11));
			LBairro.setBounds(363, 228, 46, 14);
				TBairro = new JTextField();
				TBairro.setBounds(419, 225, 192, 20);
				TBairro.setColumns(10);
						
			LCidade = new JLabel("Cidade: ");
			LCidade.setFont(new Font("Arial", Font.BOLD, 11));
			LCidade.setBounds(65, 253, 46, 14);
				TCidade = new JTextField();
				TCidade.setBounds(111, 250, 208, 20);
				TCidade.setColumns(10);
						
			LCep = new JLabel("CEP:");
			LCep.setFont(new Font("Arial", Font.BOLD, 11));
			LCep.setBounds(75, 284, 35, 14);
				TCep = new JTextField();
				TCep.setBounds(111, 281, 86, 20);
				TCep.setColumns(10);			
				
		LContato = new JLabel("CONTATO");
		LContato.setFont(new Font("Calibri", Font.BOLD, 13));
		LContato.setBounds(15, 308, 72, 14);
		
			LEmail = new JLabel("Email:");
			LEmail.setFont(new Font("Arial", Font.BOLD, 11));
			LEmail.setBounds(50, 325, 46, 14);
				TEmail = new JTextField();
				TEmail.setBounds(109, 322, 263, 20);
				TEmail.setColumns(10);
			
			LCelular = new JLabel("Celular:");
			LCelular.setFont(new Font("Arial", Font.BOLD, 11));
			LCelular.setBounds(404, 284, 46, 14);
				TCelular = new JTextField();
				TCelular.setBounds(456, 284, 155, 20);
				TCelular.setColumns(10);
			
			LTelefone = new JLabel("Telefone:");
			LTelefone.setFont(new Font("Arial", Font.BOLD, 11));
			LTelefone.setBounds(394, 325, 72, 14);
				TTelefone = new JTextField();
				TTelefone.setBounds(456, 322, 155, 20);
				TTelefone.setColumns(10);			
	}
	
	public void InicializaCompomentes(){
		tela.add(this.TId);
		tela.add(this.TNome );
		tela.add(this.TRg_insc);
		tela.add(this.TObservacao);
		tela.add(this.LId);
		tela.add(this.LNome);
		tela.add(this.LDocumento);
		tela.add(this.LRg_insc);
		tela.add(this.LDataNasc);
		tela.add(this.LDataCad);
		tela.add(this.LObservacao);
		tela.add(this.LIndentif);
		//tela.add(this.ComboSexo);
		//tela.add(this.ComboTipoPessoa);
		tela.add(this.JDataCadastro);		
		tela.add(this.JCpf);
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
		tela.add(this.TCep);
		tela.add(this.LContato);
		tela.add(this.LEmail);
		tela.add(this.LCelular);
		tela.add(this.LTelefone);
		tela.add(this.TEmail);
		tela.add(this.TTelefone);
		tela.add(this.TCelular);
	}

	
	
}
