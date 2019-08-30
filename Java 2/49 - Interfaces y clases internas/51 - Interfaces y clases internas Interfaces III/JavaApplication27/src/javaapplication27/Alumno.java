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
public class Alumno extends Persona {
    
    protected String carrera;
    
    public Alumno(String nom, String carrera)
    {
        super(nom);
        
        this.carrera = carrera;
    }
    
    public String dameDescripcion()
    {
        return "Descripción!!";
    }
}
