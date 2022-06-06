/*
 Crear una clase Rectángulo que modele rectángulos por medio de un atributo
 privado base y un atributo privado altura. La clase incluirá un método para crear el
 rectángulo con los datos del Rectángulo dados por el usuario. También incluirá un
 método para calcular la superficie del rectángulo y un método para calcular el
 perímetro del rectángulo. Por último, tendremos un método que dibujará el
 rectángulo mediante asteriscos usando la base y la altura. Se deberán además definir
 los métodos getters, setters y constructores correspondientes.
 Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package Clases;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia6Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        
        // Nacimiento del Rectangulo
        Rectangulo r1 = new Rectangulo();

        System.out.println("Ingrese dos valores para operar: ");
        int base = leer.nextInt();
        int altura = leer.nextInt();
        //Asigno atributos
        r1.crearRectangulo(base, altura);
        r1.CalcularSuperficie(base, altura);
        r1.CalcularPerimetro(base, altura);
        r1.ImprimirRectangulo();
        System.out.println(r1.toString());
    }

}
