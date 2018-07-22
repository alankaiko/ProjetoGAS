package br.com.gsv.tabelas;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import br.com.gsv.domain.Prontuario;
import br.com.gsv.util.ConverteDadosUtil;

public class TabelaProntuarioPorAgendamento extends AbstractTableModel{
	private String[] colunas = new String[] { "DATA", "ESTADO MENTAL"};
	private List<Prontuario> linhas;
	private static final int DATA = 0;
    private static final int ESTADO = 1;
	 
    
    public TabelaProntuarioPorAgendamento() {
        linhas = new ArrayList<Prontuario>();
       
    }
 
    
    public TabelaProntuarioPorAgendamento(List<Prontuario> dadosConvenio) {
        linhas = new ArrayList<Prontuario>(dadosConvenio);
	
	
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
        case DATA:
            return Long.class;
        case ESTADO:
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
        
        Prontuario dados = linhas.get(rowIndex);
 
        switch (columnIndex) {
        case DATA:
            return ConverteDadosUtil.TransformandoEmString(dados.getData());
        case ESTADO:
            return dados.getAnotMental();
        default:
           
            throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }
	
	 
	
	public void addDados(Prontuario dados) {
	    linhas.add(dados);
	    int ultimoIndice = getRowCount() - 1;
	    fireTableRowsInserted(ultimoIndice, ultimoIndice);
	}
	 
	 
	
	public void addListaDeDados(List<Prontuario> dados) {
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
       
        Prontuario dados = linhas.get(rowIndex);
 
        switch (columnIndex) {
        case DATA:
        	dados.setData((Date) aValue);
            break;
        case ESTADO:
        	dados.setAnotMental((String) aValue);
            break;
        default:
            throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
         
        fireTableCellUpdated(rowIndex, columnIndex); 
    }
}
