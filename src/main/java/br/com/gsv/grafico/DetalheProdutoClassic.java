package br.com.gsv.grafico;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.border.EmptyBorder;

import br.com.gsv.formularios.DetalhesProdutoDialog;


public class DetalheProdutoClassic {
	private DetalhesProdutoDialog formulario;
	
	public DetalheProdutoClassic(DetalhesProdutoDialog formulario) {
		this.formulario = formulario;
		CriarTelaGeralClassic();
		DadosConvenio();
	}
	
	
	public void CriarTelaGeralClassic() {
		this.formulario.setTitle("Detalhes Dados de Produtos");
		this.formulario.setModal(true);
		this.formulario.setResizable(false);
		this.formulario.setBounds(100, 100, 489, 356);

		this.formulario.getTela().setLayout(null);
		this.formulario.getTela().add(this.formulario.getPanel(), BorderLayout.CENTER);

		this.formulario.getPanel().setLayout(null);
		this.formulario.getPanel().setBorder(new EmptyBorder(5, 5, 5, 5));
	}
	

	public void DadosConvenio() {
		this.formulario.getLDados().setText("Dados do Produto");
		this.formulario.getLDados().setBounds(38, 29, 130, 14);

		this.formulario.getLCodigo().setText("Código");
		this.formulario.getLCodigo().setBounds(38, 62, 70, 14);
		
		this.formulario.getTCodigo().setBounds(100, 59, 86, 20);

		this.formulario.getLDescricao().setText("Descrição");
		this.formulario.getLDescricao().setBounds(38, 104, 70, 14);
		
		this.formulario.getTDescricao().setBounds(106, 101, 328, 20);

		this.formulario.getLQuantidade().setText("Quantidade");
		this.formulario.getLQuantidade().setBounds(38, 145, 94, 14);
		
		this.formulario.getTQuantidade().setBounds(116, 142, 124, 20);

		this.formulario.getLFabricante().setText("Fabricante");
		this.formulario.getLFabricante().setBounds(38, 196, 80, 14);
		
		this.formulario.getTFabricante().setBounds(128, 196, 262, 14);

		this.formulario.getBTCancelar().setText("Cancelar");
		this.formulario.getBTCancelar().setFont(new Font("Calibri", Font.PLAIN, 12));
		this.formulario.getBTCancelar().setBounds(209, 275, 89, 23);
	}

}
