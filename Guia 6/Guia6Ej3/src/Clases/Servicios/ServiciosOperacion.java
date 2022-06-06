/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases.Servicios;

import Clases.Operacion;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ServiciosOperacion {

    private Scanner leer = new Scanner(System.in);

    public Operacion crearOperacion() {
        System.out.println("Ingrese dos valores para operar: ");
        int numero1 = leer.nextInt();
        int numero2 = leer.nextInt();
        
        return new Operacion (numero1,numero2);
    }
}
