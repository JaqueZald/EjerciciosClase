package Interfaz;

import javax.swing.*;

public interface Suma {
    public static void main(String[] args) {
//Obtener la entrada del usuario de los dialigos de entrada de JOptionPane
        String primerNumero= JOptionPane.showInputDialog("Intriduzca el primer entrero: ");
        String segundoNumero=
                JOptionPane.showInputDialog("Introduzca el segundo numero: ");
        //Convertir las entradas String en valores int para usarlos en un calculo
        int numero1=Integer.parseInt(primerNumero);
        int numero2=Integer.parseInt(segundoNumero);
        int suma=numero1+numero2;
        //MOstrar llos resultados de un dialogonde mensaje JOPtionPane
        JOptionPane.showMessageDialog(null, "La suma es: "+suma, "Suma de dos entereros",JOptionPane.PLAIN_MESSAGE);

    }
}
