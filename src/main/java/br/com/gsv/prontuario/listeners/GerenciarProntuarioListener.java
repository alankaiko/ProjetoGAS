package br.com.gsv.prontuario.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.List;

import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JRootPane;
import javax.swing.KeyStroke;
import javax.swing.ListSelectionModel;

import br.com.gsv.paciente.formularios.BuscarPacienteDialog;
import br.com.gsv.prontuario.domain.Prontuario;
import br.com.gsv.prontuario.formularios.ExcluirProntuarioDialog;
import br.com.gsv.prontuario.formularios.GerenciaProntuarios;
import br.com.gsv.prontuario.formularios.ProntuarioForm;
import br.com.projeto.gsv.controller.PacienteController;
import br.com.projeto.gsv.controller.ProntuarioController;
import br.com.projeto.gsv.util.ConverteDadosUtil;
import br.com.projeto.gsv.util.TabelaDeProntuariosUtil;

public class GerenciarProntuarioListener implements ActionListener{
	private TabelaDeProntuariosUtil tabela;
	private GerenciaProntuarios gerenciamento;
	private List<Prontuario> listaProntuarios;
	private ProntuarioController control;
	
	public GerenciarProntuarioListener(GerenciaProntuarios gerenciamento) {
		this.gerenciamento = gerenciamento;
		this.control = new ProntuarioController();
		AdicionaListener();
		TeclaEsc();
	}
	
	public void ResetarLista(){
		this.listaProntuarios = control.ListaCompletaDeProntuarios();
		
		TabelaDeProdutos();
	}
	
	
	private void AdicionaListener(){
		this.gerenciamento.getBAgendar().addActionListener(this);
		this.gerenciamento.getBCancelar().addActionListener(this);
		this.gerenciamento.getBFiltrar().addActionListener(this);
		this.gerenciamento.getBModificar().addActionListener(this);
		this.gerenciamento.getBExcluir().addActionListener(this);
		this.gerenciamento.getBPesquisar().addActionListener(this);
	}
	
	
			
	
	
	private void TabelaDeProdutos(){		
		tabela = new TabelaDeProntuariosUtil(listaProntuarios);
		this.gerenciamento.getTable().setModel(tabela);
		this.gerenciamento.getTable().getColumnModel().getColumn(0).setPreferredWidth(60);
		this.gerenciamento.getTable().getColumnModel().getColumn(1).setPreferredWidth(20);
		this.gerenciamento.getTable().getColumnModel().getColumn(2).setPreferredWidth(150);
		this.gerenciamento.getTable().getColumnModel().getColumn(3).setPreferredWidth(40);
		this.gerenciamento.getTable().getColumnModel().getColumn(4).setPreferredWidth(20);
		this.gerenciamento.getTable().getColumnModel().getColumn(5).setPreferredWidth(20);
		this.gerenciamento.getTable().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		this.gerenciamento.getTable().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		this.gerenciamento.getTable().changeSelection(0, 0, false, false);
		//this.gerenciamento.getTable().setRowSelectionInterval(0, 0);
		this.gerenciamento.getTable().setFocusable(false);
		
		this.gerenciamento.getScrollPane().setViewportView(this.gerenciamento.getTable());
		
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent event) {
		if(event.getSource().equals(this.gerenciamento.getBPesquisar())){
			ExecutaPesquisar();
		}
		
		if(event.getSource().equals(this.gerenciamento.getBAgendar())){
			ExecutaAgendar();
		}
		
		if(event.getSource().equals(this.gerenciamento.getBModificar()) && this.gerenciamento.getTable().getRowCount() != 0){
			ExecutaEdicao(SelecionaLinha());
		}
		
		if(event.getSource().equals(this.gerenciamento.getBFiltrar())){
			ExecutaFiltragem();
		}
		
		if(event.getSource().equals(this.gerenciamento.getBExcluir())  && this.gerenciamento.getTable().getRowCount() != 0){
			ExecutaExclusao(SelecionaLinha());
		}
		
		if(event.getSource().equals(this.gerenciamento.getBCancelar())){
			this.gerenciamento.dispose();
		}
		
	}
	
	private void ExecutaPesquisar(){
		BuscarPacienteDialog dialog = new BuscarPacienteDialog();
		dialog.setLocationRelativeTo(this.gerenciamento.getContentPane());
		dialog.setVisible(true);
		
		if(dialog.getListener().getCodigo() != null)
			BuscarCliente(dialog.getListener().getCodigo());
	}
	
	private void BuscarCliente(Long id){
		listaProntuarios = control.BuscandoPelaIdPaciente(id);
		TabelaDeProdutos();
	}
	
	private void ExecutaAgendar(){
		ProntuarioForm formulario = new ProntuarioForm();
		formulario.getListener().InicializaObjetos();
		formulario.setLocationRelativeTo(this.gerenciamento.getContentPane());
		formulario.setVisible(true);
		
		TabelaDeProdutos();
	}
	
	private void ExecutaFiltragem(){
		if(this.gerenciamento.getDataFiltrar().getDate() != null)
			listaProntuarios = control.BuscandoPelaData(this.gerenciamento.getDataFiltrar().getDate());
		else
			listaProntuarios = control.ListaCompletaDeProntuarios();
		TabelaDeProdutos();
	}
	
	private Long SelecionaLinha(){
		int linha = this.gerenciamento.getTable().getSelectedRow();
		Long valor = listaProntuarios.get(linha).getId();

		return valor;
	}
		
	private void ExecutaEdicao(Long id){
		ProntuarioController controller = new ProntuarioController();
		ProntuarioForm form = new ProntuarioForm();
		
		form.getListener().setProntuario(controller.BuscarPelaID(id));
		form.getListener().PreencheCamposParaEdicao();
		
		form.setLocationRelativeTo(this.gerenciamento.getContentPane());
		form.setVisible(true);
		
		ResetarLista();
	}
	
	private void ExecutaExclusao(Long id){
		ProntuarioController controller = new ProntuarioController();
		ExcluirProntuarioDialog dialog = new ExcluirProntuarioDialog(controller.BuscarPelaID(id));
		
		dialog.setLocationRelativeTo(this.gerenciamento.getContentPane());
		dialog.setVisible(true);
		
		ResetarLista();	
	}
	
	
	
	
	
	
	public void TeclaEsc(){
        JRootPane meurootpane = this.gerenciamento.getRootPane();  
        meurootpane.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), "ESCAPE");  
        meurootpane.getRootPane().getActionMap().put("ESCAPE", new AbstractAction("ESCAPE") {  
  
            public void actionPerformed(ActionEvent e) {  
            	gerenciamento.dispose();  
            }  
        });  
    } 
	

}
