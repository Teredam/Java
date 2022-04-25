package Nivel1.S0103Ex4;

import java.util.Collection;
import java.util.Iterator;

public class Mi_Iterador {

    public static void iterador(Collection c){

        Iterator iterator = c.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next().toString() + " ");
        }
    }





}

