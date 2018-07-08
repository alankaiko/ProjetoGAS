package br.com.gsv.evolucao.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import br.com.gsv.domain.Evolucao;
import br.com.gsv.domain.sub.EnumEvolucaoEstGeral;
import br.com.gsv.domain.sub.EnumEvolucaoNivOrientacao;
import br.com.gsv.domain.sub.EnumEvolucaoNivelConsciencia;
import br.com.gsv.domain.sub.EnumEvolucaoPressao;
import br.com.gsv.domain.sub.EnumEvolucaoPulso;
import br.com.gsv.domain.sub.EnumEvolucaoTemperatura;
import br.com.gsv.evolucao.formulario.EvolucaoFormulario;
import br.com.gsv.util.ConverteDadosUtil;
import br.com.gsv.util.ValidaCampos;
import br.com.projeto.gsv.controller.AgendaController;

public class EvolucaoListener implements ActionListener{
	private EvolucaoFormulario formulario;
	private Evolucao evolucao;
	
	public EvolucaoListener(EvolucaoFormulario formulario) {
		this.formulario = formulario;
		AdicionaListener();
	}
	
	public void IniciaObjetos(){
		this.evolucao = new Evolucao();
	}
	
	private void AdicionaListener(){
		this.formulario.getBVoltar().addActionListener(this);
		this.formulario.getBGravar().addActionListener(this);
	}
	
	/*-------------------------------------------------GRAVAR OBJETO------------------------------------------------*/
	public void FormToEvolucao(){
		this.evolucao.setEnumEstadoGeral((EnumEvolucaoEstGeral) this.formulario.getComboEstGeral().getSelectedItem());
		this.evolucao.setEnumNivelConsciencia((EnumEvolucaoNivelConsciencia) this.formulario.getComboNivConsciencia().getSelectedItem());
		this.evolucao.setEnumNivelOrientacao((EnumEvolucaoNivOrientacao) this.formulario.getComboNivOrientacao().getSelectedItem());
		this.evolucao.setEnumTemperatura((EnumEvolucaoTemperatura) this.formulario.getComboTemperatura().getSelectedItem());
		this.evolucao.setEnumPressao((EnumEvolucaoPressao) this.formulario.getComboPressao().getSelectedItem());
		this.evolucao.setEnumPulso((EnumEvolucaoPulso) this.formulario.getComboPulso().getSelectedItem());
		this.evolucao.setQueixaPaciente(this.formulario.getTQueixaPaciente().getText());
		this.evolucao.setTemperatura(this.formulario.getTTemperatura().getText());
		this.evolucao.setPressao(this.formulario.getTPressao().getText());
		this.evolucao.setPulso(this.formulario.getTPulso().getText());
		this.evolucao.setData(ConverteDadosUtil.TransformandoEmDate(this.formulario.getJData().getText()));
	}
	
	private void PegarRadioButtons(){
		if(this.formulario.getRadioEntubado().isSelected())
			this.evolucao.setRadioRespiracao(this.formulario.getRadioEntubado().getText());
		
		if(this.formulario.getRadioEspontaneo().isSelected())
			this.evolucao.setRadioRespiracao(this.formulario.getRadioEspontaneo().getText());
			
		if(this.formulario.getRadioOxigenio().isSelected())
			this.evolucao.setRadioRespiracao(this.formulario.getRadioOxigenio().getText());
			
		if(this.formulario.getRadioTraquostomia().isSelected())
			this.evolucao.setRadioRespiracao(this.formulario.getRadioTraquostomia().getText());
	}
	
	
	/*-------------------------------------------------ALTERAR OBJETO------------------------------------------------*/
	public void EditToEvolucao(){
		this.formulario.getComboEstGeral().setSelectedItem(this.evolucao.getEnumEstadoGeral().values());
		this.formulario.getComboNivConsciencia().setSelectedItem(this.evolucao.getEnumNivelConsciencia().values());
		this.formulario.getComboNivOrientacao().setSelectedItem(this.evolucao.getEnumNivelOrientacao().values());
		this.formulario.getComboTemperatura().setSelectedItem(this.evolucao.getEnumTemperatura().values());
		this.formulario.getComboPressao().setSelectedItem(this.evolucao.getEnumPressao().values());
		this.formulario.getComboPulso().setSelectedItem(this.evolucao.getEnumPulso().values());
		this.formulario.getTQueixaPaciente().setText(this.evolucao.getQueixaPaciente());
		this.formulario.getTTemperatura().setText(this.evolucao.getTemperatura());
		this.formulario.getTPressao().setText(this.evolucao.getPressao());
		this.formulario.getTPulso().setText(this.evolucao.getPulso());
		this.formulario.getJData().setText(ConverteDadosUtil.TransformandoEmString(this.evolucao.getData()));
	}
	
	
	

	@Override
	public void actionPerformed(ActionEvent event) {
		if(event.getSource().equals(this.formulario.getBGravar()) && Validando()){
			BotaoSalvando();
		}else if(event.getSource().equals(this.formulario.getBVoltar())){
			this.formulario.dispose();
		}
	}
	
	
	private void BotaoSalvando(){
		FormToEvolucao();
		
		/*controller = new AgendaController();
		controller.setAgenda(agenda);
		controller.SalvarAgenda();
		*/
		this.formulario.dispose();
	}
	
	private boolean Validando(){
		//return ValidaCampos.Validar(this.formulario.gett)
				//&& ValidaCampos.Validar(this.formulario.getTFuncionario().getText());
		return true;
	}
	
	
	
	public Evolucao getEvolucao() {
		return evolucao;
	}
	
	public void setEvolucao(Evolucao evolucao) {
		this.evolucao = evolucao;
	}
	
}





















