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

import java.util.*;

public class Empleado {
    
    private String nombre;
    private double sueldo;
    private Date altaContrato;
    
    
    public Empleado(String nom, double sue, int agno, int mes, int dia)
    {
        nombre = nom;
        sueldo = sue;
        GregorianCalendar calendario = new GregorianCalendar(agno,mes-1,dia);
   
        altaContrato = calendario.getTime();
    }
    
    public Empleado(String nom)
    {
        nombre = nom;
        
        // Llama al otro constructor
        //this(nom, 3000.00, 2000, 01, 01);
    }
    
    public String getNom()        
    {
        return nombre;
    }
    
    public double getSueldo()        
    {
        return sueldo;
    }
    
    public Date getFecha()        
    {
        return altaContrato;
    }
    
    public void subeSueldo(double porcentaje)
    {
        double aumento=sueldo*porcentaje/100;
        
        sueldo+=aumento;
        
        
    }
}
