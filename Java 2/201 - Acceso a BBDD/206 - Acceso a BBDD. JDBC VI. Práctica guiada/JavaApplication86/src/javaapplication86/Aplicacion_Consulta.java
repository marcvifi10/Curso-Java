package javaapplication86;

import javax.swing.*;

import java.awt.*;
import java.sql.*;


public class Aplicacion_Consulta 
{

    public static void main(String[] args) 
    {
	// TODO Auto-generated method stub
		
	JFrame mimarco=new Marco_Aplicacion();
		
	mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	mimarco.setVisible(true);

    }

}

class Marco_Aplicacion extends JFrame
{
    
    private JComboBox secciones;
	
    private JComboBox paises;
	
    private JTextArea resultado;	
	
    public Marco_Aplicacion()
    {
		
	setTitle ("Consulta BBDD");
		
	setBounds(500,300,400,400);
		
	setLayout(new BorderLayout());
		
	JPanel menus=new JPanel();
		
	menus.setLayout(new FlowLayout());
		
	secciones=new JComboBox();
		
	secciones.setEditable(false);
		
	secciones.addItem("Todos");
		
	paises=new JComboBox();
		
	paises.setEditable(false);
		
	paises.addItem("Todos");
		
	resultado= new JTextArea(4,50);
		
	resultado.setEditable(false);
		
	add(resultado);
		
	menus.add(secciones);
		
	menus.add(paises);	
		
	add(menus, BorderLayout.NORTH);
		
        add(resultado, BorderLayout.CENTER);
		
        JButton botonConsulta=new JButton("Consulta");	
		
        add(botonConsulta, BorderLayout.SOUTH);
	
        // ---------------Connexión con BBDD----------------
        
        try
        {
            
            Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/curso_sql","root","");
        
            Statement sentencia = miConexion.createStatement();
            
            //-------------CARGA JCOMBOBOX SECCIONES-----------
            
            String consulta = "SELECT DISTINCTROW SECCION FROM PRODUCTOS";
            
            ResultSet rs = sentencia.executeQuery(consulta);
            
            while(rs.next())
            {
                
                secciones.addItem(rs.getString(1));
                
            }
            
            rs.close();
            
            //-------------CARGA JCOMBOBOX PAÍSES-----------
            
            consulta = "SELECT DISTINCTROW PAISORIGEN FROM PRODUCTOS";
            
            rs = sentencia.executeQuery(consulta);
            
            while(rs.next())
            {
                
                paises.addItem(rs.getString(1));
                
            }
            
            rs.close();
            
        }
        catch(Exception e)
        {
            
            
            
        }
        
    }	
	
}

