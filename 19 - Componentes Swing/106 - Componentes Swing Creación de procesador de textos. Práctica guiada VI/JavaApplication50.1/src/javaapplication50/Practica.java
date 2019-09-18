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
    
    JMenu fuente, estilo, tamano;
    
    Font letras;
    
    public LaminaProcesador()
    {
        
        setLayout(new BorderLayout());
        
        JPanel laminamenu = new JPanel();
        
        JMenuBar mibarra = new JMenuBar();
        
        miarea = new JTextPane();
        
        //---------------------------------------
        
        fuente = new JMenu("Fuente");
        
        estilo = new JMenu("Estilo");
        
        tamano = new JMenu("Tamaño");
        
        configura_menu("Arial","fuente","Arial",9,10);
        
        configura_menu("Times New Roman","fuente","Times New Roman",9,10);
        
        configura_menu("Verdana","fuente","Verdana",9,10);
        
        //-----------------------------------------
        
        configura_menu("Negrita","estilo","",Font.BOLD,1);
        
        configura_menu("Cursiva","estilo","",Font.ITALIC,1);
        
        //------------------------------------------
        
        configura_menu("12","tamano","",9,12);
        
        configura_menu("16","tamano","",9,16);
        
        configura_menu("20","tamano","",9,20);
        
        configura_menu("24","tamano","",9,24);
        
        //--------------------------------------------
        
        mibarra.add(fuente);
        
        mibarra.add(estilo);
        
        mibarra.add(tamano);
        
        laminamenu.add(mibarra);
        
        add(laminamenu,BorderLayout.NORTH);
        
        add(miarea,BorderLayout.CENTER);
        
    }
    
    public void configura_menu(String rotulo, String menu, String tipo_letra, int estilos, int tam)
    {
        
        JMenuItem elem_menu = new JMenuItem(rotulo);
        
        if(menu == "fuente")
        {
            
             fuente.add(elem_menu); 
            
            if(tipo_letra == "Arial")
            {
                elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambia_letra","Arial"));
            }
                else if(tipo_letra == "Times New Roman")
                {
                    elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambia_letra","Times New Roman"));
                }
                else if(tipo_letra == "Verdana")
                {
                    elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambia_letra","Verdana"));
                }
            
        }
        else if(menu == "estilo")
        {
            
            estilo.add(elem_menu); 
            
            if(estilos == Font.BOLD)
            {
                
                estilo.add(elem_menu);
                
                elem_menu.addActionListener(new StyledEditorKit.BoldAction());
                
                if(tipo_letra == "Arial")
                {
                    elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambia_letra","Arial"));
                }
                else if(tipo_letra == "Times New Roman")
                {
                    elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambia_letra","Times New Roman"));
                }
                else if(tipo_letra == "Verdana")
                {
                    elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambia_letra","Verdana"));
                }
                    
            } 
            else if(estilos == Font.ITALIC)
            {
            
                elem_menu.addActionListener(new StyledEditorKit.ItalicAction());
            
            } 
                
        }
        else if(menu == "tamano")
        {
            
            tamano.add(elem_menu); 
            
            elem_menu.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamaño", tam));
            
        }   
        
    }
    
}
