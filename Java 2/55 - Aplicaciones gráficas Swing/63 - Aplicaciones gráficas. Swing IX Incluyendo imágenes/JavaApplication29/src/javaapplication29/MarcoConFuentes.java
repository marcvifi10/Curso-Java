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
import javax.swing.JPanel.*;
import javax.swing.*;

/**
 *
 * @author marcv
 */
public class MarcoConFuentes extends JFrame {
    
    public MarcoConFuentes()
    {
        setVisible(true);
        
        setTitle("hhh");
        
        setSize(400,400);
        
        LaminaConFuentes milamina = new LaminaConFuentes();
        
        // Font mifuente = new Font("Arial",Font.BOLD,26);
        
        
        
        // setFont(mifuente);
        
        // g2.drawString("Marc",100,100);
        
        add(milamina);
        
        milamina.setForeground(Color.BLUE);
        
    }
    
}
