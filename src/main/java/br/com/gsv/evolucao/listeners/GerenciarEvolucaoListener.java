package br.com.gsv.evolucao.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JRootPane;
import javax.swing.KeyStroke;
import javax.swing.ListSelectionModel;

import br.com.gsv.domain.Evolucao;
import br.com.gsv.domain.Funcionario;
import br.com.gsv.domain.Paciente;
import br.com.gsv.evolucao.formulario.EvolucaoFormulario;
import br.com.gsv.evolucao.formulario.GerenciarEvolucoes;
import br.com.gsv.tabelas.TabelaDeEvolucao;
import br.com.gsv.util.ValidaCampos;
import br.com.projeto.gsv.controller.EvolucaoController;

public class GerenciarEvolucaoListener implements ActionListener{
	private GerenciarEvolucoes formulario;
	private TabelaDeEvolucao tabela;
	private Paciente paciente;
	private Funcionario funcionario;
	
	public GerenciarEvolucaoListener(GerenciarEvolucoes formulario) {
		this.formulario = formulario;
		addActionListener();
		TeclaEsc();
		UsandoTAB();
	}
	
	
	private void addActionListener(){
		this.formulario.getBTAdicionar().addActionListener(this);
		this.formulario.getBTAlterar().addActionListener(this);
		this.formulario.getBTCancelar().addActionListener(this);
	}
	
	
	public void CriaTabela(){
		EvolucaoController control = new EvolucaoController();
		tabela = new TabelaDeEvolucao(control.BuscarPoPaciente(this.paciente.getId()));
		this.formulario.getTable().setModel(tabela);
		
		this.formulario.getTable().getColumnModel().getColumn(0).setPreferredWidth(4);
		this.formulario.getTable().getColumnModel().getColumn(1).setPreferredWidth(50);
		this.formulario.getTable().getColumnModel().getColumn(2).setPreferredWidth(150);
		this.formulario.getTable().getColumnModel().getColumn(3).setPreferredWidth(150);
		this.formulario.getTable().getColumnModel().getColumn(4).setPreferredWidth(150);
		this.formulario.getTable().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		this.formulario.getTable().changeSelection(0, 0, false, false);

		//this.gerenciamento.getTable().setRowSelectionInterval(0, 0);
		this.formulario.getTable().setFocusable(false);
		this.formulario.getScrollPane().setViewportView(this.formulario.getTable());
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent event) {
		if(event.getSource().equals(this.formulario.getBTAdicionar())){
			AbrirTelaEvolucao();
		}else if(event.getSource().equals(this.formulario.getBTAlterar())  && this.formulario.getTable().getRowCount() != 0){
			EditarEvolucao(SelecionaLinha());
		}else if(event.getSource().equals(this.formulario.getBTCancelar())){
			this.formulario.dispose();
		}
		
		CriaTabela();
	}
	
	
	private void AbrirTelaEvolucao(){
		EvolucaoFormulario form = new EvolucaoFormulario();
		form.getListener().setPaciente(this.paciente);
		form.getListener().setFuncionario(this.funcionario);
		form.getListener().InserirDadosPaciente();
		form.setLocationRelativeTo(this.formulario.getTela());
		form.setVisible(true);
	}
	
	private void EditarEvolucao(Long id){
		EvolucaoController controller = new EvolucaoController();
		EvolucaoFormulario form = new EvolucaoFormulario();
		form.getListener().setEvolucao(	controller.BuscaId(id));
		
		form.getListener().EditToEvolucao();
		form.setLocationRelativeTo(this.formulario.getTela());
		form.setVisible(true);
	}
	
	
	public void InsereDados(){
		this.formulario.getTPaciente().setText(this.paciente.getNome());
		this.formulario.getTConvenio().setText(this.paciente.getConvenio().getNome());
		this.formulario.getTTelefone().setText(this.paciente.getContato().getTelefone());
		this.formulario.getTCelular().setText(this.paciente.getContato().getCelular());
		this.formulario.getTEmail().setText(this.paciente.getContato().getEmail());
	}
	
	
	private Long SelecionaLinha(){
		int linha = this.formulario.getTable().getSelectedRow();
		Long codigo = (Long) this.formulario.getTable().getValueAt(linha,0);
		
		return codigo;
	}
	
	private void UsandoTAB(){
		this.formulario.getRootPane().setDefaultButton(this.formulario.getBTAdicionar());
		this.formulario.getBTAdicionar().addKeyListener(new KeyAdapter() {  
            public void keyPressed(KeyEvent e) {  
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {  
                	formulario.getBTAdicionar().doClick();
                }  
            }  
        });
		
		
		
		this.formulario.getBTCancelar().addKeyListener(new KeyAdapter() {  
            public void keyPressed(KeyEvent e) {  
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {  
                	formulario.getBTCancelar().doClick();  
                }  
            }  
        });
	}
	
	
	
	public void TeclaEsc(){
        JRootPane meurootpane = this.formulario.getRootPane();  
        meurootpane.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), "ESCAPE");  
        meurootpane.getRootPane().getActionMap().put("ESCAPE", new AbstractAction("ESCAPE") {  
            public void actionPerformed(ActionEvent e) { 
            	formulario.dispose();  
            }  
        });  
    }
	

	public Paciente getPaciente() {
		return paciente;
	}
	
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	
	public Funcionario getFuncionario() {
		return funcionario;
	}

}
