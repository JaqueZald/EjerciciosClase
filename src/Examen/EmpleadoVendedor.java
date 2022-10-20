package Examen;

public class EmpleadoVendedor extends Empleado{
    private double montoVendido;
    private double tasaComision;

    //Constructor

    public EmpleadoVendedor(String rfc, String apellidos, String nombres, double montoVendido, double tasaComision) {
        super(rfc, apellidos, nombres);
        this.montoVendido = montoVendido;
        this.tasaComision = tasaComision;
    }

    //Set Get

    public double getMontoVendido() {
        return montoVendido;
    }

    public void setMontoVendido(double montoVendido) {
        this.montoVendido = montoVendido;
    }

    public double getTasaComision() {
        return tasaComision;
    }

    public void setTasaComision(double tasaComision) {
        this.tasaComision = tasaComision;
    }
    //Iniciar metodos heredados
    public double ingresos(){
        return getMontoVendido()*getTasaComision();
    }

    public double bonificacion() {
        if(getMontoVendido()<1000)
            return 0;
        else if(getMontoVendido()<5000 && getMontoVendido()>1000)
            return  ingresos()*0.05;
        else
            return  ingresos()*0.1;
    }

    public double descuento() {
        if (ingresos()<1000)
            return  ingresos()*0.11;
        else
            return ingresos()*0.15;
    }

    public double sueldoNeto() {
        return ingresos()+bonificacion()-descuento();
    }

    public String  mostrarInfo(){
        return "Empleado Permanente: "+super.mostrarInfo();
    }
}
