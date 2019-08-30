/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bbdd_jdbc;

import java.sql.*;
import java.sql.Statement;

/**
 *
 * @author marcv
 */
public class ModificaBBDD {
    
    public static void main(String[] args) {
        
        try
        {
            
            // 1. CREAR CONEXIÓN
            Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas","root","");
            
            // 2. CREAR OBJETO STATEMENT
            Statement miStatement = miConexion.createStatement();
            
            String instruccionSQL = "INSERT INTO PRODUCTOS(CODIGOARTICULO, NOMBREARTICULO, PRECIO) VALUES ('AR77','PANTALÓN',25.99)";
            
            miStatement.executeUpdate(instruccionSQL);
            
            System.out.println("Datos insertados correctamente!!!");
            
        }
        catch(Exception e)
        {
            
            System.out.println("No se ha podido conectar!!!");
            
            e.printStackTrace();
            
        }
        
        
    }
    
}
