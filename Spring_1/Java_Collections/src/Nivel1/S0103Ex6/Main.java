package Nivel1.S0103Ex6;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> enumeracion = new LinkedList<>();
        Rellenar rellenar = new Rellenar();
        ListIterator litsIter = enumeracion.listIterator(enumeracion.size()/2);
        int c;

        do{
            c = (int) rellenar.rellenar();
            if (c >= 33 && c <= 47 || c >= 58 && c<= 126){
                litsIter = enumeracion.listIterator(enumeracion.size()/2);
                litsIter.add(c);
                System.out.println(enumeracion);

            }else{
                System.out.println("No ingrese números!!!");
            }
        }while (c != '0');

    }
}
