/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication48;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;

/**
 *
 * @author marcv
 */

public class MarcoSpinner 
{
    
    public static void main(String[] args)
    {
        FrameSpinner mimarco2 = new FrameSpinner();
        
        mimarco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        mimarco2.setVisible(true);
    }
}

class FrameSpinner extends JFrame
{
    
    public FrameSpinner()
    {
        
        setBounds(550,350,550,350);
        
        setVisible(true);
        
        add(new LaminaSpinner());
        
    }
    
}

class LaminaSpinner extends JPanel
{
    
    public LaminaSpinner()
    {
        
        // String lista[]=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        
        JSpinner control = new JSpinner(new SpinnerNumberModel(5,0,10,1){
            
            
            public Object getNextValue()
            {
           
                return super.getPreviousValue();
            
            }
        
            public Object getPreviousValue()
            {
            
                return super.getNextValue();
            
            }
            
        
        });
        
        Dimension d = new Dimension(200,20);
        
        control.setPreferredSize(d);
        
        add(control);
        
    }
    
    /* private class MiModeloSpinner extends SpinnerNumberModel
    {
        
        public MiModeloSpinner()
        {
            
            super(5,0,10,1);
            
        }
        
        public Object getNextValue()
        {
           
            return super.getPreviousValue();
            
        }
        
        public Object getPreviousValue()
        {
            
            return super.getNextValue();
            
        }
        
    }*/ 
            
}
