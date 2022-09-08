package Figuras;

import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        /*Triangulo t1 = new Triangulo(2,3,4);
        //Figura f1 = new Figura();
        System.out.println(t1.toString());
        Cuadrado c1=new Cuadrado(2);
        System.out.println(c1.toString());

        Figura t2=new Triangulo(7,8,9);//se esta instanciando para una figura, sirve para recorrer todos los metodos, solo se pueden ocupar los metodos que estan en la superclase
        t2.toString();
        Figura c2=new Cuadrado(3);
        c2.toString();
*/

        Figura[] figs = new Figura[3];
        int opcion;
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
                    figs[0] = new Cuadrado(lado);
                    System.out.println("Selecciona uno: ");
                    System.out.println("1 Area: ");
                    System.out.println("2 Perimetro: ");
                    opcionF = entrada.nextInt();
                    if (opcionF == 1) {
                        System.out.println(figs[0].calcularArea());
                    }
                    if (opcionF == 2) {
                        System.out.println(figs[0].calcularPerimentro());
                    }
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
                    figs[1] = new Triangulo(lado1, lado2, lado3);
                    System.out.println("Selecciona uno: ");
                    System.out.println("1 Area: ");
                    System.out.println("2 Perimetro: ");
                    opcionF = entrada.nextInt();
                    if (opcionF == 1) {
                        System.out.println(figs[1].calcularArea());
                    }
                    if (opcionF == 2) {
                        System.out.println(figs[1].calcularPerimentro());
                    }
                    break;
                case 3:
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("No valido");
                    break;
            }
        } while (opcion != 3);
    }

    private static void menu() {
        System.out.println();
        System.out.print("Elige una figura: \n");
        System.out.println("1- Cuadrado");
        System.out.println("2 Triangulo");
        System.out.println("3- Salir");
        System.out.print("Escoje una opción: ");
    }
}

//tarea ir agregando el ejercicio de herencia, en ell de abstract
//añador cuadradolado
//crear menu
/*
polimorfismo
una clase que es una superclase pude contener metodos de subtipo subclase
 */
