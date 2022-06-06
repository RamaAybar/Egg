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
public class Guia5Ej11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Considera que estás desarrollando una web para una empresa que fabrica motores
        (suponemos que se trata del tipo de motor de una bomba para mover fluidos).
         Definir una variable tipoMotor y permitir que el usuario ingrese un valor entre 1 y 4.
    El programa debe mostrar lo siguiente:
         o Si el tipo de motor es 1, mostrar un mensaje indicando “La bomba es una
         bomba de agua”.
         o Si el tipo de motor es 2, mostrar un mensaje indicando “La bomba es una
         bomba de gasolina”.
         o Si el tipo de motor es 3, mostrar un mensaje indicando “La bomba es una
         bomba de hormigón”.
         o Si el tipo de motor es 4, mostrar un mensaje indicando “La bomba es una
         bomba de pasta alimenticia”.
         o Si no se cumple ninguno de los valores anteriores mostrar el mensaje “No
         existe un valor válido para tipo de bomba”
    Bucles y sentencias de salto break y continue*/
         //Invocamos Scanner
         Scanner leer = new Scanner (System.in);
         //Definir variables
         int tipoMotor;
         //Petición usuario
         System.out.println("Ingrese el número de su motor, el programa le dirá que tipo de motor es.");
         do{
            tipoMotor = leer.nextInt();
             if (tipoMotor >= 1 && tipoMotor <= 4){
            switch (tipoMotor) {
                case 1:
                    System.out.println("La bomba es una bomba de agua.");
                case 2:
                    System.out.println("La bomba es una bomba de gasolina.");
                    break;
                case 3:
                    System.out.println("La bomba es una bomba de hormigón.");
                    break;
                case 4:
                    System.out.println("La bomba es una bomba de pasta alimenticia.");
                    break;        
            }
             } else {
            System.out.println("Número no válido, por favor ingrese su número nuevamente:");          
        }
         }while(tipoMotor >= 4 || tipoMotor <= 1);
    }
}
         
             