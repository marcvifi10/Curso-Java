/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

/**
 *
 * @author marcv
 */

import java.util.Scanner;
import javax.swing.*;

public class JavaApplication13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int lado, base, altura;
        
        System.out.print("Elige una opción: \n1: Cuadrado \n2: Rectángulo \n3: Triángulo \n4: Circulo");
        
        int figura = entrada.nextInt();
       
        switch(figura)
        {
            case 1:
                lado = Integer.parseInt(JOptionPane.showInputDialog("Entra el lado: "));
                JOptionPane.showMessageDialog(null, "El área es: "+(lado*lado)+"cm2.");
            break;
            
            case 2:
                lado = Integer.parseInt(JOptionPane.showInputDialog("Entra el lado: "));
                JOptionPane.showMessageDialog(null, "El área es: "+(lado*lado)+"cm2.");
            break;
            
            case 3:
                base = Integer.parseInt(JOptionPane.showInputDialog("Entra la base: "));
                altura = Integer.parseInt(JOptionPane.showInputDialog("Entra la altura: "));
                JOptionPane.showMessageDialog(null, "El área es: "+(base*altura)/2+"cm2.");
            break;
            
            case 4:
                
            break;
        }
    }
    
}
