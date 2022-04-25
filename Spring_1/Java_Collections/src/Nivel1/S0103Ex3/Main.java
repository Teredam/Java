package Nivel1.S0103Ex3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("ArrayList:    " + Generadora.rellenar(new ArrayList(), 10));
        System.out.println("...............................................................................................");
        System.out.println("LinkList:     " + Generadora.rellenar(new LinkedList(), 10));
        System.out.println("...............................................................................................");
        System.out.println("HashSet:      " + Generadora.rellenar(new HashSet(), 8));
        System.out.println("...............................................................................................");
        System.out.println("LinkeHashSet: " + Generadora.rellenar(new LinkedHashSet(), 6));
        System.out.println("...............................................................................................");
        System.out.println("TreeSet:      " + Generadora.rellenar(new TreeSet(), 6));

    }
}
