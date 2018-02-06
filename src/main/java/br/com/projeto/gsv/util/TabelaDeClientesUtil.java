package br.com.projeto.gsv.util;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import br.com.projeto.gsv.domain.Cliente;

public class TabelaDeClientesUtil extends AbstractTableModel{

	private String[] colunas = new String[] { "CODIGO", "NOME", "IDENTIFICAÇÂO" };
	private List<Cliente> linhas;
	private static final int CODIGO = 0;
    private static final int NOME = 1;
    private static final int IDENTIFICACAO = 2;
	 
    
    public TabelaDeClientesUtil() {
        linhas = new ArrayList<Cliente>();
       
    }
 
    
    public TabelaDeClientesUtil(List<Cliente> dadosCliente) {
        linhas = new ArrayList<Cliente>(dadosCliente);
	
	
    }
	
    
 
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
        case NOME:
            return String.class;
        case IDENTIFICACAO:
            return String.class;
        default:
           
            throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }
    

	public int getRowCount() {
	    return linhas.size();
	}

	public Object getValueAt(int rowIndex, int columnIndex) {
        
        Cliente dados = linhas.get(rowIndex);
 
        switch (columnIndex) {
        case CODIGO:
            return dados.getId();
        case NOME:
            return dados.getNome();
        case IDENTIFICACAO:
            return dados.getRg();
        default:
           
            throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }
	
	 
	
	public void addSocio(Cliente dados) {
	  
	    linhas.add(dados);
	    int ultimoIndice = getRowCount() - 1;
	    fireTableRowsInserted(ultimoIndice, ultimoIndice);
	}
	 
	 
	
	public void addListaDeSocios(List<Cliente> dados) {
	    
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
       
        Cliente dados = linhas.get(rowIndex);
 
        switch (columnIndex) {
        case CODIGO:
        	dados.setId((Long) aValue);
            break;
        case NOME:
        	dados.setNome((String) aValue);
            break;
        case IDENTIFICACAO:
        	dados.setCpf((String) aValue);
            break;
        default:
            throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
         
        fireTableCellUpdated(rowIndex, columnIndex); 
    }
    
}