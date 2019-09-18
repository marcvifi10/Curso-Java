/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication29;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;

/**
 *
 * @author marcv
 */
public class LaminaConFiguras extends JPanel {
    
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        
        Graphics2D g2 = (Graphics2D) g;
        
        Rectangle2D rectangulo = new Rectangle2D.Double(100,100,200,150);
    
        g2.setPaint(Color.RED);
        
        g2.fill(rectangulo);
        
        g2.draw(rectangulo);
        
        Ellipse2D elipse = new Ellipse2D.Double();
        
        elipse.setFrame(rectangulo);
        
        g2.setPaint(Color.BLUE);
        
        g2.setPaint(new Color(0,140,255).brighter().brighter().brighter());
        
        g2.fill(elipse);
        
        g2.draw(elipse);
        
        g2.draw(new Line2D.Double(100,100,300,250));
   
        double CentroEnX = rectangulo.getCenterX();
        double CentroEnY = rectangulo.getCenterY();
        double radio = 150;
        
        Ellipse2D circulo = new Ellipse2D.Double();
        
        circulo.setFrameFromCenter(CentroEnX,CentroEnY,CentroEnX+radio,CentroEnY+radio);
        
        g2.draw(circulo);
    }
    
}
