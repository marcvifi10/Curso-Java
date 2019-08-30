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

import java.awt.Frame;
import javax.swing.*;

public class miMarco extends JFrame {
    
    public miMarco()
    {
        
        // setSize(500,500);
        // setLocation(200,40);
        
        // x, y, sizex, sizey
        setBounds(200,40,500,500);
        
        // No permitir redimensionar la ventana
        // setResizable(false);
        
        // Extender la ventana al máximo
        // setExtendedState(Frame.MAXIMIZED_BOTH);
        
        // Poner un titulo
        setTitle("Titulo");
        
    }
    
}
