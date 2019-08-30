/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication43;

/**
 *
 * @author marcv
 */

import javax.swing.*;

public class Sintaxis_radio {
    
    public static void main(String[] args)
    {
        
        Marco_radio_sintaxis mimarco = new Marco_radio_sintaxis();
        
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}

class Marco_radio_sintaxis extends JFrame
{
    
    public Marco_radio_sintaxis()
    {
        
        setVisible(true);
        
        setBounds(550,100,500,300);
        
        Lamina_radio_sintaxis milamina = new Lamina_radio_sintaxis();
        
        add(milamina);
        
    }
    
}

class Lamina_radio_sintaxis extends JPanel
{
    
    public Lamina_radio_sintaxis()
    {
        
        ButtonGroup migrupo1 = new ButtonGroup();
        
        JRadioButton boton1 = new JRadioButton("Azul",false);
        
        JRadioButton boton2 = new JRadioButton("Rojo",false);
        
        JRadioButton boton3 = new JRadioButton("Amarillo",false);
        
        migrupo1.add(boton1);
        migrupo1.add(boton2);
        migrupo1.add(boton3);
        
        add(boton1);
        add(boton2);
        add(boton3);
        
    }
    
}
