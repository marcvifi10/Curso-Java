/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bbdd_jdbc;

/**
 *
 * @author marcv
 */

import java.sql.*;

public class Conecta_Pruebas {
    
    public static void main(String[] args) {
        
        try
        {
            
            // 1. CREAR CONEXIÓN
            Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas","root","");
            
            // 2. CREAR OBJETO STATEMENT
            Statement miStatement = miConexion.createStatement();
            
            // 3. EJECUTAR SQL
            ResultSet miResultset = miStatement.executeQuery("SELECT * FROM PRODUCTOS");
            
            // 4. RECORRER EL RESULTSET
            while(miResultset.next())
            {
                
                System.out.println(miResultset.getInt("CODIGOARTICULO") + " " + miResultset.getString("NOMBREARTICULO") + " " + miResultset.getDouble("PRECIO") + " " + miResultset.getDate("FECHA"));
                
            }
            
        }
        catch(Exception e)
        {
            
            System.out.println("No se ha podido conectar!!!");
            
            e.printStackTrace();
            
        }
        
        
    }
    
}
