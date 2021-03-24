
package Main;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sebastian
 */
public class Contacto {
    // Atributos
    protected String nombre; 
    protected String direccion;
    protected String email;
    protected String alias;
    protected List<String> telefonos = new ArrayList();
    
    //Constructores

    public Contacto(String nombre, List<String> telefonos) {
        this.nombre = nombre;
        this.telefonos = telefonos;
    }

    public Contacto(String nombre, List<String> telefonos, String email, 
                    String direccion, String alias) {
        this.nombre = nombre;
        this.telefonos = telefonos;
        this.direccion = direccion;
        this.email = email;
        this.alias = alias;
    }
    
    //Métodos
    
    public void añadirNumero(String telefono){
        this.telefonos.add(telefono);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public void setTelefonos(List<String> telefonos) {
        this.telefonos = telefonos;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getEmail() {
        return email;
    }

    public String getAlias() {
        return alias;
    }

    public List<String> getTelefonos() {
        return telefonos;
    }
    
}
