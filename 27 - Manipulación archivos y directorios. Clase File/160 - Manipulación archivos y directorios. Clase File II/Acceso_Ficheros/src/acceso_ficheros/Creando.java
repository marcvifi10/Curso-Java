/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acceso_ficheros;

/**
 *
 * @author marcv
 */

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Creando {
    
     public static void main(String[] args) {
        
        File ruta = new File("C:" + File.separator + "Users" + File.separator + "marcv" + File.separator + "Desktop" + File.separator + "nuevo_directorio" + File.separator + "prueba_texto.txt");
        
        ruta.mkdir();
        
        String archivo_destino = ruta.getAbsolutePath();
        
         try 
         {
             ruta.createNewFile();
         } 
         catch (IOException ex) 
         {
             Logger.getLogger(Creando.class.getName()).log(Level.SEVERE, null, ex);
         }
         
         Escribiendo accede_es = new Escribiendo();
         
         accede_es.escribir(archivo_destino);
         
         ruta.delete();
        
     }
    
}

class Escribiendo
{
    
    public Escribiendo()
    {
        
    }
    
    public void escribir(String ruta_archivo)
    {
        
        String frase = "Esto es un ejemplo";
        
        try
        {
            
            FileWriter escritura = new FileWriter(ruta_archivo);
        
            for(int i = 0; i < frase.length(); i++)
            {
                
                escritura.write(frase.charAt(i));
                
            }
            
            escritura.close();
            
        }
        catch(IOException e)
        {
            
        }
        
    }
    
}
