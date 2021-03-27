/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IGU.Modelos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sebastian
 */
public class DTO_añadir {
    private String nombre;
    private List<String> listaTelefonos = new ArrayList();
    private String email;
    private String direccion;
    private String alias;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<String> getListaTelefonos() {
        return listaTelefonos;
    }

    public void setListaTelefonos(List<String> listaTelefonos) {
        this.listaTelefonos = listaTelefonos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    @Override
    public String toString() {
        return "DTO_a\u00f1adir{" + "nombre=" + nombre + ", listaTelefonos=" 
                + listaTelefonos + ", email=" + email + ", direccion=" 
                + direccion + ", alias=" + alias + '}';
    }
    
    
    
}
