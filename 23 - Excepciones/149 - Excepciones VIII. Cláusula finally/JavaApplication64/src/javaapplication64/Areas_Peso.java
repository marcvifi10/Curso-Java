/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication64;

/**
 *
 * @author marcv
 */

import java.util.*;
import javax.swing.JOptionPane;

public class Areas_Peso {
    
     static int figura;
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Elige una opción: \n1: Cuadrado \n2: Rectangulo \n3: Triángulo \n4: Circulo");
        
        try
        {
            
            figura = entrada.nextInt();
        
            // entrada.close();
            
        }
        catch(Exception e)
        {
           
            System.out.println("Ha ocurrido un error!!!");
            
        }
        finally
        {
            
            entrada.close();
            
        }
        
        switch(figura)
        {
            
            case 1:
                
                int lado = Integer.parseInt(JOptionPane.showInputDialog("Entra el lado: "));
                
                System.out.println(Math.pow(lado,2));
                
            break;
            
            case 2:
                
                int base = Integer.parseInt(JOptionPane.showInputDialog("Entra la base: "));
                
                int altura = Integer.parseInt(JOptionPane.showInputDialog("Entra la altura: "));
                
                System.out.println(base * altura);
                
            break;
            
            case 3:
                
                base = Integer.parseInt(JOptionPane.showInputDialog("Entra la base: "));
                
                altura = Integer.parseInt(JOptionPane.showInputDialog("Entra la altura: "));
                
                System.out.println((base * altura) / 2);
                
            break;
            
            case 4:
                
                int radio = Integer.parseInt(JOptionPane.showInputDialog("Entra el radio: "));
                
                System.out.println(Math.PI*(Math.pow(radio,2)));
                
            break;
            
            default:
                
                System.out.println("La opción no es correcta!!");
            
        }
        
        int altura = Integer.parseInt(JOptionPane.showInputDialog("Entra tu altura"));
        
        System.out.println("Si eres hombre tu peso ideal es: " + (altura-150) + " kg");
        
        System.out.println("Si eres hombre tu peso ideal es: " + (altura-120) + " kg");
        
    }
    
}
