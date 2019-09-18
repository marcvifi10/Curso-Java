/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication51;

/**
 *
 * @author marcv
 */

import java.awt.*;
import javax.swing.*;

public class MarcoEmergente {
    
    public static void main(String[] args) {
        
        MarcoEmergenteM mimarco = new MarcoEmergenteM();
        
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}

class MarcoEmergenteM extends JFrame
{
    
    public MarcoEmergenteM()
    {
        
        setBounds(100,100,300,250);
        
        LaminaEmergenteM milamina = new LaminaEmergenteM();
        
        add(milamina);
        
        setVisible(true);
        
    }
    
}

class LaminaEmergenteM extends JPanel
{
    
    public LaminaEmergenteM()
    {
        
        JPopupMenu emergente = new JPopupMenu();
        
        JMenuItem opcion1 = new JMenuItem("Opción 1");
        
        emergente.add(opcion1);
        
        // opcion1.addActionListener();
        
        JMenuItem opcion2 = new JMenuItem("Opción 2");
        
        emergente.add(opcion2);
        
        JMenuItem opcion3 = new JMenuItem("Opción 3");
        
        emergente.add(opcion3);
        
        setComponentPopupMenu(emergente);
        
    }
            
    
}
