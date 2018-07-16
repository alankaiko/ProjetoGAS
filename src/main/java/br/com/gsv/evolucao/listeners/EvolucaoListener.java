package br.com.gsv.evolucao.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JRootPane;
import javax.swing.KeyStroke;

import br.com.gsv.domain.Evolucao;
import br.com.gsv.domain.Funcionario;
import br.com.gsv.domain.Paciente;
import br.com.gsv.domain.sub.EnumEvolucaoEstGeral;
import br.com.gsv.domain.sub.EnumEvolucaoNivOrientacao;
import br.com.gsv.domain.sub.EnumEvolucaoNivelConsciencia;
import br.com.gsv.domain.sub.EnumEvolucaoPressao;
import br.com.gsv.domain.sub.EnumEvolucaoPulso;
import br.com.gsv.domain.sub.EnumEvolucaoTemperatura;
import br.com.gsv.evolucao.formulario.EvolucaoFormulario;
import br.com.gsv.util.ConverteDadosUtil;
import br.com.projeto.gsv.controller.EvolucaoController;

public class EvolucaoListener implements ActionListener{
	private EvolucaoFormulario formulario;
	private Evolucao evolucao;
	private Paciente paciente;
	private Funcionario funcionario;
	private EvolucaoController controller;
	
	public EvolucaoListener(EvolucaoFormulario formulario) {
		this.formulario = formulario;
		AdicionaListener();
		IniciaObjetos();
		UsandoTAB();
		TeclaEsc();
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
		this.evolucao.setTemperatura(this.formulario.getTTemperatura().getText());
		this.evolucao.setPressao(this.formulario.getTPressao().getText());
		this.evolucao.setPulso(this.formulario.getTPulso().getText());
		this.evolucao.setData(ConverteDadosUtil.TransformandoEmDate(this.formulario.getJData().getText()));
		this.evolucao.setTempoInternacao(this.formulario.getTTempo().getText());
		this.evolucao.setTextoDiagnostico(this.formulario.getTdiagnostico().getText());
		this.evolucao.setTextoItensRelacionados(this.formulario.getTextoItensRelacionados().getText());
		this.evolucao.setTextoSonda(this.formulario.getTextoSondas().getText());
		this.evolucao.setTextoCurativo(this.formulario.getTextoCurativo().getText());
		this.evolucao.setQueixaPaciente(this.formulario.getTQueixaPac().getText());
		
		this.evolucao.setPaciente(this.paciente);
		this.evolucao.setFuncionario(this.funcionario);
		PegarRadioButtons();
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
	@SuppressWarnings("static-access")
	public void EditToEvolucao(){		
		this.funcionario = this.evolucao.getFuncionario();
		this.paciente = this.evolucao.getPaciente();
		
		this.formulario.getComboEstGeral().setSelectedItem(this.evolucao.getEnumEstadoGeral().values());
		this.formulario.getComboNivConsciencia().setSelectedItem(this.evolucao.getEnumNivelConsciencia().values());
		this.formulario.getComboNivOrientacao().setSelectedItem(this.evolucao.getEnumNivelOrientacao().values());
		this.formulario.getComboTemperatura().setSelectedItem(this.evolucao.getEnumTemperatura().values());
		this.formulario.getComboPressao().setSelectedItem(this.evolucao.getEnumPressao().values());
		this.formulario.getComboPulso().setSelectedItem(this.evolucao.getEnumPulso().values());
		this.formulario.getTTemperatura().setText(this.evolucao.getTemperatura());
		this.formulario.getTPressao().setText(this.evolucao.getPressao());
		this.formulario.getTPulso().setText(this.evolucao.getPulso());
		this.formulario.getJData().setText(ConverteDadosUtil.TransformandoEmString(this.evolucao.getData()));
		this.formulario.getTTempo().setText(this.evolucao.getTempoInternacao());
		this.formulario.getTdiagnostico().setText(this.evolucao.getTextoDiagnostico());
		this.formulario.getTextoItensRelacionados().setText(this.evolucao.getTextoItensRelacionados());
		this.formulario.getTextoSondas().setText(this.evolucao.getTextoSonda());
		this.formulario.getTextoCurativo().setText(this.evolucao.getTextoCurativo());
		this.formulario.getTQueixaPac().setText(this.evolucao.getQueixaPaciente());
		this.formulario.getComboEstGeral().setSelectedItem(this.evolucao.getEnumEstadoGeral());
		this.formulario.getComboNivConsciencia().setSelectedItem(this.evolucao.getEnumNivelConsciencia());
		this.formulario.getComboNivOrientacao().setSelectedItem(this.evolucao.getEnumNivelOrientacao());
		this.formulario.getComboPulso().setSelectedItem(this.evolucao.getEnumPulso());
		this.formulario.getComboPressao().setSelectedItem(this.evolucao.getEnumPressao());
		this.formulario.getComboTemperatura().setSelectedItem(this.evolucao.getEnumTemperatura());
		
		this.formulario.getTIdPaciente().setText(""+this.evolucao.getPaciente().getId());
		this.formulario.getTNomePaciente().setText(this.evolucao.getPaciente().getNome());
		
		this.formulario.getTCodigo().setText(""+this.evolucao.getFuncionario().getId());
		this.formulario.getTNome().setText(this.evolucao.getFuncionario().getNome());
		this.formulario.getTRegistro().setText(ConcatenaRegistro());
		
		SetarRadioButtons();
	}
	
	
	private void SetarRadioButtons(){
		if(this.evolucao.getRadioRespiracao().equals(this.formulario.getRadioEntubado().getText())){
			this.formulario.getRadioEntubado().setSelected(true);
		}
			
		if(this.evolucao.getRadioRespiracao().equals(this.formulario.getRadioEspontaneo().getText())){
			this.formulario.getRadioEspontaneo().setSelected(true);
		}
			
		if(this.evolucao.getRadioRespiracao().equals(this.formulario.getRadioOxigenio().getText())){
			this.formulario.getRadioOxigenio().setSelected(true);
		}
			
		if(this.evolucao.getRadioRespiracao().equals(this.formulario.getRadioTraquostomia().getText())){
			this.formulario.getRadioTraquostomia().setSelected(true);
		}

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
		
		controller = new EvolucaoController();
		controller.setEvolucao(this.evolucao);
		controller.Salvar();
		this.formulario.dispose();
	}
	
	private boolean Validando(){
		//return ValidaCampos.Validar(this.formulario.gett)
				//&& ValidaCampos.Validar(this.formulario.getTFuncionario().getText());
		return true;
	}
	
	public void InserirDadosPaciente(){
		this.formulario.getTNomePaciente().setText(this.paciente.getNome());
		this.formulario.getTIdPaciente().setText(""+this.paciente.getId());
		
		this.formulario.getTCodigo().setText(""+this.funcionario.getId());
		this.formulario.getTNome().setText(this.funcionario.getNome());
		this.formulario.getTRegistro().setText(ConcatenaRegistro());
	}
	
	private String ConcatenaRegistro(){
		return this.funcionario.getRegistroCoren().getCoren()
				+" "+this.funcionario.getRegistroCoren().getInscricao()
				+" "+this.funcionario.getRegistroCoren().getUf();
	}

	private void UsandoTAB(){
		this.formulario.getRootPane().setDefaultButton(this.formulario.getBGravar());
		this.formulario.getBGravar().addKeyListener(new KeyAdapter() {  
            public void keyPressed(KeyEvent e) {  
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {  
                	formulario.getBGravar().doClick();
                }  
            }  
        });
		
		
		
		this.formulario.getBVoltar().addKeyListener(new KeyAdapter() {  
            public void keyPressed(KeyEvent e) {  
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {  
                	formulario.getBVoltar().doClick();  
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
	
	
	public Evolucao getEvolucao() {
		return evolucao;
	}
	
	public void setEvolucao(Evolucao evolucao) {
		this.evolucao = evolucao;
	}
	
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	
	public Funcionario getFuncionario() {
		return funcionario;
	}
	
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
}





















