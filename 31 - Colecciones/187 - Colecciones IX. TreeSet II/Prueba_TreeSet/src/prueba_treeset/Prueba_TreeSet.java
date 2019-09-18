/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba_treeset;

/**
 *
 * @author marcv
 */

import java.util.*;

public class Prueba_TreeSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* TreeSet<String> ordenaPersonas = new TreeSet<String>();
        
        ordenaPersonas.add("Sandra");
        ordenaPersonas.add("Amanda");
        ordenaPersonas.add("Diana");
        
        for(String s : ordenaPersonas)
        {
            
            System.out.println(s);
            
        } */
        
        Articulo primero = new Articulo(1, "Primer articulo");  
        Articulo segundo = new Articulo(2, "Segundo articulo");
        Articulo tercero = new Articulo(3, "Tercer articulo");
        
        TreeSet<Articulo> ordenaArticulos = new TreeSet<Articulo>();
        
        ordenaArticulos.add(tercero);
        ordenaArticulos.add(segundo);
        ordenaArticulos.add(primero);
        
        for(Articulo art : ordenaArticulos)
        {
            
            System.out.println(art.getDescripcion());
            
        }
        
        System.out.println();
        
        Articulo comparadorArt = new Articulo();
        
        TreeSet <Articulo> ordenaArticulos2 = new TreeSet<Articulo>(comparadorArt);
        
        ordenaArticulos2.add(primero);
        ordenaArticulos2.add(segundo);
        ordenaArticulos2.add(tercero);
        
        for(Articulo art : ordenaArticulos2)
        {
            
            System.out.println(art.getDescripcion());
            
        }
        
    }
    
}

class Articulo implements Comparable<Articulo>, Comparator<Articulo>
{
    
    private int numero_articulo;
    private String descripcion;
    
    public Articulo()
    {
        
        
        
    }
    
    public Articulo(int num, String desc)
    {
        
        numero_articulo = num;
        
        descripcion = desc;
        
    }

    @Override
    public int compareTo(Articulo t) {
        
        return numero_articulo - t.numero_articulo;
        
    }
    
    public String getDescripcion()
    {
        
        return descripcion;
        
    }

    @Override
    public int compare(Articulo arg0, Articulo arg1) {
        
        String descripcionA = arg0.getDescripcion();
        String descripcionB = arg1.getDescripcion();
        
        return descripcionA.compareTo(descripcionB);
 
    }
 
}
