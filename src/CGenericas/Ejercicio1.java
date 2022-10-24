package CGenericas;

public class Ejercicio1 <T> {
    private T dato;

    public Ejercicio1(T dato) {
        this.dato = dato;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }
}
