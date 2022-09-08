package Figuras;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int opcion;
        do{
            menu();
            opcion=entrada.nextInt();
            System.out.println("Ingrese la figura que desea elegir");
        }while();
    }
}
