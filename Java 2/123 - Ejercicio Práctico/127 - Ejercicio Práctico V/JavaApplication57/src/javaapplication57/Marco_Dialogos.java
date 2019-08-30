/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication57;

/**
 *
 * @author marcv
 */

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.*;

public class Marco_Dialogos extends JFrame {
    
    private Lamina_Botones lamina_tipo, lamina_tipo_mensajes, lamina_mensaje, lamina_tipo_opcion, lamina_opciones, lamina_entrada;
    private String cadenaMensaje="Mensaje";
    private Icon iconoMensaje = new ImageIcon("src/d.png");
    private Object objetoMensaje = new Date();
    private Component componenteMensaje = new Lamina_Ejemplo();
    
    public Marco_Dialogos()
    {
        
        setTitle("Prueba de diálogos");
        
        setBounds(500,300,600,450);
        
        JPanel lamina_cuadricula = new JPanel();
        
        lamina_cuadricula.setLayout(new GridLayout(2,3));
        
        String primero[] = {"Mensaje","Confirmar","Opción","Entrada"};
        
        lamina_tipo = new Lamina_Botones("Tipo",primero);
        
        lamina_tipo_mensajes = new Lamina_Botones("Tipo de mesnaje", new String[]{
            
            "ERRO_MESSAGE",
            "INFORMATION_MESSAGE",
            "QUESTION_MESSAGE",
            "PLAIN_MESSAGE"
            
        });
        
        lamina_mensaje = new Lamina_Botones("Mensaje", new String[]{
            
            "Cadena",
            "Icono",
            "Componente",
            "Otros",
            "Object[]"
            
        });
        
        lamina_tipo_opcion = new Lamina_Botones("Confirmar", new String[]{
            
            "DEFAULT_OPTION",
            "YES_NO_OPTION",
            "YES_NO_CANCEL_OTION",
            "OK_CANCEL_OPTION"
            
        });
        
        lamina_opciones = new Lamina_Botones("Opción", new String[]{
            
            "String[]",
            "Icon[]",
            "Object[]"
            
        });
        
        lamina_entrada = new Lamina_Botones("Entrada", new String[]{
            
            "Campo de texto",
            "Combo"
            
        });
        
        setLayout(new BorderLayout());
        
        lamina_cuadricula.add(lamina_tipo);
        lamina_cuadricula.add(lamina_tipo_mensajes);
        lamina_cuadricula.add(lamina_mensaje);
        lamina_cuadricula.add(lamina_tipo_opcion);
        lamina_cuadricula.add(lamina_opciones);
        lamina_cuadricula.add(lamina_entrada);
        
        // Construimos la lámina inferior
        
        JPanel lamina_mostrar = new JPanel();
        
        JButton boton_mostrar = new JButton("Mostrar");
        
        boton_mostrar.addActionListener(new AccionMostrar());
        
        lamina_mostrar.add(boton_mostrar);
        
        add(lamina_mostrar,BorderLayout.SOUTH);
        
        add(lamina_cuadricula, BorderLayout.CENTER);
        
        // JPanel milamina = new Lamina_Superior();
        
        // add(lamina_cuadricula);
        
    }
    
    private class AccionMostrar implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent ae) {
            
            // System.out.println(lamina_tipo.dameSeleccion());
            
            if(lamina_tipo.dameSeleccion().equals("Mensaje"))
            {
                
                JOptionPane.showMessageDialog(Marco_Dialogos.this,"Mensaje","Título",0);
                
            }
            else if(lamina_tipo.dameSeleccion().equals("Confirmar"))
            {
                
                JOptionPane.showMessageDialog(Marco_Dialogos.this,"Confirmar","Título",0);
                
            }
            else if(lamina_tipo.dameSeleccion().equals("Entrada"))
            {
                
                JOptionPane.showMessageDialog(Marco_Dialogos.this,"Entrada","Título",0);
                
            }
            else if(lamina_tipo.dameSeleccion().equals("Opción"))
            {
                
                JOptionPane.showOptionDialog(Marco_Dialogos.this,"Opción","Título",0,0,null,null,null);
                
            }
            
        } 
        
    }
    
}
