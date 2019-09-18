/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication38;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author marcv
 */
public class PruebaTexto extends JFrame {
    
    public static void main(String[] args) {
        
        MarcoTexto marco = new MarcoTexto();
        
        marco.setVisible(true);
        
        marco.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    
}

class MarcoTexto extends JFrame
{
    
    public MarcoTexto()
    {
        
        setBounds(600,300,600,350);
        
        LaminaTexto milamina = new LaminaTexto();
        
        add(milamina);
        
        setVisible(true);
        
    }
    
}

class LaminaTexto extends JPanel
{
    
    private JTextField campo1;
    
    public LaminaTexto()
    {
        
        JLabel texto1 = new JLabel("Email:  ");
        add(texto1);
        
        campo1 = new JTextField("         Texto por defecto",20);        
        add(campo1);
        
        JButton miboton = new JButton("Comprobar");
        
        DameTexto mievento = new DameTexto();
        
        miboton.addActionListener(mievento);
        
        add(miboton);
    }
    
    private class DameTexto implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent ae) {
            
            System.out.println(campo1.getText().trim());
            
        }
                
    }
    
}
