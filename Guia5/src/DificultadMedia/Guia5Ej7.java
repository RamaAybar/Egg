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
public class Guia5Ej7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crear un programa que dado un numero determine si es par o impar.
         //Invocamos Scanner
         Scanner leer = new Scanner (System.in);
         //Definir variables
         int n,eval; //eval=evaluador par o impar
         System.out.println("Ingrese un número, el programa determinará si es par o impar.");
         n = leer.nextInt();
         if (n %2==0) {
             System.out.println("El número es par.");
         } else {
             System.out.println("El número es impar.");
         }
    }
    
}
