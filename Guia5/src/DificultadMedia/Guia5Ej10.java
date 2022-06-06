/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DificultadMedia;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia5Ej10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escriba un programa que pida una frase o palabra y valide si la primera letra de esa
frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
“INCORRECTO”. Nota: investigar la función Substring y equals() de Java.*/
        //Invocamos Scanner
         Scanner leer = new Scanner (System.in);
         //Definir variables
         String frase;
         //Petición usuario
         System.out.println("Ingrese una frase o palabrama. Si la primer letra de lo ingresado es la letra 'A' entonces se mostrará un mensaje en pantalla.");
         frase = leer.nextLine();
         frase = frase.toUpperCase();
         //Condición
         String Sc = frase.substring(0,1);
         if (Sc.equals("A")){
             System.out.println("Correcto");
         } else {
             System.out.println("Incorrecto");
         }
       
    }
    
}
