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
public class Guia5Ej22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
cuántos de 2 dígitos, etcétera (hasta 5 dígitos).*/
         //Invocamos Scanner
         Scanner leer = new Scanner (System.in);
        //Definir variables
        int n,cifras;
        cifras = 0;
        //Petición al usuario
        System.out.println("Ingrese un número, el programa le dirá la cantidad de cifras que este tiene.");
        n= leer.nextInt();
        
        //Proceso
        while (n!=0){
            n=n/10;
            cifras++;
        }
        System.out.println("El número tiene " +cifras+ " cifras.");
    }
    
}
