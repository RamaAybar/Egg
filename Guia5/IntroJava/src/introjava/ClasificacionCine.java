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
public class ClasificacionCine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Definir variable
        int opinion;
        //Invocamos el escaner con nombre "leer"
        Scanner leer = new Scanner(System.in);
        //Imprimimos por pantalla nuestra petición al usuario
        System.out.println("Califique la película del 1 al 5:");
        //Leemos la respuesta
        opinion = leer.nextInt();
        
        if (opinion >= 1 && opinion <= 5){
            
            switch (opinion) {
                case 1:
                case 2:
                    System.out.println("Disculpa, no viniste a ver Batman de Patinson, no seas pretencioso");
                    break;
                case 3:
                    System.out.println("Un tre dijo Pino");
                    break;
                case 4:
                    System.out.println("Un cuatro, buena calificación, como The Batman ahre");
                    break;
                case 5:
                    System.out.println("Aguanta, tanto le iba a gustar la peli, la re vivis");
                    break;
            }
        } else if (opinion < 0 ) {
            System.out.println("Dale amigo, ¿Tan mala era como para darle negativo?");
                    
        }else if (opinion == 0) {
            System.out.println("No podes poner cero, te jodes ahora");
        } else if (opinion > 0) {
                    System.out.println("Bueno, evidentemente tenés dos años para poner mas de cinco");
                
       }
       System.out.println("Bueno, a casa ahora, que esto no es guardería");
    }
    
}
