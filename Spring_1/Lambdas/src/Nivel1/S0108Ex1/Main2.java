package Nivel1.S0108Ex1;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<String> animales = new ArrayList<>();
        animales.add("Oso");
        animales.add("Perro");
        animales.add("Rinoceronte");
        animales.add("Gusano");
        animales.add("Rana");
        animales.add("Serpiente");
        animales.add("Pez");

        System.out.println("Lista de nombres de animales que incluye la letra \"o\" o tienen más de 5 letras: ");
        animales.stream().filter(x -> x.contains("o") || x.length() > 5).forEach(System.out::println);


    }
}
