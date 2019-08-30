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
        catch(Exception e)
        {
            System.out.println("Incorrecto");
        }
        
        // examina_mail(el_mail);
        
    }
    
    static void examina_mail(String mail) throws Longitud_mail_erronea  
    {
        
        int arroba = 0;
        boolean punto = false;
        
        if(mail.length() <= 3)
        {
            
            // ArrayIndexOutOfBoundsException mi_excepcion = new ArrayIndexOutOfBoundsException();
            
            // throw new ArrayIndexOutOfBoundsException();
            
            // throw new EOFException();
            
            throw new Longitud_mail_erronea("El mail no puede tener menos de 3 caracteres!!!");
            
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

class Longitud_mail_erronea extends Exception
{
    
    public Longitud_mail_erronea()
    {
        
    }
    
    public Longitud_mail_erronea(String msj_error)
    {
        
        super(msj_error);
        
    }
    
}
