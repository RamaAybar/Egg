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

/**
 *
 * @author Usuario
 */
public class Guia6Ej7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Definir variables para el main
        int IMC1, IMC2, IMC3, IMC4;
        boolean moy1, moy2, moy3, moy4;
        //Dar nacimiento a las personas
        Persona p1 = new Persona();
        Persona p2 = new Persona();
        Persona p3 = new Persona();
        Persona p4 = new Persona();
        //Asignar atributos
        System.out.println("Ingrese los datos de la primer persona: ");
        p1.crearPersona();
        System.out.println("Ingrese los datos de la segunda persona: ");
        p2.crearPersona();
        System.out.println("Ingrese los datos de la tercera persona: ");
        p3.crearPersona();
        System.out.println("Ingrese los datos de la cuarta persona: ");
        p4.crearPersona();
        //Calcular peso ideal
        IMC1 = p1.calcularIMC();
        IMC2 = p2.calcularIMC();
        IMC3 = p3.calcularIMC();
        IMC4 = p4.calcularIMC();
        //Mayor o menor
        moy1 = p1.esMayorDeEdad();
        moy2 = p2.esMayorDeEdad();
        moy3 = p3.esMayorDeEdad();
        moy4 = p4.esMayorDeEdad();
        //Porcentaje de peso P1
        if (IMC1 == -1) {
            System.out.println("La primer persona está debajo del peso ideal.");
        }
        if (IMC1 == 0) {
            System.out.println("La primer persona está en su peso ideal.");
        }
        if (IMC1 == 1) {
            System.out.println("La primer persona está por encima de su peso ideal.");
        }
        //Porcentaje de peso P2
        if (IMC2 == -1) {
            System.out.println("La segunda persona está debajo del peso ideal.");
        }
        if (IMC2 == 0) {
            System.out.println("La segunda persona está en su peso ideal.");
        }
        if (IMC2 == 1) {
            System.out.println("La segunda persona está por encima de su peso ideal.");
        }
        //Porcentaje de peso P3
        if (IMC3 == -1) {
            System.out.println("La tercer persona está debajo del peso ideal.");
        }
        if (IMC3 == 0) {
            System.out.println("La tercer persona está en su peso ideal.");
        }
        if (IMC3 == 1) {
            System.out.println("La tercer persona está por encima de su peso ideal.");
        }
        //Porcentaje de peso P4
        if (IMC4 == -1) {
            System.out.println("La cuarta persona está debajo del peso ideal.");
        }
        if (IMC4 == 0) {
            System.out.println("La cuarta persona está en su peso ideal.");
        }
        if (IMC4 == 1) {
            System.out.println("La cuarta persona está por encima de su peso ideal.");
        }
        //Porcentaje de mayores y menores
        //Edad P1
        if (moy1 = true) {
            System.out.println("La primer persona es mayor de edad.");
        } else {
            System.out.println("La primer persona es menor de edad.");
        }
        //Edad P2
        if (moy2 = true) {
            System.out.println("La segunda persona es mayor de edad.");
        } else {
            System.out.println("La segunda persona es menor de edad.");
        }
        //Edad P3
        if (moy3 = true) {
            System.out.println("La tercer persona es mayor de edad.");
        } else {
            System.out.println("La tercer persona es menor de edad.");
        }
        //Edad P4
        if (moy4 = true) {
            System.out.println("La cuarta persona es mayor de edad.");
        } else {
            System.out.println("La cuarta persona es menor de edad.");
        }
    }

}
