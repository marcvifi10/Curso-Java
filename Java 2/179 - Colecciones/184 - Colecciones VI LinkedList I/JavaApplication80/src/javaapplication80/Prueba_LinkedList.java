/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication80;

/**
 *
 * @author marcv
 */

import java.util.*;

public class Prueba_LinkedList {
    
    public static void main(String[] args)
    {
        
        LinkedList<String> personas = new LinkedList<String>();
        
        personas.add("Pepe");
        personas.add("Sandra");
        personas.add("Ana");
        personas.add("Marc");
        
        System.out.println(personas.size());
        System.out.println("");
        
        ListIterator<String> it = personas.listIterator();
        
        it.next();
        
        it.add("Juan");
        
        for(String persona : personas)
        {
            
            System.out.println(persona);
            
        }
        
    }
    
}
