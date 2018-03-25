package br.com.gsv.prontuario.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import br.com.gsv.funcionario.formularios.GerenciaTelaFuncionario;
import br.com.gsv.paciente.domain.Paciente;
import br.com.gsv.paciente.formularios.BuscarPacienteDialog;
import br.com.gsv.prontuario.domain.Prontuario;
import br.com.gsv.prontuario.formularios.ProntuarioForm;
import br.com.projeto.gsv.controller.PacienteController;
import br.com.projeto.gsv.controller.ProntuarioController;
import br.com.projeto.gsv.util.ConverteDadosUtil;

public class ProntuarioListener implements ActionListener{
	private ProntuarioForm formulario;
	private Prontuario prontuario;
	private ProntuarioController controller;
	private Paciente paciente;
	
	public ProntuarioListener(ProntuarioForm formulario) {
		this.formulario = formulario;
		this.prontuario = new Prontuario();
		
		AdicionaListener();
	}
	
	
	
	
	private void AdicionaListener(){
		this.formulario.getBTGravar().addActionListener(this);
		this.formulario.getBTCancelar().addActionListener(this);
		this.formulario.getBTPesquisar().addActionListener(this);
	}
	
	
	private void FormToProntuario(){
		this.prontuario.setAnotObservacao(this.formulario.getTextoAreaAnotacao().getText());
		this.prontuario.setCondSono(this.formulario.getTextoAreaSono().getText());
		this.prontuario.setEquipObservacao(this.formulario.getTextoEquipamento().getText());
		this.prontuario.setInteHemoText(this.formulario.getTHemorragia().getText());
		this.prontuario.setInteDispText(this.formulario.getTDispneia().getText());
		this.prontuario.setInteEdemaText(this.formulario.getTEdema().getText());
		this.prontuario.setInteDescText(this.formulario.getTDEscamacao().getText());
		this.prontuario.setInteHemaText(this.formulario.getTHematoma().getText());
		this.prontuario.setInteCicaText(this.formulario.getTCicatriz().getText());
		this.prontuario.setInteOutrosText(this.formulario.getTOutrosInt().getText());
		this.prontuario.setSintomasEspText(this.formulario.getTextoSintomas().getText());
		this.prontuario.setSinomasMembText(this.formulario.getTextoMembros().getText());	
		PegarRadioButtons();
		
	/*	private Paciente paciente;
		private EquipamentoCheckBox equipCheckbox;
		private SintomasCheckbox sintomasEsp;
		private SintomasMembrosCheckbox sintomasMembros;
		*/
	}
	
	private void PegarRadioButtons(){
		if(this.formulario.getRadioAlerta().isSelected())
			this.prontuario.setAnotConsciencia(this.formulario.getRadioAlerta().getText());
		
		if(this.formulario.getRadioLetargico().isSelected())
			this.prontuario.setAnotConsciencia(this.formulario.getRadioLetargico().getText());
		
		if(this.formulario.getRadioObnubilado().isSelected())
			this.prontuario.setAnotConsciencia(this.formulario.getRadioObnubilado().getText());
		
		if(this.formulario.getRadioTorporoso().isSelected())
			this.prontuario.setAnotConsciencia(this.formulario.getRadioTorporoso().getText());
		
		if(this.formulario.getRadioComatoso().isSelected())
			this.prontuario.setAnotConsciencia(this.formulario.getRadioComatoso().getText());
		
		
		if(this.formulario.getRadioCalmo().isSelected())
			this.prontuario.setAnotMental(this.formulario.getRadioCalmo().getText());
		
		if(this.formulario.getRadioApatico().isSelected())
			this.prontuario.setAnotMental(this.formulario.getRadioApatico().getText());
		
		if(this.formulario.getRadioAlegre().isSelected())
			this.prontuario.setAnotMental(this.formulario.getRadioAlegre().getText());
		
		if(this.formulario.getRadioTriste().isSelected())
			this.prontuario.setAnotMental(this.formulario.getRadioTriste().getText());
		
		if(this.formulario.getRadioAgitado().isSelected())
			this.prontuario.setAnotMental(this.formulario.getRadioAgitado().getText());
		
		
		if(this.formulario.getRadioDeambulante().isSelected())
			this.prontuario.setCondDeambulacao(this.formulario.getRadioDeambulante().getText());
		
		if(this.formulario.getRadioUtilizaCadeira().isSelected())
			this.prontuario.setCondDeambulacao(this.formulario.getRadioUtilizaCadeira().getText());
		
	
		
		if(this.formulario.getRadioRelativo().isSelected())
			this.prontuario.setCondRepouso(this.formulario.getRadioRelativo().getText());
		
		if(this.formulario.getRadioAbsoluto().isSelected())
			this.prontuario.setCondRepouso(this.formulario.getRadioAbsoluto().getText());	
	}
	
	
	
	
	
	
	
	

	@Override
	public void actionPerformed(ActionEvent event) {
		if(event.getSource().equals(this.formulario.getBTGravar())){
			FormToProntuario();
			this.controller = new ProntuarioController();
			this.controller.setProntuario(prontuario);
			this.controller.SalvarProntuario();
			this.formulario.dispose();
		}
		
		if(event.getSource().equals(this.formulario.getBTCancelar())){
			this.formulario.dispose();
		}
		
		if(event.getSource().equals(this.formulario.getBTPesquisar())){
			BuscarPacienteDialog dialog = new BuscarPacienteDialog();
			dialog.setLocationRelativeTo(this.formulario.getContentPane());
			dialog.setVisible(true);
			BuscarCliente(dialog.getListener().getCodigo());
		}
		
	}
	
	
	
	
	
	private void BuscarCliente(Long id){
		PacienteController controller = new PacienteController();
		this.paciente = controller.BuscarPelaID(id);
		
		this.formulario.getTCodigo().setText(String.valueOf(this.paciente.getId()));
		this.formulario.getTDataCad().setText(ConverteDadosUtil.RetornaDataAtual());
		this.formulario.getTPaciente().setText(this.paciente.getNome());
		this.formulario.getTRg().setText(this.paciente.getRg());
		this.formulario.getTCpf().setText(this.paciente.getCpf());
		
	}
	
	
	public void setProntuario(Prontuario prontuario) {
		this.prontuario = prontuario;
	}
	
	public Prontuario getProntuario() {
		return prontuario;
	}


	
	
}



















