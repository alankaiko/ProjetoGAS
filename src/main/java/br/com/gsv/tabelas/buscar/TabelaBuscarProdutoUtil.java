package br.com.gsv.tabelas.buscar;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import br.com.gsv.domain.Funcionario;
import br.com.gsv.domain.Produto;

public class TabelaBuscarProdutoUtil extends AbstractTableModel {
	private String[] colunas = new String[] { "CODIGO", "DESCRICAO", "FABRICANTE" };
	private List<Produto> linhas;
	private static final int CODIGO = 0;
    private static final int DESCRICAO = 1;
    private static final int FABRICANTE = 2;

	 
    
    public TabelaBuscarProdutoUtil() {
        linhas = new ArrayList<Produto>();
       
    }
 
    
    public TabelaBuscarProdutoUtil(List<Produto> produto) {
        linhas = new ArrayList<Produto>(produto);
	
	
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
            return Integer.class;
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
            return dados.getCodigo();
        case DESCRICAO:
            return dados.getDescricao();
        case FABRICANTE:
            return dados.getFabricante().getDescricao();
        default:
           
            throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }
	
	 
	
	public void addUsuario(Produto dados) {
	  
	    linhas.add(dados);
	    int ultimoIndice = getRowCount() - 1;
	    fireTableRowsInserted(ultimoIndice, ultimoIndice);
	}
	 
	 
	
	public void addListaDeUsuario(List<Produto> dados) {
	    
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
        	dados.setCodigo(String.valueOf(aValue));
            break;
        case DESCRICAO:
        	dados.setDescricao((String) aValue);
            break;
        case FABRICANTE:
        	dados.getFabricante().setDescricao((String) aValue);
        default:
            throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
         
        fireTableCellUpdated(rowIndex, columnIndex); 
    }
}
