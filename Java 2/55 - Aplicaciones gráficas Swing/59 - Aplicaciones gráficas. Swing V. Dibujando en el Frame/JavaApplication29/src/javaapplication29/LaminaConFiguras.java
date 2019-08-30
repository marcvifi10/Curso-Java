/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication29;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author marcv
 */
public class LaminaConFiguras extends JPanel {
    
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        
        g.drawRect(50,50,200,200);
        
        g.drawLine(1, 1, 1, 1);
    }
    
}
