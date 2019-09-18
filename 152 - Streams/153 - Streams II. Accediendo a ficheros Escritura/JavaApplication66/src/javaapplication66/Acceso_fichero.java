/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication66;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author marcv
 */
public class Acceso_fichero {
    
    public static void main(String[] args) {
        
        Leer_fichero a = new Leer_fichero();
        
        a.lee();
        
    }
    
}

class Leer_fichero
{
    
    FileReader entrada;
    
    public void lee()
    {
        
        try 
        {
            entrada = new FileReader("C:/Users/marcv/Desktop/ejemplo.txt");
        
            int c = 0;
            
            while(c != -1)
            {
                
                c = entrada.read();
                
                char letra = (char)c;
                
                System.out.print(letra);
                
                
            }
            
            System.out.println("");
            
        } 
        
        catch (IOException ex) 
        {
            System.out.println("No se ha encontrado el archivo");
        }
        
        finally
        {
        }
        
    }
    
}
