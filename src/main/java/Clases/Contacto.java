
package Clases;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sebastian
 */
public class Contacto{
    // Atributos
    protected final Double id = Math.random()*1000;
    protected String nombre; 
    protected String direccion;
    protected String lugar;
    protected String email;
    protected String alias;
    protected List<String> telefonos = new ArrayList();
    
    //Constructores

    public Contacto(String nombre, List<String> telefonos, String lugar) {
        this.nombre = nombre;
        this.telefonos = telefonos;
        this.lugar = lugar;
    }

    public Contacto(String nombre, List<String> telefonos, String lugar, String email, 
                    String direccion, String alias) {
        this.nombre = nombre;
        this.telefonos = telefonos;
        this.lugar = lugar;
        this.direccion = direccion;
        this.email = email;
        this.alias = alias;
    }
    
    //Métodos

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public Double getId(){
        return id;
    }

    public void añadirNumero(String telefono) {
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
