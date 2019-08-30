
import java.beans.Statement;
import java.sql.*;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marcv
 */
public class ModeloProductos {
    
    private DataSource origenDatos;

    public ModeloProductos(DataSource origenDatos) 
    {
        
        this.origenDatos = origenDatos;
    
    }

    public List<Productos> getProductos() throws Exception
    {
        
       List<Productos> productos = new ArrayList<>();

       Connection miConexion = null;
       
       Statement miStatement = null;
       
       ResultSet miResultset = null;
       
       //--------Establecer conexón
       
       miConexion = origenDatos.getConnection();
       
       //--------Crear sentencia SQL y Statement
       
       String instruccionSQL = "SELECT * FROM PRODUCTOS";
       
       miStatement = (Statement) miConexion.createStatement();
       
       //--------Ejecutar SQL
       
       miResultset = miStatement.executeQuery(instruccionSQL);
       
       //--------Recorrer el resultado obtenido
       
       while(miResultset.next())
       {
           
           String c_art = miResultset.getString("CODIGOARTICULO");
           String seccion = miResultset.getString("SECCION");
           String n_art = miResultset.getString("NOMBREARTICULO");
           double precio = miResultset.getDouble("PRECIO");
           Date fecha = miResultset.getDate("FECHA");
           String importado = miResultset.getString("IMPORTADO");
           String p_orig = miResultset.getString("PAISORIGEN");
           
           Productos tempProd = new Productos(c_art,seccion,n_art,precio,fecha,importado,p_orig);
           
       }
       
        return productos;
       
    }
    
}
