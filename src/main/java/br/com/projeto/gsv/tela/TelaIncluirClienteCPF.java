package br.com.projeto.gsv.tela;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import br.com.projeto.gsv.domain.Contato;
import br.com.projeto.gsv.domain.Endereco;
import br.com.projeto.gsv.domain.SexoType;
import br.com.projeto.gsv.domain.TipoPessoa;

public class TelaIncluirClienteCPF extends JDialog {
	private final JPanel contentPanel = new JPanel();
	private Container tela = getContentPane();
	private String valor, codigo;
	JTextField TId, TNome, TRg_insc, TObservacao;
	JLabel LId, LNome, LDocumento, LRg_insc, LDataNasc, LDataCad, LObservacao, LIndentif;
	JComboBox  ComboSexo, ComboTipoPessoa;
	JFormattedTextField JCpf,JDataNasc, JDataCadastro;
	MaskFormatter  mascaraCep, mascaraFoneFixo, mascaraFoneCel, mascaraCpf,mascaraDataNasc, mascaraDataCadastro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			TelaIncluirClienteCPF dialog = new TelaIncluirClienteCPF("","");
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public TelaIncluirClienteCPF(String valor, String codigo) {
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
	}
	
	
	
	
	

	public void DadosCPF(){
		LIndentif = new JLabel("DADOS PESSOAIS");
		LIndentif.setBounds(15,10,300,20);
		LIndentif.setFont(new Font("Arial",Font.BOLD,10));
		LIndentif.setForeground(Color.black);
									
					
			LId = new JLabel ("Código:");
			LId.setBounds(68,30,50,20);
			LId.setFont(new Font("Arial",Font.BOLD,11));
				TId = new JTextField(codigo);
				TId.setBounds(115,30,120,20);
				TId.setBackground(new Color(255,255,204));
				TId.setFont(new Font("Arial",Font.BOLD,10));
				TId.setForeground(Color.black);
				TId.setEditable(false);
					
						 
			LDocumento = new JLabel("*CPF:");
			LDocumento.setBounds(293,30,53,20);
			LDocumento.setFont(new Font("Arial" , Font.BOLD,11));;
				try{
					mascaraCpf=new MaskFormatter("###.###.###-##");
					mascaraCpf.setPlaceholderCharacter('_');
				}
				catch(ParseException excp){}
							
				JCpf= new JFormattedTextField(mascaraCpf);
				JCpf.setBounds(320,30,116,19);		
				
			LTipoPessoa = new JLabel("Sexo:");
			LTipoPessoa.setBounds(287,70,100,20);
			LTipoPessoa.setFont(new Font("Arial" , Font.BOLD,11));;
				lista4 = new JComboBox(tipopessoa);
				lista4.setMaximumRowCount(4);
				lista4.setBounds(320,70,115,19);
						
			LDataNasc = new JLabel("Data Nasc.:");
			LDataNasc.setBounds(53,50,100,20);
			LDataNasc.setFont(new Font("Arial" , Font.BOLD,11));;
				try{
					mascaraDataNasc=new MaskFormatter("##/##/####");
					mascaraDataNasc.setPlaceholderCharacter('_');
				}
				catch(ParseException excp){}
					
				JDataNasc= new JFormattedTextField(mascaraDataNasc);
				JDataNasc.setBounds(115,50,120,19);
					
												
			LRg_insc = new JLabel("*RG:");
			LRg_insc.setBounds(92,70,50,20);
			LRg_insc.setFont(new Font("Arial" , Font.BOLD,11));;
				TRg_insc = new JTextField();
				TRg_insc .setBounds(115,70,120,19);
				TRg_insc .setFont(new Font("Arial",Font.BOLD,10));
						
						
			LSexo = new JLabel("Sexo:");
			LSexo.setBounds(287,70,100,20);
			LSexo.setFont(new Font("Arial" , Font.BOLD,11));;
				lista3 = new JComboBox(sexo);
				lista3.setMaximumRowCount(4);
				lista3.setBounds(320,70,115,19);
				
					
			LNome = new JLabel("*Nome:");
			LNome.setBounds(75,91,50,20);
			LNome.setFont(new Font("Arial" , Font.BOLD,11));;
				TNome = new JTextField();
				TNome.setBounds(115,91,500,19);
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
			LDataCad.setBounds(53,50,150,50);
			LDataCad.setFont(new Font("Arial" , Font.BOLD,11));;
				try{
					mascaraDataCadastro=new MaskFormatter("##/##/####");
					mascaraDataCadastro.setPlaceholderCharacter('_');
				}
				catch(ParseException excp){}
					
				JDataNasc= new JFormattedTextField(mascaraDataNasc);
				JDataNasc.setBounds(115,50,120,19);
				
			LObservacao = new JLabel("*Nome:");
			LObservacao.setBounds(75,91,50,20);
			LObservacao.setFont(new Font("Arial" , Font.BOLD,11));;
				TObservacao = new JTextField();
				TObservacao.setBounds(115,91,500,19);
				TObservacao.setFont(new Font("Arial",Font.BOLD,10));
				TObservacao.addKeyListener(new KeyAdapter() {  
					public void keyReleased(KeyEvent ke) {  
						if (ke.getKeyCode() != KeyEvent.VK_HOME) {  
							String s = TObservacao.getText();  
							TObservacao.setText(s.toUpperCase());  
						}  
					}  
				}); 
						
				
				
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
			tela.add(this.ComboSexo);
			tela.add(this.ComboTipoPessoa);
			tela.add(this.JCpf);
			tela.add(this.JDataNasc);
			tela.add(this.JDataCadastro);			
		
	}				
	
}
