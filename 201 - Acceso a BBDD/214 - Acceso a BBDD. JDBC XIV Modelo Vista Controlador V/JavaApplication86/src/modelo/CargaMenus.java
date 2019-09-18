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

public class CargaMenus 
{
    
    Conexion miConexion;
    
    public ResultSet rs;
    
    public ResultSet rs2;
    
    
    public CargaMenus()
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
            
            Statement paises = accesoBBDD.createStatement();
            
            rs = secciones.executeQuery("SELECT DISTINCTROW SECCION FROM PRODUCTOS");    
            
            rs2 = paises.executeQuery("SELECT DISTINCTROW PAISDEORIGEN FROM PRODUCTOS");
            
                miProducto = new Productos();
                
                miProducto.setSeccion(rs.getString(1));
            
                miProducto.setpOrigen(rs2.getString(1));
                
            rs.close();
            
            rs2.close();
            
        }
        catch(Exception e)
        {
            
            
            
        }
        
        return miProducto.getSeccion();
        
    }
    
}
