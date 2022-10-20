package Examen;

public abstract class EmpleadoPermanente extends Empleado{
    private   double sueldoBase;
    private String afiliacion;

    //Inicia constructor

    public EmpleadoPermanente(String rfc, String apellidos, String nombres, double sueldoBase, String afiliacion) {
        super(rfc, apellidos, nombres);
        this.sueldoBase = sueldoBase;
        this.afiliacion = afiliacion;
    }


    //Metodos

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public String getAfiliacion() {
        return afiliacion;
    }

    public void setAfiliacion(String afiliacion) {
        this.afiliacion = afiliacion;
    }
    //Metodos que hereda
    public double ingresos() {
        return getSueldoBase();
    }

    public double descuento() {
        if(getAfiliacion().equalsIgnoreCase("Afiliacion empleado permanente"))
            return getSueldoBase()*0.11;
        else
            return 0;
    }

    public double sueldoNeto() {
        return ingresos()-descuento();
    }

    //Utilizar sobrecarga
    public String mostrarInfo(){
        return "Empleado Permanente: "+super.mostrarInfo();
    }
}
