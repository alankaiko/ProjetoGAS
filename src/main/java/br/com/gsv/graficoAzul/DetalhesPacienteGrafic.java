package br.com.gsv.graficoAzul;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.LineBorder;

import br.com.gsv.formularios.DetalhesPacienteDialog;


public class DetalhesPacienteGrafic {
	private DetalhesPacienteDialog formulario;
	
	
	public DetalhesPacienteGrafic(DetalhesPacienteDialog formulario) {
		this.formulario = formulario;
		CriarTelaGeral();
		Dados();
		ArrastandoPainel();
	}
	
	
	
	//cria e tela geral onde todos os componentes serao inseridos, é a tela geral do sistema
	private void CriarTelaGeral(){
		this.formulario.setModal(true);
		this.formulario.setBounds(100, 100, 650, 460);
		this.formulario.getTela().setLayout(null);
		this.formulario.setUndecorated(true);
		this.formulario.getPanel().setBorder(new LineBorder(new Color(71,120,197)));
		this.formulario.getPanel().setBackground(Color.WHITE);
		this.formulario.getPanel().setBounds(0, 0, 650, 460);
		this.formulario.getTela().add(this.formulario.getPanel());
	}
	
	

	
	
	
	
	public void Dados(){
		this.formulario.getPainelDrag().setBounds(0, 0, 650, 24);
		this.formulario.getPainelDrag().setBackground(new Color(20, 34, 56));
		
		JLabel LFechar = new JLabel();
		LFechar.setIcon(new ImageIcon(DetalhesPacienteGrafic.class.getResource("/imagens/icons8-não-22.png")));
		LFechar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				formulario.dispose();
			}
		});
		
		JLabel Titulo = new JLabel("Dados do Paciente");
		Titulo.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		Titulo.setForeground(Color.WHITE);
		GroupLayout gl_painelTitulo = new GroupLayout(this.formulario.getPainelDrag());
		gl_painelTitulo.setHorizontalGroup(
			gl_painelTitulo.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_painelTitulo.createSequentialGroup()
				.addContainerGap()
				.addComponent(Titulo, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED, 485, Short.MAX_VALUE)
				.addComponent(LFechar, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
		);
		gl_painelTitulo.setVerticalGroup(
			gl_painelTitulo.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_painelTitulo.createSequentialGroup()
				.addComponent(Titulo, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
				.addGap(11))
				.addGroup(Alignment.LEADING, gl_painelTitulo.createSequentialGroup()
				.addComponent(LFechar, GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
				.addContainerGap())
		);
		this.formulario.getPainelDrag().setLayout(gl_painelTitulo);
		
		this.formulario.getLIndentif().setText("DADOS PESSOAIS");
		this.formulario.getLIndentif().setBounds(11, 31, 140, 18);
		this.formulario.getLIndentif().setForeground(new Color(71, 120, 197));
		this.formulario.getLIndentif().setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		
		this.formulario.getLId().setText("Código");
		this.formulario.getLId().setBounds(11, 55, 44, 20);
		this.formulario.getLId().setFont(new Font("Segoe UI Light", Font.PLAIN, 14));;
		
		this.formulario.getLNome().setText("Nome");
		this.formulario.getLNome().setBounds(118, 55, 89, 20);
		this.formulario.getLNome().setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		
		this.formulario.getCancelar().setText("Cancelar");
		this.formulario.getCancelar().setBounds(272, 430, 97, 22);
		this.formulario.getCancelar().setForeground(Color.WHITE);
		this.formulario.getCancelar().setFont(new Font("Segoe UI", Font.PLAIN, 14));
		this.formulario.getCancelar().setBackground(new Color(71, 120, 197));
	
		this.formulario.getTId().setBounds(11, 81, 72, 20);
		this.formulario.getTId().setFont(new Font("Segoe UI", Font.PLAIN, 13));
		
		this.formulario.getTNome().setBounds(118, 81, 380, 20);
		this.formulario.getTNome().setFont(new Font("Segoe UI", Font.PLAIN, 13));
		
		this.formulario.getLCpf().setText("CPF");
		this.formulario.getLCpf().setBounds(118, 107, 45, 20);
		this.formulario.getLCpf().setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		
		this.formulario.getTCpf().setBounds(118, 133, 193, 20);
		this.formulario.getTCpf().setFont(new Font("Segoe UI", Font.PLAIN, 13));
		
		this.formulario.getLRg().setText("RG");
		this.formulario.getLRg().setBounds(11, 107, 35, 20);
		this.formulario.getLRg().setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		
		this.formulario.getTRg().setBounds(11, 133, 79, 20);
		this.formulario.getTRg().setFont(new Font("Segoe UI", Font.PLAIN, 13));
		
		JSeparator separa = new JSeparator();
		separa.setBounds(11, 190, 630, 2);
		separa.setBackground(new Color(71, 120, 197));
		
		this.formulario.getLDataCad().setText("Data Cadastro");
		this.formulario.getLDataCad().setBounds(428, 29, 89, 20);
		this.formulario.getLDataCad().setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		
		this.formulario.getLEndereco().setText("ENDEREÇO");
		this.formulario.getLEndereco().setBounds(11, 195, 140, 18);
		this.formulario.getLEndereco().setForeground(new Color(71, 120, 197));
		this.formulario.getLEndereco().setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		
		this.formulario.getLLogradouro().setText("Logradouro");
		this.formulario.getLLogradouro().setBounds(11, 212, 93, 20);
		this.formulario.getLLogradouro().setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		
		this.formulario.getLComplemento().setText("Complemento");
		this.formulario.getLComplemento().setBounds(11, 259, 103, 20);
		this.formulario.getLComplemento().setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		
		this.formulario.getTLogradouro().setBounds(11, 230, 358, 18);
		this.formulario.getTLogradouro().setFont(new Font("Segoe UI", Font.PLAIN, 13));
		
		this.formulario.getTComplemento().setBounds(11, 277, 358, 18);
		this.formulario.getTComplemento().setFont(new Font("Segoe UI", Font.PLAIN, 13));
		
		this.formulario.getLNumero().setText("Número");
		this.formulario.getLNumero().setBounds(580, 212, 61, 20);
		this.formulario.getLNumero().setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		
		this.formulario.getLCidade().setText("Cidade");
		this.formulario.getLCidade().setBounds(407, 259, 64, 20);
		this.formulario.getLCidade().setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		
		this.formulario.getTNumero().setBounds(580, 230, 61, 18);
		this.formulario.getTNumero().setFont(new Font("Segoe UI", Font.PLAIN, 13));
		
		this.formulario.getTCidade().setBounds(407, 277, 234, 18);
		this.formulario.getTCidade().setFont(new Font("Segoe UI", Font.PLAIN, 13));
		
		this.formulario.getLBairro().setText("Bairro");
		this.formulario.getLBairro().setBounds(407, 212, 50, 20);
		this.formulario.getLBairro().setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		
		this.formulario.getTBairro().setBounds(407, 230, 155, 18);
		this.formulario.getTBairro().setFont(new Font("Segoe UI", Font.PLAIN, 13));
		
		JSeparator separator = new JSeparator();
		separator.setBounds(11, 342, 630, 2);
		separator.setBackground(new Color(71, 120, 197));
		
		this.formulario.getLContato().setText("CONTATO");
		this.formulario.getLContato().setBounds(11, 350, 96, 18);
		this.formulario.getLContato().setForeground(new Color(71, 120, 197));
		this.formulario.getLContato().setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		
		this.formulario.getLEmail().setText("E-mail");
		this.formulario.getLEmail().setBounds(11, 368, 69, 20);
		this.formulario.getLEmail().setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		
		this.formulario.getTDataCadastro().setBounds(527, 30, 114, 20);
		this.formulario.getTDataCadastro().setFont(new Font("Segoe UI", Font.PLAIN, 13));
		
		this.formulario.getLDataNasc().setText("Data nasc");
		this.formulario.getLDataNasc().setBounds(552, 55, 89, 20);
		this.formulario.getLDataNasc().setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		
		this.formulario.getTDataNasc().setBounds(552, 81, 89, 20);
		this.formulario.getTDataNasc().setFont(new Font("Segoe UI", Font.PLAIN, 13));
		
		this.formulario.getLConvenio().setText("Convênio");
		this.formulario.getLConvenio().setBounds(344, 164, 72, 20);
		this.formulario.getLConvenio().setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		
		this.formulario.getTConvenio().setBounds(407, 165, 234, 20);
		this.formulario.getTConvenio().setFont(new Font("Segoe UI", Font.PLAIN, 13));
		
		this.formulario.getLObservacao().setText("Observação");
		this.formulario.getLObservacao().setBounds(344, 112, 87, 20);
		this.formulario.getLObservacao().setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		
		this.formulario.getTObservacao().setBounds(344, 133, 297, 20);
		this.formulario.getTObservacao().setFont(new Font("Segoe UI", Font.PLAIN, 13));
		
		this.formulario.getTEmail().setBounds(11, 387, 265, 18);
		this.formulario.getTEmail().setFont(new Font("Segoe UI", Font.PLAIN, 13));
		
		this.formulario.getLTelefone().setText("Telefone");
		this.formulario.getLTelefone().setBounds(286, 368, 69, 20);
		this.formulario.getLTelefone().setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		
		this.formulario.getTTelefone().setBounds(286, 386, 97, 20);
		this.formulario.getTTelefone().setFont(new Font("Segoe UI", Font.PLAIN, 13));
		
		this.formulario.getLCelular().setText("Celular");
		this.formulario.getLCelular().setBounds(402, 368, 69, 20);
		this.formulario.getLCelular().setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		
		this.formulario.getTCelular().setBounds(402, 386, 97, 20);
		this.formulario.getTCelular().setFont(new Font("Segoe UI", Font.PLAIN, 13));
		
	}
	
	private void ArrastandoPainel(){
		
		this.formulario.getPainelDrag().addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent evt) {
                arrastaPainel(evt);
            }
        });
		
		this.formulario.getPainelDrag().addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                arrastaPressionado(evt);
            }
        });
	}
	
	private void arrastaPressionado(MouseEvent evt) {
		this.formulario.setXx(evt.getX());
		this.formulario.setXy(evt.getY());
        //this.formulario.xx = evt.getX();
        //this.formulario.xy = evt.getY();
    }

    private void arrastaPainel(MouseEvent evt) {
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.formulario.setLocation(x-this.formulario.getXx(),y-this.formulario.getXy());
    }
		
}
