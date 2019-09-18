/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication47;

import java.awt.BorderLayout;
import java.awt.Font;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;

/**
 *
 * @author marcv
 */



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
    
    private JLabel rotulo;
    private JSlider control;
    private static int contador;
    
    public Lamina_Sliders()
    {
        
        setLayout(new BorderLayout());
        
        rotulo = new JLabel("a b c d e f g h ");
        
        add(rotulo, BorderLayout.CENTER);
        
        control = new JSlider(8,50,12);
        
        control.setMajorTickSpacing(20);
        
        control.setMinorTickSpacing(5);
        
        control.setPaintTicks(true);
        
        control.setPaintLabels(true);
        
        control.setFont(new Font("Serif",Font.ITALIC,10));
        
        JPanel laminaSlider = new JPanel();
        
        laminaSlider.add(control);
        
        add(laminaSlider, BorderLayout.NORTH);
        
    }
    
    private class EventoSlider implements ChangeListener
    {

        public void stateChanged(ChangeEvent e) {
          
           
        }

        @Override
        public void changed(ObservableValue observable, Object oldValue, Object newValue) {
              
           // contador++;
            
           // System.out.println("Estas manipilando: " + contador);
            
           rotulo.setFont(new Font("Serif",Font.PLAIN, control.getValue()));
       
        }
          
    }
    
}