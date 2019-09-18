/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication76;

/**
 *
 * @author marcv
 */
public class HerenciaGenericos {
    
    public static void main(String[] args) {
        
        /* Empleado Administrativa = new Empleado("Helena",45,1500);
        
        Jefe DirectoraComercial = new Jefe("Ana",27,3500);
        
        Empleado nuevoEmpleado = DirectoraComercial; */
        
        Pareja<Empleado> Administrativa = new Pareja<Empleado>();
        
        Pareja<Jefe> DirectoraComercial = new Pareja<Jefe>();
        
        Pareja.imprimirTrabajador(Administrativa);
        
        Pareja.imprimirTrabajador(DirectoraComercial);
        
    }
    
}
