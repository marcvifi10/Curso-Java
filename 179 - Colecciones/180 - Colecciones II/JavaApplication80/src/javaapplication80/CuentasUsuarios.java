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
    
    public static void main(String[] args)
    {
        
        Cliente c1 = new Cliente("aaa","00001",200000);
        Cliente c2 = new Cliente("Alex","00002",100000);
        Cliente c3 = new Cliente("Marc","00003",400000);
    
        Set <Cliente> clientesBanco = new HashSet<Cliente>();
        
        clientesBanco.add(c1);
        clientesBanco.add(c2);
        clientesBanco.add(c3);
        
        for(Cliente cliente : clientesBanco) 
        {
            
            System.out.println(cliente.getNombre() + " " + cliente.getN_cuenta() + " " + cliente.getSaldo());
            
        }
        
    }
    
}
