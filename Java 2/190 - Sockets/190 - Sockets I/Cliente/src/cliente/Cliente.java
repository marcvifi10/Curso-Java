package cliente;

import java.awt.event.*;
import java.io.IOException;
import javax.swing.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Cliente {

    public static void main(String[] args) 
    {
		
	MarcoCliente mimarco=new MarcoCliente();
		
	mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}


class MarcoCliente extends JFrame{
	
    public MarcoCliente()
    {
		
        setBounds(600,300,280,350);
				
        LaminaMarcoCliente milamina=new LaminaMarcoCliente();
		
        add(milamina);
		
        setVisible(true);
                
    }	
	
}

class LaminaMarcoCliente extends JPanel
{
    
    private JTextField campo1;
	
    private JButton miboton;
	
    public LaminaMarcoCliente()
    {
	
	JLabel texto=new JLabel("CLIENTE");
		
	add(texto);
	
	campo1=new JTextField(20);
	
	add(campo1);		
	
	miboton=new JButton("Enviar");
                
        EnviaTexto mievento = new EnviaTexto();
                
        miboton.addActionListener(mievento);
		
        add(miboton);	
		
    }
		
    private class EnviaTexto implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent ae) 
        {
                
            try 
            {
                // System.out.println(campo1.getText());

                Socket misocket = new Socket("192.168.1.35",9999);
            } 
            catch (IOException ex) 
            {
                System.out.println(ex.getMessage());
            }
                
        }
 
    }
	
}