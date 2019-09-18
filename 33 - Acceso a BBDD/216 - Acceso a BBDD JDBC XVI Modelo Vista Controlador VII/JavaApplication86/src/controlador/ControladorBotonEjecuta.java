/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import modelo.*;
import vista.*;

/**
 *
 * @author marcv
 */

public class ControladorBotonEjecuta implements ActionListener {

    private Marco_Aplicacion2 elmarco;
    
    EjecutaConsultas obj = new EjecutaConsultas();
    
    private ResultSet resultadoConsulta;
    
    public ControladorBotonEjecuta(Marco_Aplicacion2 elmarco)
    {
        
        this.elmarco = elmarco;
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
       
         String seleccionSeccion = (String)elmarco.secciones.getSelectedItem();
            
         String seleccionPais = (String)elmarco.paises.getSelectedItem();
            
        try {
            resultadoConsulta = obj.filtraBBDD(seleccionSeccion,seleccionPais);
        } catch (SQLException ex) {
            Logger.getLogger(ControladorBotonEjecuta.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
        try {
            
            elmarco.resultado.setText("");
           
            while(resultadoConsulta.next())
            {
                
                elmarco.resultado.append(resultadoConsulta.getString(1));
                
                elmarco.resultado.append(", ");
                
                elmarco.resultado.append(resultadoConsulta.getString(2));
                
                elmarco.resultado.append(", ");
                
                elmarco.resultado.append(resultadoConsulta.getString(3));
                
                elmarco.resultado.append(", ");
                
                elmarco.resultado.append(resultadoConsulta.getString(4));
                
                elmarco.resultado.append("\n");
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ControladorBotonEjecuta.class.getName()).log(Level.SEVERE, null, ex);
        }
                    
    } 
    
}
