package Nivel3.S0103Ex2;

import Nivel3.S0103Ex1.Contenedor;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        final long startTime1 = System.currentTimeMillis(); //Inicio contador tiempo

        Contenedor1 enumerar = new Contenedor1();
        enumerar.addNumero(1);
        enumerar.addNumero(2);
        enumerar.addNumero(3);
        enumerar.addNumero(4);
        enumerar.addNumero(5);
        enumerar.addNumero(6);

        System.out.println(enumerar);

        enumerar.removerNumero(2);
        enumerar.addNumero(7);
        enumerar.addNumero(8);

        System.out.println(enumerar);

        enumerar.removerNumero(5);

        System.out.println(enumerar);

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

        contar.remove(2);
        contar.add(7);
        contar.add(8);

        System.out.println(contar);

        contar.remove(5);

        System.out.println(contar);

        final long endTime2 = System.currentTimeMillis();//Final contador de tiempo
        System.out.println(" ");
        System.out.print("Tiempo ejecución 2: \t" + (endTime2 - startTime2));
        System.out.println(" ");



    }
}
