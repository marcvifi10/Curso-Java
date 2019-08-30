/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication80;

import java.util.*;

/**
 *
 * @author marcv
 */
public class CuentasUsuarios {
    
    /*public static void main(String[] args)
    {
        
        Cliente c1 = new Cliente("aaa","00001",200000);
        Cliente c2 = new Cliente("Alex","00002",100000);
        Cliente c3 = new Cliente("Marc","00003",400000);
        Cliente c4 = new Cliente("Marc","00003",400000);
    
        Set <Cliente> clientesBanco = new HashSet<Cliente>();
        
        clientesBanco.add(c1);
        clientesBanco.add(c2);
        clientesBanco.add(c3);
        clientesBanco.add(c4);
        
        if(c3.equals(c4))
        {
            
            System.out.println("Son iguales");
            
            System.out.println(c3.hashCode());
            
            System.out.println(c4.hashCode());
            
        }
        else
        {
            
            System.out.println("No son iguales");
            
            System.out.println(c3.hashCode());
            
            System.out.println(c4.hashCode());
            
        }
        
        for(Cliente cliente : clientesBanco) 
        {
            
            System.out.println(cliente.getNombre() + " " + cliente.getN_cuenta() + " " + cliente.getSaldo());
            
        } 
        
        /*for(Cliente cliente : clientesBanco) 
        {
            
            // System.out.println(cliente.getNombre() + " " + cliente.getN_cuenta() + " " + cliente.getSaldo());
           
            if(cliente.getNombre().equals("Marc"))
            {
                
                clientesBanco.remove(cliente);
                
            }
            
        } 
        
        Iterator<Cliente> it = clientesBanco.iterator();
        
        while(it.hasNext())
        {
            
            String nombre_cliente = it.next().getNombre();
            
            if(nombre_cliente.equals("Marc"))
            {
                
                it.remove();
                
            }
            
        }
        
        System.out.println("");
        
        for(Cliente cliente : clientesBanco) 
        {
            
            System.out.println(cliente.getNombre() + " " + cliente.getN_cuenta() + " " + cliente.getSaldo());
            
        } 
        
       /* Iterator<Cliente> it = clientesBanco.iterator();
        
        while(it.hasNext())
        {
            
            String nombre_cliente = it.next().getNombre();
            
            System.out.println(nombre_cliente);
            
            String n_cuenta = it.next().getN_cuenta()
            
            System.out.println(n_cuenta);
            
        } 
        
    }*/
    
}
