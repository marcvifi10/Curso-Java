/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sincronizandohilos;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author marcv
 */
public class SincronizandoHilos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        
        HilosVarios hilo1 = new HilosVarios();
        
        hilo1.start();
        
        HilosVarios2 hilo2 = new HilosVarios2(hilo1);
        
        hilo1.join();
        
        hilo2.start();
        
        hilo2.join();
        
        System.out.println("FIN!!!");
        
    }
    
}

class HilosVarios extends Thread
{
    
    public void run()
    {
        
        for(int i = 0; i < 15; i++)
        {
            
            System.out.println("Ejecutando hilo " + (i+1) + ": " + getName());
            
            try 
            {
                Thread.sleep(700);
            } 
            catch (InterruptedException ex) 
            {
                Logger.getLogger(HilosVarios.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
    }
    
}

class HilosVarios2 extends Thread
{
    
    private Thread hilo;
    
    public HilosVarios2(Thread hilo)
    {
        
        this.hilo = hilo;
        
    }        
    
    public void run()
    {
        
        try {
            hilo.join();
            
            for(int i = 0; i < 15; i++) 
            {
                
                System.out.println("Ejecutando hilo " + (i+1) + ": " + getName());
                
                try
                {
                    Thread.sleep(700);
                }
                catch (InterruptedException ex)
                {
                    Logger.getLogger(HilosVarios.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        } catch (InterruptedException ex) {            
            Logger.getLogger(HilosVarios2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
