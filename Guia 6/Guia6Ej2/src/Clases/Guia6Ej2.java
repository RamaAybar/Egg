/*
 * Declarar una clase llamada Circunferencia que tenga como atributo privado el radio
 * de tipo real. A continuación, se deben crear los siguientes métodos:
 * a) Método constructor que inicialice el radio pasado como parámetro.
 * b) Métodos get y set para el atributo radio de la clase Circunferencia.
 * c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo
 * del objeto.
 * d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio!).
 * e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
 */
package Clases;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia6Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el valor del radio: ");
        int radio = leer.nextInt();
        
        Circunferencia c = new Circunferencia();

        c.crearCircunferencia(radio);

        c.area(radio);
        c.perimetro(radio);
        
        System.out.println(c.toString());
    }

}
