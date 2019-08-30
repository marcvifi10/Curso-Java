package cliente;

import java.awt.event.*;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import javax.swing.*;
import java.net.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Cliente {

    public static void main(String[] args) 
    {
		
	MarcoCliente mimarco=new MarcoCliente();
		
	mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}


class MarcoCliente extends JFrame
{
	
    public MarcoCliente()
    {
		
        setBounds(600,300,280,350);
				
        LaminaMarcoCliente milamina=new LaminaMarcoCliente();
		
        add(milamina);
		
        setVisible(true);
        
        addWindowListener(new EnvioOnline());
                
    }	
	
}

//-------------------------ENVIO DE SEÑAL ONLINE------------------------

class EnvioOnline extends WindowAdapter
{
    
    public void windeowOpened(WindowEvent e)
    {
        
        try
        {
            
            Socket misocket = new Socket("192.168.1.40",9999);
            
            PaqueteEnvio datos = new PaqueteEnvio();
            
            datos.setMensaje(" online");
            
            ObjectOutputStream paquete_datos = new ObjectOutputStream(misocket.getOutputStream());
            
            paquete_datos.writeObject(datos);
            
            misocket.close();
            
        }
        catch(Exception e2)
        {
            
            
            
        }
        
    }
    
}

//---------------------------------------------------------------

class LaminaMarcoCliente extends JPanel implements Runnable
{
    
    private JTextField campo1;
    
    private JComboBox ip;
    
    private JLabel nick;
	
    private JButton miboton;
    
    private JTextArea campochat;
	
    public LaminaMarcoCliente()
    {
        
        String nick_usuario = JOptionPane.showInputDialog("Nick: ");
        
        JLabel n_nick = new JLabel("Nick: ");
        
        add(n_nick);
        
        nick = new JLabel();
        
        nick.setText(nick_usuario);
        
        add(nick);
	
	JLabel texto=new JLabel("Online: ");
		
	add(texto);
        
        ip = new JComboBox();
        
        /* ip.addItem("Usuario 1");
        
        ip.addItem("Usuario 2");
        
        ip.addItem("Usuario 3"); */
        
        ip.addItem("192.168.1.40");
        
        add(ip);
        
        campochat = new JTextArea(12,20);
	
        add(campochat);
        
	campo1=new JTextField(20);
	
	add(campo1);		
	
	miboton=new JButton("Enviar");
                
        EnviaTexto mievento = new EnviaTexto();
                
        miboton.addActionListener(mievento);
		
        add(miboton);	
        
        Thread mihilo = new Thread(this);
        
        mihilo.start();
		
    }

    @Override
    public void run() {
       
        try
        {
            
            ServerSocket servidor_cliente = new ServerSocket(9090);
            
            Socket cliente;
            
            PaqueteEnvio paqueteRecibido;
            
            while(true)
            {
                
                cliente = servidor_cliente.accept();
                
                ObjectInputStream flujo_entrada = new ObjectInputStream(cliente.getInputStream());
                
                paqueteRecibido = (PaqueteEnvio)flujo_entrada.readObject();
                
                campochat.append("\n" + paqueteRecibido.getNick() + ": " + paqueteRecibido.getMensaje());
                
            }
            
        }
        catch(Exception e)
        {
            
            System.out.println(e.getMessage());
            
        }
        
    }
		
    private class EnviaTexto implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent ae) 
        {
                
            try 
            {
                // System.out.println(campo1.getText());

                Socket misocket = new Socket("127.0.0.1",9999);
            
                PaqueteEnvio datos = new PaqueteEnvio();
                
                datos.setNick(nick.getText());
                
                datos.setIp(ip.getSelectedItem().toString());
                
                datos.setMensaje(campo1.getText());
                
                ObjectOutputStream paquete_datos = new ObjectOutputStream(misocket.getOutputStream());
                
                paquete_datos.writeObject(datos);
                
                misocket.close();
                
               // DataOutputStream flujo_salida = new DataOutputStream(misocket.getOutputStream());
                
              //  flujo_salida.writeUTF(campo1.getText());
                
               // flujo_salida.close();
                
            } 
            catch (IOException ex) 
            {
                System.out.println(ex.getMessage());
            }
                
        }
 
    }
	
}

class PaqueteEnvio implements Serializable
{

    private String nick, ip, mensaje;
    
    private ArrayList<String> Ips;

    

    public String getNick() 
    {
        
        return nick;
        
    }

    public String getIp() 
    {
        
        return ip;
        
    }

    public String getMensaje() 
    {
        
        return mensaje;
        
    }

    public void setNick(String nick) 
    {
        
        this.nick = nick;
        
    }

    public void setIp(String ip) 
    {
        
        this.ip = ip;
        
    }

    public void setMensaje(String mensaje) 
    {
        
        this.mensaje = mensaje;
        
    }
    
    public ArrayList<String> getIps() 
    {
        
        return Ips;
        
    }

    public void setIps(ArrayList<String> Ips) 
    {
        
        this.Ips = Ips;
        
    }
    
}