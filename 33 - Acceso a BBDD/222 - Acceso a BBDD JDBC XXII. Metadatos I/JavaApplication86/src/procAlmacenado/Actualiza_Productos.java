/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procAlmacenado;

/**
 *
 * @author marcv
 */

import java.sql.*;
import javax.swing.*;
import javax.swing.JOptionPane;

public class Actualiza_Productos {
    
    public static void main(String[] args)
    {
        
        int nPrecio = Integer.parseInt(JOptionPane.showInputDialog("Introduce precio: "));
        String nArticulo = JOptionPane.showInputDialog("Introduce el nombre del articulo: ");
        
        try
        {
            
            Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/curso_sql","root","");
            
            CallableStatement miSentencia = miConexion.prepareCall("{call ACTUALIZA_PROD(?,?)}");
            
            miSentencia.setInt(1, nPrecio);
            
            miSentencia.setString(2, nArticulo);
            
            miSentencia.execute();
            
            System.out.println("Actualización OK");
            
        }
        catch(Exception e)
        {
            
            
            
        }
        
    }
    
}
