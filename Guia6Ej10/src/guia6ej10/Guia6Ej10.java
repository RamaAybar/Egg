/*
Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo
A de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por
pantalla. Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros
10 números ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos
elementos con el valor 0.5. Mostrar los dos arreglos resultantes: el ordenado de 50
elementos y el combinado de 20.
 */
package guia6ej10;

import java.util.Arrays;

/**
 *
 * @author Usuario
 */
public class Guia6Ej10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creo Array = A
        double A[] = new double[50];
        double B[] = new double[20];
        //Lleno A con valores aleatorios
        for (int i = 0; i < A.length; i++) {
            A[i] = Math.random();
            System.out.println("");
        }
        //Ordenar Array = A
        Arrays.sort(A);
        //Dar los primeros diez valores al vector
        System.arraycopy(A, 0, B, 0, 9);
        for (int i = 10; i < 19; i++) {
            B[i]=0.5;
        }
        //Imprimir Vectores
        System.out.println("Vector A:");
        System.out.println("");
        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
            System.out.println("");
        }
        
        System.out.println("Vector B:");
        System.out.println("");
        for (int i = 0; i < B.length; i++) {
            System.out.println(B[i]);
            System.out.println("");
        }
    }

}
