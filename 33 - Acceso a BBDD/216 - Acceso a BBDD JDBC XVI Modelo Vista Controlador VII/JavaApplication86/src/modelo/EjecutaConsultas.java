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

import modelo.*;
import vista.*;
import controlador.*;

public class EjecutaConsultas 
{
    
    //private String pruebas;
    
    private Conexion miConexion;
    
    private ResultSet rs;
    
    private PreparedStatement enviaConsultaSeccion;
    
    private final String consultaSeccion = "SELECT NOMBREARTICULO, SECCION, PRECIO, PAISORIGEN FROM PRODUCTOS WHERE SECCION =?";
    
    
    public EjecutaConsultas()
    {
        
        miConexion = new Conexion(); 
        
    }
    
    public ResultSet filtraBBDD(String seccion, String pais) throws SQLException
    {
        
        //pruebas = "";
        
        Connection conecta = miConexion.dameConexion();
        
        rs = null;
        
        try
        {
            
            if(!seccion.equals("Todos") && pais.equals("Todos"))
            {

                //pruebas = "Has escogido seccion!!!";

                enviaConsultaSeccion = conecta.prepareStatement(consultaSeccion);

                enviaConsultaSeccion.setString(1,seccion);
                
                rs = enviaConsultaSeccion.executeQuery();
                
            }
            else if(seccion.equals("Todos") && !pais.equals("Todos"))
            {

                //pruebas = "Has escogido pais!!!";

            }
            else
            {

                //pruebas = "Has escogido ambos!!!";

            }
        
        }
        catch(Exception e)
        {
            
            
            
        }
        
        return rs;
        
        //return pruebas;
        
    }
    
}
