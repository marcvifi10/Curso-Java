/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication74;

/**
 *
 * @author marcv
 */
public class UsoPareja {
    
    public static void main(String[] args)
    {
        
        Pareja<String> una = new Pareja<String>();
        
        una.setPrimero("Marc");
        
        System.out.println(una.getPrimero());
        
        Persona p1 = new Persona("Ana");
        
        Pareja<Persona> p2 = new Pareja<Persona>();
        
        p2.setPrimero(p1);
        
        System.out.println(p2.getPrimero().toString());
        
    }
    
}

class Persona
{
    
    private String nombre;
    
    public Persona(String nombre)
    {
        
        this.nombre = nombre;
        
    }
    
    public String toString()
    {
        
        return "El nombre es " + nombre;
        
    }
    
}
