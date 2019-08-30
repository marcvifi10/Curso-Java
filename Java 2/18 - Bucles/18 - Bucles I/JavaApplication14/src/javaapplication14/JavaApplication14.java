/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication14;

/**
 *
 * @author marcv
 */

import javax.swing.*;

public class JavaApplication14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String clave = "Marc";
        String pass = "";
        
        while(clave.equals(pass)==false)
        {
            pass = JOptionPane.showInputDialog("Entra la contraseña: ");
            
            if(clave.equals(pass)==false)
            {
                System.out.println("Contraseña incorrecta");
            }
        }
        
        System.out.println("Contraseña correcta!!!");
    }
    
}
