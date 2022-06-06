/*
Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual. Las
operaciones asociadas a dicha clase son:
• Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
• Agregar los métodos getters y setters correspondientes
• Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
• Método ingresar(double ingreso): el método recibe una cantidad de dinero a
ingresar y se la sumara a saldo actual.
• Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y
se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
• Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar
que el usuario no saque más del 20%.
• Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
• Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package Clases;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Cuenta {

    Scanner leer = new Scanner(System.in);
//Atributos
    private int numeroCuenta;
    private int DNI;
    private double saldo;
    private double intereses;
//Constructor vacío

    public Cuenta() {
    }
//Constructor datos principales

    public Cuenta(int numeroCuenta, int DNI, int saldo) {
        this.numeroCuenta = numeroCuenta;
        this.DNI = DNI;
        this.saldo = saldo;
    }
//Constructor datos principales y secundarios

    public Cuenta(int numeroCuenta, int DNI, double saldo, double intereses) {
        this.numeroCuenta = numeroCuenta;
        this.DNI = DNI;
        this.saldo = saldo;
        this.intereses = intereses;
    }
//Menú     //Menú      //Menú        //Menú           //Menú

    public void menu() {
        int opcion = 0;
        do {
            System.out.println("Escriba el número de la acción que quiere realizar: ");
            System.out.println("1-Ingreso");
            System.out.println("2-Retiro");
            System.out.println("3-Retiro rápido");
            System.out.println("4-Consulta de datos");
            System.out.println("5-Salir");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    Ingresar();
                    break;
                case 2:
                    Retirar();
                    break;
                case 3:
                    ExtraccionRapida();
                    break;
                case 4:
                    ConsultaDatos();
                    ConsultaSaldo();
                    break;
                case 5:
                    break;
            }
        } while (opcion != 5);
    }
//Menú     //Menú      //Menú        //Menú           //Menú
//Getters y Setters

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getIntereses() {
        return intereses;
    }

    public void setIntereses(double intereses) {
        this.intereses = intereses;
    }
//Servicios

    public void Servicios() {
        System.out.println("Ingrese el número de cuenta: ");
        numeroCuenta = leer.nextInt();
        System.out.println("Ingrese su DNI: ");
        DNI = leer.nextInt();
        System.out.println("Ingrese su saldo: ");
        saldo = leer.nextDouble();
    }
//Método ingresar plata

    public void Ingresar() {
        System.out.println("Declare la cantidad a ingresar: ");
        double ingreso = leer.nextDouble();
        saldo = saldo + ingreso;
    }
//Método retirar plata

    public void Retirar() {
        System.out.println("Declare la cantidad a retirar: ");
        double retiro = leer.nextDouble();
        if (retiro > saldo) {
            System.out.println("Su saldo es insuficiente para realizar el retiro");
        } else {
            saldo = saldo - retiro;
        }
    }

//Método extracción rápida
    public void ExtraccionRapida() {
        System.out.println("Ingrese la cantidad de dinero a extraer(Max:20%): ");
        double extraccionr = leer.nextDouble();
        double veintep = 0.2 * saldo;
        if (extraccionr > veintep) {
            System.out.println("No es posible retirar más del 20% del saldo.");
        } else {
            saldo = saldo - extraccionr;
        }
    }
//Método consulta saldo

    public void ConsultaSaldo() {
        System.out.println("Su saldo es: " + saldo);
    }
//Método consulta datos

    public void ConsultaDatos() {
        System.out.println("Su número de cuenta es " + numeroCuenta + " y su DNI es:" + DNI + ".");
    }
}
