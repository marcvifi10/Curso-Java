/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author marcv
 */

import java.awt.*;
import javax.swing.*;

public class Marco_Aplicacion2 extends JFrame
{
    
    private JComboBox secciones;
	
    private JComboBox paises;
	
    private JTextArea resultado;
    
    public Marco_Aplicacion2()
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
        
    }
    
}
