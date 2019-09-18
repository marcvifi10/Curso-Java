/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;

/**
 *
 * @author marcv
 */

import java.util.Scanner;

public class JavaApplication10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int edad;
        
        System.out.print("Introduce tu nombre: ");
        nombre = entrada.nextLine();
        
        System.out.print("Introduce tu edad: ");
        edad = entrada.nextInt();
        
        System.out.println("\nTu nombre es: " + nombre);
        System.out.println("Tu edad es: " + edad);
    }
    
}
