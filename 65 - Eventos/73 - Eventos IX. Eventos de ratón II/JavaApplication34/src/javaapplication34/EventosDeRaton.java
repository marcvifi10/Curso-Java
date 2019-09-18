/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication34;

/**
 *
 * @author marcv
 */

import java.awt.event.*;
import javax.swing.JFrame;

public class EventosDeRaton implements MouseListener {

    public void mouseClicked(MouseEvent me) {
       
        System.out.println("Has hecho click!!!");
        
    }

    public void mousePressed(MouseEvent me) {
       
        System.out.println("Has presionado");
        
    }

    public void mouseReleased(MouseEvent me) {
        System.out.println("Acabas de levantar");
    }

    public void mouseEntered(MouseEvent me) {
        System.out.println("Entrar");
    }

    public void mouseExited(MouseEvent me) {
        System.out.println("Salir");
    }
    
}
