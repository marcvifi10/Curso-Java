/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication50;

/**
 *
 * @author marcv
 */

import java.awt.event.*;
import javax.swing.JFrame;
import java.awt.*;
import javax.swing.*;
import javax.swing.text.*;

public class Practica {
    
    public static void main(String[] args) {
        
        MenuProcesador mimarco2 = new MenuProcesador();
        
        mimarco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        mimarco2.setVisible(true);
        
    }
    
}

class MenuProcesador extends JFrame
{
    
    public MenuProcesador()
    {
        
        setBounds(500,300,550,400);
        
        LaminaProcesador milamina = new LaminaProcesador();
        
        add(milamina);
        
        setVisible(true);
        
    }
    
}

class LaminaProcesador extends JPanel
{
    
    JTextPane miarea;
    
    JMenu fuente, estilo, tamano;
    
    Font letras;
    
    public LaminaProcesador()
    {    
        
        setLayout(new BorderLayout());
        
        JPanel laminamenu = new JPanel();
        
        JMenuBar mibarra = new JMenuBar();
        
        miarea = new JTextPane();
        
        //---------------------------------------
        
        fuente = new JMenu("Fuente");
        
        estilo = new JMenu("Estilo");
        
        tamano = new JMenu("Tamaño");
        
        configura_menu("Arial","fuente","Arial",9,10,"");
        
        configura_menu("Times New Roman","fuente","Times New Roman",9,10,"");
        
        configura_menu("Verdana","fuente","Verdana",9,10,"");
        
        //-----------------------------------------
        
        configura_menu("Negrita","estilo","",Font.BOLD,1,"src/javaapplication50/copiar.gif");
        
        configura_menu("Cursiva","estilo","",Font.ITALIC,1,"");
        
      /* JCheckBoxMenuItem negrita = new JCheckBoxMenuItem("Negrita",new ImageIcon("src/javaapplication50/copiar.gif"));
       
       JCheckBoxMenuItem cursiva = new JCheckBoxMenuItem("Cursiva",new ImageIcon("src/javaapplication50/copiar.gif"));
       
       negrita.addActionListener(new StyledEditorKit.BoldAction());
       
       cursiva.addActionListener(new StyledEditorKit.ItalicAction());
       
       estilo.add(negrita);
       
       estilo.add(cursiva); */
       
        //------------------------------------------
        
       /* configura_menu("12","tamano","",9,12,"");
        
        configura_menu("16","tamano","",9,16,"");
        
        configura_menu("20","tamano","",9,20,"");
        
        configura_menu("24","tamano","",9,24,""); */
       
       ButtonGroup tamano_letra = new ButtonGroup();
       
       JRadioButtonMenuItem doce = new JRadioButtonMenuItem("12");
        
       JRadioButtonMenuItem dieciseis = new JRadioButtonMenuItem("16");
       
       JRadioButtonMenuItem veinte = new JRadioButtonMenuItem("20");
       
       JRadioButtonMenuItem veinticuatro = new JRadioButtonMenuItem("24");
       
       // veinticuatro.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,InputEvent.CTRL_DOWN_MASK));
       
       tamano_letra.add(doce);
       
       tamano_letra.add(dieciseis);
       
       tamano_letra.add(veinte);
       
       tamano_letra.add(veinticuatro);
       
       doce.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamano", 12));
       
       dieciseis.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamano", 16));
       
       veinte.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamano", 20));
       
       veinticuatro.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamano", 24));
       
       tamano.add(doce);
       tamano.add(dieciseis);
       tamano.add(veinte);
       tamano.add(veinticuatro);
       
       
        //--------------------------------------------
        
        mibarra.add(fuente);
        
        mibarra.add(estilo);
        
        mibarra.add(tamano);
        
        laminamenu.add(mibarra);
        
        add(laminamenu,BorderLayout.NORTH);
        
        add(miarea,BorderLayout.CENTER);
        
        JPopupMenu emergente = new JPopupMenu();
        
        JMenuItem negritaE = new JMenuItem("Negrita");
        
        emergente.add(negritaE);
        
        // opcion1.addActionListener();
        
        JMenuItem cursivaE = new JMenuItem("Cursiva");
        
        emergente.add(cursivaE);
        
        negritaE.addActionListener(new StyledEditorKit.BoldAction());
       
        cursivaE.addActionListener(new StyledEditorKit.ItalicAction());
        
        miarea.setComponentPopupMenu(emergente);
        
        //----------------------------------------------
        
        JToolBar barra = new JToolBar();
        
        JButton negritaBarra = new JButton(new ImageIcon("src/javaapplication50/negrita.png"));
    
        barra.add(negritaBarra);
        
        JButton cursivaBarra = new JButton(new ImageIcon("src/javaapplication50/cursiva.png"));
    
        barra.add(cursivaBarra);
        
        JButton subBarra = new JButton(new ImageIcon("src/javaapplication50/cursiva.png"));
    
        barra.add(subBarra);
        
        JButton azulBarra = new JButton(new ImageIcon("src/javaapplication50/cursiva.png"));
    
        barra.add(azulBarra);
        
        JButton amarilloBarra = new JButton(new ImageIcon("src/javaapplication50/cursiva.png"));
    
        barra.add(amarilloBarra);
        
        JButton rojoBarra = new JButton(new ImageIcon("src/javaapplication50/cursiva.png"));
    
        barra.add(rojoBarra);
        
        JButton a_izquierda = new JButton(new ImageIcon("src/javaapplication50/cursiva.png"));
    
        barra.add(a_izquierda);
        
        JButton a_centrado = new JButton(new ImageIcon("src/javaapplication50/cursiva.png"));
    
        barra.add(a_centrado);
        
        JButton a_derecha = new JButton(new ImageIcon("src/javaapplication50/cursiva.png"));
    
        barra.add(a_derecha);
        
        JButton a_justificado = new JButton(new ImageIcon("src/javaapplication50/cursiva.png"));
    
        barra.add(a_justificado);
        
        negritaBarra.addActionListener(new StyledEditorKit.BoldAction());
        
        cursivaBarra.addActionListener(new StyledEditorKit.ItalicAction());
        
        subBarra.addActionListener(new StyledEditorKit.UnderlineAction());
        
        azulBarra.addActionListener(new StyledEditorKit.ForegroundAction("Pone_azul",Color.BLUE));
        
        amarilloBarra.addActionListener(new StyledEditorKit.ForegroundAction("Pone_amarillo",Color.YELLOW));
        
        rojoBarra.addActionListener(new StyledEditorKit.ForegroundAction("Pone_rojo",Color.RED));
        
        a_izquierda.addActionListener(new StyledEditorKit.AlignmentAction("izquierda",0));
        
        a_derecha.addActionListener(new StyledEditorKit.AlignmentAction("derecha",2));
        
        a_centrado.addActionListener(new StyledEditorKit.AlignmentAction("centrado",1));
        
        a_justificado.addActionListener(new StyledEditorKit.AlignmentAction("justificado",3));
        
        barra.setOrientation(1);
        
        add(barra, BorderLayout.WEST);
        
    }
    
    public void configura_menu(String rotulo, String menu, String tipo_letra, int estilos, int tam, String ruta_icono)
    {
        
        JMenuItem elem_menu = new JMenuItem(rotulo, new ImageIcon(ruta_icono));
        
        if(menu == "fuente")
        {
            
            fuente.add(elem_menu); 
            
        }
        else if(menu == "estilo")
        {
            
            estilo.add(elem_menu); 
            
            if(estilos == Font.BOLD)
            {
                
                elem_menu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,InputEvent.CTRL_DOWN_MASK));
                        
                elem_menu.addActionListener(new StyledEditorKit.BoldAction());
                
            }
            else if(estilos == Font.ITALIC)
            {
                
                elem_menu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_K,InputEvent.CTRL_DOWN_MASK));
                
                elem_menu.addActionListener(new StyledEditorKit.ItalicAction());
            }
            
        }
        else if(menu == "tamano")
        {
            
            tamano.add(elem_menu); 
            
        }
       
        elem_menu.addActionListener(new Gestiona_Eventos(rotulo,tipo_letra,estilos,tam));
        
    }
    
    private class Gestiona_Eventos implements ActionListener
    {
        
        String tipo_texto, menu;   
        int estilo_letra, tamano_letra;

        public Gestiona_Eventos(String elemento,String texto2, int estilo2, int tam_letra)
        {
            
            tipo_texto = texto2;
            
            estilo_letra = estilo2;
            
            tamano_letra = tam_letra;
            
            menu = elemento;
            
        }
        
        @Override
        public void actionPerformed(ActionEvent ae) {
            
            letras = miarea.getFont();
            
            if(menu == "Arial" || menu == "Times New Roman" || menu == "Verdana")
            {
                
                estilo_letra = letras.getStyle();
                
                tamano_letra = letras.getSize();
                
            }
            else if(menu == "Cursiva" || menu == "Negrita")
            {
                
                if(letras.getStyle() == 1 || letras.getStyle() == 2)
                {
                    
                    estilo_letra = 3;
                    
                }
                
                tipo_texto = letras.getFontName();
                
                tamano_letra = letras.getSize();
                
            }
            else if(menu == "12" || menu == "16" || menu == "20" || menu == "24")
            {
                
                tipo_texto = letras.getFontName();
                
                estilo_letra = letras.getStyle();
                
            }
            
            miarea.setFont(new Font(tipo_texto,estilo_letra,tamano_letra));
            
            System.out.println("Tipo de letra: " + tipo_texto + " Estilo: " + estilo_letra + " Tamaño: " + tamano_letra);
            
        }
        
    }
    
}
