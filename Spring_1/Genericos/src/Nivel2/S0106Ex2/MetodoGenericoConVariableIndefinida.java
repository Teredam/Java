package Nivel2.S0106Ex2;

import java.util.ArrayList;

public class MetodoGenericoConVariableIndefinida <T> {
    public void variableIndefinida(ArrayList <T> x){

        System.out.println("ArrayList de cualquier tipo");

        for (int i = 0; i < x.size(); i++){
            System.out.println("Posición " + i + ": " + x.get(i));
        }

    }
}
