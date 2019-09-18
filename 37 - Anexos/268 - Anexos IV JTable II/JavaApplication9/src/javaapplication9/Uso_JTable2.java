/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

/**
 *
 * @author marcv
 */

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.*;
import javax.swing.table.TableModel;
import javax.swing.table.*;

public class Uso_JTable2 {
    
     public static void main(String[] args) {
        
        JFrame mimarco = new MarcoTablaPersonalizado();
        
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        mimarco.setVisible(true);
        
    }
    
}

class MarcoTablaPersonalizado extends JFrame
{
    
    public MarcoTablaPersonalizado()
    {
        
        setTitle("Titulo");
 
        setBounds(300,300,400,200);
        
        ModeloTablaPersonalizada mimodelo = new ModeloTablaPersonalizada();
        
        JTable mitabla = new JTable((TableModel) mimodelo);
        
        add(new JScrollPane(mitabla));
        
    }
    
}

class ModeloTablaPersonalizada 
{
    
    public int getColumnCount()
    {
        
        return 3;
        
    }
    
    public int getRowCount()
    {
        
        return 5;
        
    }
    
    public Object getValueAt(int rowIndex, int columnIndex)
    {
        
        int z = rowIndex + 1;
        
        int y = columnIndex + 2;
        
        return " " + z + " " + y;
        
    }
    
    public String getColumnName(int c)
    {
        
        return "Columna: " + c;
        
    }
    
}
