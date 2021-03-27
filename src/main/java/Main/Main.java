/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Clases.Agenda;
import Clases.CustomException;
import IGU.Inicio;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class Main {
    
    public static void main(String[] args) throws CustomException {
        
        Inicio init = new Inicio();
        init.setVisible(true);
       // int opcion = escaner.nextInt();
      
//        switch (opcion) {
//            case 1:
//                System.out.println("Escogió iniciar");
//                break;
//            case 2:
//                System.out.println("Escogió importar");
//                break;
//            case 3:
//                System.out.println("Escogió crear agenda\nIngrese el nombre del"
//                                   + " dueño de la agenda.");
//                
//                String dueño;
//                escaner.nextLine();
//                dueño = escaner.nextLine();
//                
//                if(!"".equals(dueño)){
//                    Agenda agenda = new Agenda(dueño);
//                    
//                    gestionar(agenda);
//                }
//                break;
//
//            default:
//                throw new AssertionError();
//        }
                
    }
    
    public static void gestionar(Agenda agenda) throws CustomException{
        
        Scanner escaner = new Scanner(System.in);
        String mensaje = "Este es tu gestor de agenda, ¿Que quieres hacer?\n"
               + "1- Añadir, 2- Eliminar, 3- Modificar, 4- Consultar, 0- Salir";
        
        System.out.println(mensaje);
        
        int opcion = escaner.nextInt();
        
        while(opcion != 0){
            
            switch (opcion) {
                case 1://Añadir
                    String nombre;
                    String tel;
                    List<String> telefonos = new ArrayList();
                    String email;
                    String direccion;
                    String alias;
                    int op = 1;
                    
                    System.out.println("Ingrese los siguientes datos:");
                    System.out.print("Nombre: ");
                    escaner.nextLine();
                    nombre = escaner.nextLine();
                    
                    do {                        
                        System.out.print("Telefono: ");
                        tel = escaner.nextLine();
                        telefonos.add(tel);
                        System.out.print("¿Quiere añadir otro numero? 1- Si, "
                                + "2- No:  ");
                        op = escaner.nextInt();
                        escaner.nextLine();
                    } while (op != 2);
                    
                    System.out.print("Email: ");
                    email = escaner.nextLine();
                    
                    System.out.print("Direccion: ");
                    direccion = escaner.nextLine();
                    
                    System.out.print("Alias: ");
                    alias = escaner.nextLine();
                    
                    try {
                        agenda.añadirContacto(nombre, telefonos, email, direccion, 
                                          alias);
                    } catch (CustomException e) {
                        System.out.println("ERROR: "+ e.getMessage());
                    }
                    
                    break;
                case 2://Eliminar
                    
                    break;
                case 3://Modificar
                    
                    break;
                case 4://Consultar
                    
                    break;
                default:
                    throw new AssertionError();
            }
            
            System.out.println("¿Que más quieres hacer?\n1- Añadir, 2- Eliminar"
                    + ", 3- Modificar, 4- Consultar, 0- salir");
            opcion = escaner.nextInt();
        }
        
    }

}
