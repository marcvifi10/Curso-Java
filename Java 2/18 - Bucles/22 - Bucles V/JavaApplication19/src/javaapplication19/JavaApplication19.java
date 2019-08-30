/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;

/**
 *
 * @author marcv
 */

import javax.swing.JOptionPane;

public class JavaApplication19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int resultado = 1;
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Entra un numero: "));
        
        for(int i = numero; i>0; i--)
        {
            resultado*=i;
        }
        
        System.out.println("El factorial de " + numero + " es " + resultado + ".");
    }
    
}
