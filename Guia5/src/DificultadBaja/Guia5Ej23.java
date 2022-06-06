/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DificultadBaja;

import java.util.Random;

/**
 *
 * @author Usuario
 */
public class Guia5Ej23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre
la traspuesta de la matriz.*/

        //Generamos la matriz
        int N;
        N = 4;
        int[][] matriz;
        matriz = new int[N][N];

        //Invocamos el generador de aleatorios y damos valores       
        Random generadorAleatorios = new Random();
        int numeroAleatorio;
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                matriz[x][y] = 1 + generadorAleatorios.nextInt(100);
            }

            //Generamos una nueva matriz para la traspuesta
            int[][] matrizT = new int[matriz[0].length][matriz.length];

            //Llenamos la matriz con los valores cambiando x por y de la matriz original
            for (x = 0; x < matriz.length; x++) {
                System.out.print("|");
                for (int y = 0; y < matriz[x].length; y++) {
                    System.out.print(matriz[x][y]);
                    if (y != matriz[x].length - 1) {
                        System.out.print("\t");
                    }
                }
                System.out.println("|");
            }
            System.out.println("");
            for (x = 0; x < matriz.length; x++) {
                System.out.print("|");
                for (int y = 0; y < matriz[x].length; y++) {
                    System.out.print(matriz[x][y]);
                    if (y != matriz[x].length - 1) {
                        System.out.print("\t");
                    }
                }
                System.out.println("|");
            }
        }
    }
}
