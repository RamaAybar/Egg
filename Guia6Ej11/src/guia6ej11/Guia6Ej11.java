/*
Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con
la clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la
clase Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le
pedirán al usuario para poner el constructor del objeto Date. Una vez creada la fecha
de tipo Date, deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la
fecha actual, que se puede conseguir instanciando un objeto Date con constructor
vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
Si necesiten acá tienen más información en clase Date: Documentacion Oracle
 */
package guia6ej11;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia6Ej11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Scanner
        Scanner leer = new Scanner(System.in);
        //Variables
        int anio, mes, dia, dif;
        System.out.println("Ingrese el día: ");
        dia = leer.nextInt();
        System.out.println("Ingrese el mes: ");
        mes = leer.nextInt();
        System.out.println("Ingrese el año");
        anio = leer.nextInt();

        //Mes
        mes = mes + 1;

        //Año
        anio = anio - 1900;

        Date fecha = new Date(anio, mes, dia);

        System.out.println(fecha);

        Date fecha2 = new Date();

        System.out.println(fecha2);
        int resta;
        resta = (fecha2.getYear() + 1900) - fecha.getYear();
        System.out.println("Año ingresado: " + fecha.getYear());
        System.out.println("Año actual " + (fecha2.getYear() + 1900));
        System.out.println("Diferencia " + resta);
    }
}
