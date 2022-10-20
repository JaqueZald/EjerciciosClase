package Examen;

import java.util.Scanner;

public class Principal{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        /*Empleado[] empleados = new Empleado[20];
        int opcion;
        int numEmpleado=0;
        do {
            menu();
            opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion) {
                case 1:
                    double opcionE;
                    double sueldoNeto;
                    double montoVendido;
                    System.out.println("Ingresa rfc");
                    rfc=get
                    System.out.print("Ingresa el sueldo: ");
                    sueldoNeto = entrada.nextDouble();
                    System.out.print("Ingresa el monto Vendido: ");
                    montoVendido = entrada.nextDouble();
                    empleados[numEmpleado]=new EmpleadoVendedor(1,2);
                    System.out.println(montoVendido);
                    numEmpleado++;
                    break;
                case 2:
                    System.out.println("Empleado permanente");
                    System.out.println("Ingresa sueldo base");
                    double sueldoBase = 0;
                    System.out.print("Ingrese afiliacion: ");
                    String afiliacion = null;

                    numEmpleado++;
                    break;
                case 3:
                    for (Empleado i: empleados){//for each
                        System.out.println(i);
                    }
                    break;
                case 4:
                    break;
                default:
                    System.out.println("No valido");
                    break;
            }
        } while (opcion != 4);
    }

    private static void menu() {
        System.out.print("Elige el tipo de empleado: \n");
        System.out.println("1- Empleado Vendedor");
        System.out.println("2- Empleado Permanente");
        System.out.println("3- Mostrar datos");
        System.out.println("4.- Salir");
        System.out.print("Escoge una opción: ");
    */
        String rfc;
        String apellido;
        String nombre;
        double monto_Vendido;
        double tasaComision;
        System.out.println("Escribe el rfc del empleado: ");
        rfc=entrada.next();
        System.out.println("Escribe el apellido: ");
        apellido=entrada.next();
        System.out.println("Escribe el nombre: ");
        nombre=entrada.next();

        int opcion;
        do{
            menu();
            opcion=entrada.nextInt();
            switch (opcion ){
                case 1:
                    System.out.println("Ingrese el monto vendido:" );
                    monto_Vendido=entrada.nextDouble();
                    break;
                case 2:
                    System.out.println("Ingrese sueldo Base: ");//+cargosB.obtenerCobroTotal());
                    double sueldoBase;
                    System.out.println("Ingrese numero de afiliacion: ");
                    String afiliacion;
                    break;
                case 3:
                    System.out.println("Escribe nuevo saldo del cliente: ");

                    System.out.println("Escribe la cantidad de cheques emitidos: ");


                    break;
                case 4:
                    System.out.println("Terminando...");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }//fin swith
        }while(opcion !=4);

    }//fin de main
    public static void menu(){
        System.out.println("-----------------------------------");
        System.out.println("Menú principal");
        System.out.println("1.- Mostrar Saldo Actual");
        System.out.println("2.- Aplicar cargos bancarios y mostrar el saldo restante");
        System.out.println("3.- Asignar nuevos valores al balance de cuenta");
        System.out.println("4.- Salir");
        System.out.println("Escribe la opcion");
    }//fin de menu
}

