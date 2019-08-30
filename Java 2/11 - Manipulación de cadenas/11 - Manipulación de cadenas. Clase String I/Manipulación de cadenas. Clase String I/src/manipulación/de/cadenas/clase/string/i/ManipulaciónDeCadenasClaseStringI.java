/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manipulación.de.cadenas.clase.string.i;

/**
 *
 * @author marcv
 */
public class ManipulaciónDeCadenasClaseStringI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre = "Marc";
        
        System.out.println("Mi nombre es "+nombre);
        System.out.println("El nombre tiene "+nombre.length()+" letras.");
        System.out.println("La primera letra del nombre es la "+nombre.charAt(0));
        System.out.println("La ultima letra es " + nombre.charAt(nombre.length()-1));
    }
    
}
