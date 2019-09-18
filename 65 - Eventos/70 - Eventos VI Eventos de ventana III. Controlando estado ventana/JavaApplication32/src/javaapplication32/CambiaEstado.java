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

public class CambiaEstado implements WindowStateListener {

    public void windowStateChanged(WindowEvent e) {
        
        System.out.println("La ventana ha cambiado de estado!!!");
        //System.out.println(e.getNewState());
        
        if(e.getNewState() == Frame.MAXIMIZED_BOTH)
        {
            System.out.println("Pantalla completa!!!");
        }
        else if(e.getNewState() == Frame.NORMAL)
        {
            System.out.println("Pantalla normal!!!");
        }
        else if(e.getNewState() == Frame.ICONIFIED)
        {
            System.out.println("Pantalla minimizada");
        }
        
    }
    
    
    
}
