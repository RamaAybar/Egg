
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Guia5Ej14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe
        salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa
        deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el
        número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.*/
        //Invocamos Scanner
         Scanner leer = new Scanner (System.in);
         //Definir variables
         int n,suma=0,pp=20;
         boolean valid;
         //Petición usuario
         System.out.println("Ingrese 20 números y el programa calculará la suma de estos.");
         System.out.println("Si ingresa un valor negativo este no se sumará y si ingresa el número cero el proceso terminará");
         do{ 
             System.out.print(">");
             n=leer.nextInt();
             if (n>0){
                 //Si el valor es mayor que CERO, sumamos
                 suma=suma+n;
             }
             //Controlamos que el valor no sea CERO
             if (n<=0 && n>=0){
                 System.out.println("Se capturó el número cero.");
                 break;
             }//Restamos y Controlamos el contador
             pp=pp-1;
             if (pp<=0){
                 valid=false;
             }
         } while (valid=true);
         System.out.println("La suma de los números ingresados es de: " +suma);
    }
    
    
}
