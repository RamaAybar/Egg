/*
 Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. Deberá además implementar los
siguientes métodos:
• Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.
• Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla.
Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
• Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario
y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
• Método compararLongitud(String frase), deberá comparar la longitud de la frase
que compone la clase con otra nueva frase ingresada por el usuario.
• Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
• Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y
mostrar la frase resultante.
• Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package Clases;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Cadena {

    Scanner leer = new Scanner(System.in);
    //Atributos

    private String frase;

//Constructores
    public Cadena() {
    }

    public Cadena(String frase) {
        this.frase = frase;
    }
//Getters and Setters

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }
//Método mostrarVocales

    public void mostrarVocales(String frase) {
        int contador1 = 0;
        for (int x = 0; x < frase.length(); x++) {
            if ((frase.charAt(x) == 'a') || (frase.charAt(x) == 'e') || (frase.charAt(x) == 'i') || (frase.charAt(x) == 'o') || (frase.charAt(x) == 'u')) {
                contador1++;
            }
        }
        System.out.println("La palabra " + frase + " contiene " + contador1 + " vocales");
    }
//Método invertirFrase

    public void invertirfrase(String frase) {
        char[] invertir = frase.toCharArray();
        int contador2 = 0;
        for (contador2 = frase.length() - 1; contador2 >= 0; contador2--) {
            System.out.print(invertir[contador2]);
        }
        System.out.println("");
        System.out.println(frase);
    }
//Método vecesRepetido

    public int vecesRepetido(String frase,String letra) {
        int contador3 = 0;
        
        frase = frase.toUpperCase();
        for (int x = 0; x < frase.length(); x++) {
            if ((frase.equals(letra))) {
                contador3++;
            }
        }
        return contador3;
    }
//Método compararLongitud

    public void unirFrases(String frase, String frase2) {
        System.out.println(frase + "-" + frase2);
    }
//Método reemplazar

    public void reemplazar(String frase, String letra) {
        System.out.println(frase.replace(letra, "a"));
    }
//Método contiene

    public void contiene(String frase, String letra, boolean b) {

        b = false;
        int contador4 = 0;
        for (int x = 0; x < frase.length(); x++) {
            contador4 = 0;
            for (int z = 0; z < letra.length(); z++) {
                if (frase.charAt(x) == letra.charAt(z)) {
                    contador4++;
                }
            }
            if (contador4 == letra.length()) {
                b = true;
            }
        }
        b = false;
        System.out.println("La letra " + letra + " se repite " + contador4 + " veces.");
    }
}
