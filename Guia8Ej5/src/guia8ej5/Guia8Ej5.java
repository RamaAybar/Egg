/*
Se requiere un programa que lea y guarde países, y para evitar que se ingresen
repetidos usaremos un conjunto. El programa pedirá un país en un bucle, se
guardará el país en el conjunto y después se le preguntará al usuario si quiere
guardar otro país o si quiere salir, si decide salir, se mostrará todos los países
guardados en el conjunto.
Después deberemos mostrar el conjunto ordenado alfabéticamente para esto
recordar como se ordena un conjunto.
Y por ultimo, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator,
se buscará el país en el conjunto y si está en el conjunto se eliminará el país que
ingresó el usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto
se le informará al usuario.
 */
package guia8ej5;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia8Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Scanner
        Scanner leer = new Scanner(System.in);
        //Clase ServiciosPaises
        ServiciosPaises sp = new ServiciosPaises();
        
        //Ingresamos los países a guardar
        System.out.println("Ingrese nombres de países, el programa guardará los nombres y a continuación le mostrará su colección.");
        sp.IngresarPaises();
        //Mostrar Países
        System.out.println(sp.toString());
        
        //Eliminar País del ArrayList
        System.out.println("Ingrese el nombre de un país para eliminarlo: ");
        sp.EliminarPais();
        
        //Volvemos a mostrar los países
        System.out.println(sp.toString());
    }

}
