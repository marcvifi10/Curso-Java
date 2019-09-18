/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication33;

/**
 *
 * @author marcv
 */

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class EventoDeTeclado implements KeyListener {

    public void keyTyped(KeyEvent ke) {
        
        char letra = ke.getKeyChar();
        
        System.out.println(letra);
        
    }

    public void keyPressed(KeyEvent ke) {
        
        int codigo = ke.getKeyCode();
        
        System.out.println(codigo);
        
    }

    public void keyReleased(KeyEvent ke) {
        
    }
    
}
