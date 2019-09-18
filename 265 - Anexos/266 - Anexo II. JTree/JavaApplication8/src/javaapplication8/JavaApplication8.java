/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author marcv
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MarcoArbol mimarco = new MarcoArbol();
        
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        mimarco.setVisible(true);
        
    }
    
}

class MarcoArbol extends JFrame
{
    
    public MarcoArbol()
    {
        
        setTitle("Arbol Sencillo");
        
        setBounds(350,300,400,600);
        
        DefaultMutableTreeNode raiz = new DefaultMutableTreeNode("Mundo");
        
        DefaultMutableTreeNode pais = new DefaultMutableTreeNode("España");
        
        raiz.add(pais);
        
        DefaultMutableTreeNode comunidad = new DefaultMutableTreeNode("Cantabria");
        
        pais.add(comunidad);
        
        DefaultMutableTreeNode ciudad = new DefaultMutableTreeNode("Santander");
        
        comunidad.add(ciudad);
        
        pais = new DefaultMutableTreeNode("Alemania");
        
        raiz.add(pais);
        
        JTree arbol = new JTree(raiz);
        
        // LaminaArbol milamina = new LaminaArbol(arbol);
        
        // add(milamina);
        
        Container laminaContenido = getContentPane();
        
        laminaContenido.add(new JScrollPane(arbol));
        
    }
    
}

class LaminaArbol extends JPanel
{
    
    public LaminaArbol(JTree miarbol)
    {
        
        setLayout(new BorderLayout());
        
        add(miarbol, BorderLayout.NORTH);
        
    }
    
}
