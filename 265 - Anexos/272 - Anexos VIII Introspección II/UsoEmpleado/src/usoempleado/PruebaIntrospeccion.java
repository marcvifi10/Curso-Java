/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usoempleado;

import java.lang.reflect.*;
import java.util.*;

/**
 *
 * @author marcv
 */
public class PruebaIntrospeccion {
    
    public static void main(String[] args)
    {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Intrduce el nombre de la clase: ");

        String nombreClase;
        
        nombreClase = entrada.next();
        
        // Imprimir clase y superclase
        
        try
        {
            
            Class cl = Class.forName(nombreClase);
            
            Class superCl = cl.getSuperclass();
            
            System.out.println("Clase: " + nombreClase);
            
            if(superCl != null && superCl != Object.class)
            {
                
                System.out.println(" extends " + superCl.getName());
                
            }
            
            System.out.println();
            
            imprimirConstructores(cl);
            
            System.out.println();
            
            imprimitMetodos(cl);
            
            System.out.println();
            
            imprimirCampos(cl);
            
        }
        catch(Exception e)
        {
            
            e.printStackTrace();
            
            System.exit(0);
            
        }
        
    }
    
    public static void imprimirConstructores(Class cl)
    {
        
        Constructor[] constructores = cl.getDeclaredConstructors();
        
        for(Constructor c: constructores)
        {
            
            String nombre = c.getName();
            
            System.out.println(" " + Modifier.toString(c.getModifiers()));
            
            System.out.println(" " + nombre + "(");
            
            // Imprimir parámetros
            
            Class[] tipoParams = c.getParameterTypes();
            
            for(int i = 0; i < tipoParams.length; i++)
            {
                
                if(i > 0)
                {
                    
                    System.out.print(", ");
                    
                    System.out.print(tipoParams[i].getName());
                    
                }
                
            }
            
            System.out.print(");");
            
        }
        
    }
    
}
