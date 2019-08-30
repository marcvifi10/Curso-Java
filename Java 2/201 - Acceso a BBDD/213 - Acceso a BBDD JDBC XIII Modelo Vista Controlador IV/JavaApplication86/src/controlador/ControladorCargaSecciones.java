/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

/**
 *
 * @author marcv
 */

import modelo.*;

import vista.*;

import java.awt.event.*;

public class ControladorCargaSecciones extends WindowAdapter
{
    
    CargaSecciones obj = new CargaSecciones();
    
    private Marco_Aplicacion2 elmarco;
    
    
    public ControladorCargaSecciones(Marco_Aplicacion2 elmarco)
    {
        
        this.elmarco = elmarco;
        
    }

    public void WindowOpened(WindowEvent e)
    {
        
        obj.EjecutaConsultas();
        
        try
        {
            
            while(obj.rs.next())
            {
                
                elmarco.secciones.addItem(obj.rs.getString(1));
                
            }
            
        }
        catch(Exception e2)
        {
            
            e2.printStackTrace();
            
        }
        
    }

}
