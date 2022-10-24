package CGenericas;

import java.util.Scanner;

public class Ejercicio1Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int id;
        String nombre;
        int edad;
        String sexo;
        String direccion;
        System.out.println("Ingrese el id: ");
        id = entrada.nextInt();
        System.out.println("Ingrese el nombre: ");
        nombre=entrada.next();
        System.out.println("Ingrese el edad: ");
        edad=entrada.nextInt();
        System.out.println("Ingrese el sexo: ");
        sexo=entrada.next();
        System.out.println("Ingrese el direccion: ");
        direccion=entrada.next();



        /*Ejercicio1<String> gen1=new Ejercicio1<>("Hola");
        System.out.println(gen1.getDato());
        EjerPersona p1=new EjerPersona(1, "Jaque",28,"xd", "temas");
        Ejercicio1<EjerPersona>gen2=new Ejercicio1<>(p1);//Para guardar un objeto
        System.out.println(gen2.getDato());*/
        //<, <=, >, >= Menor, menor o igual, mayor, mayor o igual
        EjerPersona p1 = new EjerPersona(1, "Jaque", 28, "xd", "temas");
        Ejercicio1<EjerPersona> gen2 = new Ejercicio1<>(p1);//Para guardar un objeto
        //for ()
    }
}
