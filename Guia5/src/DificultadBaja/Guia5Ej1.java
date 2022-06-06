/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DificultadBaja;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia5Ej1 {

    /**
     * @param args the command line arguments
     */
    
    /*Escribir un programa que pida dos números enteros por teclado y calcule la suma
de los dos. El programa deberá después mostrar el resultado de la suma
*/
    public static void main(String[] args) {
        // TODO code application logic here
        //Invoco Scanner
        Scanner leer = new Scanner (System.in);
        //Definir variables
        int NumEntero;
        int NumEntero2;
        int Suma;
        //Hago petición al usuario e ingreso los datos
        System.out.println("Ingrese dos números enteros para calcular su suma:");
        System.out.print("Primer número:");
        NumEntero = leer.nextInt();
        System.out.print("Segundo número:");
        NumEntero2 = leer.nextInt();
        //Sumamos los enteros
        Suma = NumEntero + NumEntero2;
        //Mostramos el resultado
        System.out.println("La suma de los dos números enteros es de " +Suma );
    }
    
    
}
