/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication22;

/**
 *
 * @author marcv
 */

import javax.swing.*;

public class JavaApplication22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int n, m;
        
        n = Integer.parseInt(JOptionPane.showInputDialog("Entra el numero de filas: "));
        m = Integer.parseInt(JOptionPane.showInputDialog("Entra el numero de columnas: "));
        
        int [][] matriz = new int[n][m];
        
        for(int i = 0; i < matriz.length; i++)
        {
            for(int j = 0; j < matriz.length; j++)
            {
                matriz[i][j]=Integer.parseInt(JOptionPane.showInputDialog("Entra un numero: "));
            }
        }
        
        for(int i = 0; i < matriz.length; i++)
        {
            System.out.println();
            for(int j = 0; j < matriz.length; j++)
            {
                System.out.print(matriz[i][j]+" ");
            }
        }
    }
    
}
