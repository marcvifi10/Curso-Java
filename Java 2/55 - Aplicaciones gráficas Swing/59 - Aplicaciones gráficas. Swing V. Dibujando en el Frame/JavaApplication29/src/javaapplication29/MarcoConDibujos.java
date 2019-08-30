/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication29;

import javax.swing.JFrame;

/**
 *
 * @author marcv
 */
public class MarcoConDibujos extends JFrame {
    
    public MarcoConDibujos()
    {
        
        setTitle("Prueba de dibujo");
        setSize(400,400);
        
        LaminaConFiguras milamina = new LaminaConFiguras();
        add(milamina);
        
    }
    
}
