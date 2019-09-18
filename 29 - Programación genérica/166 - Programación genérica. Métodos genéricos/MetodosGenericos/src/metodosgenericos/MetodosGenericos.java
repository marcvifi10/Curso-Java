/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosgenericos;

import java.util.GregorianCalendar;

/**
 *
 * @author marcv
 */
public class MetodosGenericos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String nombres2[] = {"Marc","Alex","Juan"};
        
        String elementos = MisMatrices.getElementos(nombres2);
        
        System.out.println(elementos);
        
        // Empleado listaEmpleados[] = {new Empleado("Ana",45,2500),new Empleado("Ana",45,2500)};
        
        // System.out.println(MisMatrices.getElementos(listaEmpleados));
        
        System.out.println(MisMatrices.getMenor(nombres2));
        
        GregorianCalendar fechas[] = {new GregorianCalendar(2015,11,28), new GregorianCalendar(2015,10,28)};
        
        System.out.println(MisMatrices.getMenor(fechas));
        
    }
    
}

class MisMatrices
{
    
    public static <T> String getElementos(T[]a)
    {
        
        return "El array tiene " + a.length + " elementos.";
        
    }
    
    public static <T extends Comparable> T getMenor(T[]a)
    {
        
        if(a == null || a.length == 0)
        {
            return null;
        }
        
        T elementoMenor = a[0];
        
        for(int i = 1; i < a.length; i++)
        {
            
            if(elementoMenor.compareTo(a[i]) > 0)
            {
                elementoMenor = a[i];
            }
            
        }
        
        return elementoMenor;
        
    }
    
}
