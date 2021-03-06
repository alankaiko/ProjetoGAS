package br.com.gsv.prontuario.formularios;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import br.com.gsv.prontuario.listeners.GerenciarProntuarioListener;

import com.toedter.calendar.JDateChooser;

public class GerenciaProntuarios extends JDialog {
	private JLabel LGerenciar;
	private JPanel panel = new JPanel();
	private JDateChooser dataFiltrar;
	private JButton BFiltrar, BCancelar, BAgendar, 	BModificar,BExcluir, BPesquisar, BGerar;
	private JScrollPane scrollPane;
	private JTable table;
	private GerenciarProntuarioListener listener;

	public GerenciaProntuarios() {
		CriaTela();
		IniciaCompomentes();
		AdicionaComponentes();
		listener = new GerenciarProntuarioListener(this);
	}

	private void CriaTela() {
		setBounds(100, 100, 650, 460);
		getContentPane().setLayout(null);

		panel.setBounds(0, 0, 634, 422);
		getContentPane().add(panel);
		panel.setLayout(null);
		setModal(true);
		setResizable(false);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 72, 614, 303);
		panel.add(scrollPane);
		table = new JTable();
	}

	private void IniciaCompomentes() {
		LGerenciar = new JLabel("Gerenciar Prontuários");
		LGerenciar.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		LGerenciar.setBounds(10, 11, 162, 14);
		
		BPesquisar = new JButton("Pesquisar");
		BPesquisar.setBounds(118, 386, 96, 23);

		BAgendar = new JButton("Agendar");
		BAgendar.setBounds(222, 386, 89, 23);

		BCancelar = new JButton("Cancelar");
		BCancelar.setBounds(535, 386, 89, 23);

		BFiltrar = new JButton("Filtrar");
		BFiltrar.setBounds(494, 41, 89, 23);
		
		BModificar = new JButton("Modificar");
		BModificar.setBounds(321, 386, 96, 23);
	
		BExcluir = new JButton("Excluir");
		BExcluir.setBounds(429, 386, 96, 23);

		dataFiltrar = new JDateChooser();
		dataFiltrar.setBounds(380, 41, 104, 20);
		
		BGerar = new JButton("Gerar PDF");
		BGerar.setBounds(10, 386, 96, 23);
		

	}

	private void AdicionaComponentes() {
		panel.add(LGerenciar);
		panel.add(BAgendar);
		panel.add(BCancelar);
		panel.add(BFiltrar);
		panel.add(dataFiltrar);
		panel.add(BModificar);
		panel.add(BExcluir);
		panel.add(BPesquisar);	
		panel.add(BGerar);
	}

	public JLabel getLGerenciar() {
		return LGerenciar;
	}

	public void setLGerenciar(JLabel lGerenciar) {
		LGerenciar = lGerenciar;
	}

	public JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}

	
	public JDateChooser getDataFiltrar() {
		return dataFiltrar;
	}

	public void setDataFiltrar(JDateChooser dataFiltrar) {
		this.dataFiltrar = dataFiltrar;
	}

	public JButton getBFiltrar() {
		return BFiltrar;
	}

	public void setBFiltrar(JButton bFiltrar) {
		BFiltrar = bFiltrar;
	}

	public JButton getBCancelar() {
		return BCancelar;
	}

	public void setBCancelar(JButton bCancelar) {
		BCancelar = bCancelar;
	}

	public JButton getBAgendar() {
		return BAgendar;
	}

	public void setBAgendar(JButton bAgendar) {
		BAgendar = bAgendar;
	}

	
	public JScrollPane getScrollPane() {
		return scrollPane;
	}

	public void setScrollPane(JScrollPane scrollPane) {
		this.scrollPane = scrollPane;
	}

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}

	public JButton getBModificar() {
		return BModificar;
	}

	public void setBModificar(JButton bModificar) {
		BModificar = bModificar;
	}

	public JButton getBExcluir() {
		return BExcluir;
	}

	public void setBExcluir(JButton bExcluir) {
		BExcluir = bExcluir;
	}

	public GerenciarProntuarioListener getListener() {
		return listener;
	}

	public void setListener(GerenciarProntuarioListener listener) {
		this.listener = listener;
	}

	public JButton getBPesquisar() {
		return BPesquisar;
	}

	public void setBPesquisar(JButton bPesquisar) {
		BPesquisar = bPesquisar;
	}

	public JButton getBGerar() {
		return BGerar;
	}

	public void setBGerar(JButton bGerar) {
		BGerar = bGerar;
	}	
	
}
