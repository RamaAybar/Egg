/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotapp.entitades;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class usuario {

    public String nombre;
    public String apellido;
    public String dni;
    public Date nacimiento;
    public String pais;

    public usuario() {
    }

    public usuario(String nombre, String apellido, String dni, Date nacimiento, String pais) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.nacimiento = nacimiento;
        this.pais = pais;
    }

}
