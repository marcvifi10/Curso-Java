/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication40;

/**
 *
 * @author marcv
 */

import java.awt.*;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class CampoPassword {
    
    public static void main(String[] args) {
        
        MarcoPassword mimarco = new MarcoPassword();
        
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}

class MarcoPassword extends JFrame
{
    
    public MarcoPassword()
    {
        
        setBounds(400,300,550,400);
        
        LaminaPassword milamina = new LaminaPassword();
        
        add(milamina);
        
        setVisible(true);
        
    }
    
}

class LaminaPassword extends JPanel
{
    
    JTextField c_usuario = new JTextField(15);
    JPasswordField c_password = new JPasswordField(15);
    
    public LaminaPassword()
    {
        
        setLayout(new BorderLayout());
        
        JPanel lamina_superior = new JPanel();
        
        lamina_superior.setLayout(new GridLayout(2,2));
        
        add(lamina_superior, BorderLayout.NORTH);
        
        JLabel etiqueta1 = new JLabel("Usuario: ");
        JLabel etiqueta2 = new JLabel("Password: ");
        
        JTextField c_usuario = new JTextField(15);
        
        Comprueba_pass mievento = new Comprueba_pass();
        
        c_password  = new JPasswordField(15);
        
        c_password.getDocument().addDocumentListener(mievento);
        
        lamina_superior.add(etiqueta1);
        lamina_superior.add(c_usuario);
        lamina_superior.add(etiqueta2);
        lamina_superior.add(c_password);
        
        JButton enviar = new JButton("Enviar");  
        add(enviar,BorderLayout.SOUTH);
        
    }
    
    private class Comprueba_pass implements DocumentListener
    {

        @Override
        public void insertUpdate(DocumentEvent de) {
            
            char [] contrasena;
            
            contrasena = c_password.getPassword();
            
            if(contrasena.length < 8 || contrasena.length > 12)
            {
                c_password.setBackground(Color.red);
            }
            else
            {
                c_password.setBackground(Color.white);
            }
            
        }

        @Override
        public void removeUpdate(DocumentEvent de) {
            
            char [] contrasena;
            
            contrasena = c_password.getPassword();
            
            if(contrasena.length < 8 || contrasena.length > 12)
            {
                c_password.setBackground(Color.red);
            }
            else
            {
                c_password.setBackground(Color.white);
            }
            
        }

        @Override
        public void changedUpdate(DocumentEvent de) {
            
            
            
        }
        
    }
    
}
