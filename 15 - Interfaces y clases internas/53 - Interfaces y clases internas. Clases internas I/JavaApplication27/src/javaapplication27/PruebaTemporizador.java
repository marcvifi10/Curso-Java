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

import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;
import java.awt.Toolkit;

public class PruebaTemporizador {
    
    
}

class Reloj
{
    private int intervalo;
            
    private boolean sonido;
    
    public Reloj(int intervalo, boolean sonido)
    {
        this.intervalo = intervalo;
        this.sonido = sonido;
    }
    
    public void enMarcha()
    {
        ActionListener oyente = new DameLaHora2();
        
        Timer mitemporizador = new Timer(intervalo,oyente);
    
        mitemporizador.start();
    }
    
    private class DameLaHora2 implements ActionListener
    {
        public void actionPerformed(ActionEvent evento)
        {
            Date ahora = new Date();
            
            System.out.println(ahora);
            
            if(sonido==true)
            {
                Toolkit.getDefaultToolkit().beep();
            }
        }
    }
    
}