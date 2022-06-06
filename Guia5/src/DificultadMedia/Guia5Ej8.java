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
public class Guia5Ej8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota:
investigar la función equals() en Java.*/
        //Invocamos Scanner
         Scanner leer = new Scanner (System.in);
         //Definir variables
         String frase1,frase2;
         frase2= ("eureka");
         //Petición usuario
         System.out.println("Por favor ingrese una palabra:");
         frase1 = leer.nextLine();
         //Condición
         if (frase1.equals(frase2)){
             System.out.println("Correcto");
         } else {
             System.out.println("Incorrecto");
         }
    }
    
}
