package Interfaz;

import java.awt.FlowLayout; // especifica cómo se van a ordenar los componentes
import javax.swing.*;
import javax.swing.JLabel; // muestra texto e imágenes
import javax.swing.SwingConstants; // constantes comunes utilizadas con Swing
import javax.swing.Icon; // interfaz utilizada para manipular imágenes
import javax.swing.ImageIcon; // carga las imágenes

public class imagenPrueba extends JFrame {
    private JLabel etiqueta1;//Label con texto
    private JLabel etiqueta2;//Label construida con texto y un icono
    private JLabel etiqueta3;//Label con texto adicional e icono

    //Constructor
    public imagenPrueba() {
        super("Prueba de Label");
        setLayout(new FlowLayout());
        //Construtor de JLabel con un argumento String
        etiqueta1 = new JLabel("Etiqueta con texto");
        etiqueta1.setToolTipText("Esta es la etiqueta 1");
        add(etiqueta1);

        //Constructor JLabel con argumentos de cadena, icono y alineacion
        Icon insecto = new ImageIcon(getClass().getResource("insecto.png"));
        etiqueta2 = new JLabel("Etiueta con texto e icono", insecto, SwingConstants.LEFT);
        etiqueta2.setToolTipText("Esra es la etiqueta 2");
        add(etiqueta2);

        etiqueta3 = new JLabel();
        etiqueta3.setText("Etiqueta con icono y texto en la parte inferior");
        etiqueta3.setIcon(insecto);
        etiqueta3.setHorizontalTextPosition(SwingConstants.CENTER);
        etiqueta3.setVerticalTextPosition(SwingConstants.BOTTOM);
        etiqueta3.setToolTipText("Esta es la etiqueta 3");
        add(etiqueta3);
    }

}
