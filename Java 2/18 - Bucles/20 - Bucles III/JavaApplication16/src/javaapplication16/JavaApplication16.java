/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication16;

/**
 *
 * @author marcv
 */

import java.util.*;

public class JavaApplication16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int aleatorio = (int)(Math.random()*100);
        
        Scanner entrada = new Scanner(System.in);
        
        int numero = 0;
        int intentos = 0;
        
        do
        {
            intentos++;
            System.out.print("Entra otro numero: ");
            numero = entrada.nextInt();
            
            if(aleatorio > numero)
            {
                System.out.println("Es mayor!!!");
            }
            else
            {
                System.out.println("Es menor!!!");
            }
        }while(numero != aleatorio);
        
        System.out.println("Correcto!!!"+"\nHas necesitado "+intentos+" intentos.");
    }
    
}
