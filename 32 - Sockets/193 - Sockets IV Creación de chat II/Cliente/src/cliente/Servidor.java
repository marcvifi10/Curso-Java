package cliente;

import javax.swing.*;

import java.awt.*;
import java.io.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Servidor  
{

    public static void main(String[] args) 
    {
		
        MarcoServidor mimarco = new MarcoServidor();
		
	mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
    }
    
}

class MarcoServidor extends JFrame implements Runnable 
{
    
    private JTextArea areatexto;
	
    public MarcoServidor()
    {
		
	setBounds(1200,300,280,350);				
			
	JPanel milamina= new JPanel();
		
	milamina.setLayout(new BorderLayout());
		
	areatexto=new JTextArea();
		
	milamina.add(areatexto,BorderLayout.CENTER);
		
	add(milamina);
		
	setVisible(true);
        
        Thread mihilo = new Thread(this);
        
        mihilo.start();
		
    }

    @Override
    public void run() {
        
        try 
        {
            // System.out.println("Escucha");

            ServerSocket servidor = new ServerSocket(9999);
        
            String nick, ip, mensaje;
            
            PaqueteEnvio paquete_recibido;
            
            while(true)
            {
            
                Socket misocket = servidor.accept();

                // DataInputStream flujo_entrada = new DataInputStream(misocket.getInputStream());

                // String mensaje_texto = flujo_entrada.readUTF();

                // areatexto.append("\n" + mensaje_texto);

                ObjectInputStream paquete_datos = new ObjectInputStream(misocket.getInputStream());
                
                paquete_recibido = (PaqueteEnvio)paquete_datos.readObject();
                
                nick = paquete_recibido.getNick();
                
                ip = paquete_recibido.getIp();
                
                mensaje = paquete_recibido.getMensaje();
                
                areatexto.append("\n" + nick + ": " + mensaje + " para " + ip);
                
                misocket.close();
                
            }
            
        } 
        catch (IOException | ClassNotFoundException ex) 
        {
            
            ex.printStackTrace();
        
        }
        
    }
	
}
