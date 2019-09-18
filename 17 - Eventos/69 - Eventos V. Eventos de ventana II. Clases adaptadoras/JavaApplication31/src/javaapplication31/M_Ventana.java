/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication31;

/**
 *
 * @author marcv
 */

import javax.swing.*;
import java.awt.event.*;

public class M_Ventana extends WindowAdapter {

   public void windowIconified(WindowEvent e)
   {
       System.out.println("Ventana minimizada");
   }
     
}
