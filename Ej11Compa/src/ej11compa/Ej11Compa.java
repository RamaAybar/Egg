/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej11compa;

import java.util.Scanner;
import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Ej11Compa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try (//Scanner
                Scanner leer = new Scanner(System.in)) {
            //Variables
            int anio, mes, dia;
            System.out.println("Ingrese el día: ");
            dia = leer.nextInt();
            System.out.println("Ingrese el mes: ");
            mes = leer.nextInt();
            System.out.println("Ingrese el año");
            anio = leer.nextInt();

            Date fecha = new Date(anio, mes, dia);

            System.out.println(fecha);

            Date fechaactual = new Date();

            System.out.println(fechaactual);

            int resta;
            resta = (fechaactual.getYear() + 1900) - fecha.getYear();
            System.out.println("Año ingresado: " + fecha.getYear());
            System.out.println("Año actual " + (fechaactual.getYear() + 1900));
            System.out.println("Diferencia " + resta);

        }
    }
}
