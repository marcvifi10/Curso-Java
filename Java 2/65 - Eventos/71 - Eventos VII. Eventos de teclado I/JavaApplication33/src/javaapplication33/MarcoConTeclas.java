/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication33;

/**
 *
 * @author marcv
 */

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MarcoConTeclas extends JFrame {
    
    public MarcoConTeclas()
    {
        
        setVisible(true);
        
        setBounds(700,300,500,450);
        
        EventoDeTeclado tecla = new EventoDeTeclado();
                
        addKeyListener(tecla);
        
    }
    
}
