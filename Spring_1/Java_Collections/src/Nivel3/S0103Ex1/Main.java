package Nivel3.S0103Ex1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        final long startTime1 = System.currentTimeMillis(); //Inicio contador tiempo

        Contenedor cadena = new Contenedor();
        cadena.addCadena("Estoy");
        cadena.addCadena("realizando");
        cadena.addCadena("un");
        cadena.addCadena("programa");
        cadena.addCadena("en");
        cadena.addCadena("JAVA.");

        System.out.println(cadena);

        final long endTime1 = System.currentTimeMillis();//Final contador de tiempo
        System.out.println(" ");
        System.out.print("Tiempo ejecución 1: \t" + (endTime1 - startTime1));
        System.out.println(" ");
        System.out.println("::::::::::::::::::::::");
        final long startTime2 = System.currentTimeMillis(); //Inicio contador tiempo

        ArrayList<Integer> contar = new ArrayList<Integer>();
        contar.add(1);
        contar.add(2);
        contar.add(3);
        contar.add(4);
        contar.add(5);
        contar.add(6);

        System.out.println(contar);

        final long endTime2 = System.currentTimeMillis();//Final contador de tiempo
        System.out.println(" ");
        System.out.print("Tiempo ejecución 2: \t" + (endTime2 - startTime2));
        System.out.println(" ");
        System.out.println("::::::::::::::::::::::");

    }
}
