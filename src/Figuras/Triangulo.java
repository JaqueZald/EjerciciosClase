package Figuras;

public class Triangulo extends Figura{
        private double base;//lado 1
        //private double altura;
        private double lado2;
        private double lado3;
        private double area;
        private double perimetro;


        /*
        a raiz de s(s-a)(s-b)(s-c
        s=a+b+c/2
         */
        public Triangulo(double base, double lado2, double lado3) {
            this.base = base;
            this.lado2 = lado2;
            this.lado3 = lado3;
        }

        @Override
        public double calcularArea() {
            double s;
            s = (base + lado2 + lado3) / 2;
            area = Math.sqrt((s * (s - base) * (s - lado2) * (s - lado3)));
            return area;
        }

    @Override
    public double calcularPerimentro() {
            perimetro=base+lado2+lado3;
        return perimetro;
    }

        @Override
        public String toString() {
            return "Triangulo{" +
                    "lado1=" + base +
                    ", lado2=" + lado2 +
                    ", lado3=" + lado3 +
                    ", area=" + calcularArea() +
                    ", perimetro=" + calcularPerimentro() +
                    '}';
        }
    }

