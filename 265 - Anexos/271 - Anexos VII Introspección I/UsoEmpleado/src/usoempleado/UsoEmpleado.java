/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usoempleado;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author marcv
 */
public class UsoEmpleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Persona Antonio = new Persona("Antonio");    
        System.out.println(Antonio.getNombre());
        
        Empleado Ana = new Empleado("Ana",3600);    
        System.out.println(Ana.getNombre() + "\n" + Ana.getSalario()); 
        System.out.println(Antonio.getClass());
        
        Class cl1 = Antonio.getClass();
        System.out.println(cl1.getName());
        
        String nombreClase = "introspeccion.Empleado";
        
        try 
        {
            
            Class cl2 = Class.forName(nombreClase);
            System.out.println(cl1.getName());
            
        } 
        catch (ClassNotFoundException ex) 
        {
            
            Logger.getLogger(UsoEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        
        }
        
    }
    
}

class Persona
{
    
    private String nombre;
    
    public Persona(String nombre)
    {
        
        this.nombre = nombre;
        
    }

    public String getNombre() 
    {
        
        return nombre;
        
    }
    
}

class Empleado extends Persona
{
    
    private double salario;
    
    public Empleado(String nombre, double salario)
    {
        
        super(nombre);
        this.salario = salario;
        
    }
    
    public void setIncentivo(double incentivo)
    {
        
        salario = salario + incentivo;
        
    }
    
    public String getSalario() 
    {
        
        return "Salario = " + salario;
        
    }
    
}

