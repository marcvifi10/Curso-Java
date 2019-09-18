/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication28;

/**
 *
 * @author marcv
 */

import java.util.*;

public class JavaApplication28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Entra una talla: MINI, MEDIANO o GRANDE");
   
        String datos = entrada.next().toUpperCase();
        
        Tallas la_talla = Enum.valueOf(Tallas.class, datos);
    }
    
}
