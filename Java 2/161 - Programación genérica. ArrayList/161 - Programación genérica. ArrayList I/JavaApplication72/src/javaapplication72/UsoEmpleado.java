/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication72;

/**
 *
 * @author marcv
 */

import java.util.*;

public class UsoEmpleado {
    
    public static void main(String[] args) {
        
        /* Empleado listaEmpleados[] = new Empleado[3];
        
        listaEmpleados[0] = new Empleado("Ana",45,2500);
        listaEmpleados[1] = new Empleado("Antonio",55,2400);       
        listaEmpleados[2] = new Empleado("Maria",25,2600); */
        
        ArrayList <Empleado> listaEmpleados = new ArrayList<Empleado>();
        
        // Crea un arrayList de 11 posiciones
        // listaEmpleados.ensureCapacity(11);
        
        listaEmpleados.add(new Empleado("Ana",45,2500));
        listaEmpleados.add(new Empleado("Antonio",55,2400));
        listaEmpleados.add(new Empleado("Maria",25,2600));
        
        // Cortamos el exceso de memoria
        listaEmpleados.trimToSize();
        
        System.out.println(listaEmpleados.size());
        
        for(Empleado e: listaEmpleados)
        {
            
            System.out.println(e.dameDatos());
            
        }
        
    }
    
}

class Empleado
{
    
    private String nombre;
    
    private int edad;
    
    private double salario;
    
    public Empleado(String nombre, int edad, double salario)
    {
        
        this.nombre = nombre;
        
        this.salario = salario;
        
        this.edad = edad;
        
    }
    
    public String dameDatos()
    {
        
        return "El empleado se llama " + nombre + ", tiene " + edad + " años, " + " y un salario de " + salario + " euros."; 
        
    }
    
}
