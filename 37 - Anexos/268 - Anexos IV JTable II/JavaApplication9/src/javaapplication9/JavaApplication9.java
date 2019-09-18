/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.*;

/**
 *
 * @author marcv
 */
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        JFrame mimarco = new MarcoTabla();
        
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        mimarco.setVisible(true);
        
    }
    
}

class MarcoTabla extends JFrame
{
    
    private String [] nombresColumnas = {"Nombre","Radio","Satelites","Gaseoso"};
    
    private Object [][] datosFila = {
    
        {"Mercurio",2440.0,0,false},
        {"Venus",6052.0,0,false},
        {"Tierra",6378.0,1,false},
        {"Marte",3397.0,2,false},
        {"Jupiter",71492.0,16,true},
        {"Saturno",60268.0,17,true},
        {"Urano",24766.0,8,true},
        {"Neptuno",1137.0,1,true}
        
    };
    
    public MarcoTabla()
    {
        
        setTitle("Titulo");
 
        setBounds(300,300,400,200);
        
        JTable tablaPlanetas = new JTable(datosFila, nombresColumnas);
        
        add(new JScrollPane(tablaPlanetas),BorderLayout.CENTER);
        
        JButton botonImprimir = new JButton("Imprimir");
        
        botonImprimir.addActionListener(new ActionListener(){
           
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                try
                {
                    
                    tablaPlanetas.print();
                    
                }
                catch(Exception e)
                {
                    
                    e.printStackTrace();
                    
                }
                
            }
            
        });
        
        JPanel laminaBoton = new JPanel();
        
        laminaBoton.add(botonImprimir);
        
        add(laminaBoton,BorderLayout.SOUTH);
        
    }
    
}
