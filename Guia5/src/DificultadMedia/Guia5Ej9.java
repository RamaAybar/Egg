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
public class Guia5Ej9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Realizar un programa que solo permita introducir solo frases o palabras de 8 de
largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir
un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá
imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java.*/
         //Invocamos Scanner
         Scanner leer = new Scanner (System.in);
         //Definir variables
         String frase;
         //Petición
         System.out.println("Ingrese una frase o palabra de 8 caracteres de largo:");
         frase = leer.nextLine();
         int length = frase.length(); 
        
         //Condición
         if (length==8){
             System.out.println("Correcto");
         } else {
             System.out.println("Incorrecto");
         }
    }
    
}
