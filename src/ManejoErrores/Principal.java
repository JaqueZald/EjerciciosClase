package ManejoErrores;

public class Principal {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3};
        System.out.print("Valor: ");
        try {//Cuando es suceptible, evalua lo que hay entre los corchetes
            System.out.println(numeros[3]);
        } catch (Exception e) {//captura el error en el objeto e
            System.out.println("Error en el codigo");

        }

        System.out.println("Final");
    }
}

