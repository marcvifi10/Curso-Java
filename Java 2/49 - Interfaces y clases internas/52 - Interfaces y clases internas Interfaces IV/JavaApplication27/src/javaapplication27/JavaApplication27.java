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
import javax.swing.*;
import javax.swing.Timer;

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
        
        Empleado director = new Jefatura("ddd",8550,2000,10,10);
        
        Comparable ejemplo = new Empleado("ddd",9500,2000,01,10);
        
        if(director instanceof Empleado)
        {
            System.out.println("Es de tipo Jefatura");
        }
        
        if(ejemplo instanceof Comparable)
        {
            System.out.println("Implementa la interfaz comparable");
        }
        
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
        
        Arrays.sort(empleados);
        
        for(Empleado e:empleados)
        {
            System.out.println(e.dameDescripcion());
        }
        
        System.out.println(jefa2.establece_bonus(500));
       
        
        
        
        DameLaHora oyente = new DameLaHora();
        
        Timer temporizador = new Timer(5000, oyente);
        
        temporizador.start();
        
        JOptionPane.showMessageDialog(null,"Pulsa Aceptar para detener");
        
        System.exit(0);
        
    }
    
}
