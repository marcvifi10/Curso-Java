/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication35;

/**
 *
 * @author marcv
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class LaminaFoco extends JPanel {
    
    JTextField cuadro1;
    
    JTextField cuadro2;
    
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        
        // Desactivamos la colocacion por defecto
        // para poder colocar los elementos donde
        // queramos
        setLayout(null);
        
        cuadro1 = new JTextField();
        
        cuadro2 = new JTextField();
        
        cuadro1.setBounds(120,10,150,20);
        
        cuadro2.setBounds(120,50,150,20);
        
        add(cuadro1);
                
        add(cuadro2);
        
        LanzaFocos elFoco = new LanzaFocos();
        
        cuadro1.addFocusListener(elFoco);
        
    }
    
    private class LanzaFocos implements FocusListener {

        public void focusGained(FocusEvent fe) {

            System.out.println("He ganado el foco");

        }

        public void focusLost(FocusEvent fe) {

            System.out.println("He perdido el foco");

        }

    }
    
}
