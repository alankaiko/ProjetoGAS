package br.com.gsv.prontuario.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JRootPane;
import javax.swing.KeyStroke;

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
		TeclaEsc();
		AdicionaListener();
		UsandoTAB();
	}
	
	
	
	
	private void AdicionaListener(){
		this.formulario.getBTGravar().addActionListener(this);
		this.formulario.getBTCancelar().addActionListener(this);
		this.formulario.getBTPesquisar().addActionListener(this);
	}
	
	
	public void InicializaObjetos(){
		this.prontuario = new Prontuario();
		this.equiCheckbox = new EquipamentoCheckBox();
	}
	
	
	
	
	/*------------------------------------------SALVA NOVO OBJETO------------------------------------------------*/
	/*-----------------------------------------------------------------------------------------------------------*/
	private void FormToProntuario(){
		this.prontuario.setData(ConverteDadosUtil.TransformandoEmDate(this.formulario.getTDataCad().getText()));
		this.prontuario.setHora(this.formulario.getTHora().getText());
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
	/*-----------------------------------------------------------------------------------------------------------*/
	/*-----------------------------------------------------------------------------------------------------------*/
	
	/*-----------------------------------------------------ALTERA OBJETO-----------------------------------------*/
	/*-----------------------------------------------------------------------------------------------------------*/
	public void PreencheCamposParaEdicao(){
		this.formulario.getTDataCad().setText(ConverteDadosUtil.TransformandoEmString(this.prontuario.getData()));
		this.formulario.getTHora().setText(this.prontuario.getHora());
		this.formulario.getTextoAreaAnotacao().setText(this.prontuario.getAnotObservacao());
		this.formulario.getTextoAreaDeam().setText(this.prontuario.getCondDeamObservacao());
		this.formulario.getTextoAreaSono().setText(this.prontuario.getCondSono());
		this.formulario.getTextoEquipamento().setText(this.prontuario.getEquipObservacao());
		this.formulario.getTHemorragia().setText(this.prontuario.getInteHemoText());
		this.formulario.getTDispneia().setText(this.prontuario.getInteDispText());
		this.formulario.getTEdema().setText(this.prontuario.getInteEdemaText());
		this.formulario.getTDEscamacao().setText(this.prontuario.getInteDescText());
		this.formulario.getTHematoma().setText(this.prontuario.getInteHemaText());
		this.formulario.getTCicatriz().setText(this.prontuario.getInteCicaText());
		this.formulario.getTOutrosInt().setText(this.prontuario.getInteOutrosText());
		this.formulario.getTextoSintomas().setText(this.prontuario.getSintomasEspText());
		this.formulario.getTextoMembros().setText(this.prontuario.getSintomasMembText());
		
		this.formulario.getTCodigo().setText(String.valueOf(this.prontuario.getPaciente().getId()));
		this.formulario.getTPaciente().setText(this.prontuario.getPaciente().getNome());
		this.formulario.getTRg().setText(this.prontuario.getPaciente().getRg());
		this.formulario.getTCpf().setText(this.prontuario.getPaciente().getCpf());
		this.formulario.getTDataNasc().setText(ConverteDadosUtil.TransformandoEmString(this.prontuario.getPaciente().getDataNasc()));
		
		
	}
	
	
	
	

	@Override
	public void actionPerformed(ActionEvent event) {
		if(event.getSource().equals(this.formulario.getBTGravar())){
			FormToProntuario();
			this.controller = new ProntuarioController();
			this.controller.setProntuario(prontuario);
			this.controller.SalvarProntuario();
			//this.formulario.dispose();
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
	
	
	private void UsandoTAB() {
		this.formulario.getRootPane().setDefaultButton(
				this.formulario.getBTGravar());
		this.formulario.getBTGravar().addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					formulario.getBTGravar().doClick();
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

	
	public void TeclaEsc() {
		JRootPane meurootpane = this.formulario.getRootPane();
		meurootpane.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), "ESCAPE");
		meurootpane.getRootPane().getActionMap().put("ESCAPE", new AbstractAction("ESCAPE") {
			public void actionPerformed(ActionEvent e) {
				formulario.dispose();
			}
		});
	}
	
	
	public void setProntuario(Prontuario prontuario) {
		this.prontuario = prontuario;
	}
	
	public Prontuario getProntuario() {
		return prontuario;
	}
	
	
}



















