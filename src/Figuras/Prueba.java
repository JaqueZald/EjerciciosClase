package Figuras;

public class Prueba {
    public static void main(String[] args) {
        Triangulo t1 = new Triangulo(2,3,4);
        //Figura f1 = new Figura();
        System.out.println(t1.toString());
        Cuadrado c1=new Cuadrado(2);
        System.out.println(c1.toString());

        Figura t2=new Triangulo(7,8,9);//se esta instanciando para una figura, sirve para recorrer todos los metodos, solo se pueden ocupar los metodos que estan en la superclase
        t2.toString();
        Figura c2=new Cuadrado(3);
        c2.toString();



    }

}//tarea ir agregando el ejercicio de herencia, en ell de abstract
//añador cuadradolado
//crear menu
/*
polimorfismo
una clase que es una superclase pude contener metodos de subtipo subclase
 */
