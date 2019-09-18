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
        
        configura_menu("Arial","fuente","Arial",9,10,"");
        
        configura_menu("Times New Roman","fuente","Times New Roman",9,10,"");
        
        configura_menu("Verdana","fuente","Verdana",9,10,"");
        
        //-----------------------------------------
        
        configura_menu("Negrita","estilo","",Font.BOLD,1,"src/javaapplication50/copiar.gif");
        
        configura_menu("Cursiva","estilo","",Font.ITALIC,1,"");
        
        //------------------------------------------
        
        configura_menu("12","tamano","",9,12,"");
        
        configura_menu("16","tamano","",9,16,"");
        
        configura_menu("20","tamano","",9,20,"");
        
        configura_menu("24","tamano","",9,24,"");
        
        //--------------------------------------------
        
        mibarra.add(fuente);
        
        mibarra.add(estilo);
        
        mibarra.add(tamano);
        
        laminamenu.add(mibarra);
        
        add(laminamenu,BorderLayout.NORTH);
        
        add(miarea,BorderLayout.CENTER);
        
    }
    
    public void configura_menu(String rotulo, String menu, String tipo_letra, int estilos, int tam, String ruta_icono)
    {
        
        JMenuItem elem_menu = new JMenuItem(rotulo, new ImageIcon(ruta_icono));
        
        if(menu == "fuente")
        {
            
            fuente.add(elem_menu); 
            
        }
        else if(menu == "estilo")
        {
            
            estilo.add(elem_menu); 
            
        }
        else if(menu == "tamano")
        {
            
            tamano.add(elem_menu); 
            
        }
       
        elem_menu.addActionListener(new Gestiona_Eventos(rotulo,tipo_letra,estilos,tam));
        
    }
    
    private class Gestiona_Eventos implements ActionListener
    {
        
        String tipo_texto, menu;   
        int estilo_letra, tamano_letra;

        public Gestiona_Eventos(String elemento,String texto2, int estilo2, int tam_letra)
        {
            
            tipo_texto = texto2;
            
            estilo_letra = estilo2;
            
            tamano_letra = tam_letra;
            
            menu = elemento;
            
        }
        
        @Override
        public void actionPerformed(ActionEvent ae) {
            
            letras = miarea.getFont();
            
            if(menu == "Arial" || menu == "Times New Roman" || menu == "Verdana")
            {
                
                estilo_letra = letras.getStyle();
                
                tamano_letra = letras.getSize();
                
            }
            else if(menu == "Cursiva" || menu == "Negrita")
            {
                
                if(letras.getStyle() == 1 || letras.getStyle() == 2)
                {
                    
                    estilo_letra = 3;
                    
                }
                
                tipo_texto = letras.getFontName();
                
                tamano_letra = letras.getSize();
                
            }
            else if(menu == "12" || menu == "16" || menu == "20" || menu == "24")
            {
                
                tipo_texto = letras.getFontName();
                
                estilo_letra = letras.getStyle();
                
            }
            
            miarea.setFont(new Font(tipo_texto,estilo_letra,tamano_letra));
            
            System.out.println("Tipo de letra: " + tipo_texto + " Estilo: " + estilo_letra + " Tamaño: " + tamano_letra);
            
        }
        
    }
    
}
