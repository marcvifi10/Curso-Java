/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication23;

/**
 *
 * @author marcv
 */
public class JavaApplication23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int [][] matriz={
            {10,15,18,19,21},
            {11,12,13,14,15},
            {21,22,23,24,26},
            {33,32,36,39,37}
        };
        
        for(int i = 0; i < matriz.length; i++)
        {
            System.out.println();
            for(int j = 0; j < matriz.length; j++)
            {
                System.out.println(matriz[i][j] + " ");
            }
        }
    } 
    
}
