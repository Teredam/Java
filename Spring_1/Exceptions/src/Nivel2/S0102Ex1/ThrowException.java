package Nivel2.S0102Ex1;

import java.util.Scanner;

public class ThrowException {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

    }
    public void f(){
        try {
            g();
        } catch (Exception e) {
            System.out.print("Introduce una edad válida");
        }
    }

    public void g() {
        System.out.print("Ingrese su nombre?");
        String nombre = entrada.nextLine();
        System.out.print("Ingrese su edad?");
        int edad =   entrada.nextInt();
        System.out.print("Hola " + nombre + ", tienes " + edad + " años.");
    }

}