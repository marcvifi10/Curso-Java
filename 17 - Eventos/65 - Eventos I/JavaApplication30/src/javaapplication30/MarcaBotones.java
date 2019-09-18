/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication30;

/**
 *
 * @author marcv
 */

import java.awt.*;
        
import javax.swing.*;

public class MarcaBotones extends JFrame {
    
    public MarcaBotones()
    {
        
        setTitle("Botones y Eventos");
        
        setBounds(700,300,500,300);
        
        LaminaBotones milamina = new LaminaBotones();
        
        add(milamina);
                
    }
    
}
