/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Sebastian
 */
public class AgendaTest {
    
    public AgendaTest() {
    }

    @Test
    public void AñadirYEliminar() throws CustomException {
        
        Agenda agenda = new Agenda("Sebas");
        
        List<String> telefonos1 = new ArrayList();
        telefonos1.add("3241578421");
        telefonos1.add("3147841547");
        Contacto contacto1 = new Contacto("Camilo Mosquera Ospina",telefonos1,
                                           "","","Milo");
        agenda.añadirContacto(contacto1);
        
        List<String> telefonos2 = new ArrayList();
        telefonos2.add("3487584417");
        Contacto contacto2 = new Contacto("Benito Armando Martinez",telefonos2,
                                           "benito_came@yahoo.com","","Beni");
        agenda.añadirContacto(contacto2);
        
        agenda.eliminarContacto(contacto2);
    }
    
    @Test
    public void AñadirYConsultar() throws CustomException {
        
        Agenda agenda = new Agenda("Sebas");
        List<Contacto> consulta1 = new ArrayList();
        List<Contacto> consulta2 = new ArrayList();
        
        List<String> telefonos1 = new ArrayList();
        telefonos1.add("3241578421");
        telefonos1.add("3147841547");
        Contacto contacto1 = new Contacto("Camilo Mosquera Ospina",telefonos1,
                                           "","Mz 9 Cs 1","Milo");
        agenda.añadirContacto(contacto1);
        consulta1.add(contacto1);
        consulta2.add(contacto1);
        
        List<String> telefonos2 = new ArrayList();
        telefonos2.add("3487584417");
        Contacto contacto2 = new Contacto("Benito Armando Martinez",telefonos2,
                                           "benito_came@yahoo.com","","Beni");
        agenda.añadirContacto(contacto2);
        
        List<String> telefonos3 = new ArrayList();
        telefonos3.add("3328967415");
        Contacto contacto3 = new Contacto("Geovany Giraldo",telefonos3,
                                           "GeoGir@yahoo.com","Mz 9 Cs 1","Geo");
        agenda.añadirContacto(contacto3);
        consulta2.add(contacto3);
        
        
        assertEquals(consulta1,agenda.consultar("","","","","Milo"));
        assertEquals(consulta2,agenda.consultar("","","","Mz 9 Cs 1",""));
        
    }
    
    @Test
    public void AñadirEImprimir() throws CustomException {
        
        Agenda agenda = new Agenda("Sebas");
        String mensajeEsperado = "Camilo Mosquera Ospina;3241578421,3147841547;"
                +";Mz 9 Cs 1;Milo\nBenito Armando Martinez;3487584417;"
                + "benito_came@yahoo.com;;Beni\nGeovany Giraldo;3328967415;"
                + "GeoGir@yahoo.com;Mz 9 Cs 1;Geo\n";
        
        List<String> telefonos1 = new ArrayList();
        telefonos1.add("3241578421");
        telefonos1.add("3147841547");
        Contacto contacto1 = new Contacto("Camilo Mosquera Ospina",telefonos1,
                                           "","Mz 9 Cs 1","Milo");
        agenda.añadirContacto(contacto1);
        
        List<String> telefonos2 = new ArrayList();
        telefonos2.add("3487584417");
        Contacto contacto2 = new Contacto("Benito Armando Martinez",telefonos2,
                                           "benito_came@yahoo.com","","Beni");
        agenda.añadirContacto(contacto2);
        
        List<String> telefonos3 = new ArrayList();
        telefonos3.add("3328967415");
        Contacto contacto3 = new Contacto("Geovany Giraldo",telefonos3,
                                           "GeoGir@yahoo.com","Mz 9 Cs 1","Geo");
        agenda.añadirContacto(contacto3);
        
        assertEquals(mensajeEsperado, agenda.toString());
        
    }
    
    @Test
    public void AñadirModificarEImprimir() throws CustomException {
        
        Agenda agenda = new Agenda("Sebas");
        String mensajeEsperado = "Camilo Mosquera Ospina;3241578421,3147841547;"
                +";Mz 9 Cs 1;Milo\n"
                + "Benito Armando Martinez;3487584417,3214875487;"
                + "ArmandoMartinis@gmail.com;;Martinez\n"
                + "Geovany Giraldo;3328967415;GEEO@gmail.com;;Geo\n";
        
        List<String> telefonos1 = new ArrayList();
        telefonos1.add("3241578421");
        telefonos1.add("3147841547");
        Contacto contacto1 = new Contacto("Camilo Mosquera Ospina",telefonos1,
                                           "","Mz 9 Cs 1","Milo");
        agenda.añadirContacto(contacto1);
        
        List<String> telefonos2 = new ArrayList();
        telefonos2.add("3487584417");
        Contacto contacto2 = new Contacto("Benito Armando Martinez",telefonos2,
                                           "benito_came@yahoo.com","","Beni");
        agenda.añadirContacto(contacto2);
        
        List<String> telefonos3 = new ArrayList();
        telefonos3.add("3328967415");
        Contacto contacto3 = new Contacto("Geovany Giraldo",telefonos3,
                                           "GeoGir@yahoo.com","Mz 9 Cs 1","Geo");
        agenda.añadirContacto(contacto3);
        
        contacto3.setDireccion("");
        contacto3.setEmail("GEEO@gmail.com");
        agenda.añadirContacto(contacto3);
        
        contacto2.telefonos.add("3214875487");
        contacto2.setEmail("ArmandoMartinis@gmail.com");
        contacto2.setAlias("Martinez");
        agenda.añadirContacto(contacto2);
        
        assertEquals(mensajeEsperado, agenda.toString());
    }
    
}
