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
public class Guia5Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre
           por pantalla.
        */
        //Invocamos Scanner
        Scanner leer = new Scanner (System.in);
        //Definir variables
        String name;
        System.out.println("Escriba su nombre:");
        name = leer.next();
        System.out.println("Hola " +name+ ", bienvenido a Java.");
    }
    
}
