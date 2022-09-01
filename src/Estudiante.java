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


    public void verCalificacion(){
        System.out.println("La calificacion de "+getNombre()+" es"+calicacion);
    }
    public void verCurso(){
        System.out.println("El curso es: "+curso);
    }

}
