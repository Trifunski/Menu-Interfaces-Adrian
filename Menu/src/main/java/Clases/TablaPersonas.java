package Clases;

/**
 *
 * @author Trifunski
 */

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class TablaPersonas extends AbstractTableModel {

    private static final int DNI = 0;
    private static final int NOMBRE = 1;
    private static final int APELLIDO1 = 2;
    private static final int APELLIDO2 = 3;
    private static final int AÑONAC = 4;
    private static final int CORREO = 5;
    private static final int CONTRASEÑA = 6;
    
    private ArrayList<Persona> listaPersonas;
    
    private static final String[] columns = new String[]{"Dni", "Nombre", "Ape1", "Ape2", "Fecha_Nac", "email", "Password"};
    private static final Class<?>[] clase = { String.class, String.class, String.class, String.class, String.class, String.class, String.class};
    
    private String[] columnNames = {"DNI", "NOMBRE", "APELLIDO1", "APELLIDO2", "AÑONAC", "CORREO", "CONTRASEÑA"};
    
    public TablaPersonas(ArrayList<Persona> listaPersonas){
        this.listaPersonas=listaPersonas;
    }
    
    @Override
    public int getRowCount() {
        return listaPersonas.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }
    
    
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Persona a = getPersona(rowIndex);

        if(a != null) {
            switch (columnIndex) {
                case DNI:
                    return a.getDNI();
                case NOMBRE:
                    return a.getNombre();
                case APELLIDO1:
                    return a.getApellido1();
                case APELLIDO2:
                    return a.getApellido2();
                 case AÑONAC:
                    return a.getAñoNac();
                case CORREO:
                    return a.getCorreo();
                case CONTRASEÑA:
                    return a.getContraseña();
               }
        }
        return "";
    }
    
    
    @Override
    public void setValueAt(Object valor,int rowIndex, int columnIndex) {
        Persona a = getPersona(rowIndex);

        if(a != null) {
            switch (columnIndex) {
                case DNI:
                     a.setDNI(valor.toString());
                case NOMBRE:
                     a.setNombre(valor.toString());
                case APELLIDO1:
                     a.setApellido1(valor.toString());
                case APELLIDO2:
                     a.setApellido2(valor.toString());
                 case AÑONAC:
                     a.setAñoNac(valor.toString());
                case CORREO:
                     a.setCorreo(valor.toString());
                case CONTRASEÑA:
                     a.setContraseña(valor.toString());
               }
        }
       
    }
    
   
    public void setValueRow(Persona a,int rowIndex) {
        Persona modificar = getPersona(rowIndex);

        if(modificar != null) {
            modificar.setDNI(a.getDNI());
            modificar.setNombre(a.getNombre());
            modificar.setApellido1(a.getApellido1());
            modificar.setApellido2(a.getApellido2());
            modificar.setAñoNac(a.getAñoNac());
            modificar.setCorreo(a.getCorreo());
            modificar.setContraseña(a.getContraseña());
            this.fireTableDataChanged();
           }
    }
  
    
    public Persona getPersona(int rowIndex) {
        if (getRowCount() > rowIndex && rowIndex >= 0) {
            return listaPersonas.get(rowIndex);
        }
        return null;
    }

    public ArrayList<Persona> getlistaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(ArrayList<Persona> listaPersonas) {
        this.listaPersonas = listaPersonas;
        this.fireTableDataChanged(); //informa que la tabla ha cambiado.
    }

    public void setPersona(Persona sb){
        listaPersonas.add(sb);
        this.fireTableRowsInserted(listaPersonas.size()-1, listaPersonas.size()-1);
    }
   @Override
    public Class<?> getColumnClass(int columnIndex) {
        return clase[columnIndex];
    }
    
    @Override 
    public String getColumnName(int index) { 
        return columnNames[index]; 
    } 

   
    public String[] getColumnNames() {
        return columnNames;
    }

    public void setColumnNames(String[] columnNames) {
        this.columnNames = columnNames;
    }
    
}
