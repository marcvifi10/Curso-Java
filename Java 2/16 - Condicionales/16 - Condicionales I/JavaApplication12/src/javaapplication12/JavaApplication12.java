/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

/**
 *
 * @author marcv
 */

import java.util.*;
import javax.swing.JOptionPane;

public class JavaApplication12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int edad;
        
        System.out.print("Introduce tu edad, por favor: ");
        edad = entrada.nextInt();
        
        if(edad > 18 || edad == 18)
        {
            JOptionPane.showMessageDialog(null,"Eres mayor de edad!!!");
        }   
        else
        {
            JOptionPane.showMessageDialog(null,"Eres menor de edad!!!");
        } 
    }
    
}
