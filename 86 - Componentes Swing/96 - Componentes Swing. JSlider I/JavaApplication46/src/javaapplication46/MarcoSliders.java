/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication46;

/**
 *
 * @author marcv
 */

import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;

public class MarcoSliders {
    
    public static void main(String[] args) {
        
        Frame_Sliders mimarco = new Frame_Sliders();
        
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}

class Frame_Sliders extends JFrame
{
    
    public Frame_Sliders()
    {
        
        setBounds(550,400,550,350);
        
        Lamina_Sliders milamina = new Lamina_Sliders();
        
        add(milamina);
        
        setVisible(true);
        
    }
    
}

class Lamina_Sliders extends JPanel
{
    
    public Lamina_Sliders()
    {
        
        JSlider control = new JSlider(SwingConstants.HORIZONTAL,0,100,50);
        
        // control.setOrientation(SwingConstants.VERTICAL);
        
        control.setMajorTickSpacing(25);
        control.setMinorTickSpacing(5);
        
        control.setPaintTicks(true);
        
        control.setPaintLabels(true);
        
        control.setFont(new Font("Serif",Font.ITALIC,12));
        
        control.setSnapToTicks(true);
        
        add(control);
        
    }
    
}
