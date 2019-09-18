/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication80;

/**
 *
 * @author marcv
 */
public class Cliente {
    
    private String nombre;
    
    private String n_cuenta;
    
    private double saldo;
    
    public Cliente(String nombre, String n_cuenta, int saldo)
    {
        
        this.nombre = nombre;
        this.n_cuenta = n_cuenta;
        this.saldo = saldo;
        
    }

    public String getNombre() 
    {
        return nombre;
    }

    public String getN_cuenta() 
    {
        return n_cuenta;
    }

    public double getSaldo() 
    {
        return saldo;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public void setN_cuenta(String n_cuenta) 
    {
        this.n_cuenta = n_cuenta;
    }

    public void setSaldo(double saldo) 
    {
        this.saldo = saldo;
    }
    
    
    
}
