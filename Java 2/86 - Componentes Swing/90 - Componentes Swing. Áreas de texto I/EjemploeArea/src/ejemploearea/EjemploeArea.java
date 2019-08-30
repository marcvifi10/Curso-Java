/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploearea;

/**
 *
 * @author marcv
 */

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JFrame;

public class EjemploeArea {

    public static void main(String[] args) {
        
        MarcoArea mimarco = new MarcoArea();
        
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}

class MarcoArea extends JFrame
{
    
    public MarcoArea()
    {
        
        setBounds(500,300,500,350);
        
        LaminaArea milamina = new LaminaArea();
        
        add(milamina);
        
        setVisible(true);
        
    }
    
}

class LaminaArea extends JPanel
{
    
    private JTextArea area_texto;
    
    public LaminaArea()
    {
        
        area_texto = new JTextArea(8,20);
        
        JScrollPane laminaBarras = new JScrollPane(area_texto);
        
        // area_texto.setLineWrap(true);
        
        add(laminaBarras);
        
        JButton boton = new JButton("Dale");
        
        boton.addActionListener(new GestionaArea());
        
        add(boton);
        
    }
    
    private class GestionaArea implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent ae) {
            
            System.out.println(area_texto.getText());
            
        }
        
        
        
    }
    
}
