package br.com.projeto.gsv.util;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import br.com.gsv.prontuario.domain.Prontuario;

public class TabelaDeProntuarios extends AbstractTableModel{
	private String[] colunas = new String[] { "DATA", "HORA", "NOME", "CPF", "NIVEL ALERTA", "ESTADO MENTAL" };
	private List<Prontuario> linhas;
	private static final int DATA = 0;
    private static final int HORA = 1;
    private static final int NOME = 2;
    private static final int CPF = 3;
    private static final int NIVEL_ALERTA = 4;
    private static final int ESTADO_MENTAL = 5;
	 
    
    public TabelaDeProntuarios() {
        linhas = new ArrayList<Prontuario>();
       
    }
 
    
    public TabelaDeProntuarios(List<Prontuario> dadosProntuario) {
        linhas = new ArrayList<Prontuario>(dadosProntuario);
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
            return String.class;
        case HORA:
            return String.class;
        case NOME:
            return String.class;
        case CPF:
            return String.class;
        case NIVEL_ALERTA:
            return String.class;
        case ESTADO_MENTAL:
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
            return dados.getData();
        case HORA:
            return dados.getHora();
        case NOME:
        	return dados.getPaciente().getNome();
        case CPF:
            return dados.getPaciente().getCpf();
        case NIVEL_ALERTA:
            return dados.getAnotConsciencia();
        case ESTADO_MENTAL:
        	return dados.getAnotMental();
        default:
            throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }
	
	 
	
	public void addSocio(Prontuario dados) {
	    linhas.add(dados);
	    int ultimoIndice = getRowCount() - 1;
	    fireTableRowsInserted(ultimoIndice, ultimoIndice);
	}
	 
	 
	
	public void addLista(List<Prontuario> dados) {
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
        case HORA:
        	dados.setHora((String) aValue);
            break;
        case NOME:
        	dados.getPaciente().setNome((String) aValue);
            break;
        case CPF:
        	dados.getPaciente().setCpf((String) aValue);
            break;
        case NIVEL_ALERTA:
        	dados.setAnotConsciencia((String) aValue);
            break;
        case ESTADO_MENTAL:
        	dados.setAnotMental((String) aValue);
            break;
        default:
            throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
         
        fireTableCellUpdated(rowIndex, columnIndex); 
    }
}
