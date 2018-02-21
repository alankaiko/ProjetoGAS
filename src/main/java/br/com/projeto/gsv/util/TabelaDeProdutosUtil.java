package br.com.projeto.gsv.util;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import br.com.gsv.produtos.domain.Produto;

public class TabelaDeProdutosUtil extends AbstractTableModel{
	private String[] colunas = new String[] { "CODIGO", "DESCRICAO", "FABRICANTE" };
	private List<Produto> linhas;
	private static final int CODIGO = 0;
    private static final int DESCRICAO = 1;
    private static final int FABRICANTE = 2;
	 
    
    public TabelaDeProdutosUtil() {
        linhas = new ArrayList<Produto>();
       
    }
 
    
    public TabelaDeProdutosUtil(List<Produto> dadosProduto) {
        linhas = new ArrayList<Produto>(dadosProduto);
	
	
    }
	
    
    @Override
    public int getColumnCount() {
        return colunas.length;
    }
    
    @Override
    public String getColumnName(int columnIndex) {
        return colunas[columnIndex];
    };
    
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
        case CODIGO:
            return Long.class;
        case DESCRICAO:
            return String.class;
        case FABRICANTE:
            return String.class;
        default:
           
            throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }
    
    @Override
	public int getRowCount() {
	    return linhas.size();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
        
		Produto dados = linhas.get(rowIndex);
 
        switch (columnIndex) {
        case CODIGO:
            return dados.getId();
        case DESCRICAO:
            return dados.getDescricao();
        case FABRICANTE:
            return dados.getFabricante().getDescricao();
        default:
           
            throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }
	
	 
	
	public void addSocio(Produto dados) {
	    linhas.add(dados);
	    int ultimoIndice = getRowCount() - 1;
	    fireTableRowsInserted(ultimoIndice, ultimoIndice);
	}
	 
	 
	
	public void addListaDeSocios(List<Produto> dados) {
	    int indice = getRowCount();
	    linhas.addAll(dados);
	    fireTableRowsInserted(indice, indice + dados.size());
	}
	 

	public void limpar() {
	    linhas.clear();
	    fireTableDataChanged();
	}
	
	
	
	
	
	
	@Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
       
		Produto dados = linhas.get(rowIndex);
 
        switch (columnIndex) {
        case CODIGO:
        	dados.setId((Long) aValue);
            break;
        case DESCRICAO:
        	dados.setDescricao((String) aValue);
            break;
        case FABRICANTE:
        	dados.getFabricante().setDescricao((String) aValue);
            break;
        default:
            throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
         
        fireTableCellUpdated(rowIndex, columnIndex); 
    }
    
}
