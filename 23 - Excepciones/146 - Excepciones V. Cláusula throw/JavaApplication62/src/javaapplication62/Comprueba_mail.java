/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication62;

/**
 *
 * @author marcv
 */

import java.io.EOFException;
import javax.swing.*;

public class Comprueba_mail {
    
    public static void main(String[] args)
    {
        
        String el_mail = JOptionPane.showInputDialog("Introduce mail: ");
        
        try
        {
            examina_mail(el_mail);
        }
        catch(EOFException e)
        {
            System.out.println("Incorrecto");
        }
        
    }
    
    static void examina_mail(String mail) throws EOFException
    {
        
        int arroba = 0;
        boolean punto = false;
        
        if(mail.length() <= 3)
        {
            
            // ArrayIndexOutOfBoundsException mi_excepcion = new ArrayIndexOutOfBoundsException();
            
            // throw new ArrayIndexOutOfBoundsException();
            
            throw new EOFException();
            
        }
        
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
            
            System.out.println("Es correcto");
            
        }
        else
        {
            
            System.out.println("Es incorrecto");
            
        }
        
    }
    
}
