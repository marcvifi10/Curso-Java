/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication34;

/**
 *
 * @author marcv
 */

import java.awt.event.*;
import javax.swing.JFrame;

public class MarcoRaton extends JFrame {
   
    public MarcoRaton()
    {
        
        setVisible(true);
        setBounds(700,300,600,450);
        
        EventosDeRaton2 EventoRaton = new EventosDeRaton2();
        EventosDeRaton3 EventoRaton2 = new EventosDeRaton3();
        
        addMouseListener(EventoRaton);
        addMouseMotionListener(EventoRaton2);
        
    }
    
}

class EventosDeRaton2 extends MouseAdapter
{
    
    /*public void mouseClicked(MouseEvent e)
    {
        // System.out.println("Cordenada X: " + e.getX() + "\nCoordenada Y: " + e.getY() + "\n");
        
        System.out.println(e.getClickCount());
    }*/
    
    public void mousePressed(MouseEvent e)
    {
        // System.out.println(e.getModifiersEx());
        
        if(e.getModifiersEx() == MouseEvent.BUTTON1_DOWN_MASK)
        {
            System.out.println("Botón izquierdo");
        }
        else if(e.getModifiersEx() == MouseEvent.BUTTON3_DOWN_MASK)
        {
            System.out.println("Botón derecho");
        }
        else if(e.getModifiersEx() == MouseEvent.BUTTON2_DOWN_MASK)
        {
            System.out.println("Rueda");
        }
        
    }
    
}
