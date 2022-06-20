package App;

import java.util.Scanner;

public class Alumno {

    private Scanner leer = new Scanner(System.in);
    private String nombre;
    private int nota1;
    private int nota2;
    private int nota3;
    private float promedio;

    public void crearalumno() {
        System.out.println("Ingrese el nombre del alumno");
        nombre = leer.next();
        System.out.println("Ingrese la primer nota: ");
        nota1 = leer.nextInt();
        System.out.println("Ingrese la segunda nota: ");
        nota2 = leer.nextInt();
        System.out.println("Ingrese la tercer nota: ");
        nota3 = leer.nextInt();
        promedio = (nota1 + nota2 + nota3) / 3;

    }

    public int getNota1() {
        return nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public int getNota3() {
        return nota3;
    }

    public float getPromedio() {
        return promedio;
    }

    public String getNombre() {
        return nombre;
    }

}
