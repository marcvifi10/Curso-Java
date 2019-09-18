/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

/**
 *
 * @author marcv
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String frase = "Hola, que tal?";
        
        String alumno1, alumno2;
        
        String frase_resumen = frase.substring(1,3)+".";
        
        System.out.println(frase_resumen);
        
        alumno1 = "Marc";
        
        alumno2 = "Marc";
        
        System.out.println(alumno1.equals(alumno2));
    }
    
}
