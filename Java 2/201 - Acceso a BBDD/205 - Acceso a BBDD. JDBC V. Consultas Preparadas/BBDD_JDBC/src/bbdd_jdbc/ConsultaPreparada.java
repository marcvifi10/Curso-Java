/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bbdd_jdbc;

/**
 *
 * @author marcv
 * 
 * 
 */

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConsultaPreparada {
    
    public static void main(String[] args)
    {
        
        
        try 
        {
            
            // 1. CREAR LA CONEXIÓN
            Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/curso_sql","root","");
        
            // 2. PREPARAR CONSULTA
            PreparedStatement miSentencia = miConexion.prepareStatement("SELECT NOMBREARTICULO, SECCIÓN, PAISORIGEN FROM PRODUCTOS" + " WHERE SECCION=? AND PAISORIGEN=?");
        
            // 3. ESTABLECER PARÁMETROS DE CONSULTA
            miSentencia.setString(1, "deportes");
            
            miSentencia.setString(2, "USA");
            
            // 4. EJECUTAR Y RECORRER CONSULTA
            ResultSet rs = miSentencia.executeQuery();
            
            while(rs.next())
            {
                
                System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
                
            }
            
            rs.close();
            
            // REUTILIZACIÓN DE CONSULTA SQL
            System.out.println("EJECUCIÓN SEGUNDA CONSULTA");
            System.out.println("");
            
            miSentencia.setString(1, "ceramica");
            
            miSentencia.setString(2, "China");
            
            // 4. EJECUTAR Y RECORRER CONSULTA
            rs = miSentencia.executeQuery();
            
            while(rs.next())
            {
                
                System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
                
            }
            
            rs.close();
            
        } 
        catch (SQLException ex) 
        {
            
            Logger.getLogger(ConsultaPreparada.class.getName()).log(Level.SEVERE, null, ex);
        
        }
        
    }
    
}
