/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;

/**
 *
 * @author marcv
 */

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.AbstractTableModel;

public class TablaProductos {
    
    public static void main(String[] args) {
        
        JFrame mimarco = new MarcoProducto();
        
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        mimarco.setVisible(true);
        
    }
    
}

class MarcoProducto extends JFrame
{
    
    private JComboBox nombresDeTablas;
    
    private DatabaseMetaData datosBBDD;
    
    private ResultSet rs;
    
    private Connection miConexion;
    
    private Statement sentencia;
    
    private ResultSetModeloTabla modelo;
    
    
    public MarcoProducto()
    {
        
        setTitle("Titulo");
        
        setBounds(500,300,800,400);
        
        nombresDeTablas = new JComboBox();
        
        JPanel superior = new JPanel();
        
        nombresDeTablas = new JComboBox();
        
        try
        {
            
            miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/curso","root","");
            
            datosBBDD = miConexion.getMetaData();
            
            rs = datosBBDD.getTables(null,null,null,null);
            
            /* while(rs.next())
            {
                
                nombresDeTablas.addItem(rs.getString("TABLE_NAME"));
                
            } */
            
            modelo = new ResultSetModeloTabla(rs);
            
            JTable tabla = new JTable(modelo);
            
            add(new JScrollPane(tabla), BorderLayout.CENTER);
            
            validate();
            
        }
        catch(Exception e)
        {
            
            e.printStackTrace();
            
        }
        
        nombresDeTablas.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                String tablaSeleccionada = (String) nombresDeTablas.getSelectedItem();
                
                String consulta = "SELECT * FROM " + tablaSeleccionada;
                
                try 
                {
                    
                    sentencia = miConexion.createStatement();
                
                } 
                catch (SQLException ex) 
                {
                    
                    Logger.getLogger(MarcoProducto.class.getName()).log(Level.SEVERE, null, ex);
                
                }
                
                try 
                {
                    
                    rs = sentencia.executeQuery(consulta);
                
                    while(rs.next())
                    {
                        
                        System.out.println(rs.getString("NOMBREARTICULO") + " " + rs.getString("SECCION"));
                        
                    }
                    
                } 
                catch (SQLException ex) 
                {
                    
                    Logger.getLogger(MarcoProducto.class.getName()).log(Level.SEVERE, null, ex);
                
                }
                
            }
            
        });
        
        superior.add(nombresDeTablas);
        
        add(superior, BorderLayout.NORTH);
        
    }
    
}

class ResultSetModeloTabla extends AbstractTableModel
{
    
    private ResultSet rsRegistros;
    
    private ResultSetMetaData resmd;
    
    
    public ResultSetModeloTabla(ResultSet unResultset)
    {
        
        rsRegistros = unResultset;
        
        try 
        {
            
            resmd = rsRegistros.getMetaData();
            
        } 
        catch (SQLException ex) 
        {
            
            Logger.getLogger(ResultSetModeloTabla.class.getName()).log(Level.SEVERE, null, ex);
        
        }
        
    }

    @Override
    public int getRowCount() 
    {
        
        try 
        {
            
            rsRegistros.last();
            
            return rsRegistros.getRow();
            
        } 
        catch (SQLException ex) 
        {
            
            Logger.getLogger(ResultSetModeloTabla.class.getName()).log(Level.SEVERE, null, ex);
        
            return 0;
            
        }
        
    }

    @Override
    public int getColumnCount() 
    {
        
        try 
        {
            
            return resmd.getColumnCount();
            
        } 
        catch (SQLException ex) 
        {
            
            Logger.getLogger(ResultSetModeloTabla.class.getName()).log(Level.SEVERE, null, ex);
        
            return 0;
            
        }
        
    }

    @Override
    public Object getValueAt(int i, int i1) 
    {
        
        try
        {
            
            rsRegistros.absolute(i + 1);
            
            return rsRegistros.getObject(i1 + 1);
            
        }
        catch(Exception e)
        {
            
            e.printStackTrace();
            
            return null;
            
        }
        
    }
    
    public String getColumnName(int c)
    {
        
        try
        {
            
           return resmd.getColumnName(c + 1);
            
        }
        catch(Exception e)
        {
            
            e.printStackTrace();
            
            return null;
            
        }
        
    }

}
