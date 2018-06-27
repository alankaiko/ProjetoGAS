package br.com.gsv.agenda.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Date;
import java.util.List;

import javax.swing.SpinnerListModel;

import org.joda.time.DateTime;

import br.com.gsv.agenda.formulario.AgendaFormulario;
import br.com.gsv.domain.Agenda;
import br.com.gsv.domain.Funcionario;
import br.com.gsv.domain.Paciente;
import br.com.gsv.domain.sub.EnumTipoAgendamento;
import br.com.gsv.formularios.BuscarFuncionarioDialog;
import br.com.gsv.formularios.BuscarPacienteDialog;
import br.com.gsv.util.AgendaDadosUtil;
import br.com.projeto.gsv.controller.AgendaController;
import br.com.projeto.gsv.controller.FuncionarioController;
import br.com.projeto.gsv.controller.PacienteController;

public class AgendaListener implements ActionListener, PropertyChangeListener{
	private AgendaFormulario formulario;
	private Paciente paciente;
	private Funcionario funcionario;
	private Agenda agenda;
	private AgendaController controller;
	private List<DateTime> listaHorarios;
	
	public AgendaListener(AgendaFormulario formulario) {
		this.formulario = formulario;
		AdicionaListener();
		InicializaObjetos();
		Date data = new Date();
		this.formulario.getTData().setDate(data);
	}
	
	private void AdicionaListener(){
		this.formulario.getBPesqFunc().addActionListener(this);
		this.formulario.getBPesqPacient().addActionListener(this);
		this.formulario.getBVoltar().addActionListener(this);
		this.formulario.getBSalvar().addActionListener(this);		
		this.formulario.getTData().addPropertyChangeListener(this);
	}
	
	private void InicializaObjetos(){
		this.funcionario = new Funcionario();
		this.paciente = new Paciente();
		this.agenda = new Agenda();
	}
	
	
	private void FormToFormulario(){
		this.agenda.setPaciente(this.paciente);
		this.agenda.setFuncionario(this.funcionario);
		this.agenda.setTipoAgendamento((EnumTipoAgendamento) this.formulario.getComboAgendamento().getSelectedItem());
		this.agenda.setData(this.formulario.getTData().getDate());
		this.agenda.setHoraDesejada( this.formulario.getTHoraSpinner().getValue().toString());
		this.agenda.setObservacao(this.formulario.getTObservacao().getText());
	}
	
	
	public void AlterandoAgendamento(){
		this.formulario.getTPaciente().setText(this.agenda.getPaciente().getNome());
		this.formulario.getTCelular().setText(this.agenda.getPaciente().getContato().get(0).getCelular());
		this.formulario.getTFixo().setText(this.agenda.getPaciente().getContato().get(0).getTelefone());
		this.formulario.getTConvenio().setText(this.agenda.getPaciente().getConvenio().getNome());
		
		this.formulario.getTFuncionario().setText(this.agenda.getFuncionario().getNome());
		this.formulario.getTRegistro().setText(ConcatenarRegistro());
		
		this.formulario.getComboAgendamento().setSelectedItem(this.agenda.getTipoAgendamento().values());
		this.formulario.getTData().setDate(this.agenda.getData());
		
	}
	
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent event) {
		if(event.getSource().equals(this.formulario.getBPesqPacient())){
			BuscarPacienteDialog dialog = new BuscarPacienteDialog();
			dialog.IniciaClassic();
			dialog.setLocationRelativeTo(this.formulario.getContentPane());
			dialog.setVisible(true);
			
			if(dialog.getListener().getCodigo() != null)
				BuscarCliente(dialog.getListener().getCodigo());
		}else if(event.getSource().equals(this.formulario.getBPesqFunc())){
			BuscarFuncionarioDialog dialog = new BuscarFuncionarioDialog();
			dialog.IniciaClassic();
			dialog.setLocationRelativeTo(this.formulario.getContentPane());
			dialog.setVisible(true);
			
			if(dialog.getListener().getCodigo() != null){
				BuscarFuncionario(dialog.getListener().getCodigo());
			}
		}else if(event.getSource().equals(this.formulario.getBVoltar())){
			this.formulario.dispose();
		}else if(event.getSource().equals(this.formulario.getBSalvar())){
			FormToFormulario();
			
			controller = new AgendaController();
			controller.setAgenda(agenda);
			controller.SalvarAgenda();
			
			//this.formulario.dispose();
		}
		
	}
	
	
	
	private void BuscarCliente(Long id){
		PacienteController controller = new PacienteController();
		this.paciente = controller.BuscarPelaID(id);
		
		this.formulario.getTPaciente().setText(this.paciente.getNome());
		this.formulario.getTCelular().setText(this.paciente.getContato().get(0).getCelular());
		this.formulario.getTFixo().setText(this.paciente.getContato().get(0).getTelefone());
		this.formulario.getTConvenio().setText(this.paciente.getConvenio().getNome());
		
	}
	
	private void BuscarFuncionario(Long id){
		FuncionarioController controller = new FuncionarioController();
		this.funcionario = controller.BuscarPelaID(id);	
		
		this.formulario.getTFuncionario().setText(this.funcionario.getNome());
		this.formulario.getTRegistro().setText(ConcatenarRegistro());
	}

	
	private String ConcatenarRegistro(){
		String concatena = this.funcionario.getRegistroCoren().getCoren()
				+" "
				+this.funcionario.getRegistroCoren().getInscricao()
				+" "
				+this.funcionario.getRegistroCoren().getUf();
		
		return concatena;
	}
	
	
	
	private SpinnerListModel ListaDeHorarios(){
		AgendaController controller = new AgendaController();
		List<String> listaDoBanco = controller.ListarHorarios(this.formulario.getTData().getDate());
		List<String> listaAgenda = AgendaDadosUtil.ListaHoras();
		listaAgenda.removeAll(listaDoBanco);
		
		SpinnerListModel model = new SpinnerListModel(listaAgenda);
		
		for(String aff : listaDoBanco){
			System.out.println(aff);
		}
		
		return model;
	}

	



	@Override
	public void propertyChange(PropertyChangeEvent event) {
		this.formulario.getTHoraSpinner().setModel(ListaDeHorarios());
	}
	
	
}









































