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
public abstract class Persona {
    
    private String nombre;
    
    public Persona(String nom)
    {
        nombre = nom;
    }
    
    public String dameNombre()
    {
        return nombre;
    }
    
    public abstract String dameDescripcion();
    
}
