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
public class Guia5Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escribir un programa que pida una frase y la muestre toda en mayúsculas y
después toda en minúsculas. Nota: investigar la función toUpperCase() y
toLowerCase() en Java.*/
        //Invocamos Scanner
        Scanner leer = new Scanner (System.in);
        //Definir variables
        String frase;
        //Petición al usuario
        System.out.println("Ingrese una frase:");
        frase = leer.next();
        //Imprimimos en minúscula
        System.out.println("Frase en minúscula:");
        System.out.println(frase.toLowerCase());
        //Imprimimos en mayúscula
         System.out.println("Frase en mayúscula:");
         System.out.println(frase.toUpperCase());
                }
    
}
