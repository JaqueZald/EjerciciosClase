package Interfaz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CampoTextoMarco extends JFrame {
    private final JTextField campoTexto1;
    private final JTextField campoTexto2;
    private final JTextField campoTexto3;
    private final JPasswordField campoContrasena;

    //Constructor
    public CampoTextoMarco() {
        super("Prueba de JTextField y JPasswordFiel");
        setLayout(new FlowLayout());

        //Construir campo de texto con 10 columnas
        campoTexto1 = new JTextField(10);
        add(campoTexto1);
        //Campo con texto predeterminado
        campoTexto2 = new JTextField("Escriba el texto aqui");
        add(campoTexto2);
        //Campo de texto con texto predeterminado y 21 columnas
        campoTexto3 = new JTextField("Campo de texto no editable", 21);
        campoTexto3.setEditable(false);
        add(campoTexto3);
        //Campo de contraseña con texto predeterminado
        campoContrasena = new JPasswordField("Texto oculto");
        add(campoContrasena);
        //Registrar los manejadores de eventos
        ManejadorCampoTexto manejador = new ManejadorCampoTexto();
        campoTexto1.addActionListener(manejador);
        campoTexto2.addActionListener(manejador);
        campoTexto3.addActionListener(manejador);
        campoContrasena.addActionListener(manejador);
    }

    // clase interna privada para el manejo de eventos
    private class ManejadorCampoTexto implements ActionListener {
        // procesa los eventos de campo de texto
        @Override
        public void actionPerformed(ActionEvent evento) {
            String cadena = "";
            //Usuario oprimio intro en el objeto JTextField campotexto1
            if (evento.getSource() == campoTexto1)
                cadena = String.format("CampoTexto1: %s", evento.getActionCommand());
                //Usuario oprimio campoTexto2
            else if (evento.getSource() == campoTexto2)
                cadena = String.format("CampoTexto2: %s", evento.getActionCommand());
            else if (evento.getSource() == campoTexto3)
                cadena = String.format("CampoTexto3: %s", evento.getActionCommand());
            else if (evento.getSource() == campoContrasena)
                cadena = String.format("CampoConstraseña: %s", evento.getActionCommand());
            //mostrar contenido JTextField
            JOptionPane.showMessageDialog(null, cadena);
        }
    } // fin de la clase interna privada ManejadorCampoTexto
} // fin de la clase CampoTextoMarco
