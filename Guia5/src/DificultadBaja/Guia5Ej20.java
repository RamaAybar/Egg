/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DificultadBaja;

/**
 *
 * @author Usuario
 */
public class Guia5Ej20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y
los muestre por pantalla en orden descendente.*/
        
         //Declaro un arreglo de una dimensión con []
        int[] vector;
        int a=0;
        //Creo en memoria con valor por defecto
        vector = new int[100];
        //Declaro contador
        int pp=100;
        
        System.out.println(llenarvector(vector,a,pp));
        
    }

    /**
     * @param pp
     * @param vector
     * @param a
     * @return
     */
    public static int llenarvector(int[] vector,int a,int pp){
        
       
        
        //Relleno el vector con valores descendentes desde 100
        for (int i=0;i<vector.length;i++){
            vector[i]= pp;
            pp=pp-1;
        }
        for(int i=0;i<vector.length;i++)
        {
            System.out.println(vector[i]);
        }
        
        return a;
    }
    
}
