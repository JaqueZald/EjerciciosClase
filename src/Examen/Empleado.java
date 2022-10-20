package Examen;

import java.text.DecimalFormat;

public abstract class Empleado {
    private String rfc;
    private String apellidos;
    private String nombres;

//Constructor
    public Empleado(String rfc, String apellidos, String nombres) {
        this.rfc = rfc;
        this.apellidos = apellidos;
        this.nombres = nombres;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String mostrarInfo(){
        DecimalFormat df=new DecimalFormat("##0.00");
        return "Nombre: "+getNombres()+"Apellidos: "+getApellidos()+"RFC: "+getRfc()+"Ingresos: "+df.format(ingresos())+"Bonificaciones: "+df.format(bonificacion())
                +"Descuentos: "+df.format(descuento())+"Sueldo neto: "+df.format(sueldoNeto());
    }
    public  double sueldoNeto(){
        return ingresos()+bonificacion()-descuento();
    }
    public abstract double ingresos();
    public abstract double bonificacion();
    public abstract double descuento();

}
