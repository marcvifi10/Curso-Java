/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author marcv
 */

import java.sql.*;
import controlador.*;

public class CargaSecciones 
{
    
    Conexion miConexion;
    
    public ResultSet rs;
    
    public CargaSecciones()
    {
        
        miConexion = new Conexion();
        
    }
    
    public String ejecutaConsultas()
    {
        
        Productos miProducto = null;
        
        Connection accesoBBDD = miConexion.dameConexion();
        
        try
        {
            
            Statement secciones = accesoBBDD.createStatement();
            
            rs = secciones.executeQuery("SELECT DISTINCTROW SECCION FROM PRODUCTOS");
            
            while(rs.next())
            {
                
                miProducto = new Productos();
                
                miProducto.setSeccion(rs.getString(1));
                
                return miProducto.getSeccion();
                
            }
            
            rs.close();
            
        }
        catch(Exception e)
        {
            
            
            
        }
        
        return miProducto.getSeccion();
        
    }
    
}
