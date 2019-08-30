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
public class JavaApplication27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Jefatura jefe = new Jefatura("Marc",55000,2006,9,25);
        
        jefe.estableceIncentivo(2520);
        
        Empleado[] empleados = new Empleado[7];
        
        empleados[0] = new Empleado("Marc",3000,2000,07,07);
        
        empleados[1] = new Empleado("Alex",3000,2000,07,07);
        
        empleados[2] = new Empleado("Juan",3000,2000,07,07);
        
        empleados[3] = new Empleado("Marc",3000,2000,07,07);
        
        empleados[4] = new Empleado("Marc",3000,2000,07,07);
    
        empleados[5] = jefe;
                
        empleados[6] = new Jefatura("Jefe",5000,1996,11,28);
    
        Jefatura jefa2 = (Jefatura) empleados[5];
        
        jefa2.estableceIncentivo(55000);
        
        // Jefatura jefe3 = (Jefatura) empleados[1];
        
        for(Empleado e: empleados)
        {
            e.subeSueldo(5);
        }
        
        Persona [] personas = new Persona[2];
        
        personas[0] = new Empleado("aaaa",50000,2009,02,25);
        
        personas[1] = new Alumno("Marc","c1");
        
        for(Persona p:personas)
        {
            System.out.println(p.dameNombre() + " , " + p.dameDescripcion());
        }
        
        Alumno p1 = new Alumno("m","");
       
    }
    
}
