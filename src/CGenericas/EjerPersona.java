package CGenericas;

public class EjerPersona {
    protected int id;
    protected String nombre;
    protected int edad;
    protected String sexo;
    protected String direccion;

    public EjerPersona(int id, String nombre, int edad, String sexo, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.direccion = direccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    public String getDireccion() {
        return direccion;
    }

    @Override
    public String toString() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Sexo: " + sexo);
        System.out.println("Direccion: " + direccion);
        return "Nombre: " + nombre+" Edad: " + edad+" Sexo: " + sexo+" Direccion: " + direccion;//Para retornar los datos en la clase principal
    }
}
