public class Estudiante extends Persona implements IntAlumno, IntAlumno2 {
    int noCuenta;
    String curso;
    double calicacion;

    public Estudiante(String nombre, int edad, String sexo, String direccion, int noCuenta, String curso, double cal) {
        super(nombre, edad, sexo, direccion);
        this.noCuenta = noCuenta;
        this.curso = curso;
        this.calicacion = cal;
    }


    public void verCalificacion() {
        System.out.println("La calificacion de " + getNombre() + " es" + calicacion);
    }

    public void verCurso() {
        System.out.println("El curso es: " + curso);
    }

    @Override
    public void mostrarCurso() {
        System.out.println("Mostrar curso: ");
    }

    @Override
    public void mostrarGrado() {

    }

    @Override
    public int obtenerAnosdeCarrera() {
        return 0;
    }

    @Override
    public void entrarCurso() {

    }
}