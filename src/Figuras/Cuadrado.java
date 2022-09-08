package Figuras;

public class Cuadrado extends Figura{

    double lado;
    private double area;
    private double perimetro;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        area=lado*lado;
        return area;
    }

    @Override
    public double calcularPerimentro() {
        perimetro=lado*4;
        return perimetro;
    }

    @Override
    public String toString() {
        return "Cuadrado{" +
                "lado=" + lado +
                ", area=" + calcularArea() +
                ", perimetro=" + calcularPerimentro() +
                '}';
    }
}
