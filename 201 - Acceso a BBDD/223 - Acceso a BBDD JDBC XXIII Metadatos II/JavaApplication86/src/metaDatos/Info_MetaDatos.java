/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metaDatos;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author marcv
 */
public class Info_MetaDatos {
    
    public static void main(String[] args)
    {
        
        // mostrarInfo_BBDD();
        
        mostrarInfo_Tablas();
        
    }
    
    public static void mostrarInfo_BBDD()
    {
        
        Connection miConexion = null;
        
        try
        {
            
            miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/curso","root","");
            
            // Obtención de metadatos
            
            DatabaseMetaData datosBBDD = miConexion.getMetaData();
            
            // Mostramos la información de la BBDD
            
            System.out.println("Gestor de BBDD: " + datosBBDD.getDatabaseProductName());
            
            System.out.println("Versión del gestor de BBDD: " + datosBBDD.getDatabaseProductVersion());
            
            System.out.println("Nombre del driver: " + datosBBDD.getDriverName());
            
            System.out.println("Versión del driver: " + datosBBDD.getDriverVersion());
            
        }
        
        catch(Exception e)
        {
            
            e.printStackTrace();
            
        }
        
        finally
        {
            
            try 
            {
                
                miConexion.close();
                
            }
            
            catch (SQLException ex) 
            {
                
                Logger.getLogger(Info_MetaDatos.class.getName()).log(Level.SEVERE, null, ex);
            
            }
            
        }
        
    }
    
    public static void mostrarInfo_Tablas()
    {
        
         Connection miConexion = null;
         
         ResultSet miResultset = null;
        
        try
        {
            
            miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/curso","root","");
            
            // Obtención de metadatos
            
            DatabaseMetaData datosBBDD = miConexion.getMetaData();
            
            // Lista de tablas
            
            System.out.println("LISTA DE TABLAS");
            
            miResultset = datosBBDD.getTables(null, null, null, null);
            
            while(miResultset.next())
            {
                
                System.out.println(miResultset.getString("TABLE_NAME"));
                
            }
            
            // Lista de columnas de Productos
            
            System.out.println("");
            
            System.out.println("Campos de Productos");
            
            miResultset = datosBBDD.getColumns(null, null, "productos", null);
            
            while(miResultset.next())
            {
                
                System.out.println(miResultset.getString("COLUMN_NAME"));
                
            }
            
        }
        
        catch(Exception e)
        {
            
            e.printStackTrace();
            
        }
        
        finally
        {
            
            try 
            {
                
                miConexion.close();
                
            }
            
            catch (SQLException ex) 
            {
                
                Logger.getLogger(Info_MetaDatos.class.getName()).log(Level.SEVERE, null, ex);
            
            }
            
        }
        
    }
    
}
