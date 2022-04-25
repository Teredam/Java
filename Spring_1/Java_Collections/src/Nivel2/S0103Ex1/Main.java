/*  Crea una clase llamada Numero que contenga un objeto Integer que se inicie con un valor comprendido entre 0 y 100
utilizando java.util.Random. Rellena una cola tipo PriorityQueue con objetos de esta clase y extrae los valores
utilizando poll() para demostrar que se obtiene el orden deseado. */
package Nivel2.S0103Ex1;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        Numero objeto = new Numero();
        Numero objeto1 = new Numero();
        Numero objeto2 = new Numero();
        Numero objeto3 = new Numero();
        Numero objeto4 = new Numero();

        PriorityQueue<Numero> numeroPriorityQueue = new PriorityQueue<Numero>();
        numeroPriorityQueue.add(objeto);
        numeroPriorityQueue.add(objeto1);
        numeroPriorityQueue.add(objeto2);
        numeroPriorityQueue.add(objeto3);
        numeroPriorityQueue.add(objeto4);
        System.out.println(numeroPriorityQueue);
        System.out.println("......................................................................................." +
                "........");

        for (int i = 0; i < 5; i++){
            numeroPriorityQueue.poll();
            System.out.println(numeroPriorityQueue);
        }

    }
}
