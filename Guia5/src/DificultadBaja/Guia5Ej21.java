/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DificultadBaja;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia5Ej21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le
pida al usuario un numero a buscar en el vector. El programa mostrará donde se
encuentra el numero y si se encuentra repetido*/

        //Definir N
        int N, retorno, search, pp = 0;
        //Invocamos Scanner
        Scanner leer = new Scanner(System.in);
        //Petición usuario
        System.out.println("Ingrese un valor para N, siendo este el tamaño del vector.");
        N = leer.nextInt();
        //Definir vector
        int[] vector;
        vector = new int[N];

        //generador de numeros aleatorios
        Random generadorAleatorios = new Random();
        int numeroAleatorio;
        for (int i = 0; i < N - 1; i++) {
            vector[i] = 1 + generadorAleatorios.nextInt(100);
        }
        //Pedimos al usuario que busque un valor
        System.out.println("Ingrese un valor a buscar dentro del vector:");
        search = leer.nextInt();

        //Invocamos la función
        buscador(vector, N, search, pp);

    }

    public static void buscador(int[] vector, int N, int search, int pp) {

        for (int i = 0; i < N - 1; i++) {
            if (search == vector[i]) {
                pp = pp + 1;
                System.out.println("[" + (i + 1) + "]");
            }
        }
        System.out.println("El valor " + search + " ha sido encontrado " + pp + " veces.");
    }
}
