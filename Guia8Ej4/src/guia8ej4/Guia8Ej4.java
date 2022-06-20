package guia8ej4;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia8Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Pelicula p = new Pelicula();
        //Invocamos el método "crearPelicula"
        p.crearPelicula();
        //Entramos al menú
        p.Menu();
        //Fin del programa
        
    }
    
}
