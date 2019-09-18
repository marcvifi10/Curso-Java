/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication42;

/**
 *
 * @author marcv
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PruebaChecks {
    
    public static void main(String[] args) {
        
        MarcoChecks mimarco = new MarcoChecks();
        
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        mimarco.setVisible(true);
        
    }
    
}

class MarcoChecks extends JFrame
{
    
    public MarcoChecks()
    {
        
        setBounds(550,300,550,350);
        
        setVisible(true);
        
        LaminaCheck milamina = new LaminaCheck();
        
        add(milamina);
        
    }
    
}

class LaminaCheck extends JPanel
{
    
    public LaminaCheck()
    {
        
        setLayout(new BorderLayout());
        
        Font miletra = new Font("Serif", Font.PLAIN, 24);
        
        texto = new JLabel("jjj ddd");
        
        texto.setFont(miletra);
        
        JPanel laminatexto = new JPanel();
        
        laminatexto.add(texto);
        
        add(laminatexto, BorderLayout.CENTER);
        
        check1 = new JCheckBox("Negrita");
        
        check2 = new JCheckBox("Cursiva");
        
        check1.addActionListener(new ManejaChecks());
        
        check2.addActionListener(new ManejaChecks());
        
        JPanel laminachecks = new JPanel();
        
        laminachecks.add(check1);
        
        laminachecks.add(check2);
        
        add(laminachecks,BorderLayout.SOUTH);
        
    }
    
    private class ManejaChecks implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent ae) {
            
            int tipo=0;
            
            if(check1.isSelected())
            {
                
                tipo += Font.BOLD;
                
            }
            
            if(check2.isSelected())
            {
                
                tipo += Font.ITALIC;
                
            }
            
            texto.setFont(new Font("Serif",tipo,24));
            
        }
        
            
                
    }
    
    private JLabel texto;
    
    private JCheckBox check1, check2;
    
}
