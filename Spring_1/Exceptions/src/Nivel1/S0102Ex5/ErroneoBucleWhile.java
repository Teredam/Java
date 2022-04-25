package Nivel1.S0102Ex5;

import java.util.Scanner;

public class ErroneoBucleWhile {
    public static void main(String[] args) {
        int num1;
        int num2;
        int operacion;
        boolean bandera = true;

        Scanner entrada = new Scanner(System.in);

        do {
            bandera = true;
            try {
                System.out.println("Ingrese el número dividendo");
                num1 = Integer.parseInt(entrada.nextLine());
                System.out.println("Ingrese el número divisor");
                num2 = Integer.parseInt(entrada.nextLine());
                operacion = num1 / num2;

                System.out.print("El resultado de la división entre " + num1 + " y " + num2 + " es: " + operacion);

            } catch (java.lang.ArithmeticException e) {
                System.out.println("El divisor debe ser diferente a cero (0)");
                bandera = false;

            } catch (java.lang.NumberFormatException e) {
                System.out.println("Valores no válidos (solo números)");
                System.out.println("Error de tipo: " + e.getClass().getName());
                bandera = false;
            } finally {
                entrada.close();
                bandera = true;
            }


        } while (bandera != true);
    }
}

