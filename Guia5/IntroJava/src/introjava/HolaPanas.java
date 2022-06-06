/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class HolaPanas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //La variable Scanner se importa para leer datos del usuario
        Scanner leer = new Scanner(System.in);
        //Se crea una variable cadena(String)que se utiliza para leer datos del usuario
        String nombre;
        //Mostramos un mensaje por pantalla
        System.out.println("Ingresa tu nombre");
        //Leemos el nombre de la persona en la variable nombre
        nombre = leer.next();
        //Mostramos por pantalla el nombre con la frase
        System.out.println("Hola panas, soy " +nombre+ "y estoy, poenele, programando en Java");
    }
    
}
