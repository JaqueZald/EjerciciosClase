package Extras;

public class Clase1310 {
    private static String mensaje="Hola";
    private static int numero(int v1){
        return v1++;
    }
//cuando es estatico pertenece a la clase no al objeto

    public static void main(String[] args) {
        Clase1310 obj1= new Clase1310();
        Clase1310 obj2=new Clase1310();
        obj2.mensaje="Mundo";
        System.out.println(Clase1310.mensaje);
        System.out.println("el resultado es: "+Clase1310.numero(2));
        int contador=0;
        for(int i=0; i<20;i++){
            System.out.println(contador);
            contador++;

        }
    }
}
