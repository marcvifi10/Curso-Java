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
        
        setLayout(new EnColumnas());
        
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
        
        /*nombre.setBounds(20,20,80,10); */
        
        /* c_nombre.setBounds(100,20,100,20); */
        
        /* apellido.setBounds(20,60,80,10); */
        
        /* c_apellido.setBounds(100,55,100,20); */
        
        add(nombre);
        
        add(c_nombre);
        
        add(apellido);
        
        add(c_apellido);
        
    }
    
}

class EnColumnas implements LayoutManager
{
    
    private int x = 20;
    private int y = 20;

    @Override
    public void addLayoutComponent(String string, Component cmpnt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeLayoutComponent(Component cmpnt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Dimension preferredLayoutSize(Container cntnr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Dimension minimumLayoutSize(Container cntnr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void layoutContainer(Container micontenedor) {
        
        int contador = 0;
        int n = micontenedor.getComponentCount();
        
        for(int i = 0; i < n; i++)
        {
            
            contador++;
            
            Component c = micontenedor.getComponent(i);
            
            c.setBounds(x, y, 100, 20);
            
            x += 100;
            
            if(contador % 2 == 0)
            {
                x = 20;
                y += 40;
            }
            
        }
        
    }
    
    
    
}
