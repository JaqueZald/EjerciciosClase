package CGenericas;

public class Generica2 <Gen>{
    private Gen dato;

    public Generica2(Gen dato) {
        this.dato = dato;
    }

    public Gen getDato() {
        return dato;
    }

    public void setDato(Gen dato) {
        this.dato = dato;
    }
}
