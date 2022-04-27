package Nivel1.S0108Ex1;

import java.util.ArrayList;

public class Main4 {
    public static void main(String[] args) {
        ArrayList<String> mesesDelAnio = new ArrayList<>();

        mesesDelAnio.add("Enero");
        mesesDelAnio.add("Febrero");
        mesesDelAnio.add("Marzo");
        mesesDelAnio.add("Abril");
        mesesDelAnio.add("Mayo");
        mesesDelAnio.add("Junio");
        mesesDelAnio.add("Julio");
        mesesDelAnio.add("Agosto");
        mesesDelAnio.add("Septiembre");
        mesesDelAnio.add("Octubre");
        mesesDelAnio.add("Noviembre");
        mesesDelAnio.add("Diciembre");

        System.out.println("Lista con método reference:");
        mesesDelAnio.forEach(System.out::println);
    }
}
