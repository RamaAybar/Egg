/*
Crear una clase llamada Operacion que tenga como atributos privados numero1 y
numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los
guarda en los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero,
si fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el
error. Si no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a
pasar una división por cero, el método devuelve 0 y se le informa al usuario el
error se le informa al usuario. Si no, se hace la división y se devuelve el resultado
al main.
 */
package Clases;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Operacion {

    private Scanner leer = new Scanner(System.in);

    private int numero1;
    private int numero2;
    private double suma;
    private double resta;
    private double multiplicacion;
    private double division;
//Constructor vacío

    public Operacion() {
    }
//Constructor con atributos

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
//Getters

    public int getNumero1() {
        return numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public double getSuma() {
        return suma;
    }

    public double getResta() {
        return resta;
    }

    public double getMultiplicacion() {
        return multiplicacion;
    }

    public double getDivision() {
        return division;
    }

//Setters
    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public void setSuma(double suma) {
        this.suma = suma;
    }

    public void setResta(double resta) {
        this.resta = resta;
    }

    public void setMultiplicacion(double multiplicacion) {
        this.multiplicacion = multiplicacion;
    }

    public void setDivision(double division) {
        this.division = division;
    }

//Método petición
    public void crearOperacion(int numero1, int numero2) {
        numero1 = this.numero1;
        numero2 = this.numero2;
    }
//Sumar

    public void sumar(int numero1, int numero2) {
        suma = numero1 + numero2;
    }
//Restar

    public void restar(int numero1, int numero2) {
        resta = numero1 - numero2;
    }
//Multiplicar

    public void multiplicar(int numero1, int numero2) {
        if (numero1 == 0 || numero2 == 0) {
            System.out.println("Error al multiplicar, uno de los valores es 0.");
            multiplicacion = 0;
        } else {
            multiplicacion = numero1 * numero2;
        }
    }
//Dividir

    public void dividir(int numero1, int numero2) {
        if (numero1 == 0 || numero2 == 0) {
            System.out.println("Error al dividir, uno de los valores es 0.");
            division = 0;
        } else {
            division = (numero1 / numero2);
        }
    }

    @Override
    public String toString() {
        return "Operacion{" + " suma=" + suma + ", resta=" + resta + ", multiplicacion=" + multiplicacion + ", division=" + division + '}';
    }

}
