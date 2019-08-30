/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication27;

/**
 *
 * @author marcv
 */
public class JavaApplication27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Empleado e1 = new Empleado("Marc");
        
        e1.cambiaSeccion("Informática");
        
        e1.cambiaNombre("mmmm");
       
        
        
        //Empleado.id++;
        
        Empleado e2 = new Empleado("Marc");
        
        e2.cambiaSeccion("Informática");
        
        e2.cambiaNombre("AAA");
       
        
        
        Empleado e3 = new Empleado("Marc");
        
        e3.cambiaSeccion("Informática");
        
        e3.cambiaNombre("AAA");
        
        
        Empleado e4 = new Empleado("Marc");
        
        e4.cambiaSeccion("Informática");
        
        e4.cambiaNombre("AAA");
        
       
        System.out.println(e1.getDatos() + "\n" + e2.getDatos() + "\n" + e3.getDatos() + "\n" + e4.getDatos());
        
        System.out.println(Empleado.getIdSiguiente());
    }
    
}
