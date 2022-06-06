/*
 Crear una clase Rectángulo que modele rectángulos por medio de un atributo
 privado base y un atributo privado altura. La clase incluirá un método para crear el
 rectángulo con los datos del Rectángulo dados por el usuario. También incluirá un
 método para calcular la superficie del rectángulo y un método para calcular el
 perímetro del rectángulo. Por último, tendremos un método que dibujará el
 rectángulo mediante asteriscos usando la base y la altura. Se deberán además definir
 los métodos getters, setters y constructores correspondientes.
 Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package Clases;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Rectangulo {

    //Scanner
    public Scanner leer = new Scanner(System.in);

    //Atributos
    private int base;
    private int altura;
    private double superficie;
    private double perimetro;
//Constructor vacío

    public Rectangulo() {
    }
//Constructor datos

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    //Constructor auxiliar
    public void crearRectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
//Getters

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public double getSuperficie() {
        return superficie;
    }

    public double getPerimetro() {
        return perimetro;
    }
//Setters

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    //Método calcular superficie
    public void CalcularSuperficie(int base, int altura) {
        superficie = base * altura;
    }

    //Método calcular perímetro
    public void CalcularPerimetro(int base, int altura) {
        perimetro = (base + altura) * 2;
    }

    //Método de impresión del rectangulo
    public void ImprimirRectangulo() {
        String aux = "*";
        for (int alto = 0; alto < altura; alto++) {
            for (int largo = 0; largo < base; largo++) {
                // Primera y Ultima Linea (Todo con *)
                if (alto == 0 | alto == altura - 1) {
                    aux = "*";
                } else {
                    // Zona media (* o blanco)
                    if (largo == 0 | largo == base - 1) {
                        aux = "*";
                    }
                    if (largo != 0 & largo != base - 1) {
                        aux = " ";
                    }
                }
                // Pintamos caracter que corresponda
                System.out.print(aux);
                // Si es final de linea un salto
                if (largo == base - 1) {
                    System.out.print("\n");
                }
            }
        }

    }

    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + ", superficie=" + superficie + ", perimetro=" + perimetro + '}';
    }
    
}
