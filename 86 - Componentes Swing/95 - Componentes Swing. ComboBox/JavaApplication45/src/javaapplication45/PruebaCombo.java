/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication45;

/**
 *
 * @author marcv
 */

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PruebaCombo {
    
    public static void main(String[] args) {
        
        MarcoCombo mimarco = new MarcoCombo();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mimarco.setVisible(true);
        
    }
    
}

class MarcoCombo extends JFrame
{
    
    public MarcoCombo()
    {
        
        setVisible(true);
        
        setBounds(550,300,550,400);
        
        LaminaCombo milamina = new LaminaCombo();
        
        add(milamina);
        
    }
    
}

class LaminaCombo extends JPanel
{
    
    private JLabel texto;
    private JComboBox micombo;
    
    public LaminaCombo()
    {
        
        setLayout(new BorderLayout());
        
        texto = new JLabel("Texto");
        
        texto.setFont(new Font("Serif",Font.PLAIN,18));
        
        add(texto, BorderLayout.CENTER);
        
        JPanel lamina_norte = new JPanel();
        
        micombo = new JComboBox();
        
        micombo.setEditable(true);
        
        micombo.addItem("Serif");
        
        micombo.addItem("SansSerif");
        
        micombo.addItem("Monospaced");
        
        micombo.addItem("Dialog");
        
        Evento_combo mievento = new Evento_combo();
        
        micombo.addActionListener(mievento);
        
        lamina_norte.add(micombo);
        
        add(lamina_norte,BorderLayout.NORTH);
        
    }
    
    private class Evento_combo implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent ae) {
            
            texto.setFont(new Font((String)micombo.getSelectedItem(),Font.PLAIN,18));
            
        }
        
        
    }
    
}
