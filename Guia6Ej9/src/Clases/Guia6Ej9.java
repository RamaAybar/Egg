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
public class Guia6Ej9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables
        double n1,n2;
        //Nacimiento de m1
        Matematica m1 = new Matematica();
        //Damos atributos
        System.out.println("Se darán dos valores aleatorios y se trabajará con ellos.");
        //Damos valor aleatorio a n1 y n2
        n1 = Math.random();
        n2 = Math.random();
        //Setteamos
        m1.setReal(n1);
        m1.setReal2(n2);
        //Devolvemos el valor mayor
        m1.devolverMayor();
        //Calculamos Potencia
        m1.calcularPotencia();
        //Calculamos Raiz
        m1.calcularRaiz();
    }
    
}
