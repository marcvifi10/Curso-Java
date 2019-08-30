/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication36;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author marcv
 */
public class PruebaAcciones {
    
    public static void main(String[] args) {
        
        MarcoAccion marco = new MarcoAccion();
        
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        marco.setVisible(true);
        
    }
    
}

class MarcoAccion extends JFrame
{
    
    public MarcoAccion()
    {
        setTitle("Prueba Acciones");
        
        setBounds(600,350,500,300);
        
        PanelAccion lamina = new PanelAccion();
        
        add(lamina);
        
    }
}


class PanelAccion extends JPanel
{
    
    public PanelAccion()
    {
        
        JButton botonAmarillo = new JButton("Amarillo");
        
        JButton botonRojo = new JButton("Rojo");
        
        JButton botonAzul = new JButton("Azul");
        
        add(botonAmarillo);
        
        add(botonAzul);
        
        add(botonRojo);
        
    }
    
}

class AccionColor extends AbstractAction
{

    public void actionPerformed(ActionEvent ae) {
        
    }
    
}
