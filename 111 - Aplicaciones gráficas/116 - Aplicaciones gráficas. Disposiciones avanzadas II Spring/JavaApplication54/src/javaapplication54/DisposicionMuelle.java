/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication54;

/**
 *
 * @author marcv
 */

import javax.swing.*;

public class DisposicionMuelle {
    
    public static void main(String[] args) {
        
        MarcoMuelle mimarco = new MarcoMuelle();
        
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}

class MarcoMuelle extends JFrame
{
    
    public MarcoMuelle()
    {
        
        setBounds(300,400,1000,350);
        
        LaminaMuelle milamina = new LaminaMuelle();
        
        add(milamina);
        
        setVisible(true);
        
    }
    
}

class LaminaMuelle extends JPanel
{
    
    public LaminaMuelle()
    {
        
        JButton boton1 = new JButton("Boton 1");
        
        JButton boton2 = new JButton("Boton 2");
        
        JButton boton3 = new JButton("Boton 3");
        
        SpringLayout milayout = new SpringLayout();
        
        setLayout(milayout);
        
        add(boton1);
        
        add(boton2);
        
        add(boton3);
        
        Spring mimuelle = Spring.constant(0,10,100);
        
        milayout.putConstraint(SpringLayout.WEST, boton1, mimuelle, SpringLayout.WEST, this);
        
        milayout.putConstraint(SpringLayout.WEST, boton2, mimuelle, SpringLayout.EAST, boton1);
        
        milayout.putConstraint(SpringLayout.WEST, boton3, mimuelle, SpringLayout.EAST, boton2);
        
        milayout.putConstraint(SpringLayout.EAST, this, mimuelle, SpringLayout.EAST, boton3);
        
    }
    
}
