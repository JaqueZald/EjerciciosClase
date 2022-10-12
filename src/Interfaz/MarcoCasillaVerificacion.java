package Interfaz;

import javax.swing.*;

public class MarcoCasillaVerificacion extends JFrame {
    private JTextField campoTexto; // muestra el texto en tipos de letra
    cambiantes
14 private JCheckBox negritaJCheckBox; // para seleccionar/deseleccionar negrita
15 private JCheckBox cursivaJCheckBox; // para seleccionar/deseleccionar cursiva
16
        17 // El constructor de MarcoCasillaVerificacion agrega objetos JCheckBox a JFrame
        18 public MarcoCasillaVerificacion()
19 {
        20 super(“Prueba de JCheckBox”);
        21 setLayout(new FlowLayout());
        22
        23 // establece JTextField y su tipo de letra
        24 campoTexto = new JTextField(“ Observe como cambia el estilo de tipo de
                letra”, 20);
        25 campoTexto.setFont(new Font(“Serif”, Font.PLAIN, 14));
        26 add(campoTexto); // agrega campoTexto a JFrame
        27
        28 negritaJCheckBox = new JCheckBox(“Negrita”);
        29 cursivaJCheckBox = new JCheckBox(“Cursiva”);
        30 add(negritaJCheckBox); // agrega casilla de verificación “negrita” a JFrame
        31 add(cursivaJCheckBox); // agrega casilla de verificación “cursiva” a JFrame
        32
        33 // registra componentes de escucha para objetos JCheckBox
        34 ManejadorCheckBox manejador = new ManejadorCheckBox();
        35 negritaJCheckBox.addItemListener(manejador);
        36 cursivaJCheckBox.addItemListener(manejador);
        37 }
38
        39 // clase interna privada para el manejo de eventos ItemListener
        40 private class ManejadorCheckBox implements ItemListener
41 {
// responde a los eventos de casilla de verificación
                43 @Override
                44 public void itemStateChanged(ItemEvent evento)
                45 {
                        46 Font tipoletra = null; // almacena el nuevo objeto Font
                        47
                        48 // determina cuáles objetos CheckBox están seleccionados
                        y crea el objeto Font
                        49 if (negritaJCheckBox.isSelected() && cursivaJCheckBox.isSelected())
                                50 tipoletra = new Font(“Serif”, Font.BOLD + Font.ITALIC, 14);
                        51 else if (negritaJCheckBox.isSelected())
                                52 tipoletra = new Font(“Serif”, Font.BOLD, 14);
                        53 else if (cursivaJCheckBox.isSelected())
                                54 tipoletra = new Font(“Serif”, Font.ITALIC, 14);
                        55 else
                        56 tipoletra = new Font(“Serif”, Font.PLAIN, 14);
                        57
                        58 campoTexto.setFont(tipoletra);
                        59 }
}
    }
}
