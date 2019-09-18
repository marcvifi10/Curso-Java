/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication50;

/**
 *
 * @author marcv
 */

import java.awt.event.*;
import javax.swing.JFrame;
import java.awt.*;
import javax.swing.*;
import javax.swing.text.*;

public class Practica {
    
    public static void main(String[] args) {
        
        MenuProcesador mimarco2 = new MenuProcesador();
        
        mimarco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        mimarco2.setVisible(true);
        
    }
    
}

class MenuProcesador extends JFrame
{
    
    public MenuProcesador()
    {
        
        setBounds(500,300,550,400);
        
        LaminaProcesador milamina = new LaminaProcesador();
        
        add(milamina);
        
        setVisible(true);
        
    }
    
}

class LaminaProcesador extends JPanel
{
    
    JTextPane miarea;
    
    public LaminaProcesador()
    {
        
        setLayout(new BorderLayout());
        
        JPanel laminamenu = new JPanel();
        
        JMenuBar mibarra = new JMenuBar();
        
        miarea = new JTextPane();
        
        //---------------------------------------
        
        JMenu fuente = new JMenu("Fuente");
        
        JMenu estilo = new JMenu("Estilo");
        
        JMenu tamagno = new JMenu("Tamaño");
        
        //---------------------------------------
        
        JMenuItem arial = new JMenuItem("Arial");
        
        arial.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e)
            {
                miarea.setFont(new Font("Arial", Font.PLAIN, 12));
            }
        
        });
        
        JMenuItem courier = new JMenuItem("Times New Roman");
        
        // Gestiona_menus tipo_letra = new Gestiona_menus();
        
        courier.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e)
            {
                miarea.setFont(new Font("Times new roman", Font.PLAIN, 12));
            }
        
        });
        
        JMenuItem verdana = new JMenuItem("Verdana");
        
        verdana.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e)
            {
                miarea.setFont(new Font("Verdana", Font.PLAIN, 12));
            }
        
        });
        
        
        fuente.add(arial);
        
        fuente.add(courier);
        
        fuente.add(verdana);
        
        //---------------------------------------
        
        JMenuItem negrita = new JMenuItem("Negrita");
        
        JMenuItem cursiva = new JMenuItem("Cursiva");
        
        
        estilo.add(negrita);
        
        estilo.add(cursiva);
        
        //---------------------------------------
        
        JMenuItem tam12 = new JMenuItem("12");
        
        JMenuItem tam16 = new JMenuItem("16");
        
        JMenuItem tam20 = new JMenuItem("20");
        
        JMenuItem tam24 = new JMenuItem("24");
        
    //----------------------------------------------
    
        tamagno.add(tam12);
        
        tamagno.add(tam16);
        
        tamagno.add(tam20);
        
        tamagno.add(tam24);
        
    //---------------------------------------------    
        
        mibarra.add(fuente);
        
        mibarra.add(estilo);
        
        mibarra.add(tamagno);
        
        laminamenu.add(mibarra);
        
        add(laminamenu,BorderLayout.NORTH);
        
        add(miarea,BorderLayout.CENTER);
        
    }
    
}
