/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication68;

/**
 *
 * @author marcv
 */

import java.io.*;

public class Lectura_Escritura {
    
    public static void main(String[] args) {
        
        boolean final_ar = false;
            
        int contador = 0;
        
        int datos_entrada[] = new int[74130];
        
        try
        {
            
            FileInputStream archivo_lectura = new FileInputStream("C:/Users/marcv/Desktop/leyendo/imagen.jpg");
            
            while(!final_ar)
            {
                
                int byte_entrada = archivo_lectura.read();
                
                if(byte_entrada != -1)
                {
                    
                    datos_entrada[contador] = byte_entrada;
                    
                }
                
                else
                {
                    
                    final_ar = true;
                    
                    System.out.println(datos_entrada[contador]);
                    
                    contador++;
                    
                }
                
                archivo_lectura.close();
                
            }
            
        }
        catch(IOException e)
        {
            
            
            
        }
        
        System.out.println(contador);
        
        crea_fichero(datos_entrada);
        
    }
    
    static void crea_fichero(int datos_nuevo_fichero[])
    {
        
        try
        {
         
            FileOutputStream fichero_nuevo = new FileOutputStream("C:/Users/marcv/Desktop/leyendo/imagen2.jpg");
            
            for(int i = 0; i < datos_nuevo_fichero.length; i++)
            {
                
                fichero_nuevo.write(datos_nuevo_fichero[i]);
                
            }
            
            fichero_nuevo.close();
            
        }
        catch(IOException e)
        {
            
        }
        
    }
    
}
