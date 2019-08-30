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

import java.util.*;

public class Empleado extends Persona implements Comparable, Trabajadores {
    
    private String nombre;
    
    private String seccion;
    
    private double sueldo;
    
    private int id;
    
    private Date altaContrato;
    
    private static int idSiguiente = 1;
    
    /*public Empleado(String nom)
    {
        nombre = nom;
        
        seccion = "Administración";
        
        id = idSiguiente;
        
        idSiguiente++;  
    }*/
    
    public Empleado(String nom, double sue, int agno, int mes, int dia)
    {
        super(nom);
        
        nombre = nom;
        
        sueldo = sue;
        
        GregorianCalendar calendario = new GregorianCalendar(agno,mes-1,dia);
    
        altaContrato = calendario.getTime();
        
        idSiguiente++;
        
        id = idSiguiente;
    }
    
    public Empleado(String nom)
    {
        this(nom, 1000, 2000, 01, 01);
    }
    
    public String dameDescripcion()
    {
        return "El sueldo es " + sueldo +" Este empleado se llama " + nombre + " y tiene un ID="+id+".";
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
        return "El sueldo es " + sueldo +", elnombre es " + nombre + ", y la sección es " + seccion + " y el Id " + id + ".";
    }
    
    public double dameSueldo()
    {
        return sueldo;
    }
    
    public Date dameFechaContrato()
    {
        return altaContrato;
    }
    
    public void subeSueldo(double porcentaje)
    {
        double aumento = sueldo * (porcentaje/100);
        
        sueldo += aumento;
    }
    
    public int compareTo(Object miObjeto)
    {
        Empleado empleado = (Empleado) miObjeto;
        
        if(this.sueldo<empleado.sueldo)
        {
            return -1;
        }
        if(this.sueldo>empleado.sueldo)
        {
            return 1;
        }
        
        return 0;
    }

    public String tomar_decisiones(String decision) {
        return "Not supported yet."; 
    }

    public double establece_bonus(double gratificacion) {
        
        return Trabajadores.base_bonus + gratificacion;
    }
}
