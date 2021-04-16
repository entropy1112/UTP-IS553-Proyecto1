/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IGU;

import Clases.Contacto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sebastian
 */
public class LibretaTableModel extends DefaultTableModel {

    private final String[] columnas = {"Nombre", "Telefonos", "Lugar", "Email",
                                       "Dirección", "Alias"};
    private List<Contacto> datos;

    public LibretaTableModel(List<Contacto> datos) {
        this.datos = datos;
        super.setColumnIdentifiers(columnas);
    }

    public void setDatos(List<Contacto> datos) {
        this.datos = datos;
        actualizarDatos();
    }

    public void actualizarDatos() {
        fireTableDataChanged();
    }

    public Contacto getDato(int row) {
        return datos.get(row);
    }

    @Override
    public int getRowCount() {
        return datos == null ? 0 : datos.size();
    }
    
    @Override
    public Object getValueAt(int row, int column) {
        Contacto contacto = datos.get(row);
        switch (column) {
            case 0: // Nombre
                return contacto.getNombre();
            case 1: // Telefonos
                return contacto.getTelefonos();
            case 2: // Lugar
                return contacto.getLugar();
            case 3: // Email
                return contacto.getEmail();
            case 4: // Direccion
                return contacto.getDireccion();
            case 5: // Alias
                return contacto.getAlias();
        }
        return super.getValueAt(row, column);
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
    }
    
    @Override
    public Class getColumnClass(int column) {
        switch (column) {
            case 0: // Nombre
                return String.class;
            case 1: // Telefonos
                return ArrayList.class;
            case 2: // Lugar
            case 3: // Email
            case 4: // Direccion
            case 5: // Alias
                return String.class;

        }
        return super.getColumnClass(column);
    }
    
    

}
