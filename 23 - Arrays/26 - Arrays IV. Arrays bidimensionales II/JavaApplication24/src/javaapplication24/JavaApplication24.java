/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication24;

/**
 *
 * @author marcv
 */
public class JavaApplication24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double acumulado;
        double interes=0.10;
        
        double [][] saldo = new double[6][5];
        
        for(int i=0; i < 6; i++)
        {
            saldo[i][0]=10000;
            acumulado=10000;
            
            for(int j = 1; j < 5; j++)
            {
                acumulado = acumulado+(acumulado*interes);
                saldo[i][j]=acumulado;
            }
            
            interes = interes + 0.01;
        }
        
        for(int z=0; z < 6; z++)
        {
            System.out.println();
            
            for(int h = 0; h < 5; h++)
            {
                System.out.print(saldo[z][h]+" ");
            }
        }
        
    }
    
}
