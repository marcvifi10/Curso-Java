
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JApplet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marcv
 */
public class Applet_Multimedi extends JApplet
{
    
    Image logo;
    
    public void init()
    {
        
        logo = getImage(getDocumentBase(),"logo.png");
        
        
    }
    
    public void paint(Graphics g)
    {
        
        g.drawImage(logo, 50, 50, this);
        
    }
}
