package Interfaz.CampoTexto;

import Interfaz.CampoTexto.CampoTextoMarco;

import javax.swing.*;

public class PruebaCampoTexto {
    public static void main(String[] args) {
        CampoTextoMarco campoTextoMarco=new CampoTextoMarco();
        campoTextoMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        campoTextoMarco.setSize(350,100);
        campoTextoMarco.setVisible(true);
    }
}
