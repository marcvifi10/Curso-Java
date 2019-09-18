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

import java.awt.event.*;

import java.util.*;

public class DameLaHora implements ActionListener {
    
    public void actionPerformed(ActionEvent e)
    {
        Date ahora = new Date();
        
        System.out.println("Te pongo la hora ca 5 seg " + ahora);
    }
}
