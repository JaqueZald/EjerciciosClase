public interface IntAlumno2 {
    void mostrarGrado();
    int obtenerAnosdeCarrera();
    public abstract void entrarCurso();
    default void mostrarHorario(){
        System.out.println("Horario corrido");
    }
}
