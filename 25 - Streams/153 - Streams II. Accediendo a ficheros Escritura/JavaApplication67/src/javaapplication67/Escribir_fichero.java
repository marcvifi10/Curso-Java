/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication67;

/**
 *
 * @author marcv
 */

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Escribir_fichero {
    
    public static void main(String[] args) {
        
        Escribiendo e = new Escribiendo();
        
        e.escribir();
        
    }
    
}

class Escribiendo
{
    
    public void escribir()
    {
        
        String frase = "Esto es una prueba de escritura";
        
        try 
        {
            FileWriter escritura = new FileWriter("C:/Users/marcv/Desktop/2.txt",true);
        
            for(int i = 0; i < frase.length(); i++)
            {
                
                escritura.write(frase.charAt(i));
                
            }
            
            escritura.close();
            
        } 
        catch (IOException ex) 
        {
            Logger.getLogger(Escribiendo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
