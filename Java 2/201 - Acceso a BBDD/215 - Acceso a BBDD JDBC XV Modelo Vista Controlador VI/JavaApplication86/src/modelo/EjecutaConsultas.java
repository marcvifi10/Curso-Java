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

public class EjecutaConsultas 
{
    
    private String pruebas;
    
    public String filtraBBDD(String seccion, String pais)
    {
        
        pruebas = "";
        
        if(!seccion.equals("Todos") && pais.equals("Todos"))
        {
            
            pruebas = "Has escogido seccion!!!";
            
        }
        else if(seccion.equals("Todos") && !pais.equals("Todos"))
        {
              
            pruebas = "Has escogido pais!!!";
            
        }
        else
        {
            
            pruebas = "Has escogido ambos!!!";
            
        }
        
        return pruebas;
        
    }
    
}
