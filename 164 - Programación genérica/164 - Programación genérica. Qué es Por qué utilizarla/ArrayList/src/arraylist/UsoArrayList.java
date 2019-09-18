/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;

/**
 *
 * @author marcv
 */

import java.io.*;

public class UsoArrayList {
    
    public static void main(String[] args)
    {
        
        ArrayList archivos = new ArrayList(5);
        
        archivos.add("Juan");
        archivos.add("Marc");
        archivos.add("Alex");
        archivos.add("Maria");
        
        archivos.add(new File("gg.accdb"));
        
        String nombrePersona = (String)archivos.get(2);
        
        // File nombrePersona = (File)archivos.get(0);
        
        System.out.println(nombrePersona);
        
    }
    
}
