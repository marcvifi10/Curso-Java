/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication31;

/**
 *
 * @author marcv
 */

import javax.swing.*;
import java.awt.event.*;

public class MarcoVentana extends JFrame {
    
    public MarcoVentana()
    {
        
        // setTitle("Respondiendo");
        
        // setBounds(300,300,500,350);
        
        setVisible(true);
        
        M_Ventana oyente = new M_Ventana();
        
        // addWindowListener(oyente);
        
        addWindowListener(new M_Ventana());
        
    }
    
}
