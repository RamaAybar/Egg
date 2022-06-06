package Clases;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        //Nuevo objeto
        Libro l1 = new Libro();

        //num=ISBN
        System.out.println("Ingrese su ISBN: ");
        l1.ISBN();

        //Nombre2=Autor
        System.out.println("Ingrese el nombre del autor: ");
        String aautor = "";
        l1.autor();

        //Nombre=titulo  
        System.out.println("Ingrese el título del libro: ");
        String ttitulo = "";
        l1.titulo();

        //num2=Número de páginas   
        System.out.println("Ingrese la cantidad de páginas del libro: ");
        l1.numpag();

        l1.mostrarDatos();
    }
}
