
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
public class Guia5Ej16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Realizar un programa que simule el funcionamiento de un dispositivo RS232, este
tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar
con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer
carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la
secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda
secuencia distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas
correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo
se utilizan las siguientes funciones de Java Substring(), Length(), equals().*/
        
        //Invocamos Scanner
         Scanner leer = new Scanner (System.in);
         //Definir variables
         String cade,b;
         int L,pp,pp2;
         //Petición al usuario
         System.out.println("Ingrese una cadena de 5 caractéres máximo, debe comenzar con ''x'' y terminar con ''o''.");
         System.out.println("Para finalizar la lectura ingrese la secuencia ''&&&&&''");
         pp=0;
         pp2=0;
        do{
            //Leemos la cadena
            cade = leer.nextLine();
            //Largo de la cadena
            L= cade.length();
            //Condiciones
            if (L==5 && cade.substring(0,1).equals("x") && cade.substring(4,5).equals("o")){
                pp=pp+1;
            }else{
                pp2=pp2+1;
            }
        }while (cade.equals("&&&&&"));
        System.out.println("La cantidad de cadenas válidas es de " +pp+ " y la cantidad de cadenas incorrectas es de " +pp2+ ".");
    }
    
}
