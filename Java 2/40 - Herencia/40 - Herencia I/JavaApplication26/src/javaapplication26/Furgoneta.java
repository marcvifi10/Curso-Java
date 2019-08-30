/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication26;

/**
 *
 * @author marcv
 */
public class Furgoneta extends Coche {
    
    private int capacidad_extra;
    
    private int plazas_extra;
    
    public Furgoneta(int plazas_extra, int capacidad_extra)
    {
        // Llamamos al constructor de la clase padre
        super();
        
        this.capacidad_extra = capacidad_extra;
        this.plazas_extra = plazas_extra;
        
    }
    
}
