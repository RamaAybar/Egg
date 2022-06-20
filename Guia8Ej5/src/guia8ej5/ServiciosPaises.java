/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8ej5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author Usuario
 */
public class ServiciosPaises {

    private Scanner leer = new Scanner(System.in);
    private TreeSet<String> listapaises = new TreeSet();
    private String selector = "no";
    //Definimos Iterador y damos nacimiento al mismo
    private Iterator<String> iter = listapaises.iterator();

    public void IngresarPaises() {
        //Bucle de ingreso de países
        do {
            System.out.println("Ingrese el nombre de un país: ");
            listapaises.add(leer.next());
            System.out.println("¿Desea salir? s/n");
            do {
                selector = leer.next();
            } while (!"s".equals(selector) && !"n".equals(selector));
        } while (!"s".equals(selector));

        //Agregamos ArrayList en la que se irán agregando los países
        ArrayList<String> listapaisesarray;
        //Damos nacimiento al ArrayList que alberga los países
        listapaisesarray = new ArrayList<>(listapaises);
        //Ordenamos el ArrayList
        Collections.sort(listapaisesarray);
    }

    public void MostrarPaises() {
        System.out.println("Los países ingresados se mostrarán a continuación: ");
        System.out.println("");

        //Bucle de impresión
        while (iter.hasNext()) {
            System.out.print( "Nombre: " +iter.next());
            System.out.println();
        }

    }

    public void EliminarPais() {
        //Leemos el País a eliminar
        selector = leer.next();
        //Bucle mientras para eliminar con Iterador
        while (iter.hasNext()) {
            String aux = iter.next();
            if (aux.equals(selector)) {
                iter.remove();
            }
        }
    }

    //Getters and Setters
    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public TreeSet<String> getListapaises() {
        return listapaises;
    }

    public void setListapaises(TreeSet<String> listapaises) {
        this.listapaises = listapaises;
    }

    public String getSelector() {
        return selector;
    }

    public void setSelector(String selector) {
        this.selector = selector;
    }

    public Iterator<String> getIter() {
        return iter;
    }

    public void setIter(Iterator<String> iter) {
        this.iter = iter;
    }

    @Override
    public String toString() {
        return "Nombre: " + listapaises + '}';
    }

}
