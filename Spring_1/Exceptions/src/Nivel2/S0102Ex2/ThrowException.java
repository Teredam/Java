package Nivel2.S0102Ex2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowException {
    public static void main(String[] args) {
    String nombre;
    int edad;

    Scanner entrada = new Scanner(System.in);

    public void f() throw InputMismatchException {
        try {
            g();

        } catch (InputMismatchException e) {
            System.out.print("Introduce una edad válida");

        }
    }

    public void g() {
            System.out.print("Ingrese su nombre?");
            nombre = entrada.nextLine();

            System.out.print("Ingrese su edad?");
            edad =   entrada.nextInt();

            System.out.print("Hola " + nombre + ", tienes " + edad + " años.");

            entrada.close();


        }
    }
}

