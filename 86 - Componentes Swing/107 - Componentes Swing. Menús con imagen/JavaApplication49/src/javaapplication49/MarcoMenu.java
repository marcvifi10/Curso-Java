/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication49;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author marcv
 */
public class MarcoMenu {
    
    public static void main(String[] args) {
        
        Menu_Frame mimarco2 = new Menu_Frame();
        
        mimarco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        mimarco2.setVisible(true);
        
    }
    
}

class Menu_Frame extends JFrame
{
    
    public Menu_Frame()
    {
        
        setBounds(500,300,550,400);
        
        MenuLamina milamina = new MenuLamina();
        
        add(milamina);
        
        setVisible(true);
        
    }
    
}

class MenuLamina extends JPanel
{
    
    public MenuLamina()
    {
        
        JMenuBar mibarra = new JMenuBar();
        
        JMenu archivo = new JMenu("Archivo");      
        JMenu edicion = new JMenu("Edición");
        JMenu herramientas = new JMenu("Herramientas");
        JMenu opciones = new JMenu("Opciones");
        
        JMenuItem guardar = new JMenuItem("Guardar");
        JMenuItem guardar_como = new JMenuItem("Guardar como ");
        
        JMenuItem cortar = new JMenuItem("Cortar",new ImageIcon("src/javaapplication49/cortar.gif"));
        JMenuItem copiar = new JMenuItem("Copiar",new ImageIcon("src/javaapplication49/copiar.gif"));
        copiar.setHorizontalTextPosition(SwingConstants.LEFT);
        JMenuItem pegar = new JMenuItem("Pegar",new ImageIcon("src/javaapplication49/pegar.gif"));
        
        JMenuItem generales = new JMenuItem("Generales");
        
        JMenuItem opcion1 = new JMenuItem("Opción 1");
        JMenuItem opcion2 = new JMenuItem("Opción 2");
        
        archivo.add(guardar);
        archivo.add(guardar_como);
        
        edicion.add(cortar);
        edicion.add(copiar);
        edicion.add(pegar);
        edicion.addSeparator();
        
        herramientas.add(generales);
        
        mibarra.add(archivo);
        mibarra.add(edicion);  
        mibarra.add(herramientas);
        
        opciones.add(opcion1);
        opciones.add(opcion2);
        edicion.add(opciones);
        
        add(mibarra);
        
        
    }
    
}
