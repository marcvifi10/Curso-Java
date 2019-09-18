/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancosinsincronizar;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author marcv
 */
public class BancoSinSincronizar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Banco b = new Banco();
        
        for(int i = 0; i < 100; i++)
        {
            
            EjecucionTransferencias r = new EjecucionTransferencias(b,i,2000);
            
            Thread t = new Thread(r);
            
            t.start();
            
        }
        
    }
    
}

class Banco 
{
    
    private final double[] cuentas;
    
    public Banco()
    {
       
        cuentas = new double[100]; 
        
        for(int i = 0; i < cuentas.length; i++)
        {
            
            cuentas[i] = 2000;
            
        }
        
    }
    
    public void transferencia(int cuentaOrigen, int cuentaDestino, double cantidad)
    {
        
        if(cuentas[cuentaOrigen] < cantidad)
        {
            
            return;
            
        }
        
        System.out.println(Thread.currentThread());
        
        cuentas[cuentaOrigen] -= cantidad;
        
        System.out.printf("%10.2f de %d para %d",cantidad, cuentaOrigen, cuentaDestino);
        
        cuentas[cuentaDestino] += cantidad;
        
        System.out.printf(" Saldo total: %10.2f%n", getSaldoTotal());
        
    }
    
    public double getSaldoTotal()
    {
        
        double suma_cuentas = 0;
        
        for(double a: cuentas)
        {
            
            suma_cuentas += a;
            
        }
        
        return suma_cuentas;
        
    }
    
}

class EjecucionTransferencias implements Runnable
{
    
    private Banco banco;
    private int deLaCuenta;
    private double cantidadMax;
    
    public EjecucionTransferencias(Banco b, int de, double max)
    {
        
        banco = b;
        deLaCuenta = de;
        cantidadMax = max;
        
    }

    @Override
    public void run() {
       
        while(true)
        {
            
            int paraLaCuenta = (int)(100*Math.random());
            
            double cantidad = cantidadMax * Math.random();
            
            banco.transferencia(deLaCuenta, paraLaCuenta, cantidad);
            
            try 
            {
                Thread.sleep((int)(Math.random()*10));
            } 
            catch (InterruptedException ex) 
            {
                Logger.getLogger(EjecucionTransferencias.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
    }  
    
}
