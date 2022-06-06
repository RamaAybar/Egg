/*
Realizar una clase llamada Matematica que tenga como atributos dos números reales
con los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener
un constructor vacío, parametrizado y get y set. En el main se creará el objeto y se
usará el Math.random para generar los dos números y se guardaran en el objeto con
su respectivos set. Deberá además implementar los siguientes métodos:
• Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor
valor
• Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
• Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package Clases;

/**
 *
 * @author Usuario
 */
public class Matematica {

    //Atributos
    private double real;
    private double real2;

    //Constructor vacío
    public Matematica() {
    }

    //Constructor lleno
    public Matematica(double real, double real2) {
        this.real = real;
        this.real2 = real2;
    }
    //Getters and Setters

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getReal2() {
        return real2;
    }

    public void setReal2(double real2) {
        this.real2 = real2;
    }

//Método devolverMayor()
    public void devolverMayor() {
        double mayor;
        mayor = Math.max(real, real2);
        System.out.println("El valor mas alto es: " + mayor);
    }
//Método calcularPotencia()

    public void calcularPotencia() {
        double potencia, n1, n2, a, b;
        //Redondeo
        n1 = Math.round(real);
        n2 = Math.round(real2);
        //Mayor separado del menor
        a = Math.max(n2, n1);
        b = Math.min(n2, n1);
        potencia = Math.pow(a, b);
        System.out.println("La potencia entre " + n1 + " y " + n2 + " es: " + potencia);
    }
//Método calculaRaiz()

    public void calcularRaiz() {
        double raiz;
        double min;
        min = Math.min(real, real2);
        min = Math.abs(min);
        raiz = Math.sqrt(min);
        System.out.println("La raíz entre " + real + " y " + real2 + " es: " + raiz);
    }
}
