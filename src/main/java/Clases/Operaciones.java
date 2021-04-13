/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.File;
import java.util.List;

/**
 *
 * @author Sebastian
 */
public interface Operaciones {
    
    public void verificarConsulta(List<Contacto> lista)throws CustomException;
    public void verificarTelefonos(List<String> telefonos, Double id)
                                   throws CustomException;
    public void verificarVacio(String nombre, List<String> telefonos) 
                                   throws CustomException;
    public void exportar(File archivo) throws CustomException;
    public void importar(File archivo) throws CustomException;
    public void cargar(File archivo) throws CustomException;

}
