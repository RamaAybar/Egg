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
public class Guia5Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Dada una cantidad de grados centígrados se debe mostrar su equivalente en
grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).*/
          //Invocamos Scanner
        Scanner leer = new Scanner (System.in);
        //Definir variables
        int C; //Centígrados
        int F; //Farenheit
        //Petición al usuario
        System.out.println("Ingrese una cantidad de grados centígrados, estos serán convertidos a farenheit");
        System.out.print(">");
        C = leer.nextInt();
        //Formula
        F = 32 + (9 * C / 5);
        System.out.println(C+"° equivalen a " +F+ " grados Farenheit.");
    }
    
}
