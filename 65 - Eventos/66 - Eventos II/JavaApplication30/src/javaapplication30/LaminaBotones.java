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

public class LaminaBotones extends JPanel implements ActionListener {
    
    JButton botonAzul = new JButton("Azul");
    
    JButton botonAmarillo = new JButton("Amarillo");
    
    JButton botonRojo = new JButton("Rojo");
    
    public LaminaBotones()
    {
        add(botonAzul);
        
        add(botonAmarillo);
        
        add(botonRojo);
        
        botonAzul.addActionListener(this);
        
        botonRojo.addActionListener(this);
        
        botonAmarillo.addActionListener(this);
        
    }
    
    public void actionPerformed(ActionEvent e)
    {
        
        Object botonPulsado = e.getSource();
        
        if(botonPulsado==botonAzul)
        {
            setBackground(Color.blue);
        }
        else if(botonPulsado==botonAmarillo)
        {
            setBackground(Color.yellow);
        }
        else if(botonPulsado==botonRojo)
        {
            setBackground(Color.red);
        }
        else
        {
            setBackground(Color.white);
        }
        
    }
    
}
