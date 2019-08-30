/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication55;

/**
 *
 * @author marcv
 */

import javax.swing.*;
import java.awt.*;

public class LibreDisposicion {
    
    public static void main(String[] args) {
        
        MarcoLibre mimarco = new MarcoLibre();
        
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}

class MarcoLibre extends JFrame
{

    public MarcoLibre()
    {
        
        setBounds(450,350,600,400);
        
        LaminaLibre milamina = new LaminaLibre();
        
        add(milamina);
        
        setVisible(true);
        
    }
    
}

class LaminaLibre extends JPanel
{
    
    public LaminaLibre()
    {
        
        setLayout(null);
        
        /* JButton boton1 = new JButton("Boton 1");
        
        boton1.setBounds(500,300,120,25);
        
        JButton boton2 = new JButton("Boton 2");
        
        boton2.setBounds(200,100,120,25);
        
        add(boton1);
        
        add(boton2); */
        
        JLabel nombre = new JLabel("Nombre: ");
        
        JLabel apellido = new JLabel("Apellido: ");
        
        JTextField c_nombre = new JTextField();
        
        JTextField c_apellido = new JTextField();
        
        nombre.setBounds(20,20,80,10);
        
        c_nombre.setBounds(100,20,100,20);
        
        apellido.setBounds(20,60,80,10);
        
        c_apellido.setBounds(100,55,100,20);
        
        add(nombre);
        
        add(apellido);
        
        add(c_nombre);
        
        add(c_apellido);
        
    }
    
}
