
package Clases;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sebastian
 */
public class Agenda implements Operaciones{
    //Atributos
    protected List<Contacto> agenda = new ArrayList();
    
    //Cosntructor
    public Agenda() {
    }
    
    //Métodos
    public void añadirContacto(String nombre, List<String> telefonos, 
                               String email, String direccion, String alias)
                               throws CustomException{
        verificarTelefonos(telefonos);
        
        Contacto nuevo = new Contacto(nombre,telefonos,email,direccion,alias);
        
        this.agenda.add(nuevo);
    }
    
    public void eliminarContacto(Contacto aEliminar) throws CustomException{
        
        if(!agenda.contains(aEliminar)){
            throw new CustomException("El contacto no pertenece a la agenda");
        }
        
        this.agenda.remove(aEliminar); 
    }
    
    public void modificarContacto(Contacto aModificar, String nombre, 
                                  List<String> telefonos, String email, 
                                  String direccion, String alias) 
                                  throws CustomException{
        
        if("".equals(nombre) || telefonos.isEmpty()){
            throw new CustomException("Llene los campos obligatorios, "
                                       +"marcados con *");
        }
        
        aModificar.setNombre(nombre);
        aModificar.setTelefonos(telefonos);
        aModificar.setDireccion(direccion);
        aModificar.setAlias(alias);
        aModificar.setEmail(email);
        
    }
    
    public void consultar(String nombreCons, String telefonoCons, 
                          String emailCons, String direccionCons, 
                          String aliasCons) throws CustomException {
        
        List<Contacto> aux = new ArrayList();
        
//Consulta por el nombre y guarda las coincidencias en una agenda auxiliar
        if(!"".equals(nombreCons)){
            agenda.stream()
                  .filter((agenda1) -> (agenda1.nombre.contains(nombreCons)))
                  .forEachOrdered((agenda1) -> {
                    aux.add(agenda1);
            });
            verificar(aux);
        }
//Luego consulta el teléfono en la agenda principal si la agenda auxiliar sigue
//vacía tras la consulta por el nombre
        if(aux.isEmpty() && !"".equals(telefonoCons)){
            agenda.stream()
                  .filter((agenda1)->(agenda1.telefonos.contains(telefonoCons)))
                  .forEachOrdered((agenda1) -> {
                      aux.add(agenda1);
            });
            verificar(aux);
        }
        else{
//Si la agenda auxiliar no está vacía tras la consulta por el nombre, la 
//consulta por el telefono se hace en esta agenda auxiliar removiendo los 
//contactos que NO cumplan con la busqueda
            if(!"".equals(telefonoCons)){
                aux.stream()
                   .filter((agenda1)->(!agenda1.telefonos.contains(telefonoCons)))
                   .forEachOrdered((agenda1) -> {
                       aux.remove(agenda1);
                });
                verificar(aux);
            }
        }

//La lógica de busqueda anterior, en agenda principal o en auxiliar, se repite
//con los demás datos a consultar
        
        if(aux.isEmpty() && !"".equals(emailCons)){
            agenda.stream()
                  .filter((agenda1)->(agenda1.email.contains(emailCons)))
                  .forEachOrdered((agenda1) -> {
                      aux.add(agenda1);
            });
            verificar(aux);
        }
        else{
            if(!"".equals(emailCons)){
                aux.stream()
                   .filter((agenda1)->(!agenda1.email.contains(emailCons)))
                   .forEachOrdered((agenda1) -> {
                       aux.remove(agenda1);
                });
                verificar(aux);
            }
        }
        
        if(aux.isEmpty() && !"".equals(direccionCons)){
            agenda.stream()
                  .filter((agenda1)->(agenda1.direccion
                                             .contains(direccionCons)))
                  .forEachOrdered((agenda1) -> {
                      aux.add(agenda1);
            });
            verificar(aux);
        }
        else{
            if(!"".equals(direccionCons)){
                aux.stream()
                   .filter((agenda1)->(!agenda1.direccion
                                               .contains(direccionCons)))
                   .forEachOrdered((agenda1) -> {
                       aux.remove(agenda1);
                });
                verificar(aux);
            }
        }
        
        if(aux.isEmpty() && !"".equals(aliasCons)){
            agenda.stream()
                  .filter((agenda1)->(agenda1.alias
                                             .contains(aliasCons)))
                  .forEachOrdered((agenda1) -> {
                      aux.add(agenda1);
            });
            verificar(aux);
        }
        else{
            if(!"".equals(aliasCons)){
                aux.stream()
                   .filter((agenda1)->(!agenda1.alias
                                               .contains(aliasCons)))
                   .forEachOrdered((agenda1) -> {
                       aux.remove(agenda1);
                });
                verificar(aux);
            }
        }
        
    }
    
    @Override
    public void verificar(List<Contacto> lista) throws CustomException{
        if(lista.isEmpty()){
            throw new CustomException("Ningún contacto cumple con la "
                                      +"consulta.");
        }
    }
    
    @Override
    public void verificarTelefonos(List<String> telefonos)
                                   throws CustomException{
        for(String telefono1: telefonos){
            for(Contacto contacto1: agenda){
                if(contacto1.telefonos.contains(telefono1)){
                    throw new CustomException("El teléfono se repite en otro "
                                              +"contacto.");
                }
            }
        }
    }
}
