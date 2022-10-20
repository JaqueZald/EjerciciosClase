package ManejoErrores;

import java.util.Scanner;

public class div1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero1;
        int numero2;
        double valor;
        System.out.println("Ingese el primer numero: ");
        numero1=entrada.nextInt();
        System.out.println("Ingese el primer numero: ");
        numero2=entrada.nextInt();
        System.out.print("Valor: ");//capturar division entre 0
        try {//Cuando es suceptible, evalua lo que hay entre los corchetes
            System.out.println(numero2/numero1);
        } catch (ArithmeticException e) {//captura el error en el objeto e
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Final");
    }
}
