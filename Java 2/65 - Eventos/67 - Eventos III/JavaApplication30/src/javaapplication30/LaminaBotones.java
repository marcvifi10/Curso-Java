/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication30;

/**
 *
 * @author marcv
 */

import java.awt.*;

import java.awt.event.*;
        
import javax.swing.*;

public class LaminaBotones extends JPanel {
    
    JButton botonAzul = new JButton("Azul");
    
    JButton botonAmarillo = new JButton("Amarillo");
    
    JButton botonRojo = new JButton("Rojo");
    
    public LaminaBotones()
    {
        add(botonAzul);
        
        add(botonAmarillo);
        
        add(botonRojo);
        
        ColorFondo Amarillo = new ColorFondo(Color.yellow);
        
        ColorFondo Rojo = new ColorFondo(Color.red);
        
        ColorFondo Azul = new ColorFondo(Color.blue);
        
        botonAzul.addActionListener(Azul);
        
        botonRojo.addActionListener(Rojo);
        
        botonAmarillo.addActionListener(Amarillo);
        
    }
    
    public class ColorFondo implements ActionListener {

        private Color colorDeFondo;

        public ColorFondo(Color c)
        {
            colorDeFondo = c;
        }

        public void actionPerformed(ActionEvent e)
        {
            setBackground(colorDeFondo);
        }

    }
    
}
