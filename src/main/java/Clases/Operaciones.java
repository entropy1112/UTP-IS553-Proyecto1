/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.List;

/**
 *
 * @author Sebastian
 */
public interface Operaciones {
    
    public void verificar(List<Contacto> lista)throws CustomException;
    public void verificarTelefonos(List<String> telefonos)
                                   throws CustomException;
    
}
