/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication34;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

/**
 *
 * @author marcv
 */
public class EventosDeRaton3 implements MouseMotionListener {

    public void mouseDragged(MouseEvent me) {
        System.out.println("Esras arrastrando");
    }

    public void mouseMoved(MouseEvent me) {
        System.out.println("Estas moviendo");
    }
    
}
