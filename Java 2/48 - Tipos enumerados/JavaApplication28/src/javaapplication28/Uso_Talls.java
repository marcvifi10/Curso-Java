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

public class Uso_Talls {
     enum Tallas{
        
        MINI("S"), MEDIANO("M"), GRANDE("L");
        
        private Tallas(String abreviatura)
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
