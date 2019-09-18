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
       
        System.out.println(e1.getDatos());
    }
    
}
