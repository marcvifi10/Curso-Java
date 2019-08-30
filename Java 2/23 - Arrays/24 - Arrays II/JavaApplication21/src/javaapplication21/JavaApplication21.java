/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication21;

/**
 *
 * @author marcv
 */
public class JavaApplication21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String [] paises = new String[8];
        
        paises[0] = "España";
        paises[1] = "México";
        paises[2] = "Colombia";
        paises[3] = "Perú";
        paises[4] = "Chile";
        paises[5] = "Argentina";
        paises[6] = "Ecuador";
        paises[7] = "Venezuela";
        
        /*for(int i = 0; i < paises.length; i++)
        {
            System.out.println("País " + (i+1) + ": " + paises[i]);
        }*/
        
        for(String i:paises)
        {
            System.out.println(i);
        }
    }
    
}
