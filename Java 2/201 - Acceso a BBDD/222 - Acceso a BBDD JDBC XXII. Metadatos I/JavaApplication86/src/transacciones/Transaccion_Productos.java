/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transacciones;

import java.sql.Connection;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author marcv
 */
public class Transaccion_Productos {
    
    public static void main(String[] args) throws SQLException
    {
        
        Connection miConexion = null;
		
	try
        {					
				
            miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas", "root", "");				
			
            miConexion.setAutoCommit(false);
                        
            Statement miStatement =miConexion.createStatement();
			
            String instruccionSql_1="DELETE FROM PRODUCTOS WHERE PAISDEORIGEN='ITALIA'";
			    
            String instruccionSql_2="DELETE FROM PRODUCTOS WHERE PRECIO>300";
               
            String instruccionSql_3="UPDATE PRODUCTOS SET PRECIO=PRECIO*1.15";
		
            boolean ejecutar = ejecutar_transaccion();
            
            if(ejecutar)
            {
            
                miStatement.executeUpdate(instruccionSql_1);
            
                miStatement.executeUpdate(instruccionSql_2);
            
                miStatement.executeUpdate(instruccionSql_3);
                
                miConexion.commit();
                
                System.out.println("Se ejecuto la transacción correctamente!!!");
                
            }
            
            else
            {
                
                System.out.println("No se realizó ningún cambio!!!");
                
            }
                
        }
        
        catch(Exception e)
        {
            
            miConexion.rollback();
            
            System.out.println("ERROR!!!");
            
        }
        
    }
    
    public static boolean ejecutar_transaccion()
    {
        
        String ejecucion = JOptionPane.showInputDialog("¿Ejecutamos transacción?");
        
        if(ejecucion.equals("Si"))
        {
            
            return true;
            
        }
        
        else
        {
            
            return false;
            
        }
        
    }
    
}
