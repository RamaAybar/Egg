/*Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
Autor, Número de páginas, y un constructor con todos los atributos pasados por
parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los
datos al usuario y luego informar mediante otro método el número de ISBN, el título,
el autor del libro y el numero de páginas.*/
package Clases;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Libro {

    Scanner leer = new Scanner(System.in);

    //Atributos
    int ISBN;
    String titulo;
    String autor;
    int numpag;

    public Libro(int ISBN, String titulo, String autor, int numpag) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numpag = numpag;
    }

    public Libro() {
    }
//Método ISBN

    public void ISBN() {
        ISBN = leer.nextInt();
    }

//Método autor
    public void autor() {
        String aautor = leer.nextLine();
        aautor = autor;
    }
//Método titulo

    public void titulo() {
        String ttitulo = leer.nextLine();
        ttitulo = titulo;
    }

//Método numpag
    public void numpag() {
        numpag = leer.nextInt();
    }

    //Mostrar datos
    public void mostrarDatos() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Autor: " + autor);
        System.out.println("Título: " + titulo);
        System.out.println("Cantidad de Páginas: " + numpag);

    }

}
