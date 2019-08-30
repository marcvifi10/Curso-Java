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
        
        /*JButton botonAmarillo = new JButton("Amarillo");
        
        JButton botonRojo = new JButton("Rojo");
        
        JButton botonAzul = new JButton("Azul");
        
        add(botonAmarillo);
        
        add(botonAzul);
        
        add(botonRojo);*/
        
        AccionColor accionAmarillo = new AccionColor("Amarillo", new ImageIcon("src/javaapplication36/amarillo.jpg"),Color.yellow);
        AccionColor accionAzul = new AccionColor("Azul", new ImageIcon("src/javaapplication36/azul.png"),Color.blue);
        AccionColor accionRojo = new AccionColor("Rojo", new ImageIcon("src/javaapplication36/rojo.jpg"),Color.red);
        
        add(new JButton(accionAmarillo));
        add(new JButton(accionAzul));
        add(new JButton(accionRojo));
        
        InputMap mapaEntrada = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        
        KeyStroke teclaAmarillo = KeyStroke.getKeyStroke("ctrl A");
        KeyStroke teclaAzul = KeyStroke.getKeyStroke("ctrl B");
        KeyStroke teclaRojo = KeyStroke.getKeyStroke("ctrl R");
        
        mapaEntrada.put(teclaAmarillo, "fondo_amarillo");
        mapaEntrada.put(teclaAzul, "fondo_azul");
        mapaEntrada.put(teclaRojo, "fondo_rojo");
        
        ActionMap mapa_accion = getActionMap();
        
        mapa_accion.put("fondo_amarillo",accionAmarillo);
        mapa_accion.put("fondo_azul",accionAzul);
        mapa_accion.put("fondo_rojo",accionRojo);
        
    }
    
    private class AccionColor extends AbstractAction
    {

        public AccionColor(String nombre, Icon icono, Color color_boton)
        {

            putValue(Action.NAME, nombre);

            putValue(Action.SMALL_ICON, icono);

            putValue(Action.SHORT_DESCRIPTION, "Poner la lámina de color " + nombre);

            putValue("color_de_fondo", color_boton);

        }

        public void actionPerformed(ActionEvent ae) {

            Color c = (Color)getValue("color_de_fondo");
            setBackground(c);
            System.out.println("Nombre: " + getValue(Action.NAME) + " Descripción: " + getValue(Action.SHORT_DESCRIPTION));

        }

    }
    
}

