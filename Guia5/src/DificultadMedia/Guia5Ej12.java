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
public class Guia5Ej12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10
la nota se pedirá de nuevo hasta que la nota sea correcta.*/
         //Invocamos Scanner
         Scanner leer = new Scanner (System.in);
         //Definir variables
         int nota;
         //Petición usuario
         System.out.println("Ingrese una nota, esta debe estar entre 0 y 10.");
         do{
            nota = leer.nextInt();
             if (nota >= 0 && nota <= 10){
                 System.out.println("La nota es válida.");
             } else {
            System.out.println("Nota no válida, por favor intente nuevamente:");          
        }
         }while(nota >= 10 || nota <= 0);
    }
}
