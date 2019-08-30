/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author marcv
 */
public class Tirar {
    
    public static void main(String[] args)
    {
        
        Marco mimarco = new Marco();
        
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JFileChooser chooser = new JFileChooser();
        
        FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & GIF Images","jpg","gif");
        
        chooser.setFileFilter(filter);
        
        int returnVal = chooser.showOpenDialog(mimarco);
        
        if(returnVal == JFileChooser.APPROVE_OPTION)
        {
            
            chooser.getSelectedFile().getName();
            
        }
        
    }
    
}

class Marco extends JFrame
{
    
    public Marco()
    {
        
        setBounds(300,300,300,300);
        
        setVisible(true);
        
    }
    
}
