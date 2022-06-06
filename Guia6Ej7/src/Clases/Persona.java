/*
  Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
 sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún
 otro atributo, puede hacerlo. Los métodos que se implementarán son:
   • Un constructor por defecto.
   • Un constructor con todos los atributos como parámetro.
   • Métodos getters y setters de cada atributo.
   • Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
 al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
 Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
 O. Si no es correcto se deberá mostrar un mensaje
   • Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
 kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
 que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
 fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
 está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
 fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
 función devuelve un 1.
   • Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
 devuelve un booleano.
 A continuación, en la clase main hacer lo siguiente:
 Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
 los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
 tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
 persona es mayor de edad.
 Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad
 en distintas variables, para después en el main, calcular un porcentaje de esas 4
 personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por
 encima, y también calcularemos un porcentaje de cuantos son mayores de edad y
 cuantos menores.
 */
package Clases;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Persona {

    Scanner leer = new Scanner(System.in);
    //Atributos

    private String nombre;
    private double edad;
    private String sexo;
    private double peso;
    private double altura;
    private double ideal;
    private boolean mayoromenor;

    //Constructor vacío
    public Persona() {
    }

    //Constructor lleno
    public Persona(String nombre, double edad, String sexo, double peso, double altura, double ideal, boolean mayoromenor) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        this.ideal = ideal;
        this.mayoromenor = mayoromenor;
    }

    public boolean isMayoromenor() {
        return mayoromenor;
    }

    public void setMayoromenor(boolean mayoromenor) {
        this.mayoromenor = mayoromenor;
    }

    public double getIdeal() {
        return ideal;
    }

    public void setIdeal(double ideal) {
        this.ideal = ideal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getEdad() {
        return edad;
    }

    public void setEdad(double edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    //Método crearPersona
    public void crearPersona() {
        System.out.println("Ingrese el nombre:");
        nombre = leer.next();
        System.out.println("Ingrese la edad:");
        edad = leer.nextDouble();

        do {
            System.out.println("Ingrese el sexo:");                            //NO TOCAR
            sexo = leer.next().toUpperCase();
            if (!sexo.equals("H") && !sexo.equals("M") && !sexo.equals("O")) {
                System.out.println("Error, intente de nuevo.");
            }                                                                   //NOOOOOO  
        } while (!sexo.equals("H") && !sexo.equals("M") && !sexo.equals("O")); //QUE NO LO TOQUES

        System.out.println("Ingrese el peso:");
        peso = leer.nextDouble();
        System.out.println("Ingrese la altura:");
        altura = leer.nextDouble();
    }

    //Método calcularIMC
    public int calcularIMC() {
        double IMC;
        int resultado = 0;
        ideal = (peso) / (altura * altura);
        IMC = (peso) / (altura * altura);
        if (IMC < 20) {
            resultado = -1;
        } else if (IMC >=20 || IMC <=25) {
            resultado = 0;
        } else if (IMC > 25) {
            resultado = 1;
        }
        return resultado;
    }

    //Método esMayorDeEdad
    public boolean esMayorDeEdad() {
        boolean mom = false;
        if (edad >= 18) {
            mom = true;
        }
        if (18 > edad) {
            mom = false;
        }
        return mom;
    }
}
