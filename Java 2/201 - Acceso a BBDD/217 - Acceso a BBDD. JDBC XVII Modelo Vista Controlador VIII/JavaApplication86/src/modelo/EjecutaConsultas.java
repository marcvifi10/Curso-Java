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
    
    private PreparedStatement enviaConsultaPais;
    
    private final String consultaPais = "SELECT NOMBREARTICULO, SECCION, PRECIO, PAISORIGEN FROM PRODUCTOS PAISORIGEN=?";
    
    private PreparedStatement enviaConsultaTodos;
    
    private final String consultaTodos = "ELECT NOMBREARTICULO, SECCION, PRECIO, PAISORIGEN FROM PRODUCTOS WHERE SECCION=? AND PAISORIGEN=?";
    
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

                enviaConsultaPais = conecta.prepareStatement(consultaPais);
                
                enviaConsultaPais.setString(1,pais);
                
                rs = enviaConsultaPais.executeQuery();
                
            }
            else
            {

                //pruebas = "Has escogido ambos!!!";

                enviaConsultaTodos = conecta.prepareStatement(consultaTodos);
                
                enviaConsultaTodos.setString(1,seccion);
                
                enviaConsultaTodos.setString(2, pais);
                
                rs = enviaConsultaTodos.executeQuery();
                
            }
        
        }
        catch(Exception e)
        {
            
            
            
        }
        
        return rs;
        
        //return pruebas;
        
    }
    
}
