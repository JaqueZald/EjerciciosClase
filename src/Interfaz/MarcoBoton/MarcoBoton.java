package Interfaz.MarcoBoton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MarcoBoton extends JFrame {
    private final JButton botonJButtonSimple;
    private final JButton botonJButtonElegante;

    //MarcoBoton adds JButton objects to JFrame
    public MarcoBoton(){
        super("Button test");
        setLayout(new FlowLayout());

        botonJButtonSimple = new JButton("Simple Button");
        add(botonJButtonSimple);


        Icon insecto1= new ImageIcon(getClass().getResource("seventeen1.gif"));
        Icon insecto2= new ImageIcon(getClass().getResource("seventeen2.gif"));
        botonJButtonElegante = new JButton("Elegant button", insecto1);//Set the image

        botonJButtonElegante.setRolloverIcon(insecto2);//Set the replacement image
        add(botonJButtonElegante);//adds buttonJButtonElegant to JFrame

        // creates new ButtonHand handler to handle button events
        ManejadorBoton manejador = new ManejadorBoton();
        botonJButtonElegante.addActionListener(manejador);
        botonJButtonSimple.addActionListener(manejador);
    }
    // internal class for handling button events
    private class  ManejadorBoton implements  ActionListener{
        // handles button event
        @Override
        public void actionPerformed(ActionEvent evento){
            JOptionPane.showMessageDialog(MarcoBoton.this,String.format("Usted oprimio" +
                    ": %s", evento.getActionCommand()));
        }
    }
} // fin de la clase MarcoBoton

