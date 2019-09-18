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
public class Lamina extends JPanel {
    
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        
        g.drawString("Estamos aprendiendo Swing",100,100);
    }
    
}
