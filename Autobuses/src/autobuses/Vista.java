/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autobuses;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author antonio
 */
public class Vista extends JFrame {
    
    private JPanel supPrincipal,cenPrincipal;
    private JComboBox origen,destino;
    private JButton buscar;
    
    public Vista(){
        initComponents();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
    }
    
    public void initComponents(){
        setLayout(new BorderLayout());
        supPrincipal = new JPanel();
        supPrincipal.setLayout(new BorderLayout());
        supPrincipal.setBackground(Color.WHITE);
        
        JLabel iconopr = new JLabel();
        JLabel titulopr = new JLabel("Servicio de autobuses QUchao2.0");
        Font fuente = new Font("Arial",1,20);
        titulopr.setFont(fuente);
        ImageIcon logo =new ImageIcon(getClass().getResource("rayo.png"));
        Icon logopr = new ImageIcon(logo.getImage().getScaledInstance(150,80,Image.SCALE_DEFAULT));
        iconopr.setIcon(logopr);
        
        cenPrincipal= new JPanel();
        cenPrincipal.setLayout(new BorderLayout());
        
        JPanel boxes= new JPanel();
        boxes.setLayout(new FlowLayout());
        
        JPanel or= new JPanel();
        //or.setLayout(new BoxLayout(or,BoxLayout.Y_AXIS));
        or.setLayout(new BorderLayout());
        or.setBackground(Color.WHITE);
        origen = new JComboBox();
        origen.addItem("Oaxaca");
        origen.addItem("Mexico");
        origen.addItem("Guadalajara");
        or.add(new JLabel("Origen:",SwingConstants.LEFT),BorderLayout.NORTH);
        or.add(origen,BorderLayout.SOUTH);
        boxes.add(or);
        
        JPanel des = new JPanel();
        des.setLayout(new BorderLayout());
        des.setBackground(Color.WHITE);
        destino = new JComboBox();
        destino.addItem("Oaxaca");
        destino.addItem("Mexico");
        destino.addItem("Guadalajara");
        des.add(new JLabel("Destino:",SwingConstants.LEFT),BorderLayout.NORTH);
        des.add(destino,BorderLayout.SOUTH);
        boxes.add(des);
        
        buscar= new JButton("Buscar viaje");
        boxes.add(buscar);
        boxes.setBackground(Color.BLACK);
        
        JLabel slogan = new JLabel("Tu mejor opcion para tener un viaje espectacular",SwingConstants.CENTER);
        slogan.setFont(new Font("Arial",1,15));
        
        supPrincipal.add(iconopr,BorderLayout.WEST);
        supPrincipal.add(titulopr,BorderLayout.CENTER);
        cenPrincipal.add(boxes);
        add(supPrincipal,BorderLayout.NORTH);
        add(slogan,BorderLayout.CENTER);
        add(cenPrincipal,BorderLayout.SOUTH);
        

    }
    
    public static void main(String[] args) {
       Vista v= new Vista();
    }
    
}
