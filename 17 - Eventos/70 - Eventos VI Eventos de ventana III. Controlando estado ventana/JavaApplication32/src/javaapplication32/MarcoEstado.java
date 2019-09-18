/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication32;

/**
 *
 * @author marcv
 */

import javax.swing.*;
import java.awt.Frame;
import java.awt.event.*;

public class MarcoEstado extends JFrame {
    
    public MarcoEstado()
    {
        
        setVisible(true);
        
        setBounds(300,300,500,350);
        
        CambiaEstado c1 = new CambiaEstado();
        
        addWindowStateListener(c1);
        
    }
    
}
