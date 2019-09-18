/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

/**
 *
 * @author marcv
 */

import java.sql.*;

public class Conexion 
{
    
    Connection miConexion = null;
    
    public Conexion()
    {
        
        
        
    }
    
    public Connection dameConexion()
    {
        
        try
        {
            
            miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/Curso","root","");
            
        }
        catch(Exception e)
        {
            
            
            
        }
        
        return miConexion;
        
    }
    
}
