/* Modifica el apartado anterior de forma que los argumentos del método genérico sean una lista de argumentos de
variable indefinida. */
package Nivel2.S0106Ex2;

import Nivel1.S0106Ex2.Persona;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MetodoGenericoConVariableIndefinida lista = new MetodoGenericoConVariableIndefinida();

        ArrayList <String> frases = new ArrayList<>();
        frases.add("Gracias por esta Oportunidad");
        frases.add("de aprender");
        frases.add("a programar en Java");

        ArrayList<Integer> dia = new ArrayList<>();
        dia.add(15);
        dia.add(30);
        dia.add(19);

        ArrayList<Persona> datos = new ArrayList<>();
        datos.add(new Persona("Iris", "Rojas", 45));
        datos.add(new Persona("Luis", "Suarez", 15));
        datos.add(new Persona("Jim", "Smith", 23));

        lista.variableIndefinida(frases);
        System.out.println("");
        lista.variableIndefinida(dia);
        System.out.println("");
        lista.variableIndefinida(datos);
    }
}
