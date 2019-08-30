/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication70;

/**
 *
 * @author marcv
 */

import java.io.*;

public class Prueba_rutas {
    
    public static void main(String[] args) {
       
        File archivo = new File("ejemplo_archivo");
        
        System.out.println(archivo.getAbsolutePath());
        
        System.out.println(archivo.exists());
        
    }
    
}
