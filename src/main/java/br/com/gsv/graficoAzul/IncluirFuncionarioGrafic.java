package br.com.gsv.graficoAzul;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.Vector;

import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.LineBorder;

import br.com.gsv.formularios.IncluirFuncionariosForm;
import br.com.gsv.util.FieldListener;
import br.com.gsv.util.ListasUtil;
import br.com.gsv.util.SomenteNumerosUtil;

public class IncluirFuncionarioGrafic {
	private IncluirFuncionariosForm formulario;
	private FieldListener field;
	private SomenteNumerosUtil soNumeros;
	
	public IncluirFuncionarioGrafic(IncluirFuncionariosForm formulario) {
		this.formulario = formulario;
		this.field = new FieldListener();
		soNumeros = new SomenteNumerosUtil();
		
		CriarTelaGeral();
		DadosFuncionario();
		ArrastandoPainel();
	}
	
	
	private void CriarTelaGeral(){
		this.formulario.setModal(true);
		this.formulario.setBounds(100, 100, 681, 482);
		this.formulario.getTela().setLayout(null);
		this.formulario.setUndecorated(true);
		this.formulario.getPanel().setBorder(new LineBorder(new Color(71,120,197)));
		this.formulario.getPanel().setBackground(Color.WHITE);
		this.formulario.getPanel().setBounds(0, 0, 681, 482);
		this.formulario.getTela().add(this.formulario.getPanel());
		
	}
		
		
	private void DadosFuncionario(){
		JPanel painelTitulo = new JPanel();
		painelTitulo.setBackground(new Color(71,120,197));
		
		this.formulario.getLIndentif().setText("DADOS PESSOAIS");
		this.formulario.getLIndentif().setForeground(new Color(71,120,197));
		this.formulario.getLIndentif().setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		
		this.formulario.getLId().setText("Código");
		this.formulario.getLId().setFont(new Font("Segoe UI", Font.PLAIN, 12));
		
		this.formulario.getTId().setBorder(new LineBorder(new Color(71,120,197)));
		this.formulario.getTId().setEditable(false);
		this.formulario.getTId().setColumns(10);
		
		this.formulario.getLNome().setText("Nome");
		this.formulario.getLNome().setFont(new Font("Segoe UI", Font.PLAIN, 12));
		
		this.formulario.getTNome().setBorder(new LineBorder(new Color(71,120,197)));
		
		this.formulario.getLRg().setText("RG");
		this.formulario.getLRg().setFont(new Font("Segoe UI", Font.PLAIN, 12));
		
		this.formulario.getTRg().setBorder(new LineBorder(new Color(71,120,197)));
		
		this.formulario.getLCpf().setText("CPF");
		this.formulario.getLCpf().setFont(new Font("Segoe UI", Font.PLAIN, 12));
		
		this.formulario.getJCpf().setBorder(new LineBorder(new Color(71,120,197)));
		
		this.formulario.getTCoren().setBorder(new LineBorder(new Color(71,120,197)));
		
		JSeparator separator = new JSeparator();
		
		this.formulario.getLEndereco().setText("ENDEREÇO");
		this.formulario.getLEndereco().setForeground(new Color(71, 120, 197));
		this.formulario.getLEndereco().setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		
		this.formulario.getLLogradouro().setText("Logradouro");
		this.formulario.getLLogradouro().setFont(new Font("Segoe UI", Font.PLAIN, 12));
		
		this.formulario.getTLogradouro().setBorder(new LineBorder(new Color(71,120,197)));
		
		this.formulario.getLNumero().setText("Número");
		this.formulario.getLNumero().setFont(new Font("Segoe UI", Font.PLAIN, 12));
		
		this.formulario.getTNumero().setBorder(new LineBorder(new Color(71,120,197)));
		
		this.formulario.getLComplemento().setText("Complemento");
		this.formulario.getLComplemento().setFont(new Font("Segoe UI", Font.PLAIN, 12));
		
		this.formulario.getTComplemento().setBorder(new LineBorder(new Color(71,120,197)));
		
		this.formulario.getLBairro().setText("Bairro");
		this.formulario.getLBairro().setFont(new Font("Segoe UI", Font.PLAIN, 12));
		
		this.formulario.getTBairro().setBorder(new LineBorder(new Color(71,120,197)));
		
		this.formulario.getTCidade().setBorder(new LineBorder(new Color(71,120,197)));
		
		this.formulario.getLCidade().setText("Cidade");
		this.formulario.getLCidade().setFont(new Font("Segoe UI", Font.PLAIN, 12));
		
		this.formulario.getLEstado().setText("Estado");
		this.formulario.getLEstado().setFont(new Font("Segoe UI", Font.PLAIN, 12));
		
		JLabel LCep = new JLabel("CEP");
		LCep.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		
		this.formulario.getJCep().setBorder(new LineBorder(new Color(71,120,197)));
		
		JSeparator separator_1 = new JSeparator();
		
		JLabel LContato = new JLabel("CONTATO");
		LContato.setForeground(new Color(71, 120, 197));
		LContato.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		
		JLabel LEmail = new JLabel("E-mail");
		LEmail.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		
		this.formulario.getTEmail().setBorder(new LineBorder(new Color(71,120,197)));
		
		this.formulario.getLTelefone().setText("Telefone");
		this.formulario.getLTelefone().setFont(new Font("Segoe UI", Font.PLAIN, 12));
		
		this.formulario.getTTelefone().setBorder(new LineBorder(new Color(71,120,197)));
		
		this.formulario.getLCelular().setText("Celular");
		this.formulario.getLCelular().setFont(new Font("Segoe UI", Font.PLAIN, 12));
		
		this.formulario.getTCelular().setBorder(new LineBorder(new Color(71,120,197)));
		
		this.formulario.getBTGravar().setText("Gravar");
		this.formulario.getBTGravar().setBounds(215, 381, 100, 23);
		this.formulario.getBTGravar().setBackground(new Color(71, 120, 197));
		this.formulario.getBTGravar().setFont(new Font("Segoe UI", 0, 14));
		this.formulario.getBTGravar().setForeground(new Color(255, 255, 255));
		
		this.formulario.getBTCancelar().setText("Voltar");
		this.formulario.getBTCancelar().setBounds(215, 381, 100, 23);
		this.formulario.getBTCancelar().setBackground(new Color(71, 120, 197));
		this.formulario.getBTCancelar().setFont(new Font("Segoe UI", 0, 14));
		this.formulario.getBTCancelar().setForeground(new Color(255, 255, 255));
		
		this.formulario.getComboCoren().setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		this.formulario.getComboCoren().setModel(new DefaultComboBoxModel(new Vector(ListasUtil.Coren())));
		this.formulario.getComboCoren().setBackground(Color.WHITE);
		
		this.formulario.getComboEstado().setBackground(Color.WHITE);
		this.formulario.getComboEstado().setModel(new DefaultComboBoxModel(new Vector(ListasUtil.Estados())));
		this.formulario.getComboEstado().setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		
		this.formulario.getComboCorenEst().setModel(new DefaultComboBoxModel(new Vector(ListasUtil.EstadosAbrev())));
		this.formulario.getComboCorenEst().setBackground(Color.WHITE);
		
		
		
		GroupLayout gl_panel = new GroupLayout(this.formulario.getPanel());
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(painelTitulo, GroupLayout.DEFAULT_SIZE, 683, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
				.addGap(10)
				.addComponent(this.formulario.getLIndentif(), GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
				.addContainerGap())
				.addGroup(gl_panel.createSequentialGroup()
				.addContainerGap()
				.addComponent(this.formulario.getLEndereco(), GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(589, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
				.addContainerGap()
				.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
				.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
				.addComponent(separator, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
				.addComponent(this.formulario.getTId(), Alignment.LEADING, 0, 0, Short.MAX_VALUE)
				.addComponent(this.formulario.getLId(), Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
				.addComponent(this.formulario.getTRg(), GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
				.addComponent(this.formulario.getLRg(), GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
				.addComponent(this.formulario.getLNome(), GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
				.addGroup(gl_panel.createSequentialGroup()
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(this.formulario.getLCpf(), GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
				.addComponent(this.formulario.getJCpf(), GroupLayout.PREFERRED_SIZE, 185, GroupLayout.PREFERRED_SIZE))
				.addGap(137)
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
				.addComponent(this.formulario.getTCoren(), GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
				.addComponent(this.formulario.getComboCorenEst(), GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel.createSequentialGroup()
				.addComponent(this.formulario.getComboCoren(), GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED, 110, Short.MAX_VALUE))))
				.addComponent(this.formulario.getTNome(), GroupLayout.PREFERRED_SIZE, 524, GroupLayout.PREFERRED_SIZE))))
				.addGap(14))
				.addGroup(gl_panel.createSequentialGroup()
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(this.formulario.getLLogradouro(), GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
				.addComponent(this.formulario.getTLogradouro(), GroupLayout.PREFERRED_SIZE, 504, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(this.formulario.getLNumero(), GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
				.addComponent(this.formulario.getTNumero(), GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE))
				.addContainerGap(16, Short.MAX_VALUE))))
				.addGroup(gl_panel.createSequentialGroup()
				.addContainerGap()
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(this.formulario.getLCidade(), GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
				.addComponent(this.formulario.getTCidade(), GroupLayout.PREFERRED_SIZE, 199, GroupLayout.PREFERRED_SIZE))
				.addGap(37)
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(this.formulario.getComboEstado(), 0, 179, Short.MAX_VALUE)
				.addComponent(this.formulario.getLEstado(), GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)))
				.addComponent(this.formulario.getTComplemento(), GroupLayout.PREFERRED_SIZE, 415, GroupLayout.PREFERRED_SIZE)
				.addComponent(this.formulario.getLComplemento(), GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE))
				.addGap(62)
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(this.formulario.getTBairro(), GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE)
				.addComponent(this.formulario.getLBairro(), GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
				.addGroup(gl_panel.createSequentialGroup()
				.addGap(84)
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(this.formulario.getJCep(), GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
				.addComponent(LCep, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)))))
				.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, 659, GroupLayout.PREFERRED_SIZE))
				.addGap(14))
				.addGroup(gl_panel.createSequentialGroup()
				.addContainerGap()
				.addComponent(LContato, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(589, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
				.addContainerGap()
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
				.addComponent(LEmail, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
				.addGap(290)
				.addComponent(this.formulario.getLTelefone(), GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel.createSequentialGroup()
				.addComponent(this.formulario.getTEmail(), GroupLayout.PREFERRED_SIZE, 318, GroupLayout.PREFERRED_SIZE)
				.addGap(18)
				.addComponent(this.formulario.getTTelefone(), GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)))
				.addPreferredGap(ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(this.formulario.getTCelular(), GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
				.addComponent(this.formulario.getLCelular(), GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE))
				.addGap(14))
				.addGroup(gl_panel.createSequentialGroup()
				.addGap(243)
				.addComponent(this.formulario.getBTGravar())
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(this.formulario.getBTCancelar(), GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(279, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
				.addComponent(painelTitulo, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(this.formulario.getLIndentif())
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
				.addComponent(this.formulario.getLId())
				.addComponent(this.formulario.getLNome(), GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
				.addComponent(this.formulario.getTId(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addComponent(this.formulario.getTNome(), GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
				.addComponent(this.formulario.getLCpf(), GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
				.addComponent(this.formulario.getComboCoren(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addComponent(this.formulario.getLRg(), GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
				.addComponent(this.formulario.getJCpf(), GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
				.addComponent(this.formulario.getTCoren(), GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
				.addComponent(this.formulario.getComboCorenEst(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addComponent(this.formulario.getTRg(), GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addComponent(separator, GroupLayout.PREFERRED_SIZE, 1, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addComponent(this.formulario.getLEndereco(), GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
				.addComponent(this.formulario.getLNumero(), GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(this.formulario.getTNumero(), GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel.createSequentialGroup()
				.addComponent(this.formulario.getLLogradouro(), GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(this.formulario.getTLogradouro(), GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)))
				.addGap(6)
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
				.addComponent(this.formulario.getLComplemento(), GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
				.addGap(5)
				.addComponent(this.formulario.getTComplemento(), GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel.createSequentialGroup()
				.addComponent(this.formulario.getLBairro(), GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
				.addGap(5)
				.addComponent(this.formulario.getTBairro(), GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)))
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
				.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
				.addComponent(this.formulario.getLCidade(), GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
				.addComponent(LCep, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
				.addComponent(this.formulario.getTCidade(), GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
				.addComponent(this.formulario.getJCep(), GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
				.addComponent(this.formulario.getComboEstado(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
				.addComponent(this.formulario.getLEstado(), GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, 1, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(LContato, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
				.addComponent(LEmail, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
				.addComponent(this.formulario.getLTelefone(), GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
				.addComponent(this.formulario.getLCelular(), GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
				.addComponent(this.formulario.getTEmail(), GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
				.addComponent(this.formulario.getTTelefone(), GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
				.addComponent(this.formulario.getTCelular(), GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
				.addComponent(this.formulario.getBTCancelar())
				.addComponent(this.formulario.getBTGravar()))
				.addContainerGap())
		);
		
		JLabel Titulo = new JLabel("Incluir Dados Funcion\u00E1rio");
		Titulo.setForeground(Color.WHITE);
		Titulo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 13));
		GroupLayout gl_painelTitulo = new GroupLayout(painelTitulo);
		gl_painelTitulo.setHorizontalGroup(
			gl_painelTitulo.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_painelTitulo.createSequentialGroup()
				.addContainerGap()
				.addComponent(Titulo, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(521, Short.MAX_VALUE))
		);
		gl_painelTitulo.setVerticalGroup(
			gl_painelTitulo.createParallelGroup(Alignment.LEADING)
				.addComponent(Titulo, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
		);
		painelTitulo.setLayout(gl_painelTitulo);
		this.formulario.getPanel().setLayout(gl_panel);
		
	}
	
	private void ArrastandoPainel(){
		
		this.formulario.getPanel().addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent evt) {
                arrastaPainel(evt);
            }
        });
		
		this.formulario.getPanel().addMouseListener(new MouseAdapter() {
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
