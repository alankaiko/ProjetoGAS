package br.com.gsv.prontuario.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JRootPane;
import javax.swing.KeyStroke;

import br.com.gsv.domain.Funcionario;
import br.com.gsv.domain.Paciente;
import br.com.gsv.domain.Prontuario;
import br.com.gsv.domain.sub.EquipamentoCheckBox;
import br.com.gsv.domain.sub.IntegridadeHemorragia;
import br.com.gsv.domain.sub.SintomasCheckbox;
import br.com.gsv.domain.sub.SintomasMembrosCheckbox;
import br.com.gsv.formularios.BuscarFuncionarioDialog;
import br.com.gsv.formularios.BuscarPacienteDialog;
import br.com.gsv.prontuario.formularios.ProntuarioForm;
import br.com.gsv.util.ConverteDadosUtil;
import br.com.projeto.gsv.controller.FuncionarioController;
import br.com.projeto.gsv.controller.PacienteController;
import br.com.projeto.gsv.controller.ProntuarioController;

public class ProntuarioListener implements ActionListener{
	private ProntuarioForm formulario;
	private Prontuario prontuario;
	private ProntuarioController controller;
	private Paciente paciente;
	private Funcionario funcionario;
	private EquipamentoCheckBox equiCheckbox;
	private IntegridadeHemorragia integCheckbox;
	private SintomasCheckbox sintCheckbox;
	private SintomasMembrosCheckbox sintMenCheckbox;

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
		this.formulario.getBTPesquiFuncionario().addActionListener(this);
	}
	
	
	public void InicializaObjetos(){
		this.prontuario = new Prontuario();
		this.equiCheckbox = new EquipamentoCheckBox();
		this.integCheckbox = new IntegridadeHemorragia();
		this.sintCheckbox = new SintomasCheckbox();
		this.sintMenCheckbox = new SintomasMembrosCheckbox();
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
		this.prontuario.setTextoAreachegada(this.formulario.getTextoAreaChegada().getText());
		this.prontuario.setAvaliCefaloTexto(this.formulario.getTextoAreaAvaliacaoCef().getText());
		this.prontuario.setAvaliIntercorrencias(this.formulario.getTextoAreaAvaliacaoInt().getText());
		
		
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
		
		if(this.formulario.getRadioConscOutros().isSelected())
			this.prontuario.setAnotConsciencia(this.formulario.getRadioConscOutros().getText());
		
		
		
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
		
		if(this.formulario.getRadioMenOutros().isSelected())
			this.prontuario.setAnotMental(this.formulario.getRadioMenOutros().getText());
		
		
		
		if(this.formulario.getRadioDeambulante().isSelected())
			this.prontuario.setCondDeambulacao(this.formulario.getRadioDeambulante().getText());
		
		if(this.formulario.getRadioUtilizaCadeira().isSelected())
			this.prontuario.setCondDeambulacao(this.formulario.getRadioUtilizaCadeira().getText());
		
		if(this.formulario.getRadioVerbaliza().isSelected())
			this.prontuario.setCondDeambulacao(this.formulario.getRadioVerbaliza().getText());
		
	
		
		if(this.formulario.getRadioRelativo().isSelected())
			this.prontuario.setCondRepouso(this.formulario.getRadioRelativo().getText());
		
		if(this.formulario.getRadioAbsoluto().isSelected())
			this.prontuario.setCondRepouso(this.formulario.getRadioAbsoluto().getText());	
		
		
		
		
		
		if(this.formulario.getRadioNeurologico().isSelected())
			this.prontuario.setAvaliCefaloMental(this.formulario.getRadioNeurologico().getText());
		
		if(this.formulario.getRadioRespiratorio().isSelected())
			this.prontuario.setAvaliCefaloMental(this.formulario.getRadioRespiratorio().getText());
		
		if(this.formulario.getRadioTegumentar().isSelected())
			this.prontuario.setAvaliCefaloMental(this.formulario.getRadioTegumentar().getText());
		
		if(this.formulario.getRadioGastrintestinal().isSelected())
			this.prontuario.setAvaliCefaloMental(this.formulario.getRadioGastrintestinal().getText());
		
		if(this.formulario.getRadioGenito().isSelected())
			this.prontuario.setAvaliCefaloMental(this.formulario.getRadioGenito().getText());
		
		if(this.formulario.getRadioCardiologico().isSelected())
			this.prontuario.setAvaliCefaloMental(this.formulario.getRadioCardiologico().getText());
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
		
		
		
		if(this.formulario.getCheckHemorragia().isSelected())
			this.integCheckbox.setCheckHemorragia(this.formulario.getCheckHemorragia().getText());
		
		if(this.formulario.getCheckDispneia().isSelected())
			this.integCheckbox.setCheckDispneia(this.formulario.getCheckDispneia().getText());
		
		if(this.formulario.getCheckEdema().isSelected())
			this.integCheckbox.setCheckEdema(this.formulario.getCheckEdema().getText());
		
		if(this.formulario.getCheckDescamacao().isSelected())
			this.integCheckbox.setCheckDescamacao(this.formulario.getCheckDescamacao().getText());
		
		if(this.formulario.getCheckHematoma().isSelected())
			this.integCheckbox.setCheckHematoma(this.formulario.getCheckHematoma().getText());
		
		if(this.formulario.getCheckCicatriz().isSelected())
			this.integCheckbox.setCheckCicatriz(this.formulario.getCheckCicatriz().getText());
		
		if(this.formulario.getCheckOutroInt().isSelected())
			this.integCheckbox.setCheckOutroInt(this.formulario.getCheckOutroInt().getText());
		
		this.prontuario.setIntegHemorragia(this.integCheckbox);
		
		
		
		if(this.formulario.getCheckNauseas().isSelected())
			this.sintCheckbox.setCheckNauseas(this.formulario.getCheckNauseas().getText());
		
		if(this.formulario.getCheckMalEstar().isSelected())
			this.sintCheckbox.setCheckMalEstar(this.formulario.getCheckMalEstar().getText());
		
		if(this.formulario.getCheckInsonia().isSelected())
			this.sintCheckbox.setCheckInsonia(this.formulario.getCheckInsonia().getText());
		
		if(this.formulario.getCheckPrurido().isSelected())
			this.sintCheckbox.setCheckPrurido(this.formulario.getCheckPrurido().getText());
		
		this.prontuario.setSintomasEsp(this.sintCheckbox);
		
		
		
		
		if(this.formulario.getCheckColoracao().isSelected())
			this.sintMenCheckbox.setCheckColoracao(this.formulario.getCheckColoracao().getText());
		
		if(this.formulario.getCheckPerfusao().isSelected())
			this.sintMenCheckbox.setCheckPerfusao(this.formulario.getCheckPerfusao().getText());
		
		if(this.formulario.getLPulso().isSelected())
			this.sintMenCheckbox.setLPulso(this.formulario.getLPulso().getText());

		this.prontuario.setSintomasMembros(this.sintMenCheckbox);
		
	

	}
	/*-----------------------------------------------------------------------------------------------------------*/
	/*-----------------------------------------------------------------------------------------------------------*/
	
	
	
	
	
	/*-----------------------------------------------------ALTERA OBJETO-----------------------------------------*/
	/*-----------------------------------------------------------------------------------------------------------*/
	public void PreencheCamposParaEdicao(){
		this.paciente = this.prontuario.getPaciente();
		this.funcionario = this.prontuario.getFuncionario();
		this.equiCheckbox = this.prontuario.getEquipCheckbox();
		this.sintCheckbox = this.prontuario.getSintomasEsp();
		this.sintMenCheckbox = this.prontuario.getSintomasMembros();
		this.integCheckbox = this.prontuario.getIntegHemorragia();
		
		
		SetarRadioButtons();
		SetarCheckBoxes();
		this.equiCheckbox = new EquipamentoCheckBox();
		this.integCheckbox = new IntegridadeHemorragia();
		this.sintCheckbox = new SintomasCheckbox();
		this.sintMenCheckbox = new SintomasMembrosCheckbox();
		
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
		this.formulario.getTextoAreaChegada().setText(this.prontuario.getTextoAreachegada());
		this.formulario.getTextoAreaAvaliacaoCef().setText(this.prontuario.getAvaliCefaloTexto());
		this.formulario.getTextoAreaAvaliacaoInt().setText(this.prontuario.getAvaliIntercorrencias());
		
		this.formulario.getTCodigo().setText(String.valueOf(this.prontuario.getPaciente().getId()));
		this.formulario.getTPaciente().setText(this.prontuario.getPaciente().getNome());
		this.formulario.getTRg().setText(this.prontuario.getPaciente().getRg());
		this.formulario.getTCpf().setText(this.prontuario.getPaciente().getCpf());
		this.formulario.getTDataNasc().setText(ConverteDadosUtil.TransformandoEmString(this.prontuario.getPaciente().getDataNasc()));
		
		this.formulario.getTAtendCodigo().setText(String.valueOf(this.prontuario.getFuncionario().getId()));
		this.formulario.getTAtendFuncionario().setText(this.prontuario.getFuncionario().getNome());
		this.formulario.getTAtendRegistro().setText(ConcatenarRegistro());
	}
	
	private void SetarRadioButtons(){
		if(this.prontuario.getAnotConsciencia().equals(this.formulario.getRadioNivNormal().getText()))
			this.formulario.getRadioNivNormal().setSelected(true);
		
		if(this.prontuario.getAnotConsciencia().equals(this.formulario.getRadioAlerta().getText()))
			this.formulario.getRadioAlerta().setSelected(true);
		
		if(this.prontuario.getAnotConsciencia().equals(this.formulario.getRadioLetargico().getText()))
			this.formulario.getRadioLetargico().setSelected(true);
		
		if(this.prontuario.getAnotConsciencia().equals(this.formulario.getRadioObnubilado().getText()))
			this.formulario.getRadioObnubilado().setSelected(true);
		
		if(this.prontuario.getAnotConsciencia().equals(this.formulario.getRadioTorporoso().getText()))
			this.formulario.getRadioTorporoso().setSelected(true);
		
		if(this.prontuario.getAnotConsciencia().equals(this.formulario.getRadioComatoso().getText()))
			this.formulario.getRadioComatoso().setSelected(true);
		
		if(this.prontuario.getAnotConsciencia().equals(this.formulario.getRadioConscOutros().getText()))
			this.formulario.getRadioConscOutros().setSelected(true);
	
		
		
		
		if(this.prontuario.getAnotMental().equals(this.formulario.getRadioEstNormal().getText()))
			this.formulario.getRadioEstNormal().setSelected(true);
		
		if(this.prontuario.getAnotMental().equals(this.formulario.getRadioCalmo().getText()))
			this.formulario.getRadioCalmo().setSelected(true);
		
		if(this.prontuario.getAnotMental().equals(this.formulario.getRadioApatico().getText()))
			this.formulario.getRadioApatico().setSelected(true);
		
		if(this.prontuario.getAnotMental().equals(this.formulario.getRadioAlegre().getText()))
			this.formulario.getRadioAlegre().setSelected(true);
		
		if(this.prontuario.getAnotMental().equals(this.formulario.getRadioTriste().getText()))
			this.formulario.getRadioTriste().setSelected(true);
		
		if(this.prontuario.getAnotMental().equals(this.formulario.getRadioAgitado().getText()))
			this.formulario.getRadioAgitado().setSelected(true);
		
		if(this.prontuario.getAnotMental().equals(this.formulario.getRadioMenOutros().getText()))
			this.formulario.getRadioMenOutros().setSelected(true);
		
		
		
		if(this.prontuario.getCondDeambulacao().equals(this.formulario.getRadioDeambulante().getText()))
			this.formulario.getRadioDeambulante().setSelected(true);
		
		if(this.prontuario.getCondDeambulacao().equals(this.formulario.getRadioUtilizaCadeira().getText()))
			this.formulario.getRadioUtilizaCadeira().setSelected(true);
		
		if(this.prontuario.getCondDeambulacao().equals(this.formulario.getRadioVerbaliza().getText()))
			this.formulario.getRadioVerbaliza().setSelected(true);
	
	
		
		if(this.prontuario.getCondRepouso().equals(this.formulario.getRadioRelativo().getText()))
			this.formulario.getRadioRelativo().setSelected(true);
		
		if(this.prontuario.getCondRepouso().equals(this.formulario.getRadioAbsoluto().getText()))
			this.formulario.getRadioAbsoluto().setSelected(true);
		
		
		
		if(this.prontuario.getAvaliCefaloMental().equals(this.formulario.getRadioNeurologico().getText()))
			this.formulario.getRadioNeurologico().setSelected(true);
		
		if(this.prontuario.getAvaliCefaloMental().equals(this.formulario.getRadioRespiratorio().getText()))
			this.formulario.getRadioRespiratorio().setSelected(true);
		
		if(this.prontuario.getAvaliCefaloMental().equals(this.formulario.getRadioTegumentar().getText()))
			this.formulario.getRadioTegumentar().setSelected(true);
		
		if(this.prontuario.getAvaliCefaloMental().equals(this.formulario.getRadioGastrintestinal().getText()))
			this.formulario.getRadioGastrintestinal().setSelected(true);
		
		if(this.prontuario.getAvaliCefaloMental().equals(this.formulario.getRadioGenito().getText()))
			this.formulario.getRadioGenito().setSelected(true);
		
		if(this.prontuario.getAvaliCefaloMental().equals(this.formulario.getRadioCardiologico().getText()))
			this.formulario.getRadioCardiologico().setSelected(true);
	}
	
	private void SetarCheckBoxes(){
		if(this.prontuario.getEquipCheckbox().getCheckCateter().equals(this.formulario.getCheckCateter().getText()))
			this.formulario.getCheckCateter().setSelected(true);
		
		if(this.prontuario.getEquipCheckbox().getCheckSonda().equals(this.formulario.getCheckSonda().getText()))
			this.formulario.getCheckSonda().setSelected(true);
		
		if(this.prontuario.getEquipCheckbox().getCheckUripen().equals(this.formulario.getCheckUripen().getText()))
			this.formulario.getCheckUripen().setSelected(true);
		
		if(this.prontuario.getEquipCheckbox().getCheckDreno().equals(this.formulario.getCheckDreno().getText()))
			this.formulario.getCheckDreno().setSelected(true);

		if(this.prontuario.getEquipCheckbox().getCheckCurativos().equals(this.formulario.getCheckCurativos().getText()))
			this.formulario.getCheckCurativos().setSelected(true);

		if(this.prontuario.getEquipCheckbox().getCheckVenoclise().equals(this.formulario.getCheckVenoclise().getText()))
			this.formulario.getCheckVenoclise().setSelected(true);

		if(this.prontuario.getEquipCheckbox().getCheckOutros().equals(this.formulario.getCheckOutros().getText()))
			this.formulario.getCheckOutros().setSelected(true);
	
			
		
		if(this.prontuario.getIntegHemorragia().getCheckHemorragia().equals(this.formulario.getCheckHemorragia().getText()))
			this.formulario.getCheckHemorragia().setSelected(true);
		
		if(this.prontuario.getIntegHemorragia().getCheckDispneia().equals(this.formulario.getCheckDispneia().getText()))
			this.formulario.getCheckDispneia().setSelected(true);

		if(this.prontuario.getIntegHemorragia().getCheckEdema().equals(this.formulario.getCheckEdema().getText()))
			this.formulario.getCheckEdema().setSelected(true);
		
		if(this.prontuario.getIntegHemorragia().getCheckDescamacao().equals(this.formulario.getCheckDescamacao().getText()))
			this.formulario.getCheckDescamacao().setSelected(true);

		if(this.prontuario.getIntegHemorragia().getCheckHematoma().equals(this.formulario.getCheckHematoma().getText()))
			this.formulario.getCheckHematoma().setSelected(true);
		
		if(this.prontuario.getIntegHemorragia().getCheckCicatriz().equals(this.formulario.getCheckCicatriz().getText()))
			this.formulario.getCheckCicatriz().setSelected(true);
		
		if(this.prontuario.getIntegHemorragia().getCheckOutroInt().equals(this.formulario.getCheckOutroInt().getText()))
			this.formulario.getCheckOutroInt().setSelected(true);
	
	
		
		if(this.prontuario.getSintomasEsp().getCheckNauseas().equals(this.formulario.getCheckNauseas().getText()))
			this.formulario.getCheckNauseas().setSelected(true);
		
		if(this.prontuario.getSintomasEsp().getCheckMalEstar().equals(this.formulario.getCheckMalEstar().getText()))
			this.formulario.getCheckMalEstar().setSelected(true);
		
		if(this.prontuario.getSintomasEsp().getCheckInsonia().equals(this.formulario.getCheckInsonia().getText()))
			this.formulario.getCheckInsonia().setSelected(true);
		
		if(this.prontuario.getSintomasEsp().getCheckPrurido().equals(this.formulario.getCheckPrurido().getText()))
			this.formulario.getCheckPrurido().setSelected(true);
		
	
		
		if(this.prontuario.getSintomasMembros().getCheckColoracao().equals(this.formulario.getCheckColoracao().getText()))
			this.formulario.getCheckColoracao().setSelected(true);
		
		if(this.prontuario.getSintomasMembros().getCheckPerfusao().equals(this.formulario.getCheckPerfusao().getText()))
			this.formulario.getCheckPerfusao().setSelected(true);
	
		if(this.prontuario.getSintomasMembros().getLPulso().equals(this.formulario.getLPulso().getText()))
			this.formulario.getLPulso().setSelected(true);	

	}
	/*-----------------------------------------------------------------------------------------------------------*/
	/*-----------------------------------------------------------------------------------------------------------*/
	

	@Override
	public void actionPerformed(ActionEvent event) {
		if(event.getSource().equals(this.formulario.getBTGravar())){
			FormToProntuario();
			
			PegarRadioButtons();
			PegarCheckboxes();
			
			this.prontuario.setPaciente(this.paciente);
			this.prontuario.setFuncionario(this.funcionario);
			
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
			
			if(dialog.getListener().getCodigo() != null)
				BuscarCliente(dialog.getListener().getCodigo());
		}
		
		if(event.getSource().equals(this.formulario.getBTPesquiFuncionario())){
			BuscarFuncionarioDialog dialog = new BuscarFuncionarioDialog();
			dialog.setLocationRelativeTo(this.formulario.getContentPane());
			dialog.setVisible(true);
			
			if(dialog.getListener().getCodigo() != null){
				BuscarFuncionario(dialog.getListener().getCodigo());
			}
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
	
	private void BuscarFuncionario(Long id){
		FuncionarioController controller = new FuncionarioController();
		this.funcionario = controller.BuscarPelaID(id);	
		this.formulario.getTAtendCodigo().setText(String.valueOf(this.funcionario.getId()));
		this.formulario.getTAtendFuncionario().setText(this.funcionario.getNome());
		this.formulario.getTAtendRegistro().setText(ConcatenarRegistro());
	}
	
	private String ConcatenarRegistro(){
		String concatena = this.funcionario.getRegistroCoren().getCoren()
				+" "
				+this.funcionario.getRegistroCoren().getInscricao()
				+" "
				+this.funcionario.getRegistroCoren().getUf();
		
		return concatena;
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



















