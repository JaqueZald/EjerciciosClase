package Interfaz.LabelFrame;

import java.awt.FlowLayout; // especifica cómo se van a ordenar los componentes
import javax.swing.*;
import javax.swing.JLabel; // muestra texto e imágenes
import javax.swing.SwingConstants; // constantes comunes utilizadas con Swing
import javax.swing.Icon; // interfaz utilizada para manipular imágenes
import javax.swing.ImageIcon; // carga las imágenes

public class LabelFrame extends JFrame {
    private JLabel etiqueta1;//JLabel text only
    private JLabel etiqueta2;//JLabel built with tecto and an icon
    private JLabel etiqueta3; //JLabel with addictive text and icon

    public LabelFrame() {
        super("JLabel Test");
        setLayout(new FlowLayout());
        //JLabel constructor with String argument
        etiqueta1 = new JLabel("Label with text");
        etiqueta1.setToolTipText("This is label1");
        add(etiqueta1);

        //Jlabel constructor with string, icon, and alignment arguments
        Icon insecto = new ImageIcon(getClass().getResource("insecto.png"));
        etiqueta2 = new JLabel("Label with text and icon", insecto, SwingConstants.LEFT);
        etiqueta2.setToolTipText("This is the label2");
        add(etiqueta2);// agrega etiqueta2 a JFrame


        etiqueta3 = new JLabel(); // constructor de JLabel sin argumentos
        etiqueta3.setText("Label with icon and text at the bottom");
        etiqueta3.setIcon(insecto); // agrega icono a JLabel
        etiqueta3.setHorizontalTextPosition(SwingConstants.CENTER);
        etiqueta3.setVerticalTextPosition(SwingConstants.BOTTOM);
        etiqueta3.setToolTipText("This is label3");
        add(etiqueta3);

    }

}
