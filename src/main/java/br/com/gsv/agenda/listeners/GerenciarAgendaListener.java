package br.com.gsv.agenda.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Date;
import java.util.List;

import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JRootPane;
import javax.swing.KeyStroke;
import javax.swing.ListSelectionModel;

import br.com.gsv.agenda.formulario.AgendaFormulario;
import br.com.gsv.agenda.formulario.GerenciarAgenda;
import br.com.gsv.domain.Agenda;
import br.com.gsv.tabelas.TabelaDeAgenda;
import br.com.projeto.gsv.controller.AgendaController;

public class GerenciarAgendaListener implements ActionListener, PropertyChangeListener, MouseListener {
	private GerenciarAgenda gerenciamento;
	private TabelaDeAgenda tabela;
	private List<Agenda> listaDeAgendados;
	
	
	
	public GerenciarAgendaListener(GerenciarAgenda gerenciamento) {
		this.gerenciamento = gerenciamento;
		AdicionaListener();
		TeclaEsc();
	}

	private void AdicionaListener(){
		this.gerenciamento.getBAgendar().addActionListener(this);
		this.gerenciamento.getBVoltar().addActionListener(this);
		this.gerenciamento.getBAlterar().addActionListener(this);
		this.gerenciamento.getCalendar().addPropertyChangeListener(this);
		this.gerenciamento.getTable().addMouseListener(this);
		
	}

	
	
	private void TabelaDeDias(Date data){
		AgendaController controller = new AgendaController();
		this.listaDeAgendados = controller.ListaDeAgendados(data);
		tabela = new TabelaDeAgenda(this.listaDeAgendados);
		
		tabela.CriaColunas(data);
		this.gerenciamento.getTable().setModel(tabela);
		
		this.gerenciamento.getTable().getColumnModel().getColumn(0).setPreferredWidth(5);
		this.gerenciamento.getTable().getColumnModel().getColumn(1).setPreferredWidth(200);
		this.gerenciamento.getTable().getColumnModel().getColumn(2).setPreferredWidth(75);
		this.gerenciamento.getTable().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);		
		this.gerenciamento.getTable().changeSelection(0, 0, false, false);
		this.gerenciamento.getTable().setRowSelectionInterval(0, 0);
		this.gerenciamento.getTable().setFocusable(false);
		this.gerenciamento.getScrollPane().setViewportView(this.gerenciamento.getTable());		
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent event) {
		if(event.getSource().equals(this.gerenciamento.getBAlterar())){
			AgendaFormulario formularioAgenda = new AgendaFormulario();
			formularioAgenda.getListener().setAgenda(SelecionarDaLista(SelecionaLinha()));
			formularioAgenda.getListener().AlterandoAgendamento();
			formularioAgenda.setVisible(true);
		}else if(event.getSource().equals(this.gerenciamento.getBAgendar())){
			AgendaFormulario formularioAgenda = new AgendaFormulario();
			formularioAgenda.getListener().InicializaObjetos();
			formularioAgenda.setVisible(true);
		}else if(event.getSource().equals(this.gerenciamento.getBVoltar())){
			this.gerenciamento.dispose();
		}
	}
	
	
	private String SelecionaLinha(){
		int linha = this.gerenciamento.getTable().getSelectedRow();
		String hora = (String) this.gerenciamento.getTable().getValueAt(linha,0);
		
		return hora;
	}
	
	
	private Agenda SelecionarDaLista(String hora){
		Agenda ag = null;
		
		for(Agenda agenda : listaDeAgendados){
			if(agenda.getHoraDesejada().equals(hora)){
				ag = agenda;
				
				this.gerenciamento.getTNome().setText(ag.getPaciente().getNome());
				this.gerenciamento.getTTipo().setText(ag.getTipoAgendamento().getValor());
				this.gerenciamento.getTData().setText(ag.getData().toString());
				this.gerenciamento.getTHora().setText(ag.getHoraDesejada());
			}
			
		}
		
		return ag;
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

	@Override
	public void propertyChange(PropertyChangeEvent event) {
		TabelaDeDias(this.gerenciamento.getCalendar().getDate());			
	}

	@Override
	public void mouseClicked(MouseEvent event) {
		int valor = this.gerenciamento.getTable().getSelectedRow();
		String hora = (String) this.gerenciamento.getTable().getValueAt(valor,0);
		SelecionarDaLista(hora);
	}

	@Override
	public void mouseEntered(MouseEvent event) {

	}

	@Override
	public void mouseExited(MouseEvent event) {
		
	}

	@Override
	public void mousePressed(MouseEvent event) {
		
	}

	@Override
	public void mouseReleased(MouseEvent event) {
		
	}

	
	
}
