/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication63;

/**
 *
 * @author marcv
 */

import javax.swing.*;

public class Varias_Excepciones {
    
    public static void main(String[] args) 
    {
        try
        {
            division();
        }
        catch(ArithmeticException e)
        {
            
            System.out.println("Estas dividiendo por 0!!!");
            
        }
        catch(NumberFormatException e)
        {
            
            System.out.println("No has introducido un numero entero!!!");
            
            System.out.println(e.getMessage());
            
        }
        
    }
    
    static void division()
    {
        
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Entra el dividendo: "));
                
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Entra el divisor: "));
      
        System.out.println("El resultado es: " + (num1/num2));
        
    }
    
}
