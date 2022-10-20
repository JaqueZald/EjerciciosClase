package Interfaz.MarcoPruebaCombinado;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class MarcoCuadroCombinado extends JFrame {
    private final JComboBox<String> imagenesJComboBox; // contiene los nombres   de los iconos
    private final JLabel etiqueta; // muestra el icono seleccionado

    private static final String nombres[] = {"txt.jfif", "seventeen1.gif", "seventeen2.gif", "002~1028.jpg"};
    private final Icon[] iconos = {
            new ImageIcon(getClass().getResource(nombres[0])),
            new ImageIcon(getClass().getResource(nombres[1])),
            new ImageIcon(getClass().getResource(nombres[2])),
            new ImageIcon(getClass().getResource(nombres[3]))};

    // El constructor de MarcoCuadroCombinado agrega un objeto JComboBox a JFrame
    public MarcoCuadroCombinado() {
        super("Prueba de JComboBox");
        setLayout(new FlowLayout()); // establece el esquema del marco

        imagenesJComboBox = new JComboBox<String>(nombres); // establece JComboBox
        imagenesJComboBox.setMaximumRowCount(3); // muestra tres filas

        imagenesJComboBox.addItemListener(
                new ItemListener() // clase interna anónima
                {
                    // maneja evento de JComboBox
                    @Override
                    public void itemStateChanged(ItemEvent evento) {
                        // determina si está seleccionado el elemento
                        if (evento.getStateChange() == ItemEvent.SELECTED)
                            etiqueta.setIcon(iconos[
                                    imagenesJComboBox.getSelectedIndex()]);
                    }
                } // fin de la clase interna anónima
        ); // fin de la llamada a addItemListener
        add(imagenesJComboBox); // agrega cuadro combinado a JFrame
        etiqueta = new JLabel(iconos[0]); // muestra el primer icono
        add(etiqueta); // agrega etiqueta a JFrame
    }
}
