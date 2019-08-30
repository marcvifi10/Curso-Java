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
public class Jefatura extends Empleado{
    
    private double incentivo;
    
    public Jefatura(String nom, double sue, int agno, int mes, int dia) 
    {
        super(nom, sue, agno, mes, dia);
    }
    
    public void estableceIncentivo(double b)
    {
        incentivo=b;
    }
    
    public double getSueldo()
    {
        double sueldoJefe = super.dameSueldo();
                
        return sueldoJefe + incentivo;
    }
}
