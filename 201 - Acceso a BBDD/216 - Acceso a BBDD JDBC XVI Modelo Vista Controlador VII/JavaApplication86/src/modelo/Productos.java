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



public class Productos 
{
    
    private String n_articulo;
    private String seccion;
    private String precio;
    private String pOrigen;
    
    public Productos()
    {
        
        n_articulo = "";
        seccion = "";
        precio = "";
        pOrigen = "";
        
    }

    public String getN_articulo() 
    {
        return n_articulo;
    }

    public String getSeccion() 
    {
        return seccion;
    }

    public String getPrecio() 
    {
        return precio;
    }

    public String getpOrigen() 
    {
        return pOrigen;
    }

    public void setN_articulo(String n_articulo) 
    {
        this.n_articulo = n_articulo;
    }

    public void setSeccion(String seccion) 
    {
        this.seccion = seccion;
    }

    public void setPrecio(String precio) 
    {
        this.precio = precio;
    }

    public void setpOrigen(String pOrigen) 
    {
        this.pOrigen = pOrigen;
    }
    
    
    
}
