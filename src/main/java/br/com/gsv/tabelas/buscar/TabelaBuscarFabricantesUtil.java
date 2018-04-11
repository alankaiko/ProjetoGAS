package br.com.gsv.tabelas.buscar;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import br.com.gsv.fabricantes.domain.Fabricante;
import br.com.gsv.funcionario.domain.Funcionario;

public class TabelaBuscarFabricantesUtil extends AbstractTableModel{
	private String[] colunas = new String[] { "CÓDIGO", "DESCRICAO"};
	private List<Fabricante> linhas;
	private static final int CODIGO = 0;
    private static final int DESCRICAO = 1;
  
    
    public TabelaBuscarFabricantesUtil() {
        linhas = new ArrayList<Fabricante>();
       
    }
 
    
    public TabelaBuscarFabricantesUtil(List<Fabricante> fabricante) {
        linhas = new ArrayList<Fabricante>(fabricante);
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
        
		Fabricante dados = linhas.get(rowIndex);
 
        switch (columnIndex) {
        case CODIGO:
            return dados.getId();
        case DESCRICAO:
            return dados.getDescricao();
        default:
           
            throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }
	
	 
	
	public void addUsuario(Fabricante dados) {
	  
	    linhas.add(dados);
	    int ultimoIndice = getRowCount() - 1;
	    fireTableRowsInserted(ultimoIndice, ultimoIndice);
	}
	 
	 
	
	public void addListaDeUsuario(List<Fabricante> dados) {
	    
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
       
		Fabricante dados = linhas.get(rowIndex);
 
        switch (columnIndex) {
        case CODIGO:
        	dados.setId((Long) aValue);
            break;
        case DESCRICAO:
        	dados.setDescricao((String) aValue);
            break;
        default:
            throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
         
        fireTableCellUpdated(rowIndex, columnIndex); 
    }
    
}
