package Figuras;

import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Figura[] figs = new Figura[10];
        int opcion;
        int numdefig=0;
        do {
            menu();
            opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion) {
                case 1:
                    int opcionF;
                    double lado;
                    System.out.print("Ingresa el lado: ");
                    lado = entrada.nextDouble();
                    figs[numdefig] = new Cuadrado(lado);
                    numdefig++;
                    break;
                case 2:
                    System.out.println("ingresa los lados");
                    double lado1, lado2, lado3;
                    System.out.print("Lado 1: ");
                    lado1 = entrada.nextDouble();
                    System.out.print("Lado 2: ");
                    lado2 = entrada.nextDouble();
                    System.out.print("Lado 3: ");
                    lado3 = entrada.nextDouble();
                    figs[numdefig] = new Triangulo(lado1, lado2, lado3);
                    numdefig++;
                    break;
                case 3:
                    for (Figura i: figs){//for each
                        System.out.println(i);
                    }
                    break;
                case 4:
                    break;
                default:
                    System.out.println("No valido");
                    break;
            }
        } while (opcion != 4);
    }

    private static void menu() {
        System.out.print("Elige una figura: \n");
        System.out.println("1- Cuadrado");
        System.out.println("2 Triangulo");
        System.out.println("3- Mdatos");
        System.out.println("4.- Salir");
        System.out.print("Escoge una opción: ");
    }
}

//tarea ir agregando el ejercicio de herencia, en ell de abstract
//añador cuadradolado
//crear menu
/*
polimorfismo
una clase que es una superclase pude contener metodos de subtipo subclase
 */
