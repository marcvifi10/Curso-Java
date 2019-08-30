/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication35;

/**
 *
 * @author marcv
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

public class FocoVentana extends JFrame implements WindowFocusListener {
    
    FocoVentana marco1;
    
    FocoVentana marco2;
    
    public static void main(String[] args) {
        
        FocoVentana mimarco = new FocoVentana();
        
        mimarco.iniciar();
        
    }
    
    public void iniciar()
    {
        marco1 = new FocoVentana();
        marco2 = new FocoVentana();
        
        marco1.setVisible(true);
        marco2.setVisible(true);
        
        marco1.setBounds(300,100,600,350);
        marco2.setBounds(120,100,600,350);
        
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        marco1.addWindowFocusListener(this);
        marco2.addWindowFocusListener(this);
    }

    public void windowGainedFocus(WindowEvent we) {
        
        if(we.getSource()==marco1)
        {
            marco1.setTitle("Tengo el foco!!!");
        }
        else
        {
            marco2.setTitle("Tengo el foco!!!");
        }
            
    }

    public void windowLostFocus(WindowEvent we) {
        if(we.getSource()==marco1)
        {
            marco1.setTitle("");
        }
        else
        {
            marco2.setTitle("");
        }
    }
    
}
