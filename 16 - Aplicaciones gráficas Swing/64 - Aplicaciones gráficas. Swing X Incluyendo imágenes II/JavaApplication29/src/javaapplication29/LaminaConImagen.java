/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication29;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author marcv
 */
public class LaminaConImagen extends JPanel {
    
    private Image imagen;
    
    public LaminaConImagen()
    {
        
        File miimagen = new File("images.png");
        
        try
        {
            imagen=ImageIO.read(miimagen);
        }
        catch(IOException e)
        {
            System.out.println("No se ha encontrado la imagen!!!");
        }
    }
    
    public void paintComponent(Graphics g)
    {
        super.paintChildren(g);
        
        File miimagen = new File("images.png");
        
        int anchuraImagen = imagen.getWidth(this);
        int alturaImagen = imagen.getHeight(this);
        
        g.drawImage(imagen, 0, 0, null);
        
        for(int i=0;i<300;i++)
        {
            for(int j =0; j<200; j++)
            {
                g.copyArea(0,0,anchuraImagen,alturaImagen,anchuraImagen*i,alturaImagen*j);
            }
        }
    }
    
}
