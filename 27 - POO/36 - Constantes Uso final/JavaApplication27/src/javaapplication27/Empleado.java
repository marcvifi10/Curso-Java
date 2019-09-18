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
    
    private final String nombre;
    
    private String seccion;
    
    public Empleado(String nom)
    {
        nombre = nom;
        
        seccion = "Administración";
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
        return "El nombre es " + nombre + ", y la sección es " + seccion;
    }
    
    
}
