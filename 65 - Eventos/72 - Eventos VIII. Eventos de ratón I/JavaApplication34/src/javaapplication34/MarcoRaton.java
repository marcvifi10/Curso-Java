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
        
        EventosDeRaton EventoRaton = new EventosDeRaton();
        addMouseListener(EventoRaton);
        
    }
    
}

class EventosDeRaton2 extends MouseAdapter
{
    
    public void mouseClicked(MouseEvent e)
    {
        System.out.println("Click");
    }
    
}
