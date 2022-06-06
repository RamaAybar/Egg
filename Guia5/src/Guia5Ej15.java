
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
public class Guia5Ej15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Realizar un programa que pida dos números enteros positivos por teclado y
          muestre por pantalla el siguiente menú:
                     MENU
                    1. Sumar
                    2. Restar
                    3. Multiplicar
                    4. Dividir
                    5. Salir
Elija opción:
    El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
    pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
    opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir
    del programa directamente, se debe mostrar el siguiente mensaje de confirmación:
    ¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el
    carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
         */
        //Invocamos Scanner
        Scanner leer = new Scanner(System.in);
        //Definir variables (Valores del usuario)
        int n1, n2;
        //Definir variables (Valores del programa)
        int menu, suma, resta, mult, div;
        String exit;
        boolean valid;
        valid = true;
        //Iniciamos el programa pidiendo al usuario los valores ingresados por teclado
        System.out.println("Ingrese dos números enteros positivos y elija la acción en el menú principal");
        System.out.print(">");
        n1 = leer.nextInt();
        System.out.print(">");
        n2 = leer.nextInt();
        //Iniciamos el menú principal
        System.out.println("Menú Principal:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        System.out.print(">");
        //Avanzamos con las opciones

        do {
            menu = leer.nextInt();
            switch (menu) {
                case 1:
                    suma = n1 + n2;
                    System.out.println("La suma de " + n1 + " y " + n2 + "es de " + suma + ".");
                    System.out.println("¿Desea continuar con otra operación? S/N");
                    System.out.println(">");
                    exit = leer.nextLine();
                    if (exit.equals("N")) {
                        valid = false;
                        break;
                    } else {
                        //Iniciamos el menú principal
                        System.out.println("Menú Principal:");
                        System.out.println("1. Sumar");
                        System.out.println("2. Restar");
                        System.out.println("3. Multiplicar");
                        System.out.println("4. Dividir");
                        System.out.println("5. Salir");
                        System.out.print(">");
                    }
                    break;
                case 2:
                    resta = n1 - n2;
                    System.out.println("La resta entre " + n1 + " y " + n2 + "es de " + resta + ".");
                    System.out.println("¿Desea continuar con otra operación? S/N");
                    System.out.println(">");
                    exit = leer.nextLine();
                    if (exit.equals("N")) {
                        valid = false;
                        break;
                    } else {
                        //Iniciamos el menú principal
                        System.out.println("Menú Principal:");
                        System.out.println("1. Sumar");
                        System.out.println("2. Restar");
                        System.out.println("3. Multiplicar");
                        System.out.println("4. Dividir");
                        System.out.println("5. Salir");
                        System.out.print(">");
                    }
                    break;
                case 3:
                    mult = n1 * n2;
                    System.out.println("La multiplicación de " + n1 + " y " + n2 + "es de " + mult + ".");
                    System.out.println("¿Desea continuar con otra operación? S/N");
                    System.out.println(">");
                    exit = leer.nextLine();
                    if (exit.equals("N")) {
                        valid = false;
                        break;
                    } else {
                        //Iniciamos el menú principal
                        System.out.println("Menú Principal:");
                        System.out.println("1. Sumar");
                        System.out.println("2. Restar");
                        System.out.println("3. Multiplicar");
                        System.out.println("4. Dividir");
                        System.out.println("5. Salir");
                        System.out.print(">");
                    }
                    break;
                case 4:
                    div = n1 / n2;
                    System.out.println("La división entre " + n1 + " y " + n2 + "es de " + div + ".");
                    System.out.println("¿Desea continuar con otra operación? S/N");
                    System.out.println(">");
                    exit = leer.nextLine();
                    if (exit.equals("N")) {
                        valid = false;
                        break;
                    } else {
                        //Iniciamos el menú principal
                        System.out.println("Menú Principal:");
                        System.out.println("1. Sumar");
                        System.out.println("2. Restar");
                        System.out.println("3. Multiplicar");
                        System.out.println("4. Dividir");
                        System.out.println("5. Salir");
                        System.out.print(">");
                    }
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir? S/N");
                    System.out.println(">");
                    exit = leer.nextLine();
                    if (exit.equals("S")) {
                        valid = false;
                        break;
                    } else {
                        valid = true;
                    }

            }

        } while (valid = true);

    }
}
