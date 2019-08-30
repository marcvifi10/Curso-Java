/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

/**
 *
 * @author marcv
 */

import javax.swing.JOptionPane;

public class JavaApplication11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String nombre;
        int edad;
        
        nombre = JOptionPane.showInputDialog("Entra tu nombre: ");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Entra tu edad: "));
        
        JOptionPane.showMessageDialog(null,"Tienes "+edad+" años.");
                
        System.out.println("Tienes " + edad + " años.");
    }
    
}
