package Nivel1.S0103Ex5;

import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<Integer> saldoCuentas = new ArrayList<>();
        saldoCuentas.add(35000);
        saldoCuentas.add(55850);
        saldoCuentas.add(27845);

        List<Integer> id = new ArrayList<>();
        id.add(124);
        id.add(125);
        id.add(126);

        ListIterator<Integer> recorrer = saldoCuentas.listIterator();
        System.out.print("La lista de saldo cuentas: ");
        while (recorrer.hasNext()){
            System.out.print(recorrer.next() + "  ");
        }
        System.out.println(" ");
        System.out.print(".......................................................");
        System.out.println(" ");

        ListIterator<Integer> conjunto = saldoCuentas.listIterator(saldoCuentas.size());
        System.out.println("Id + saldo cuentas (invertido): " + saldoCuentas + "  ");
        while (conjunto.hasPrevious()){
            id.add(conjunto.previous());
            System.out.println(id + "  ");
        }
        //Otra forma de recorrer e insertar los elementos a la inversa
        /*for (int i = saldoCuentas.size()- 1; i >= 0; i--){
            id.add(saldoCuentas.get(i));
        }
        System.out.println(".......................................................");
        System.out.println(id);*/
    }

}
