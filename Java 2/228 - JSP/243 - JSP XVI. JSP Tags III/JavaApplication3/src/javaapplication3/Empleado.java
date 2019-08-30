/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author marcv
 */
public class Empleado {
    
    private String nombre;
    
    private String apellido;
    
    private String puesto;
    
    private double salario;
    
    public Empleado(String nombre, String apellido, String puesto, double salario)
    {
        
        super();
        this.nombre = nombre;
        this.apellido = apellido;
        this.puesto = puesto;
        this.salario = salario;
        
    }

    public String getNombre() 
    {
        return nombre;
    }

    public String getApellido() 
    {
        return apellido;
    }

    public String getPuesto() 
    {
        return puesto;
    }

    public double getSalario() 
    {
        return salario;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) 
    {
        this.apellido = apellido;
    }

    public void setPuesto(String puesto) 
    {
        this.puesto = puesto;
    }

    public void setSalario(double salario) 
    {
        this.salario = salario;
    }
    
    
}
