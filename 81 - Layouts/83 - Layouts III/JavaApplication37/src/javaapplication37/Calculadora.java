/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication37;

/**
 *
 * @author marcv
 */

import java.awt.*;
import javax.swing.*;

public class Calculadora {
    
    public static void main(String[] args) {
        
        MarcoCalculadora mimarco = new MarcoCalculadora();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mimarco.setVisible(true);
        
    }
    
}

class MarcoCalculadora extends JFrame
{
    
    public MarcoCalculadora()
    {
        
        setTitle("Calculadora");
        setBounds(500,300,450,300);
        LaminaCalculadora milamina = new LaminaCalculadora();
        add(milamina);
        
    }
    
}

class LaminaCalculadora extends JPanel
{
    
    private JPanel lamina2;
    
    public LaminaCalculadora()
    {
        
        setLayout(new BorderLayout());
        JButton pantalla = new JButton("0");
        pantalla.setEnabled(false);
        add(pantalla,BorderLayout.NORTH);
        
        lamina2 = new JPanel();
        lamina2.setLayout(new GridLayout(4,4));
        
        ponerBotones("7");
        ponerBotones("8");
        ponerBotones("9");
        
        ponerBotones("/");
        ponerBotones("4");
        ponerBotones("5");
        ponerBotones("6");
        
        ponerBotones("*");
        ponerBotones("1");
        ponerBotones("2");
        ponerBotones("3");
        
        ponerBotones("-");
        
        ponerBotones("0");
        ponerBotones(".");
        ponerBotones("=");
        ponerBotones("+");
        
        add(lamina2,BorderLayout.CENTER);
        
    }
    
    private void ponerBotones(String rotulo)
    {
        
        JButton boton = new JButton(rotulo);
        lamina2.add(boton);
        
    }
    
}
