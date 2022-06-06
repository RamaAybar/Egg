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
public class Guia5Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escribir un programa que lea un número entero por teclado y muestre por pantalla
el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
Math.sqrt().*/
        //Invocamos Scanner
         Scanner leer = new Scanner (System.in);
         //Definir variables
         int num;
         int doble;
         int triple;
         //Petición al usuario
         System.out.println("Por favor ingrese un número, el programa devolverá el doble, el triple y la raíz cuadrada.");
         System.out.println(">");
         num = leer.nextInt();
         //Formulas
         doble = 2*num;
         triple = 3*num;
         //Imprimir
         System.out.println("El doble de " +num+ " es " +doble+ ".");
         System.out.println("El triple de " +num+ " es " +triple+ ".");
         System.out.println("La raíz cuadrada de " +num+ " es " +Math.sqrt(num)+ ".");
    }
    
}
