/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication36;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author marcv
 */
public class PruebaAcciones {
    
    public static void main(String[] args) {
        
        MarcoAccion marco = new MarcoAccion();
        
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        marco.setVisible(true);
        
    }
    
}

class MarcoAccion extends JFrame
{
    
    public MarcoAccion()
    {
        setTitle("Prueba Acciones");
        
        setBounds(600,350,500,300);
        
        PanelAccion lamina = new PanelAccion();
        
        add(lamina);
        
    }
    
}


class PanelAccion extends JPanel
{
    
    public PanelAccion()
    {
        
        JButton boton_nuevo = new JButton("Nuevo");
        add(boton_nuevo);
        
        boton_cerrar = new JButton("Cerrar");
        add(boton_cerrar);
        
        OyenteNuevo miOyente = new OyenteNuevo();
        boton_nuevo.addActionListener(miOyente);
        
    }
    
    
    private class OyenteNuevo implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent ae) {
            
            Marco_Emergente marco = new Marco_Emergente(boton_cerrar);
            
            marco.setVisible(true);
            
        }  
        
    }
    
    JButton boton_cerrar;
           
}

class Marco_Emergente extends JFrame
{
    
   // private static int contador = 0;
    
    public Marco_Emergente(JButton boton_de_principal)
    {
        
        contador++;
        setTitle("Ventana " + contador);
        setBounds(40*contador,40*contador,250,100);
        CierraTodos oyenteCerrar = new CierraTodos();
        boton_de_principal.addActionListener(oyenteCerrar);
        
    }
    
    private class CierraTodos implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent ae) {
         
            dispose();
            
        }
    }
    
    private static int contador = 0;
    
}

