package javaapplication1;

import java.awt.*;
import java.sql.*;
import javax.swing.*;

public class AplicacionUniversal 
{

    public static void main(String[] args) 
    {
	// TODO Auto-generated method stub
		
	MarcoBBDD mimarco=new MarcoBBDD();
		
	mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	mimarco.setVisible(true);

    }

}

class MarcoBBDD extends JFrame
{

    public MarcoBBDD()
    {
		
	setBounds(300,300,700,700);
		
	LaminaBBDD milamina=new LaminaBBDD();
		
	add(milamina);
		
    }	
	
}

class LaminaBBDD extends JPanel
{
    
    private JComboBox comboTablas;

    private JTextArea areaInformacion;
    
    private Connection miConexion;
    
	
    public LaminaBBDD()
    {
		
	setLayout(new BorderLayout());
		
	comboTablas=new JComboBox();
		
	areaInformacion=new JTextArea();
		
	add(areaInformacion,BorderLayout.CENTER);		
		
	add(comboTablas, BorderLayout.NORTH);
        
        conectarBBDD();
        
        obtenerTablas();
		
    }

    public void conectarBBDD()
    {
        
        miConexion = null;
        
        try
        {
            
            miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/curso_sql","root","");
            
        }
        
        catch(Exception e)
        {
            
           e.printStackTrace();
            
        }
        
    }
    
    public void obtenerTablas()
    {
        
        ResultSet miResultSet = null;
        
        try
        {
            
            DatabaseMetaData datosBBDD = miConexion.getMetaData();
            
            miResultSet = datosBBDD.getTables(null, null, null, null);
            
            while(miResultSet.next())
            {
                
                comboTablas.addItem(miResultSet.getString("TABLE_NAME"));
                
            }
            
        }
        
        catch(Exception e)
        {
            
            e.printStackTrace();
            
        }
        
    }
    
}


		
