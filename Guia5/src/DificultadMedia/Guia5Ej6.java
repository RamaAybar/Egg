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
public class Guia5Ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Implementar un programa que dado dos números enteros determine cuál es el
mayor y lo muestre por pantalla.*/
        //Invocamos Scanner
         Scanner leer = new Scanner (System.in);
         //Definir variables
         int num1,num2;
         System.out.println("Ingrese dos números enteros. El programa determinará cuál es el mayor y el menor respectivamente.");
         System.out.print("1°>");
         num1 = leer.nextInt();
         System.out.print("2°>");
         num2 = leer.nextInt();
         if (num1>num2){
             System.out.println("El número mayor es " +num1);
         }else{
              System.out.println("El número mayor es " +num2);       
                 }
         }
         
         
    }
