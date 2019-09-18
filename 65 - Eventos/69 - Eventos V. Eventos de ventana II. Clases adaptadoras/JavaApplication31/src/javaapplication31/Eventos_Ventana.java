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

public class Eventos_Ventana {
    
    public static void main(String[] args) {
        
        MarcoVentana mimarco = new MarcoVentana();
        
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        MarcoVentana mimarco2 = new MarcoVentana();
        
        mimarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        mimarco.setTitle("Ventana 1");
        
        mimarco2.setTitle("Ventana 2");
        
        mimarco.setBounds(300,300,500,350);
        
        mimarco2.setBounds(900,300,500,350);
        
    }
    
}
