/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebalistaenlazada;

/**
 *
 * @author marcv
 */

import java.util.*;

public class PruebaListaEnlazada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        LinkedList<String> paises = new LinkedList<String>();
        
        paises.add("España");
        paises.add("Alemania");
        paises.add("Colombia");
        paises.add("Mexico");
        
        LinkedList<String> capitales = new LinkedList<String>();
        
        capitales.add("Madrid");
        capitales.add("Berlín");
        capitales.add("Bogota");
        capitales.add("Ciudad de México");
        
        /*System.out.println(paises);
        System.out.println("");
        System.out.println(capitales);*/
        
        ListIterator<String> iterA = paises.listIterator();
        ListIterator<String> iterB = capitales.listIterator();
        
        while(iterB.hasNext())
        {
            
            if(iterA.hasNext())
            {
                
                iterA.next();
                
            }
            
            iterA.add(iterB.next());
            
        }
        
        System.out.println(paises);
        
        iterB = capitales.listIterator();
        
        while(iterB.hasNext())
        {
            
            iterB.next();
            
            if(iterB.hasNext())
            {
                
                iterB.next();
                
                iterB.remove();
                
            }
            
        }
        
        System.out.println(capitales);
        
        paises.removeAll(capitales);
        
        System.out.println(paises);
        
    }
    
}
