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
public class JavaApplication26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Coche c1 = new Coche();
        
        System.out.println(c1.getRuedas());
        
        c1.setRuedas(5);
        
        System.out.println(c1.getRuedas());
        
        c1.setColor("Rojo");
        
        System.out.println(c1.getColor());
        
        String p2 = c1.precio(1000.00);
        
        System.out.println(p2);
        
        Empleado e1 = new Empleado("Marc",85000.00, 1990, 12, 17);
        
        Empleado e2 = new Empleado("AAA",85000.00, 1990, 12, 17);
        
        Empleado e3 = new Empleado("BBB",85000.00, 1990, 12, 17);
        
        e1.subeSueldo(5);
        
        /*System.out.println("Nombre: " + e1.getNom() + "\nSueldo: " + e1.getSueldo() + "\nFecha de alta: " + e1.getFecha());
        
        System.out.println("Nombre: " + e2.getNom() + "\nSueldo: " + e2.getSueldo() + "\nFecha de alta: " + e2.getFecha());
        
        System.out.println("Nombre: " + e2.getNom() + "\nSueldo: " + e2.getSueldo() + "\nFecha de alta: " + e2.getFecha());*/
        
        Empleado[] empleados = new Empleado[3];
        
        empleados[0] = new Empleado("Marc",85000.00, 1990, 12, 17);
        
        empleados[1] = new Empleado("AAA",85000.00, 1990, 12, 17);
        
        empleados[2] = new Empleado("BBB",85000.00, 1990, 12, 17);
    
        for(int i = 0; i < 3; i++)
        {
            empleados[i].subeSueldo(5);
        }
        
        for(int i = 0; i < 3; i++)
        {
            System.out.println(empleados[i].getNom());
        }
    }
    
}
