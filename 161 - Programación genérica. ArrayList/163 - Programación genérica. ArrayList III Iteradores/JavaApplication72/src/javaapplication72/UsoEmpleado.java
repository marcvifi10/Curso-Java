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
        
        ArrayList <Empleado> listaEmpleados = new ArrayList<Empleado>();
        
       /* listaEmpleados[0] = new Empleado("Ana",45,2500);
        listaEmpleados[1] = new Empleado("Antonio",55,2400);       
        listaEmpleados[2] = new Empleado("Maria",25,2600); */
        
        /* ArrayList <Empleado> listaEmpleados = new ArrayList<Empleado>();
        
        // Crea un arrayList de 11 posiciones
        // listaEmpleados.ensureCapacity(11);
        */
        listaEmpleados.add(new Empleado("Ana",45,2500));
        listaEmpleados.add(new Empleado("Antonio",55,2400));
        listaEmpleados.add(new Empleado("Maria",25,2600));
       /* 
        // Añadimos un empleado en la primera posición del array
        listaEmpleados.set(0,new Empleado("AAA",21,2000));
        
        // Cortamos el exceso de memoria
        listaEmpleados.trimToSize();
        
        System.out.println(listaEmpleados.size());
        
        System.out.println(listaEmpleados.get(2).dameDatos());
        
        
        */
        
        for(Empleado e: listaEmpleados)
        {
            
            System.out.println(e.dameDatos());
            
        } 
        
        /* for(int i = 0; i < listaEmpleados.size(); i++)
        {
            
            Empleado e = listaEmpleados.get(i);
            
            System.out.println(e.dameDatos());
            
        } */
        
         // Empleado arrayEmpleados[] = new Empleado[listaEmpleados.size()];
        
        // listaEmpleados.toArray(arrayEmpleados);
        
        /* for(int i = 0; i < arrayEmpleados.length; i++)
        {
            
            System.out.println(arrayEmpleados[i].dameDatos());
            
        } */
        
        Iterator <Empleado> mi_iterador = listaEmpleados.iterator();
        
        while(mi_iterador.hasNext())
        {
            
            System.out.println(mi_iterador.next().dameDatos());
            
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
