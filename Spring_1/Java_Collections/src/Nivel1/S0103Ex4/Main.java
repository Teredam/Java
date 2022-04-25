package Nivel1.S0103Ex4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List flores = new ArrayList<>();
        flores.add("Margarita");
        flores.add("Rosa");
        flores.add("Petunia");
        flores.add("Orquidea");


        System.out.println("ArrayList:");
        Mi_Iterador.iterador(flores);
        System.out.println("\n................................");

        System.out.println("LinkedList:");
        LinkedList floresLK = new LinkedList(flores);
        Mi_Iterador.iterador(floresLK);
        System.out.println("\n................................");

        System.out.println("HashSet:");
        HashSet floresHS = new HashSet(flores);
        Mi_Iterador.iterador(floresHS);
        System.out.println("\n................................");

        System.out.println("LinkedHashSet:");
        LinkedHashSet<Mi_Iterador> floresLHS = new LinkedHashSet(flores);
        Mi_Iterador.iterador(floresLHS);
        System.out.println("\n................................");

        System.out.println("TreeSet:");
        TreeSet floresTS = new TreeSet(flores);
        Mi_Iterador.iterador(floresTS);

    }

}
