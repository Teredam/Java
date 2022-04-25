package Nivel1.S0103Ex6;

import java.util.Scanner;

public class Rellenar {
    public static final Scanner entrada = new Scanner(System.in);
    private char caracter;

    public char rellenar() {

            System.out.println("Ingrese un caracter u oprime cero (0) para salir: ");
            caracter = entrada.next().charAt(0);
            return caracter;

    }

}
