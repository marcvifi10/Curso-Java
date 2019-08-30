/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication27;

/**
 *
 * @author marcv
 */
public class Empleado {
    
    private String nombre;
    
    private String seccion;
    
    private int id;
    
    private static int idSiguiente = 1;
    
    public Empleado(String nom)
    {
        nombre = nom;
        
        seccion = "Administración";
        
        id = idSiguiente;
        
        idSiguiente++;
        
    }
    
    public void cambiaSeccion(String seccion)
    {
        this.seccion = seccion;   
    }
    
    public void cambiaNombre(String nombre)
    {
        this.nombre = nombre;   
    }
    
    public String getDatos()
    {
        return "El nombre es " + nombre + ", y la sección es " + seccion + " y el Id " + id + ".";
    }
    
    public static String getIdSiguiente()
    {
        return "El IdSiguiente es: " + idSiguiente;
    }
}
