/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication29;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

/**
 *
 * @author marcv
 */
public class LaminaConFuentes extends JPanel {
 
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
    
        Graphics2D g2 = (Graphics2D) g;
        
        Font mifuente = new Font("Courier",Font.BOLD,26);
    
        g2.setFont(mifuente);
        
        // g2.setColor(Color.blue);
        
        g2.drawString("Marc",100,100);
        
        g2.setFont(new Font("Arial", Font.ITALIC,24));
        
        // g2.setColor(new Color(128,90,50).brighter());
        
        g2.drawString("Curso de Java",100,200);
    }
    
}
