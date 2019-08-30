
import java.beans.Statement;
import java.sql.*;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    
    public void agregarElNuevoProducto(Productos nuevoProducto)
    {
        
        // Obtener la conexión
        
        Connection miConexion = null;
        
        PreparedStatement miStatement = null;
        
        try
        {
            
            miConexion = origenDatos.getConnection();
            
        }
        catch(Exception e)
        {
            
            
            
        }
        
        // Crear instrucción sql que inserte el producto
        
        String sql = "INSERT INTO PRODUCTOS (CODIGO,SECCION,NOMBRE,PRECIO,FECHA,IMPORTADO,PAIS)"
                + "   VALUES (?,?,?,?,?,?,?)";
        
        try 
        {
            
            miStatement = miConexion.prepareStatement(sql);
            
            // Establecer parámetros para el producto
            
            miStatement.setString(1, nuevoProducto.getcArt());
            
            miStatement.setString(2, nuevoProducto.getSeccion());
            
            miStatement.setString(3, nuevoProducto.getnArt());
            
            miStatement.setDouble(4, nuevoProducto.getPrecio());
            
            java.util.Date utilDate = nuevoProducto.getFecha();
            
            java.sql.Date fechaConvertida = new java.sql.Date(utilDate.getTime());
            
            miStatement.setDate(5, fechaConvertida);
            
            miStatement.setString(6, nuevoProducto.getcArt());
            
            miStatement.setString(7, nuevoProducto.getcArt());
            
            // Ejecutar instrucción SQL
            
            miStatement.execute();
            
        } 
        catch (SQLException ex) 
        {
            
            Logger.getLogger(ModeloProductos.class.getName()).log(Level.SEVERE, null, ex);
        
        }
        
    }
    
}
