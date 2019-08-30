/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication26;

/**
 *
 * @author marcv
 */
public class Coche {
    
    private int ruedas;   
    private int largo;
    private int ancho; 
    private int motor;
    private double peso;
    private int precio;
    private String color;
    
    public Coche()
    {
        ruedas = 4;
        largo = 2000;
        ancho = 300;
        motor = 1600;
        peso = 500;
        precio = 0;
        color = "";
    }
    
    public int getRuedas()
    {
        return ruedas;
    }
    
    public void setRuedas(int r)
    {
        ruedas = r;
    }
    
    public String getColor()
    {
        return color;
    }
    
    public void setColor(String c)
    {
        color = c;
    }
    
    public String precio(double precio)
    {
        double impuesto = precio * 0.25;
        
        double precio_final = precio + impuesto;
        
        return "El precio es " + precio_final;
        
    }
}
