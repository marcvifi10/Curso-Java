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
public class JavaApplication26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Coche c1 = new Coche();
        
        System.out.println(c1.getRuedas());
        
        c1.setRuedas(5);
        
        System.out.println(c1.getRuedas());
        
        c1.setColor("Rojo");
        
        System.out.println(c1.getColor());
        
        String p2 = c1.precio(1000.00);
        
        System.out.println(p2);
    }
    
}
