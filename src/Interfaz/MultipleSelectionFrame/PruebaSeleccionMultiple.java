package Interfaz.MultipleSelectionFrame;

import javax.swing.*;

public class PruebaSeleccionMultiple {
    public static void main(String[] args) {
        MarcoSeleccionMultiple marcoSeleccionMultiple =
                new MarcoSeleccionMultiple();
        marcoSeleccionMultiple.setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE);
        marcoSeleccionMultiple.setSize(350, 140);
        marcoSeleccionMultiple.setVisible(true);
    }

}
