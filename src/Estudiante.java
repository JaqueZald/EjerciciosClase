public class Estudiante extends Persona {
    int noCuenta;
    String curso;
    double calicacion;
    public Estudiante(String nombre, int edad, String sexo, String direccion, int noCuenta, String curso, double cal){
        super(nombre, edad, sexo, direccion);
        this.noCuenta=noCuenta;
        this.curso=curso;
        this.calicacion=cal;
    }

    public void setCalicacion(double calicacion) {
        this.calicacion = calicacion;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
