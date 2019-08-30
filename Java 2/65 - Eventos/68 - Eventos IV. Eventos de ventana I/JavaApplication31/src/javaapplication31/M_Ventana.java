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

public class M_Ventana implements WindowListener {

    public void windowOpened(WindowEvent we) {
        
        System.out.println("Ventana abierta");
        
    }

    public void windowClosing(WindowEvent we) {
        
        System.out.println("Cerrando ventana!!!");
        
    }
    
    public void windowClosed(WindowEvent we) {
        
        System.out.println("Ventana cerrada");
        
    }

    public void windowIconified(WindowEvent we) {
        
        System.out.println("Ventana minimizada");
        
    }

    public void windowDeiconified(WindowEvent we) {
        
        System.out.println("Ventana restaurada");
        
    }

    public void windowActivated(WindowEvent we) {
        
        System.out.println("Ventana activada");
        
    }

    public void windowDeactivated(WindowEvent we) {
        
        System.out.println("Ventana desactivada");
        
    }
    
    
    
}
