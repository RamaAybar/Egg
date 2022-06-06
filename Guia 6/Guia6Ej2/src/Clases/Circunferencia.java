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
public class Circunferencia {

    private int radio;
    private double area;
    private double perimetro;

    private Scanner leer = new Scanner(System.in);

    //Constructor vacío
    public Circunferencia() {
    }

//Constructores
    public Circunferencia(int radio) {
        this.radio = radio;
    }

//Setter    
    public void setRadio(int radio) {
        this.radio = radio;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

//Getter   
    public int getRadio() {
        return radio;
    }

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }

//Método circunferencia   
    public void crearCircunferencia(int radio) {
        this.radio = radio;
    }
//Método área

    public void area(int radio) {
        area = Math.PI * radio;
    }
//Método perímetro

    public void perimetro(int radio) {
        perimetro = 2 * Math.PI * radio;
    }

    @Override
    public String toString() {
        return "Circunferencia{" + "radio=" + radio + ", area=" + area + ", perimetro=" + perimetro + '}';
    }

}
