/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication37;

/**
 *
 * @author marcv
 */

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Calculadora {
    
    public static void main(String[] args) {
        
        MarcoCalculadora mimarco = new MarcoCalculadora();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mimarco.setVisible(true);
        
    }
    
}

class MarcoCalculadora extends JFrame
{
    
    public MarcoCalculadora()
    {
        
        setTitle("Calculadora");
        setBounds(500,300,450,250);
        LaminaCalculadora milamina = new LaminaCalculadora();
        add(milamina);
        // pack();
        
    }
    
}

class LaminaCalculadora extends JPanel
{
    
    private JPanel lamina2;
    private JButton pantalla;
    private boolean principio = false;
    private double resultado;
    private String ultimaOperacion;
    
    public LaminaCalculadora()
    {
        
        principio = true;
        
        setLayout(new BorderLayout());
        pantalla = new JButton("0");
        pantalla.setEnabled(false);
        add(pantalla,BorderLayout.NORTH);
        
        lamina2 = new JPanel();
        lamina2.setLayout(new GridLayout(4,4));
        
        ActionListener insertar = new InsertaNumero();
        ActionListener orden = new AccionOrden();
        
        ponerBotones("7",insertar);
        ponerBotones("8",insertar);
        ponerBotones("9",insertar);
        
        ponerBotones("/",orden);
        ponerBotones("4",insertar);
        ponerBotones("5",insertar);
        ponerBotones("6",insertar);
        
        ponerBotones("*",orden);
        ponerBotones("1",insertar);
        ponerBotones("2",insertar);
        ponerBotones("3",insertar);
        
        ponerBotones("-",orden);
        
        ponerBotones("0",insertar);
        ponerBotones(".",insertar);
        ponerBotones("=",orden);
        ponerBotones("+",orden);
        
        add(lamina2,BorderLayout.CENTER);
        
        ultimaOperacion = "=";
        
    }
    
    private void ponerBotones(String rotulo, ActionListener oyente)
    {
        
        JButton boton = new JButton(rotulo);
        
        boton.addActionListener(oyente);
        
        lamina2.add(boton);
        
    }
    
    private class InsertaNumero implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent ae) {
            
            String entrada = ae.getActionCommand();
            
            if(principio)
            {
                pantalla.setText("");
                principio = false;
            }
            
            pantalla.setText(pantalla.getText() + entrada);
            
        }
        
    }
    
    private class AccionOrden implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent ae) {
           
            String operacion = ae.getActionCommand();
            
            calcular(Double.parseDouble(pantalla.getText()));
            
            ultimaOperacion = operacion;
            
            principio = true;
            
        }
        
        public void calcular(double x)
        {
            
            if(ultimaOperacion.equals("+"))
            {
                resultado += x;
            }
            else if(ultimaOperacion.equals("-"))
            {
                resultado -= x;
            }
            else if(ultimaOperacion.equals("*"))
            {
                resultado *= x;
            }
            else if(ultimaOperacion.equals("/"))
            {
                resultado /= x;
            }
            else if(ultimaOperacion.equals("="))
            {
                resultado = x;
            }
            
            pantalla.setText("" + resultado);
            
        }
        
    }
}