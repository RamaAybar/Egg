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
public class Guia6Ej8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Variables
        String frase,frase2,letra;
        int longfrase,contadorR;
        contadorR = 0;
        
        Cadena c1 = new Cadena();
        System.out.println("Ingrese una frase: ");
        frase = leer.nextLine();
        longfrase = frase.length();
        
        //Mostrar vocales
        c1.mostrarVocales(frase);
        
        //Invertir frase
        c1.invertirfrase(frase);
        
        //Encontrar un caracter repetido
        System.out.println("Ingrese el caracter a buscar: ");
        letra = leer.nextLine();
        c1.vecesRepetido(frase,letra);
        System.out.println("La letra " + letra + " aparece " + contadorR + " veces.");
        
        //Comparar longitud
        System.out.println("Ingrese una nueva frase");
        frase2=leer.nextLine();
        c1.unirFrases(frase, frase2);
        
        //Remplazar las letras "a"
        System.out.println("Ingrese una letra para reemplazarla en las 'a' de la frase: ");
        letra=leer.nextLine();
        c1.reemplazar(frase, letra);
        
        //Buscar letra en la frase
        System.out.println("Ingrese una letra para buscar buscar dentro de la frase: ");
        letra = leer.nextLine();
        c1.contiene(frase, letra, true);
    }
    
}
