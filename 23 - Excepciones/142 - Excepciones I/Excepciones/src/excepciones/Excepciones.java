/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *
 * @author marcv
 */

import javax.swing.*;

public class Excepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int [] mi_matriz = new int[5];
        
        mi_matriz[0]=5;
        mi_matriz[1]=10;
        mi_matriz[2]=15;
        mi_matriz[3]=25;
        mi_matriz[4]=35;
        
        for(int i = 0; i < 5; i++)
        {
            System.out.println("Posición " + i + " = " + mi_matriz[i]);
        }
        
        String nombre = JOptionPane.showInputDialog("Entra tu nombre: ");
        
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Entra tu edad: "));
        
        System.out.println("Hola " + nombre + ", tienes " + edad + " años. ");
        
    }
    
}
