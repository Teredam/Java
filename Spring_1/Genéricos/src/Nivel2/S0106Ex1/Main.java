package Nivel2.S0106Ex1;

import Nivel1.S0106Ex2.Persona;

public class Main {
    public static void main(String[] args) {
        MetodoGenerico genericoYNoGenerico = new MetodoGenerico();

        System.out.println("2 Métodos Genéricos y un Método NO Genérico");
        genericoYNoGenerico.unoNoGenerico(new Persona("Iris", "Rojas", 33), "String", 125f);
        System.out.println("");

        /* El Objeto 2 tiene el argumento no genérico por tanto nos da error en la siguiente línea de comando:
        genericoYNoGenerico.unoNoGenerico("String", new Persona("Teresa", "D´Ambrosio", 51), 125f);
        System.out.println("");*/

        //genericoYNoGenerico.unoNoGenerico(155.54, 1, "Calculo"); // Error
        genericoYNoGenerico.unoNoGenerico(155.54, "Calculo", -2); // Si colocamos el String en el Método no genérico no da error

    }
}
