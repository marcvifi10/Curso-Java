/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication29;

/**
 *
 * @author marcv
 */

import java.awt.*;

import javax.swing.*;

import javax.imageio.*;

public class PruebaImagenes {
    
    public static void main(String[] args)
    {
        MarcoImagen mimarco = new MarcoImagen();
        
        mimarco.setVisible(true);
        
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}

class MarcoImagen extends JFrame
{
    
    public MarcoImagen()
    {
        setTitle("Marco Con Imagen");
        
        setBounds(750,300,300,200);
        
        LaminaConImagen milamina = new LaminaConImagen();
        
        add(milamina);
    }
    
}
