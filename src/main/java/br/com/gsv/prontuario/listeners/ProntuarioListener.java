package br.com.gsv.prontuario.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import br.com.gsv.paciente.domain.Paciente;
import br.com.gsv.paciente.formularios.BuscarPacienteDialog;
import br.com.gsv.prontuario.domain.EquipamentoCheckBox;
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
	private EquipamentoCheckBox equiCheckbox;

	public ProntuarioListener(ProntuarioForm formulario) {
		this.formulario = formulario;
		this.prontuario = new Prontuario();
		this.equiCheckbox = new EquipamentoCheckBox();
		
		AdicionaListener();
	}
	
	
	
	
	private void AdicionaListener(){
		this.formulario.getBTGravar().addActionListener(this);
		this.formulario.getBTCancelar().addActionListener(this);
		this.formulario.getBTPesquisar().addActionListener(this);
	}
	
	
	private void FormToProntuario(){
		this.prontuario.setAnotObservacao(this.formulario.getTextoAreaAnotacao().getText());
		this.prontuario.setCondDeamObservacao(this.formulario.getTextoAreaDeam().getText());
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
		this.prontuario.setSintomasMembText(this.formulario.getTextoMembros().getText());	
		PegarRadioButtons();
		PegarCheckboxes();
		this.prontuario.setPaciente(this.paciente);
		
	/*	private Paciente paciente;
		private EquipamentoCheckBox equipCheckbox;
		private SintomasCheckbox sintomasEsp;
		private SintomasMembrosCheckbox sintomasMembros;
		*/
	}
	
	private void PegarRadioButtons(){
		if(this.formulario.getRadioNivNormal().isSelected())
			this.prontuario.setAnotConsciencia(this.formulario.getRadioNivNormal().getText());
		
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
		
		
		if(this.formulario.getRadioEstNormal().isSelected())
			this.prontuario.setAnotMental(this.formulario.getRadioEstNormal().getText());
		
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
	
	private void PegarCheckboxes(){
		if(this.formulario.getCheckCateter().isSelected())
			this.equiCheckbox.setCheckCateter(this.formulario.getCheckCateter().getText());
		
		if(this.formulario.getCheckSonda().isSelected())
			this.equiCheckbox.setCheckSonda(this.formulario.getCheckSonda().getText());
		
		if(this.formulario.getCheckUripen().isSelected())
			this.equiCheckbox.setCheckUripen(this.formulario.getCheckUripen().getText());
		
		if(this.formulario.getCheckDreno().isSelected())
			this.equiCheckbox.setCheckDreno(this.formulario.getCheckDreno().getText());
		
		if(this.formulario.getCheckCurativos().isSelected())
			this.equiCheckbox.setCheckCurativos(this.formulario.getCheckCurativos().getText());
		
		if(this.formulario.getCheckVenoclise().isSelected())
			this.equiCheckbox.setCheckVenoclise(this.formulario.getCheckVenoclise().getText());
		
		if(this.formulario.getCheckOutros().isSelected())
			this.equiCheckbox.setCheckOutros(this.formulario.getCheckOutros().getText());
		
		this.prontuario.setEquipCheckbox(this.equiCheckbox);
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
		this.formulario.getTHora().setText(ConverteDadosUtil.RetornaHoraAtual());
		this.formulario.getTPaciente().setText(this.paciente.getNome());
		this.formulario.getTRg().setText(this.paciente.getRg());
		this.formulario.getJCpf().setText(this.paciente.getCpf());
		this.formulario.getTCpf().setText(this.formulario.getJCpf().getText());
		this.formulario.getJDatanascimento().setText(ConverteDadosUtil.TransformandoEmString(this.paciente.getDataNasc()));
		this.formulario.getTDataNasc().setText(this.formulario.getJDatanascimento().getText());
		
	}
	
	
	public void setProntuario(Prontuario prontuario) {
		this.prontuario = prontuario;
	}
	
	public Prontuario getProntuario() {
		return prontuario;
	}


	
	
}



















