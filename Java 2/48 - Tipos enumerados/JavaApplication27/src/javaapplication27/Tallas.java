/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication27;

/**
 *
 * @author marcv
 */

import java.util.*;

public class Tallas {
    
    // enum Talla {L,M,S};
    
    enum Talla{
        
        MINI("S"), MEDIANO("M"), GRANDE("L");
        
        private Talla(String abreviatura)
        {
            this.abreviatura = abreviatura;
        }
        
        public String dameAbreviatura()
        {
            return abreviatura;
        }
        
        private String abreviatura;
        
    }
}
