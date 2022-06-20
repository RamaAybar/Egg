package App;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        Alumno alumno = new Alumno();
        ArrayList<Alumno> listadealumnos = new ArrayList();
        String selector;
        selector = "n";
        boolean logic;
        logic = false;
        int contador;
        contador = 0;
        String buscado;
        //Lleno el ArrayList de Alumnos
        do {
            alumno.crearalumno();
            listadealumnos.add(alumno);
            System.out.println("¿Desea ingresar otro alumno? s/n");
            do {
                selector = leer.next();
            } while (!"s".equals(selector) && !"n".equals(selector));
        } while (!"n".equals(selector));
        //Busco el alumno en el array y lo muestro, si este no existe muestro un mensaje  
        do {
            System.out.println("Ingrese el nombre del alumno a buscar: ");
            buscado = leer.next();

            for (int i = 0; i < listadealumnos.size(); i++) {
                if (buscado.equals(listadealumnos.get(i).getNombre())) {
                    System.out.println("Nombre: " + listadealumnos.get(i).getNombre());
                    System.out.println("Nota N°1: " + listadealumnos.get(i).getNota1());
                    System.out.println("Nota N°2: " + listadealumnos.get(i).getNota2());
                    System.out.println("Nota N°3: " + listadealumnos.get(i).getNota3());
                    System.out.println("Promedio: " + listadealumnos.get(i).getPromedio());
                    logic = true;
                }
            }
            if (logic == false) {
                System.out.println("No existe ese alumno");
            }
            System.out.println("¿Desea buscar otro alumno? s/n");
            do {//Este buscle me permite elegir el selector 
                selector = leer.next();
            } while (!"s".equals(selector) && !"n".equals(selector));
        } while (!"n".equals(selector));

    }

}
