package guia8ej4;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

/**
 *
 * @author Usuario
 */
public class Pelicula {

    private Scanner leer = new Scanner(System.in);
    private Pelicula pelicula = new Pelicula();
    private ArrayList<Pelicula> listaPeliculas = new ArrayList();
    private String selector;
    private String titulo;
    private String director;
    private float duracion;

    public void crearPelicula() {
        //Bucle crear película
        do {
            System.out.println("Ingrese el titulo de la pelicula");
            titulo = leer.next();
            System.out.println("Ingrese el director de la pelicula");
            director = leer.next();
            System.out.println("Ingrese la duracion de la pelicula");
            duracion = leer.nextFloat();
            listaPeliculas.add(pelicula);
            System.out.println("¿Desea salir al menú? s/n");
            do {
                selector = leer.next();
            } while (!"s".equals(selector) && !"n".equals(selector));
        } while (!"s".equals(selector));
    }

    public void Menu() {
        System.out.println("Menú principal: ");
        System.out.println("Ingrese el número de la opción que desea realizar: ");
        System.out.println("1- Mostrar en pantalla todas las películas.");
        System.out.println("2- Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo\n" +
"    en pantalla.");
        System.out.println("3- Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo\n" +
"    en pantalla.");
        System.out.println("4- Ordenar las películas por titulo, alfabéticamente y mostrarlo en pantalla.");
        System.out.println("5- Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.");
        do {
            switch (selector) {
    /*• Mostrar en pantalla todas las películas.
    • Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
    • Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo
    en pantalla.
    • Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo
    en pantalla.
    • Ordenar las películas por titulo, alfabéticamente y mostrarlo en pantalla.
    • Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
    */
                case "1":
                    //Impresor de películas
                    listaPeliculas.forEach((_item) -> {
                        pelicula.mostrarPeliculas();
                    });
                case "2":
                case "3":
                    Collections.sort(listaPeliculas);

            }
        } while (!selector.equals("exit"));
    }

    public void mostrarPeliculas() {
        System.out.println("Nombre: " + titulo + ", Director: " + director + ", Dureacion: " + duracion);
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public ArrayList<Pelicula> getListaPeliculas() {
        return listaPeliculas;
    }

    public void setListaPeliculas(ArrayList<Pelicula> listaPeliculas) {
        this.listaPeliculas = listaPeliculas;
    }

    public String getSelector() {
        return selector;
    }

    public void setSelector(String selector) {
        this.selector = selector;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "leer=" + leer + ", pelicula=" + pelicula + ", listaPeliculas=" + listaPeliculas + ", selector=" + selector + ", titulo=" + titulo + ", director=" + director + ", duracion=" + duracion + '}';
    }

}
