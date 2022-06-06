/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6ej12;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Persona {

    private String nombre;
    private final Date fechadenacimiento;
    private final Date fechaactual;
    Scanner leer = new Scanner(System.in);

    //constructor    
    //creo el objeto persona solo con el date para que no se cree vacio
    public Persona() {
        fechaactual = new Date();
        fechadenacimiento = new Date();
    }

    //getters
    public Date getFechadenacimiento() {
        return fechadenacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFechaactual() {
        return fechaactual;
    }
    

    //setters
    public void setNombre() {
        System.out.println("Ingrese el nombre de la persona");
        do {
            nombre = leer.next();
        } while ("".equals(nombre));
    }

    public void setFechaactual() {

    }

    public void setFechadenacimiento() {
        System.out.println("Ingrese el año en el que nacio la persona");

        fechadenacimiento.setYear(leer.nextInt());

        System.out.println("Ingrese el mes de nacimiento de la persona");

        fechadenacimiento.setMonth(leer.nextInt());

        System.out.println("Ingrese el dia de nacimiento de la persona");
        

        fechadenacimiento.setDate(leer.nextInt());

    }

    //calculo la edad de la persona
    public void calculoedad() {

        System.out.println("La edad de " + nombre + " es " + ((fechaactual.getYear() + 1900) - fechadenacimiento.getYear()) + " años");
    }

    //comparacion con otra edad 
    public void comparacionedad() {
        if (((fechaactual.getYear() + 1900) - fechadenacimiento.getYear()) < 18) {
            System.out.println("La persona es menor de edad");
        } else {
            System.out.println("La persona es mayor de edad");
        }
    }
    //Muestro los datos de la persona 

    public void mostrardatos() {
        System.out.println("El nombre de la persona es: " + nombre);
        System.out.println("La fecha de nacimiento de la persona es : " + (fechadenacimiento.getDay()) + "/" + (fechadenacimiento.getMonth()) + "/" + (fechadenacimiento.getYear()));
    }
}
