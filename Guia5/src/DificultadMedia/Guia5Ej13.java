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
public class Guia5Ej13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere el
límite inicial.*/
        //Invocamos Scanner
         Scanner leer = new Scanner (System.in);
         //Definir variables
         int lim,num,suma=0;
         //Petición usuario
         System.out.println("Ingrese un valor límite positivo, el programa le pedirá números que irá sumando y terminará una vez supere el valor límite establecido.");
         System.out.print("Límite:");
         lim=leer.nextInt();
         do{
             System.out.print("Número a sumar:");
             num=leer.nextInt();
             if (num<lim){
              suma=suma+num;
             }else if (num>=lim){
                 suma=suma+num;
                 break;
             }
         }while (lim>suma);{
        System.out.println("El límite de " +lim+ " a sido pasado, dejando la suma en " +suma+ ".");
    }
    }
    
    
}
