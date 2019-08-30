/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication18;

/**
 *
 * @author marcv
 */
import javax.swing.JOptionPane;

public class JavaApplication18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int arroba = 0;
        boolean punto = false;
        
        String mail;
        
        mail = JOptionPane.showInputDialog("Entra un email: ");
        
        for(int i = 0; i < mail.length(); i++)
        {
            if(mail.charAt(i) == '@')
            {
                arroba++;
            }
            
            if(mail.charAt(i) == '.')
            {
                punto = true;
            }
        }
        
        if(arroba == 1 && punto == true)
        {
            System.out.println("Correcto!!!");
        }
        else
        {
            System.out.println("Incorrecto!!!");
        }
    }
    
}
