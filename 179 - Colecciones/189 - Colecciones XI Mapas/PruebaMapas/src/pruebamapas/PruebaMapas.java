/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebamapas;

/**
 *
 * @author marcv
 */

import java.util.*;

public class PruebaMapas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        HashMap<String,Empleado> personal = new HashMap<String,Empleado>();
        
        personal.put("145", new Empleado("Marc"));
        personal.put("155", new Empleado("Marc"));
        personal.put("165", new Empleado("Marc"));
        personal.put("175", new Empleado("Marc"));
        
        System.out.println(personal);
        
        personal.remove("145");
        System.out.println(personal);
        
        // Actualizamos el nombre del 155
        personal.put("155", new Empleado("AAA"));
        System.out.println(personal);
        
        // Devuelve toda la colección
        //System.out.println(personal.entrySet());
        
        System.out.println("");
        
        for(Map.Entry<String, Empleado> entrada : personal.entrySet())
        {
            
            String clave = entrada.getKey(); 
            Empleado valor = entrada.getValue();
            
            System.out.println("Calve = " + clave + ", Valor = " + valor);
            
        }
        
    }
    
}

class Empleado
{
    
    private String nombre;
    private double sueldo;
    
    public Empleado(String n)
    {
        
        nombre = n;
        sueldo = 1000;
        
    }
    
    public String toString()
    {
        
        return "[Nombre = " + nombre + ", sueldo = " + sueldo + "].";
        
    }
    
}
