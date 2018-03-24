package br.com.gsv.prontuario.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import br.com.gsv.prontuario.domain.Prontuario;
import br.com.gsv.prontuario.formularios.ProntuarioForm;
import br.com.projeto.gsv.controller.ProntuarioController;

public class ProntuarioListener implements ActionListener{
	private ProntuarioForm formulario;
	private Prontuario prontuario;
	private ProntuarioController controller;
	
	public ProntuarioListener(ProntuarioForm formulario) {
		this.formulario = formulario;
		this.prontuario = new Prontuario();
		
		AdicionaListener();
	}
	
	
	
	
	private void AdicionaListener(){
		this.formulario.getBTGravar().addActionListener(this);
		this.formulario.getBTCancelar().addActionListener(this);
	}
	
	
	private void FormToProntuario(){
		this.prontuario.setAnotConsciencia(this.formulario.getGrupoBotao1().getSelection().getActionCommand());
		this.prontuario.setAnotMental(this.formulario.getGrupoBotao2().getSelection().getActionCommand());
		this.prontuario.setAnotObservacao(this.formulario.getTextoAreaAnotacao().getText());
		this.prontuario.setCondDeambulacao(this.formulario.getGrupoBotao3().getSelection().getActionCommand());
		this.prontuario.setCondRepouso(this.formulario.getGrupoBotao3().getSelection().getActionCommand());
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

		
		
	/*	private Paciente paciente;
		private EquipamentoCheckBox equipCheckbox;
		private SintomasCheckbox sintomasEsp;
		private SintomasMembrosCheckbox sintomasMembros;
		*/
	}
	
	
	

	@Override
	public void actionPerformed(ActionEvent event) {
		if(event.getSource().equals(this.formulario.getBTGravar())){
			FormToProntuario();
			this.controller = new ProntuarioController();
			this.controller.setProntuario(prontuario);
			this.controller.SalvarProntuario();
		}
		
		if(event.getSource().equals(this.formulario.getBTCancelar())){
			this.formulario.dispose();
		}
		
	}
	
	
	
	
	
	
	public void setProntuario(Prontuario prontuario) {
		this.prontuario = prontuario;
	}
	
	public Prontuario getProntuario() {
		return prontuario;
	}
	
	
	
}



















