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
public class Pareja<T> {
    
    private T primero;
    
    public Pareja()
    {
        
        primero = null;
        
    }
    
    public void setPrimero(T nuevoValor)
    {
        
        primero = nuevoValor;
        
    }
    
    public static void imprimirTrabajador(Pareja<? extends Empleado> p)
    {
        
        Empleado primero = p.getPrimero();
        
        System.out.println(primero);
        
    }
    
    public T getPrimero()
    {
        
        return primero;
        
    }
    
}
